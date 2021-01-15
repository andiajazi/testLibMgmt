package com.example.testLibMgmt.books;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "books")
@Table(
        name = "books",
        uniqueConstraints = {
                @UniqueConstraint(name = "book_ISBN_unique", columnNames = "book_ISBN")
        }
)
public class Books {

    @Id
    @SequenceGenerator(
            name = "Books_sequence",
            sequenceName = "Books_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "books_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "book_title",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String bookTitle;
    @Column(
            name = "book_ISBN",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String bookISBN;

    public Books(String bookTitle, String bookISBN) {
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
    }

    public Books(String keshtjella, long l) {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
