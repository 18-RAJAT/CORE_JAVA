package practice.OOPS;
import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Taking the input3

        int ip = scn.nextInt();
        int arr[][] = new int[ip][];
        for(int j=0;j<ip;j++) {
            int k = scn.nextInt();
            arr[j] = new int[k];
        }
        System.out.println("Enter elements : ");
        for(int j=0;j<arr.length;j++)
            for(int i=0;i<arr[i].length;i++)

                arr[j][i] = scn.nextInt();
//        int temp = 0;

            for( int i = 0; i< arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
