package com.proj.Service;

import com.proj.Entity.AuthUserEntity;
import com.proj.Repository.AuthUserRepository;
import com.proj.Repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

@RequiredArgsConstructor
public class UserServiceTest {
    private final AuthUserRepository authUserRepository;
    private final UserInfoRepository userInfoRepository;
    @Test
    public Optional<AuthUserRepository> getAuthUser(AuthUserEntity authUserEntity){
        authUserEntity.setUserName("홍길동");
        return authUserRepository.findById(authUserEntity.getUserName());
    }
}