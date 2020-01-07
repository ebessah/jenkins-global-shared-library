package com.example.jenkins.pipelines

def libraryPipeline(param) {
    node {
        pipeline {
            stage('Run a test') {
                echo "Running a test for ${param}"
            }
            stage('Build JAR') {
                echo "Building a jar for ${param}"
            }
        }
    }
}

return this
