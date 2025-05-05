package com.andrbezr2016.library.ui.controller

import com.andrbezr2016.library.ui.dto.BookDto
import com.andrbezr2016.library.ui.dto.BookInput
import com.andrbezr2016.library.ui.dto.BookUpdate
import com.andrbezr2016.library.ui.dto.NotableBookDto
import com.andrbezr2016.library.ui.service.LibraryService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*


@Controller
class LibraryController(val libraryService: LibraryService) {

    @RequestMapping(value = ["/", "/index"])
    fun index(): String {
        return "index"
    }

    @RequestMapping(value = ["/index"], params = ["addBook"])
    fun addBook(bookInput: BookInput, model: ModelMap): String {
        libraryService.addBook(bookInput)
        model.clear()
        return "redirect:/index"
    }

    @RequestMapping(value = ["/index"], params = ["updateBook"])
    fun updateBook(bookId: UUID, bookUpdate: BookUpdate, model: ModelMap): String {
        libraryService.updateBook(bookId, bookUpdate)
        model.clear()
        return "redirect:/index"
    }

    @RequestMapping(value = ["/index"], params = ["deleteBook"])
    fun deleteBook(bookId: UUID, model: ModelMap): String {
        libraryService.deleteBook(bookId)
        model.clear()
        return "redirect:/index"
    }

    @ModelAttribute("allBooks")
    fun getBooks(): Collection<BookDto?>? {
        return libraryService.getBooks()
    }

    @ModelAttribute("allBooksToRead")
    fun getBooksToRead(): Collection<BookDto?>? {
        return libraryService.getBooksToRead()
    }

    @ModelAttribute("allNotableBooks")
    fun getNotableBooks(): Collection<NotableBookDto?>? {
        return libraryService.getNotableBooks()
    }
}