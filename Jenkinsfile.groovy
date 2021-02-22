#!/usr/bin/env groovy

pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  // parameters {
  //   choice(name: 'CHOICE', choices: ['devccm01', 'devccm02', 'devccm03', 'devccm04', 'devccm05'], description: 'select an options')
  // }

  stages {

    stage('Checkout git repo') {
      steps {
        script {
          git url: 'git@github.com:linh5847/diskspace.git'
        }
      }
    }
  }
}