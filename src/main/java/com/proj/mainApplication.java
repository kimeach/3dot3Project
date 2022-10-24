package com.proj;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@ServletComponentScan
@SpringBootApplication
@RequiredArgsConstructor
@EnableJpaAuditing //JPA Auditing을 활성화 하기 위한 어노테이션입니다.
public class mainApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application ) {
        return application.sources(mainApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(mainApplication.class, args);
    }

}
