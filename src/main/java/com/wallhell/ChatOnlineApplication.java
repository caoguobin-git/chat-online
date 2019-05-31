package com.wallhell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.wallhell.mapper")
@RestController
public class ChatOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatOnlineApplication.class, args);
    }

}
