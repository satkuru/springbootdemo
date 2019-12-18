pipeline {
    agent any
    tools{
        maven 'MAVEN_3.6.3'
        jdk 'JDK8'
    }
    stages {
        stage ("initialize") {
            steps {
            sh '''
                echo "PATH = ${PATH}"
            echo "M2_HOME = ${M2_HOME}"
            '''
            }
        }
        stage ('Build project') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy to Nexus'){
            steps {
                sh 'mvn -DskipTests deploy'
            }
        }
    }
}