package com.proj.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@Table(name = "AUTH_USER",schema = "PUBLIC",catalog = "PUBLIC")
//@IdClass(AuthUserPkEntity.class)
public class AuthUserEntity implements Serializable {

    @Id
    @Column(name = "USER_NAME")
    String userName;

    @Column(name = "SOCIAL_SECURITY_NUMBER")
    String socialSecurityNumber;

}
