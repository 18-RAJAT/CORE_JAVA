package Assessment;
import java.util.*;
import java.io.InputStream;

class Array_insert_search_traverse {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr[][] = new int[3][3];

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; ++j) {
                 arr[i][j] = sc.nextInt();
             }
         }
         //Display
         for (int i = 0; i < arr.length; ++i) {
             for (int j = 0; j < arr[i].length; ++j) {
                 System.out.println(arr[i][j] + " ");
             }
             System.out.println(" ");
         }
         //Searching
         int key = sc.nextInt();
         int flag = 0;
         for (int i = 0; i < arr.length; ++i) {
             for (int j = 0; j < arr[i].length; ++j) {
                 if (arr[i][j] == key) {
                     System.out.println(key + " Is Present");
                     flag = 1;
                     break;
                 }
             }

             if (flag == 0) {
                 System.out.println(key + " Not Present");
             }
         }
     }
 }
