package com.theironyard;

/**
 * Created by michaeldelli-gatti on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal Sound!!!");
    }

    @Override
    public String toString(){
        return name;
    }
}
