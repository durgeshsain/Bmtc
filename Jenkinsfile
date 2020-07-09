pipeline {
	
	agent any
	
	tools {
        maven 'Maven 3.6.3'
        jdk 'jdk8'
    }
	
	stages {
		stage('Build') {
		 steps {
		 	echo 'LOL'
		 	sh 'mvn clean install'
		 }
		}
		stage(Test) {
			steps {
				sh 'mvn test'
			}
		}
		stage('Build Docker') {
			steps {
				sh 'docker build -f Dockerfile -t bmtc'
			}
		}
	}
	
}