package com.example.lecture1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup",havingValue="strawberry")
public class StrawberrySyrup implements Syrup{

    public String getSyrupType(){
        return "Strawberry Syrup";
    }

}
