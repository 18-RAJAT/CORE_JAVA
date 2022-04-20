package practice;

public class Cloning_An_Array {

    public static void main(String[]args) {
        int arr[] = {1, 4, 6, 8, 9, 3};
        System.out.println("Array is");

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("Cloning the array");

        int clone[] = arr.clone();

        for (int ch : clone) {
            System.out.println(ch);
        }

       System.out.println("Both are same !!");
        System.out.println(arr == clone);
    }
}
