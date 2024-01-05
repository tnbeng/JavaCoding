import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        System.out.print("Enter two integer number:");
        Scanner sc=new Scanner(System.in);
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int result=var1+var2;
        System.out.println( var1+" + "+var2 +" = "+result);
    }
}
