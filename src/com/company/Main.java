package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Ниже выполнение первой задачи.

        int[] animals = new int[3];
        animals[0] = 1;
        int cats = animals[0];
        animals[1] = 2;
        int dogs = animals[1];
        animals[2] = 3;
        int mouses = animals[2];
        System.out.println("кошки - " + cats + ", собаки - " + dogs + ", мышки - " + mouses);

        double[] fruits = {1.57, 7.654, 9.986};
        double strawberries = fruits[0];
        double apples = fruits[1];
        double pears = fruits[2];
        System.out.println("клубника - " + strawberries + ", яблоки - " + apples + ", груши - " + pears + ".");

        int[] simple = {4, 8, 15, 16, 23, 42};
        System.out.println(simple[0] + ", " + simple[1] + ", " + simple[2] + ", " + simple[3] + ", " + simple[4] + ", " + simple[5]);

        System.out.println();

        System.out.println(" Задача 2");
        // Ниже выполнение второй задачи.

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]);
            int lastIndexAnimals = animals.length - 1;
            if (animals[i] == animals[lastIndexAnimals]) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]);
            int lastIndexArrFruit = fruits.length - 1;
            if (fruits[i] == fruits[lastIndexArrFruit]) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < simple.length; i++) {
            System.out.print(simple[i]);
            int lastIndexArrSimple = simple.length - 1;
            if (simple[i] == simple[lastIndexArrSimple]) {
                System.out.print("");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        // Ниже выполнение третьей задачи.
        {
            for (int i = animals.length - 1; i > 0; i--)
                System.out.print(animals[i] + ", ");
            System.out.print(animals[0]);
            System.out.println();

            for (int i = fruits.length - 1; i > 0; i--)
                System.out.print(fruits[i] + ", ");
            System.out.print(fruits[0]);
            System.out.println();

            for (int d = simple.length - 1; d > 0; d--)
                System.out.print(simple[d] + ", ");
            System.out.print(simple[0]);
            System.out.println();
            System.out.println();
        }

        System.out.println("Задача 4");
        // Ниже выполнение четвертой задачи.
        for (int i = 0; i < animals.length; i++)
            if (animals[i] % 2 == 1) {
                System.out.print(animals[i] + 1 + " ");
            }

        for (int i = 0; i < fruits.length; i++)
            if (fruits[i] % 2 == 1) {
                System.out.print(fruits[i] + 1 + " ");
            }
    }

}

