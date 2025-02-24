pipeline {
    agent any
    // Add this block
    tools {
        maven 'Maven3' // Match the name you configured
        jdk 'JDK21'   // If you've set up JDK 21
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Pranathii04/demo_err', branch: 'master'

        }

        stage('Build') {
            steps {
                sh 'mvn clean package' // For Java/Maven projects
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        failure {
            script {
                echo "Build failed! Sending logs to LLM..."
                // Add your LLM integration here
            }
        }
    }
}