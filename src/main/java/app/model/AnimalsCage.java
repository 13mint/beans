package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;
    private Timer  timer;

    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        animal.makeSound();
    }

    public void showTime(){
        System.out.println("Time: " + timer.getTime());
        System.out.println("--------------");
    }
}