package org.library.city.repository;

import org.library.city.entity.BookHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryHistoryRepository extends JpaRepository<BookHistory, String> {
}
