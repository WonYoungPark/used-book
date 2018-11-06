package me.gyenam05.usedbook.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private String password;

    private String name;

    @CreationTimestamp
    private LocalDateTime regAt;
}
