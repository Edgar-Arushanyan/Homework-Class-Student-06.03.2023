package Homework;

public class Main {
    //Задача 1
    //Создать класс Student c полями (переменными) имя и номер.
    //Создать несколько обьектов этого класса

    public static void main(String[] args) {

        Student edgar = new Student();
        edgar.name = "Edgar";
        edgar.number = 5;
        System.out.println("His name is "+edgar.name);
        System.out.println("His number is "+edgar.number);


        Student john = new Student();
        john.name = "John";
        john.number = 10;
        System.out.println("His name is "+john.name);
        System.out.println("His number is "+john.number);

        System.out.println("---------------------------------------------------------------------------");

        // Задача 2
        //Добавить в класс Student конструктор с параметрами имя и номер.
        //Создать еще несколько обьектов класса с использованием этого конструктора

        Student ivan = new Student("Ivan",7);
        System.out.println("His name is "+ivan.name);
        System.out.println("His number is "+ivan.number);

        Student albina = new Student("Albina",1);
        System.out.println("Her name is "+albina.name);
        System.out.println("Her number is "+albina.number);




    }









}
