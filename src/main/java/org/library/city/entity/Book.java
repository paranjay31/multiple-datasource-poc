package org.library.city.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "book")
public class Book {

    @Id
    private String id;
    private String bookName;
    private String bookAuthor;
    private LocalDate borrowedDate;
}
