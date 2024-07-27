package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Laptop implements Computer {
    public  void compile() {
        System.out.println("compile with slowwww");
    }


}
