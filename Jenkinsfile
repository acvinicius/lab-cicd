pipeline {
    agent any

    tools {
        maven 'maven-3.0.5'
        jdk 'jdk-8'
    }

    stages {
        stage('Stop') {
            steps {
               sh 'docker-compose down || true'
            }
        }
        stage('Build') {
            steps {
               sh 'mvn -B -DskipTests clean package'
               sh 'docker-compose build'
            }
        }
        stage('Deploy') {
            steps {
               sh 'docker-compose start'
            }
        }
    }
}
