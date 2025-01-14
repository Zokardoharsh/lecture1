package com.example.lecture1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;
    public void bakeCake(){
        System.out.println("Making cake with "+ frosting.getFrostingType() + " and "+ syrup.getSyrupType());
    }
}
