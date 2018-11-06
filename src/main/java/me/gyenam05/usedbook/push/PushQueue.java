package me.gyenam05.usedbook.push;

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
 * Created by wyparks2@gmail.com on 2018. 10. 14.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "push_queue")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PushQueue {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private String message;

    private boolean isPushed;

    @CreationTimestamp
    private LocalDateTime regAt;
}
