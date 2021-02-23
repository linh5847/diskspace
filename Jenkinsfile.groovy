#!/usr/bin/env groovy

pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

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
          ansiblePlaybook colorized: true, playbook: 'site.yml', sudoUser: 'jenkins', sudo: true
        }
      }
    }
  }
}