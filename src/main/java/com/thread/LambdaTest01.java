package com.thread;

public class LambdaTest01 {

    static class Like3 implements ILike{
        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like3();
        like.lambda();

        class Like2 implements ILike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        like = new Like2();
        like.lambda();

        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();

        //lambda
        like = ()->{
            System.out.println("I like lambda5");
        };
        like.lambda();



    }
}
interface ILike{
    void lambda();
}
 class Like implements ILike{
     @Override
     public void lambda() {
         System.out.println("I like lambda");
     }
 }