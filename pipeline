node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/jglick/simple-maven-project-with-tests.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Sonar') {
      mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar \
        -Dsonar.host.url=https://sonarcloud.io \
        -Dsonar.organization=szssamuel-github \
        -Dsonar.login=ff0336c86f32fbd8ce0e7d31e84a401fecb895b1
   }
   
   stage('Results') {
      //junit '**/target/surefire-reports/TEST-*.xml'
      //archive 'target/*.jar'
   }
}
