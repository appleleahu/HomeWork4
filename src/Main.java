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
        // Task 6 - extra...
        int age = 19;
        int salary = 58_000;
        if (age >= 23) {
            System.out.println("Банка предоставит лимит в размере 3 зарплат: " + (salary * 3) + "рублей!");
        } else if (age < 23) {
            System.out.println("Банка предоставит лимит в размере 2 зарплат:" + (salary * 2) + "рублей!");
        }
        if (salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + (salary * 1.2) + "рублей!");
        } else if (salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + (salary * 1.5) + "рублей!");
        }
        // Task 7 - extra...
        int age1 = 25;
        int salary1 = 60_000;
        int maxPayMonthly = salary1 / 2;
        double percent = 10.0;
        double multiplier = percent / (100 * 1.0);
        int wantedSum = 330_000;
        double clientNeedPayMonthly = wantedSum / percent;
        if (age1 < 23) {
            System.out.println(percent + 1);
        } else if (age1 < 30 && age1 > 23) {
            System.out.println(percent + 0.5);
        }
        if (salary1 > 80_000) {
            System.out.println(percent - 0.7);
        }
        if (clientNeedPayMonthly > maxPayMonthly) {
            System.out.println("Максимальный платеж при ЗП:" + salary1 + ",равен: " + maxPayMonthly + "рублей!");
        } else if (clientNeedPayMonthly < maxPayMonthly) {
            System.out.println("Платеж по кредиту " + wantedSum + " рублей. Одобрено!");
        }
        if (clientNeedPayMonthly > maxPayMonthly){
            System.out.println("Платеж по кредиту " + wantedSum + " рублей. Отказано!");
        }








    }