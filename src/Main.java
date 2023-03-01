public class Main {

    public static void isYearLeap (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void determineVersion (byte clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }
    public static void determineDeliveryTime (int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance < 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка не осуществляется.");
        }
    }
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int checkedYear = 1600;
        isYearLeap(checkedYear);
        // Задача 2
        System.out.println("Задача 2");
        byte osType = 0;
        int osReleaseYear = 2019;
        determineVersion(osType, osReleaseYear);
        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        determineDeliveryTime(deliveryDistance);
    }
}
