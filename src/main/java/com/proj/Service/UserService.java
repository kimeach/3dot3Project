package com.proj.Service;

import com.proj.Entity.AuthUserEntity;
import com.proj.Repository.AuthUserRepository;
import com.proj.Repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final AuthUserRepository authUserRepository;
    private final UserInfoRepository userInfoRepository;



    public Optional<AuthUserEntity> getAuthUser(AuthUserEntity authUserEntity){
        return authUserRepository.findById(authUserEntity.getUserName());
    }



}
