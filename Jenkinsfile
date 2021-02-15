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
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
      }
    }

    stage('Buzz test') {
      steps {
        sh 'echo \'Hello test!\''
      }
    }

  }
}