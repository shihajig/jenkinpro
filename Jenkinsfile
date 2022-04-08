pipeline {
	agent any
	
	stages{
		stage('compile stage') {
		
			
			steps{
				withMaven(maven : 'mymaven'){
				
					sh 'mvn clean compile'  
				}
					
			}
			
		}
	    stage('testing stage'){
	    
	    	steps{
				withMaven(maven : 'mymaven'){
				
					sh 'mvn test'  
				}
					
			}
	    
	      	
	    }
	    stage('package stage'){
	    
	    	steps{
				withMaven(maven : 'mymaven'){
				
					sh 'mvn package'  
				}
					
			}
	    
	      	
	    }				
	
	}

}