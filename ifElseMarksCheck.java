import java.util.Scanner;
public class ifElseMarksCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("___Enter the marks___");
        System.out.print("Enter the marks in Maths: ");
        int m1=sc.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int m2=sc.nextInt();
        System.out.print("Enter the marks in Computer Science: ");
        int m3=sc.nextInt();

        float avg=(m1+m2+m3)/3.0f;
        if(avg>=40&& m1>=33&& m2>=33 &&m3>=33 ){
            System.out.println("Congratulation You Are Passed");
        }
        else{
            System.out.println("Not Passed");
        }
    }
}
