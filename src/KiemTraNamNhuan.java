import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year;
        year = sc.nextInt();
//        if (year%4==0){
//            if (year%100==0){
//                if (year%400==0){
//                    System.out.println(year+" is a leap Year");
//                }else {
//                    System.out.println(year+" is not leap Year");
//                }
//            }else {
//                System.out.println(year+" is a leap Year");
//            }
//        }else {
//            System.out.println(year+" is not leap Year");
//        }

        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap Year");
        } else {
            System.out.println(year + " is not a leap Year");
        }
    }
}
