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
                bat 'mvn clean install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
        /*stage ('Run Jmeter tests') {
            steps {
              echo '' bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\Group2_project\\Group2\\performance\\PrestShop.jmx -l jmeter_report.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }*/
        
        
    }
}