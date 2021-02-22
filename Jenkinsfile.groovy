#!/usr/bin/env groovy

pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  // parameters {
  //   choice(name: 'CHOICE', choices: ['devccm01', 'devccm02', 'devccm03', 'devccm04', 'devccm05'], description: 'select an options')
  // }

  environments {
    azure {

      teamStacks = [
        [
          name: 'ccm',
          stacks: [
            [ name: 'steccm01'],
            [ name: 'steccm02']
          ]
        ],
        [
          name: 'bulk-scan',
          stacks: [
            [ name: 'devscan01'],
            [ name: 'devscan02']
          ]
        ]
      ]
    }
  }

   
}