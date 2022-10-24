package com.proj.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@Table(name = "USER_INFO")
public class UserInfoEntity {

    @Id
    @Column(name = "USER_ID")
    String userId;

    @Column(name = "USER_PW")
    String userPw;

    @Column(name = "USER_NAME")
    String userName;

    @Column(name = "SOCIAL_SECURITY_NUMBER")
    String socialSecurityNumber;
}
