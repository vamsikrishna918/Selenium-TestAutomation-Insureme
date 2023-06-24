pipeline{
    agent any
     
    stages{
        stage("Test auomation Code checkout"){
            steps{
                git branch: 'main', url: 'https://github.com/vamsikrishna918/Selenium-TestAutomation-Insureme'
            }
        }
        stage("Executing jar"){
            steps{
                sh ' sudo java -jar seleniumAutomationInsureme.jar'
            }
        }
        
        }
}        
