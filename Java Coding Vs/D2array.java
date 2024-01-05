import java.util.Scanner;
public class D2array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of row and column: ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("Array["+i+"]"+"["+j+"]= :");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Array["+row+"]"+"["+column+"]");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
         
          System.out.println();
        }
    }
}
