package Assessment;

import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[]args) {
        int arr1[][] = new int[3][];
        arr1[0]=new int[3];
        arr1[1]=new int[4];
        arr1[2]=new int[2];
        Scanner sc=new Scanner(System.in);

        //IP
        for(int i=0;i<arr1.length;++i)
        {
            for(int j=0;j<arr1[i].length;++j)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        //Display
        for(int i=0;i<arr1.length;++i)
        {
            for(int j=0;j<arr1[0].length;++j)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
