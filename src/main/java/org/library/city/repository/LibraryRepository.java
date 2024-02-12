package org.library.city.repository;

import org.library.city.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends MongoRepository<Book, String> {
}
