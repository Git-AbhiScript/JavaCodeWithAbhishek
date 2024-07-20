import java.util.Scanner;
public class CbsePercentageCalculater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Percentage calculation");
        System.out.println("Enter Total Marks");
        int a= sc.nextInt();
        System.out.println("Enter marks in English");
        int m1= sc.nextInt();
        System.out.println("Enter marks in Physics");
        int m2= sc.nextInt();
        System.out.println("Enter marks in Maths");
        int m3= sc.nextInt();
        System.out.println("Enter marks in Biology");
        int m4= sc.nextInt();
        System.out.println("Enter marks in Chemistry");
        int m5= sc.nextInt();

        int obtained=m1+m2+m3+m4+m5;
        float percent=(obtained*100)/(a*5);
        System.out.println(+percent+"%");
    }
}
