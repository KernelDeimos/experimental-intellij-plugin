package com.github.kerneldeimos.experimentalintellijplugin.services

import com.github.kerneldeimos.experimentalintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
