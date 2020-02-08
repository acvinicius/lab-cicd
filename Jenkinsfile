pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh './gradlew check'
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
	
	post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
    }
	
}
