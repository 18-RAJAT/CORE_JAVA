package Questions;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        int n;
        n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;++i) {
            arr[i] = scn.nextInt();
        }
        int element=scn.nextInt();
        int  occurrence=0;

        for(int i=0;i<n;++i)
        {
            if(element==arr[i])
            {
                occurrence++;
            }
        }
        System.out.println("Element is :" + element +"---- "+ "Occur-> "+occurrence + "Times :");
    }
}
