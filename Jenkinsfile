pipeline {
    agent any
    tools {
        // Ensure "Maven-3" matches the exact name you configure in Jenkins Tools
        maven 'Maven-3' 
    }
    stages {
        stage('Build') {
            steps {
                // Use 'bat' instead of 'sh' if your Jenkins server runs on Windows
                sh 'mvn clean package' 
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
