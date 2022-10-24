package com.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository  extends JpaRepository<UserInfoRepository,String> {

}
