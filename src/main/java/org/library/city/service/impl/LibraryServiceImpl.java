package org.library.city.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.library.city.entity.BookHistory;
import org.library.city.model.Book;
import org.library.city.repository.LibraryHistoryRepository;
import org.library.city.repository.LibraryRepository;
import org.library.city.service.LibraryService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;
    private final LibraryHistoryRepository libraryHistoryRepository;

    @Override
    public void borrowBook(Book book) {
        org.library.city.entity.Book currentBook = libraryRepository.findById(book.getId()).orElse(null);
        libraryRepository.save(org.library.city.entity.Book.builder()
                .id(book.getId())
                .bookAuthor(book.getBookAuthor())
                .bookName(book.getBookName())
                .borrowedDate(LocalDate.now())
                .build());
        if (Objects.nonNull(currentBook)) {
            libraryHistoryRepository.save(BookHistory.builder()
                    .bookAuthor(currentBook.getBookAuthor())
                    .bookName(currentBook.getBookName())
                    .id(currentBook.getId())
                    .borrowedDate(currentBook.getBorrowedDate())
                    .build());
        }

    }
}
