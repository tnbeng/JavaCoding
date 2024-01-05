public class D1Mul {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={5,6,6};
        int mul[]=new int[3];
        for(int i=0;i<3;i++)
        {
           mul[i]=arr1[i]*arr2[i];
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(mul[i]);
        }
    }
}
