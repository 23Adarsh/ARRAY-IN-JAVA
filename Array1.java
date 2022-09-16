public class Array1{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0;i<11;i++)
        {
            if (arr[i]%2==0)
            {
                System.out.print(""+arr[i]+" Even");
            }
            else
            {
                System.out.print(""+arr[i]+" Odd");
            }
            System.out.println();
        
        }
    }
}
