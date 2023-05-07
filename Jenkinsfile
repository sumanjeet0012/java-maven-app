 pipeline {
    agent any

    stages{

        stage("build jar"){
            steps{
                script{
                    echo "building the application"
                }
            }
        }

        stage("build image"){
            steps{
                script{
                    echo "building the docker image"
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                  def dockerCmd =  "docker run -d -p 3080:80 sumanjeet0012/react-node-example:1.0"
                  sshagent(['ec2-server-key']) {
                        ssh "ssh -0 StrictHostKeyChecking=no ec2-user@54.253.177.19 ${dockerCmd}"
                        }
                }
            }
        }

    }
 }
