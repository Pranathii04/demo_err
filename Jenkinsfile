pipeline {
    agent any

    tools {
        maven 'Maven3'  // Ensure this matches Jenkins → Tools
        jdk 'JDK21'     // Ensure JDK 21 is configured
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Pranathii04/demo_err.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package' // Use "bat" for Windows
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test' // Use "bat" for Windows
            }
        }
    } // <-- Closing brace for "stages"
} // <-- Closing brace for "pipeline"