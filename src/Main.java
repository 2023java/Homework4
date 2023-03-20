public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

}