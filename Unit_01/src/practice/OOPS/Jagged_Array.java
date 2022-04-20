package practice.OOPS;
import java.util.*;
import java.io.*;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Taking the input
        int ip = scn.nextInt();
        int arr[][] = new int[ip][];

        for(int i=0;i<arr.length;++i)

            arr[i] = new int[i+1];

        int temp = 0;

        for(int i=0;i<arr.length;++i)

            for(int j=0;j<arr[i].length;++j)

                arr[i][j] = temp++;

            System.out.println("Enter the 2-D Jagged array is n " + arr);

            for( int i = 0; i<arr.length; ++i)

                for(int j=0;j<arr[i].length;++j)

                    System.out.print(arr[i][j] + " ");

            System.out.println();

        }
    }
