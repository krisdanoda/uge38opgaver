package com.cphbusiness;

public class Datamatik {


    public static void main(String[] args) {
	Student Kris = new Student("Kris",26,false,'b');
    Student Kurisu = new Student("Kurisu",25,true,'a');
    Teacher William = new Teacher("William", 30,false);

    System.out.println(Kris.name);
    System.out.println(Kurisu.name);
    System.out.println(William.name);
    System.out.println(Kurisu.datamatikerTeam);
    System.out.println(Kris.datamatikerTeam);
    }
}
