import java.util.Scanner;
public class Km2Mm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length in Km: ");
        int km=sc.nextInt();
        double mm=(km*0.621371);
        System.out.print("Length in MM: ");
        System.out.print(mm);


    }
}
