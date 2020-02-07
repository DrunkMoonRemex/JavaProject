package com.io;

/**
 * 装饰模式
 * 模拟实现放大器对声音的放大功能
 */
public class DecorateTest01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        Amplifier am = new Amplifier(p);
        am.say();
    }
}

interface  Say{
    void say();
}
class Person implements Say{
    private int voice = 10;
    @Override
    public void say() {
        System.out.println("人的声音："+voice);
    }
    public int getVoice(){
        return voice;
    }
}
class Amplifier implements Say{
    private Person p;
    Amplifier(Person p){
        this.p = p;
    }
    @Override
    public void say() {
        System.out.println("放大器放大的声音："+p.getVoice()*10);
    }
}