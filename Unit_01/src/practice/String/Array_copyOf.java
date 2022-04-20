package practice.String;

import java.util.Arrays;

public class Array_copyOf {
    public static void main(String[]args)
    {
        int arr[] = new int[]{1,3,6,4,2};
        System.out.println("Original array");

        for(int i=0;i< arr.length;++i)
        {
            System.out.print(arr[i] +" ");
        }

        //Copy array
        int [] copy = Arrays.copyOf(arr,8);

        copy[5] = 11;
        copy[6] = 9;
        copy[7] = 119;

        System.out.println();
        System.out.println("New Modified array is");
        for(int i=0;i< copy.length;++i)
        {
            System.out.print (copy[i]+ " ");
        }
    }
}
