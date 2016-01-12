package org.opencorrelate.exercise.jvm;

public class Computer {
    
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
