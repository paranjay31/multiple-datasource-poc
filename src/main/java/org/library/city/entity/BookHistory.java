package org.library.city.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_history")
@Entity
public class BookHistory {

    @Id
    private String id;
    private String bookName;
    private String bookAuthor;
    private LocalDate borrowedDate;

}
