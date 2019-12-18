pipeline {
    agent any
    stages {
        stage('Get From SCM'){
            steps{
                sh git clone git@github.com:satkuru/springbootdemo.git
            }
        }
        stage('Build'){
            steps{
                cd springbootdemo
                mvn clean compile
            }
        }
    }
}