package com.github.oovm.notedownintelij.services

import com.intellij.openapi.project.Project
import com.github.oovm.notedownintelij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
