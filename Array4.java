import java.util.Scanner;
public class Array4 {
    public static void main(String[] args)
    {
        int arr[] = new int [5];
        int arr1[] = new int [5];

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Value in First Array  -:");
        for(int i=0;i<5;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("First Array Elements -: "); 
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.print("\nCopy Element first Array to Second element -:");
        for(int i=0;i<5;i++)
        {
            arr1[i]=arr[i];
            System.out.print(arr1[i]+" ");
        }
        

    }  
    
}
