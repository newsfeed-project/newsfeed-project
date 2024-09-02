package com.sparta.newsfeedproject.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseTimestampEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    private LocalDate birth;

    @Column(nullable = false, name = "sex", length = 6)
    @Enumerated(value = EnumType.STRING)
    private UserSexEnum sex;

}
