 def gv
 
 pipeline {
    agent any
    tools {
        maven 'Maven'
    }

    stages{

        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage("build jar"){
            steps{
                scripts{
                    gv.buildJar()
                }
            }
        }

        stage("build image"){
            steps{
                scripts{
                    gv.buildImage()
                }
            }
        }

        stage("deploy"){
            steps{
                scripts{
                  gv.deploy()  
                }
            }
        }

    }
 }
