package com.andrbezr2016.library.ui.controller

import com.andrbezr2016.library.ui.service.LibraryService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LibraryController(val libraryService: LibraryService) {

    @GetMapping("/index")
    fun index(model: Model) = "index"
}