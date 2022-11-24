public class Main {
    public static void main(String[] args) {
//case 1
        System.out.println("case 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
//case 2
        System.out.println("case 2");
        int operatingSystem = 1;
        int clientDeviceYear = 2000;
        if (operatingSystem==0){
            if (clientDeviceYear<2015){
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        } else {
            if (clientDeviceYear<2015){
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
//Case 3
        System.out.println("Case 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println(year+ " год является високосным");
        } else{
            System.out.println(year+" год является не високосным");
        }
// Case 4
        System.out.println("case 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20){
            deliveryDays++;
                            }
        if (deliveryDistance > 60){
            deliveryDays++;
        }
        System.out.println("Потребутся дней: "+deliveryDays);

//Case 5
        System.out.println("Case 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("непрывельный месяц");
        }

    }
}
