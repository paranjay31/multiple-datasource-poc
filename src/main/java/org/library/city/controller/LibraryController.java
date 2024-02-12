package org.library.city.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.library.city.model.Book;
import org.library.city.service.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
@Slf4j
@Validated
@AllArgsConstructor
public class LibraryController {

    private LibraryService libraryService;
    @PostMapping
    public ResponseEntity<Object> createBook(@Valid @RequestBody Book book) {
        libraryService.borrowBook(book);
        return new ResponseEntity<>("Successful Save", HttpStatus.OK);
    }
}
