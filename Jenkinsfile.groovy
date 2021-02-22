#!/usr/bin/env groovy

pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  // parameters {
  //   choice(name: 'CHOICE', choices: ['devccm01', 'devccm02', 'devccm03', 'devccm04', 'devccm05'], description: 'select an options')
  // }

  environment {
    ste = 'steccm01'
    dev = 'devccm01'
  }

  parameters {
    choice(name: 'CHOICE', choices: ['ste', 'dev'], description: 'select an options')
  }

  // parameters {
  //   string(name: 'JENKINS_ANSIBLE_HOST_LIMIT', defaultValue: '', description: 'user choice')
  // }

  stages {

    stage('Checkout git repo') {
      steps {
        script {
          git url: 'git@github.com:linh5847/diskspace.git'
        }
      }
    }

    stage('Checking diskspace and cleanup files that are 1 day or olders.') {
      steps {
        script {

          if('${params.CHOICE}' == 'ste') {
            ansiblePlaybook inventory: '', tags: 'diskspace_and_delete_files', playbook: 'site.yml', sudo: true, sudoUser: 'jenkins'
          }

          if('${params.CHOICE}' == 'dev') {
            ansiblePlaybook inventory: '', tags: 'diskspace_and_delete_files', playbook: 'site.yml', sudo: true, sudoUser: 'jenkins'
          }
        }
      }
    }
  }
}