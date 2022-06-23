public class Main {
    public static void main(String[] args) {
        // Task 1
        int clientOS = 0 ;
        if (clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
            // Task 2
            int clientDeviceYear = 2014;
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            // Task 3
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("год является високосным");
            } else {
                System.out.println("год не является високосным");
            }
            // Task 4
            int deliveryDistance = 15;
            if (deliveryDistance <= 20 && deliveryDistance >= 0) {
                System.out.println("Доставка займет один день");
            } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
                System.out.println("Доставка займет два дня");
            } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
                System.out.println("Доставка займет три дня");

            }
            // Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


        }

    }