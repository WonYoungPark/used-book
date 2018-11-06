package me.gyenam05.usedbook.book;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.gyenam05.usedbook.stock.Stock;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "book")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String publisher;

    private String author;

    private LocalDateTime publishedAt;

    private String isbn;

    @OneToMany(mappedBy = "book")
    private List<Stock> stocks;

    @Builder
    public Book(String name, String publisher, String author, LocalDateTime publishedAt,
        String isbn, List<Stock> stocks) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.publishedAt = publishedAt;
        this.isbn = isbn;
        this.stocks = stocks;
    }
}
