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

  }
}