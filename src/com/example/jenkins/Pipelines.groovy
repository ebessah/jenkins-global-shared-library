package com.example.jenkins

import com.example.jenkins.pipelines.LibrariesPipeline

/**
 This method is invoked by the developer indirectly without
 having any visibility of how that pipeline is constructed
 */
def libraryPipeline(param) {
    echo "Library Pipeline execution started"
    LibrariesPipeline pipeline = new LibrariesPipeline()
    pipeline.libraryPipeline(param)
}

return this