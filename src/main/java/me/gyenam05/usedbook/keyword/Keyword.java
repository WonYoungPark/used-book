package me.gyenam05.usedbook.keyword;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.gyenam05.usedbook.user.User;

import javax.persistence.*;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "keyword")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Keyword {
    @Id
    @GeneratedValue
    private Integer id;

//    @OneToOne(mappedBy = "keyword")
//    private User user;

    private String content;
}
