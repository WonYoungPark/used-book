package me.gyenam05.usedbook.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.gyenam05.usedbook.stock.Stock;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Setter
@NoArgsConstructor
public class BookDetailResponseDto {
    private Integer id;

    private String name;

    private String publisher;

    private String author;

    private LocalDateTime publishedAt;

    private String isbn;

    @OneToMany(mappedBy = "book")
    private List<Stock> stocks;

    public Book toEntity() {
        return Book.builder()

                   .build();
    }
}
