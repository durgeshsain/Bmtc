pipeline {
	
	agent any
	
	stages {
		stage('Build') {
		 steps {
		 	echo 'LOL'
		 	sh 'mvn clean install'
		 }
		}
		stage(Test) {
			steps {
				withMaven(maven : 'maven_3.6.3')
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