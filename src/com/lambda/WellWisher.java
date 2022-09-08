package com.lambda;

public class WellWisher {
    public static void sayHello(Language lang){
        lang.wish();
    }

    public static int someFunction(){
        int a = 5, b = 10;


        return 10;
    }

    public static void main(String[] args) {

        sayHello( () -> System.out.println("Namashkar"));
        sayHello( () -> System.out.println("Hello how are you?"));
        sayHello( () -> System.out.println("Namastey?"));







    }
}

//Object oriented approach
        /*Language engObj = new English();
        sayHello(engObj);

        Language hinObj = new Hindi();
        sayHello(hinObj);

        Language marObj = new Marathi();
        sayHello(marObj);
        //marObj.wish(); */

//instead of creating new classes and objects for all langs


//----->//Anonymous class objects
/*

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Namashkar");
            }
        });

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Hello how are you?");
            }
        });

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Namaste!");
            }
        });*/