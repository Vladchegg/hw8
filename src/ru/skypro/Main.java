package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int year = 2020;
        determineYear(year);

    // Задача 2
        int clientOs = 0;
        int clientDeviceYear = 2022;
        installTheApp(clientOs, clientDeviceYear);

    // Задача 3
        int deliveryDistance = 60;
        int deliveryDays = 1;
        needDays(deliveryDistance, deliveryDays);

    }
    public static void determineYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }

    public static void installTheApp (int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2022){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs != 0 && clientDeviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs != 0 && clientDeviceYear >= 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void needDays (int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <=20) {
            System.out.println("На доставку потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <=60) {
            System.out.println("На доставку потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance <=100) {
            System.out.println("На доставку потребуется дней: " + (deliveryDays + 2));
        } else if (deliveryDistance >100) {
            System.out.println("К сожалению, доставка невозможна");
        }
    }

}
