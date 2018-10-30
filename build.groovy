pipeline {
    agent any
    options { checkoutToSubdirectory('sources') }
    stages {
        stage('Prepare Workspace') {
            steps {
                dir('sources') {
                    echo 'init and update submodules'
                    sh 'git submodule update --init --recursive'
                    sh "ls -al"

                }
            }
        }
        /*stage('Checkout external proj') {
            steps {
                dir('sources') {
                    git branch: 'develop',
                        url: 'git@github.com:bbc/pnm-android-poc.git'

                    sh "ls -lat"
            }
        }*/
}