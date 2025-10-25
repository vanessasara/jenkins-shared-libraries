def call(String Project, String ImageTage, String DockerHubUser){
  sh "docker rmi ${DockerHubUser}/${Project}:${ImageTage}"
}
