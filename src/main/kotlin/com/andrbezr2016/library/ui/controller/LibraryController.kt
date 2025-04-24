package com.andrbezr2016.library.ui.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LibraryController {

    @GetMapping("/index")
    fun index(model: Model) = "index"
}