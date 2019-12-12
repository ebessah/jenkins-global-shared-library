package io.bekdev.jenkins.pipelines

def libraryPipeline() {
    node {

        pipeline {
            stage('Run a test') {
                maven.test()
            }
            stage('Build JAR') {
                maven.package()
            }
        }
    }
}

return this
