package com.infinityworks.jenkins

import com.infinityworks.jenkins.pipelines.LibrariesPipeline

/**
 This method is invoked by the developer indirectly without
 having any visibility of how that pipeline is constructed
 */
def libraryPipeline() {
    LibrariesPipeline pipeline = new LibrariesPipeline()
    pipeline.libraryPipeline()
}

return this