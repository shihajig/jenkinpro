pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                withMaven(maven : 'mymaven'){
                   sh 'mvn clean compile'
                } 
            }
        }
        
        
    }
}