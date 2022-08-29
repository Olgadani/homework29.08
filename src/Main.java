public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int age1 = 18;
        if (age1 >= 7 && age1 < 18){
            System.out.println("Ребенок ходит в школу");
        } else if (age1 >= 18 && age1 < 24) {

            System.out.println("Человек может отправляться в университет");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Задача 3");
        int capacity = 60;
        if (capacity <= 60) {
            System.out.println("Есть свободные сидячие и стоячие места");
        }
        else if (capacity > 60 && capacity < 102){
            System.out.println("Есть свободные стоячие места, сидячие все заняты");
        }
        else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задача 7");
        int age2 = 25;
        boolean preschoolOld = age2 >= 2 && age2 <=6;
        if(preschoolOld) {
            System.out.println("Если возраст человека от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        boolean schoolAge = age2 >= 7 && age2 <=18;
        if(schoolAge) {
            System.out.println("Если возраст человека от 7 до 18 лет, то ему нужно ходить в школу");
        }
        boolean univercityAge = age2 > 18 && age2 < 24;
        if (univercityAge) {
            System.out.println("Если возраст человека больше 18 лет, но меньше 24, то его место в университете");
        }
        boolean adultAge = age2 > 24;
        if(adultAge) {
            System.out.println("Если возраст человека больше 24, то ему пора ходить на работу");
        }
    }
}