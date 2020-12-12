package com.github.tarasivashchuk.timer.services

import com.intellij.openapi.project.Project
import com.github.tarasivashchuk.timer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
