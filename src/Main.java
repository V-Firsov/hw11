import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    private static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printInfoAboutYear(int year) {
        boolean leapYear = checkYear(year);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    private static void printInfoAboutPhone(int os, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear == currentYear) {
            System.out.println("Установите обычную версию приложения");
        } else {
            System.out.println("Установите облегченную версию приложения");
        }
        if (os == 0) {
            System.out.println("для iOS по ссылке");
        } else {
            System.out.println("для Andriod по ссылке");
        }
    }


    private static int checkInfoAboutDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return - 1;
        }



    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        printInfoAboutYear(year);
    }


    public static void task2() {
        System.out.println("Задача 2");
        printInfoAboutPhone(0, 2019);
    }




    public static void task3(){
        System.out.println("Задача 3");
        int distance = 27;
        int days = checkInfoAboutDays(distance);
        if (days == - 1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Будет доставлено за " + days + " дн.");
        }
    }
}

