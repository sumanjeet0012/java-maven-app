def buildJar(){
    echo "building the application"
}

def buildImage(){
   echo "building the docker image"
//   withCredentials([usernamePassword(credentialsId: "github", passwordVariable: 'PASS', usernameVariable: 'USER' )]){
//   sh "docker build -t sumanjeet0012/demo-app:2.0 ."
//   sh "echo $PASS | docker login -u $USER --password-stdin"
//   sh "docker push sumanjeet0012/demo-app:2.0"             
   }
}

def deploy(){
    def dockerCmd =  "docker run -d -p 3080:80 sumanjeet0012/react-node-example:1.0"
    sshagent(['ec2-server-key']) {
    ssh "ssh -0 StrictHostKeyChecking=no ec2-user@54.253.177.19 ${dockerCmd}"
 }
}

return this
