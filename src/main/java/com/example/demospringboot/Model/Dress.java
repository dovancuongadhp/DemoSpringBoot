package com.example.demospringboot.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dress implements Outfit{
    @Override
    public String wear(){
        return new String("DANG MAC VAY");
    }
}
