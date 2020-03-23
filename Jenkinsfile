pipeline {
  agent any
  stages {
    stage('Projeto_ES_Clean') {
      steps {
        bat(script: 'mvn -f C:\\Users\\beatr\\git\\Projeto\\Projeto\\pom.xml clean && exit', returnStatus: true)
      }
    }

    stage('Projeto_ES_Compile') {
      steps {
        bat(script: 'mvn -f C:\\Users\\beatr\\git\\Projeto\\Projeto\\pom.xml compile && exit', returnStatus: true)
      }
    }

  }
}