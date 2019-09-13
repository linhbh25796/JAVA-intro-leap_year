import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year;
        year = sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" is a leap Year");
                }else {
                    System.out.println(year+" is not leap Year");
                }
            }else {
                System.out.println(year+" is a leap Year");
            }
        }else {
            System.out.println(year+" is not leap Year");
        }
    }
}
