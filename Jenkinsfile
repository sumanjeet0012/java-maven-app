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
            steps {
                script {
                 echo 'entered in deploy stage'
             //     def dockerCmd =  "docker run -d -p 3080:80 sumanjeet0012/react-node-example:1.0"
                  sshagent (credentials: ['ec22-server-key']) { // use credential ID
                    //    ssh "-o StrictHostKeyChecking=no ubuntu@54.253.177.19 ${dockerCmd}"
                  
                 // sshagent(['ec2-server-key']) {
                   //     ssh "ssh -0 StrictHostKeyChecking=no ec2-user@54.253.177.19 ${dockerCmd}"
                        }
                }
            }
        }

    }
 }
