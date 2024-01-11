

public class pattern1 {
   public static void main(String[] args) {
    System.out.println("Pattern 1");
    for(int i=0;i<5;i++)
    {
       for(int j=0;j<=i;j++)
       {
         System.out.print("* ");
       }
       System.out.println();
    }

    System.out.println("Pattern 2");
    for(int i=0;i<5;i++)
    {
       for(int j=5;j>i;j--)
       {
         System.out.print("* ");
       }
       System.out.println();
    }
       System.out.println();
    

    System.out.println("Pattern 3");
    for(int i=0;i<5;i++)
    {
       for(int j=0;j<5;j++)
       { 
         System.out.print("* ");  
       }
       System.out.println();
    }
    
    System.out.println("Pattern 4");
    for(int i=1;i<=5;i++)
    {
       for(int j=1;j<=5;j++)
       { 
         System.out.print(i+" ");  
       }
       System.out.println();
    }
    System.out.println("Pattern 4");
    for(int i=1;i<=5;i++)
    {
       for(int j=1;j<=5;j++)
       { 
         System.out.print(j+" ");  
       }
       System.out.println();
    }  
    System.out.println("Pattern 5");
    for(int i=0;i<5;i++)
    {
       for(int j=0;j<5;j++)
       { 
         if(i==0 || i==4 || j==0 || j==4)
         {
            System.out.print("* ");
         }
         else
         {
            System.out.print(" ");
         }
       }
       System.out.println();
    }

    System.out.println("Pattern 6");
        int count=1;
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5;j++)
           { 
            if(count<10)
            {
               System.out.print("0");
            }
            System.out.print(count+++" ");
           }
           System.out.println();
        }
    System.out.println("Pattern 6");
       
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5;j++)
           { 
            if(i*j<10)
            {
               System.out.print("0");
            }
            System.out.print(i*j+" ");
           }
           System.out.println();
        }
   
    System.out.println("Pattern 7");
       for(int i=0;i<5;i++)
       {
         for(int k=0;k<5-i;k++)
         {
            System.out.print(" ");
         }

         for(int j=0;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println();
       }
    System.out.println("Pattern 8");
       for(int i=0;i<5;i++)
       {
         for(int k=0;k<5-i;k++)
         {
            System.out.print(" ");
         }

         for(int j=0;j<=i;j++)
         {
            System.out.print("* ");
         }
         System.out.println();
       }
   }
}
