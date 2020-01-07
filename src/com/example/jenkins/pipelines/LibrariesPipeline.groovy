package com.example.jenkins.pipelines

def libraryPipeline() {
    node {
        pipeline {
            stage('Run a test') {
                echo "Running a test"
            }
            stage('Build JAR') {
                echo "Building a jar"
            }
        }
    }
}

return this
