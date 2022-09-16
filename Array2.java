public class Array2 {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;

        for(int i=0;i<arr.length;i++)
        { 
            System.out.print(arr[i]+" ");
            sum = arr[i]+sum;
        }
        System.out.print(sum);
    }
}
 