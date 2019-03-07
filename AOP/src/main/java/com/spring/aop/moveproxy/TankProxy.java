package com.spring.aop.moveproxy;

public class TankProxy implements Move {
    private Move t;
    public  TankProxy(Move t){
        this.t = t;
    }
    @Override
    public void move() {
        System.out.println("Starting");
        t.move();
        System.out.println("Stop");
    }
}
