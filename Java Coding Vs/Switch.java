import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter two integer numbers: ");
      
        Scanner sc=new Scanner(System.in);
        float var1=sc.nextFloat();
        float var2=sc.nextFloat();
        while(true) {
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divition\n5.Remainder or Modulo");
        System.out.print("Enter your choise:");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1: System.out.println("The result is "+(var1+var2));
            break;
            case 2: System.out.println("The result is "+(var1-var2));
            break;
            case 3: System.out.println("The result is "+(var1*var2));
            break;
            case 4: System.out.println("The result is "+ (var1/var2));
            break;
            case 5: System.out.println("The result is "+(var1%var2));
            break;
            default: System.out.println("Wrong choise,please choise among 1,2,3,4 and 5");
        }
    }
    }
}

