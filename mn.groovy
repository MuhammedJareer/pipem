Pipeline{
agent any

stages{
stage('compile stage'){

steps{
withMaven(maven : 'maven_3_6_0'){
sh 'mvn clean compile'
}
}
}
stage('testing stage'){

steps{

withMaven(maven : 'maven_3_6_0'){

sh 'mvn clean compile'
}
}
}
}
}

    

