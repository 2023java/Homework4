public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1() {
        System.out.println("Задача 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");}
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");}
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte airTemperature= 6;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");}
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");}
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte speed= 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч то, придется заплатить штраф");}
        if (speed <= 60) {
            System.out.println("На улице " + speed + " км/ч то, можно ездить спокойно");}
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte age= 33;
        if (age >= 2 && age<=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");}
        if (age >= 7 && age<18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");}
        if (age >= 18 && age<=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");}
        if (age > 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");}
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte age= 17;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");}
        if (age >= 5 && age<14) {
            System.out.println("Если возраст ребенка равен  " + age + ", то ему можно кататься на аттракционе в сопровождении");}
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");}

    }
    public static void task6() {
        System.out.println("Задача 6");
        int place = 77;
        if (place >=1 && place <= 60) {
            System.out.println("Места в вагоне есть и ваше место сидячее");}
        else {
            if (place > 60 && place <= 102) {
                System.out.println("Места в вагоне есть и ваше место стоячее");
            } else {
                System.out.println("Мест в вагоне нет");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 111;
        int two = 1222;
        int three = 1328;
        if (one> two && one > three ) {
            System.out.println("Наибольшим числом является " + one);}
        else {
            if (two > one && two> three) {
                System.out.println("Наибольшим числом является " + two);
            } else {
                System.out.println("Наибольшим числом является " + three);
            }
        }
    }
}