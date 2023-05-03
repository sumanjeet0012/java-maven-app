def buildJar(){
    echo "building the application"
    sh "mvn package"
}

def buildImage(){
   echo "building the docker image"
//    withCredentials([usernamePassword(credentialsId: "github", passwordVariable: 'PASS', usernameVariable: 'USER' )]){
//    sh "docker build -t sumanjeet0012/demo-app:2.0 ."
//    sh "echo $PASS | docker login -u $USER --password-stdin"
//    sh "docker push sumanjeet0012/demo-app:2.0"
                
// }
}
def deploy(){
    echo "deploying the image"
}

return this
