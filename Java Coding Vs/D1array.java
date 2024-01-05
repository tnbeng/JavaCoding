import java.util.Scanner;
public class D1array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Insert element,arr["+i+"]=");
            arr[i]=sc.nextInt();
        }

        System.out.print("Array["+n+"]={" );
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            if(i!=n-1)
            System.out.print(",");
        }
        System.out.print("}");
        
    }
}
