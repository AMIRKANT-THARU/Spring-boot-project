pipeline {
    agent any

    tools {
        maven 'maven3'
        jdk 'jdk17'
    }

    environment {
        MAVEN_OPTS = '-Dmaven.repo.local=.m2/repository'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code from GitHub...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Spring Boot project...'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }
    }

    post {

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Check console output.'
        }
    }
}
