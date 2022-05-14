package com.compan;

public class Main {

    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        programmer.setName("Ada Lovelace");
        programmer.setDesignation("programmer");
        programmer.setCompanyName("apple");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.codding("aiz");
        System.out.println(programmer);
        System.out.println();

        Dancer dancer=new Dancer();
        dancer.setName("Azat");
        dancer.setDesignation("dancer");
        dancer.setGroupName("will bee");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        System.out.println(dancer);
        System.out.println();

        Singer singer=new Singer();
        singer.setName("Aiyma ");
        singer.setDesignation("singer");
        singer.setBandName("akkush");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer);

        System.out.println();


        }







    }

