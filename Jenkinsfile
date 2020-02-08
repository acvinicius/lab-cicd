pipeline {
    agent any

	stages {
        stage('Tests') {
			agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
               sh 'mvn -B test'
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
