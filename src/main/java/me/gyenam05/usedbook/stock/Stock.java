package me.gyenam05.usedbook.stock;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.gyenam05.usedbook.book.Book;
import me.gyenam05.usedbook.store.Store;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "stock")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stock {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private Integer price;

    private String url;

    @CreationTimestamp
    private LocalDateTime regAt;
}
