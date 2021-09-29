package com.github.liangjiang0012.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.liangjiang0012.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
