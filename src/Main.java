public class Main {
    public static void main(String[] args) {
        // Task 1
        int clientOS = 0;
        if (clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        int clientDeviceYear = 2014;
        if ( clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Task 3
        int year = 2021;
        if( year %4 == 0 && year %100 != 0 || year %400 ==0 ) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        // Task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20 || deliveryDistance >= 0) {
            System.out.println("Доставка займет один день");
        }
        if (deliveryDistance <= 60 || deliveryDistance >= 20) {
            System.out.println("Доставка займет два дня");
        }
        if ( deliveryDistance <= 100 || deliveryDistance >= 60 ) {
            System.out.println("Доставка займет три дня");

        }
        // Условные операторы, извиняюсь нужно будет пересмотреть видеоУроки, здаю ДЗ так как надо сдать в сроки.

    }


    }