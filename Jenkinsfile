pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                cd springbootdemo
                sh mvn clean compile
            }
        }
    }
}