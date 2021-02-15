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
        sh '''echo "I am a ${BUZZ_NAME}"
echo \'Hello world\''''
      }
    }

    stage('Buzz test') {
      steps {
        sh 'echo \'Hello test!\''
      }
    }

  }
  environment {
    BUZZ_NAME = 'Worker Bee'
  }
}