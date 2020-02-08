pipeline {
    agent any

	stages {
        stage('Tests') {
			agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
               sh 'mvn -B test'
            }
        }
	stage('Sonar') {
			agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
	       sh 'mvn checkstyle:check'
            }
        }
        stage('Build') {
			agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
               sh 'mvn -B -DskipTests clean package'
			   archiveArtifacts 'target/*.jar'
            }
        }
    }
}
