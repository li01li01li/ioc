package com.spring.aop.moveproxy;

public class MoveApp {
    public static void main(String[] args) {
        Move t1= new Tank();
        Move t2= new Car();
        Move moveproxy=new TankProxy(t2);
        moveproxy.move();

    }
}
