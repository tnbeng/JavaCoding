public class D2mul {
    public static void main(String[] args) {
        
        int arr1[][]={{1,2},{3,4}};
                      
        int arr2[][]={{2,1},{4,3}};
        int mul[][]=new int[2][2];
                     
        
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            { 
               int sum=0;
               for(int m=0;m<2;m++) 
               { 
                sum=sum+arr1[i][m]*arr2[m][j];//For first matrix row is fixed that is i
                //for second matrix column is fixed only m will be changing 
               }
               mul[i][j]=sum;
            }
            

        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
