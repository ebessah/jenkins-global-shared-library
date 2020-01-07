package com.example.jenkins.pipelines

def libraryPipeline() {
    node {
        pipeline {
            stage('Run a test') {
                sh
            }
            stage('Build JAR') {
                maven.package()
            }
        }
    }
}

return this
