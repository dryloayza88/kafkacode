pipeline {
  agent any
  stages {
    stage('Prueba') {
      steps {
        echo 'Prueba 1'
      }
    }

    stage('Prueba2') {
      steps {
        echo 'Prueba2'
      }
    }

    stage('Fluffy test') {
      steps {
        sh '''sleep 5
echo \'Success!\''''
      }
    }

    stage('Buzz build') {
      steps {
        sh 'echo \'Hello world\''
      }
    }

    stage('Buzz test') {
      steps {
        sh 'echo \'Hello test!\''
        junit '**/surefire-reports/**/*.xml'
      }
    }

  }
}