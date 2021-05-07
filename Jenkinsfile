pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-15.0.2\\bin"
    }
    agent {

	node { label "test" }

	}

    tools {
        maven 'M3'
    }
    stages {
        stage ('Build') {

           steps {

                 bat 'mvn -DWebDriver=Chrome -Dmaven.test.failure.ignore=true clean install'

            }
            post {
                success {
                  junit 'target/surefire-reports/**/*.xml'
                }
            } 
        }
		
	/*	stage("test") {
            steps {
                echo 'testing the application...'
                bat "mvn -Dmaven.test.failure.ignore=true test"
            }
        } */
        /*stage ('Run Jmeter tests') {
            steps {
              echo '' bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\FinalProject.jmx -l C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter_report.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }*/
        stage ('Run Jmeter tests') {
            steps {
              bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\FinalProject.jmx -l C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter_report.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }
        
    }
}