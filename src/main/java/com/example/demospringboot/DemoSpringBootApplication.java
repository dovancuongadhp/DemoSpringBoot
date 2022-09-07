package com.example.demospringboot;

import com.example.demospringboot.Model.Dress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoSpringBootApplication {
    public static void main(String[] args) {
//        SpringApplication.run(DemoSpringBootApplication.class, args);
        ApplicationContext context = SpringApplication.run(DemoSpringBootApplication.class,args);
        Dress dress = context.getBean(Dress.class);
        Dress dress1 = context.getBean(Dress.class);
        System.out.println(dress);
        System.out.println(dress1);
    }

}
