package com.ys.designpattern.createpattern.factory.mytest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal =  animalFactory.createAnimal("cat");
        log.info(animal.name);
        animal.eat();
        animal.sleep();


        Animal bird =  animalFactory.createAnimal("bird");
        log.info(bird.name);
        bird.eat();
        bird.sleep();

    }
}
