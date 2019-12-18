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
    }
}