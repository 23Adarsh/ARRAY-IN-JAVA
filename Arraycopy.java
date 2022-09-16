
import java.util.Scanner;
public class Arraycopy {
    public static void main(String[] args)
    {
        int a[] = new int[3];
        int b[] = new int[3];

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Array Elements -:");

        for(int i=0;i<a.length;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("\n First Array Elements -: ");
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");

        }

        System.out.print("\n Elements Swapped First to Second Array -: ");
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }

    }
}
