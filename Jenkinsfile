pipeline {
	
	agent any
	
	triggers {
		pollSCM '* * * * *'
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