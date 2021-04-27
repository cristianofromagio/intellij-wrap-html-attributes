package com.github.cristianofromagio.intellijwraphtmlattributes.services

import com.github.cristianofromagio.intellijwraphtmlattributes.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
