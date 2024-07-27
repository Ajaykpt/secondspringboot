package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired    //FIELD INJECTION
@Qualifier("laptop")
    private Computer computer;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void build (){
        computer.compile();
    System.out.println("dsafhawejkfhauysd");
    }
}
