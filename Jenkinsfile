pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhijeetgupta27/scientific-calculator-devops.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t scientific-calculator .'
            }
        }

        stage('Tag Docker Image') {
            steps {
                sh 'docker tag scientific-calculator abhijeet2710/scientific-calculator'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push abhijeet2710/scientific-calculator'
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory.ini',
                        extras: '-K'
                    )
                }
            }
        }
        
        post {
            success {
                echo 'Pipeline successfully completed!'
                emailext(
                    to: 'ag2761001@gmail.com',
                    subject: 'Build Success: Scientific Calculator',
                    body: 'The Jenkins pipeline for the Scientific Calculator project has completed successfully.'
                )
            }
            failure {
                echo 'Pipeline failed!'
                emailext(
                    to: 'ag2761001@gmail.com',
                    subject: 'Build Failure: Scientific Calculator',
                    body: 'The Jenkins pipeline for the Scientific Calculator project has failed.'
                )
            }
        }
    }
}