package practice;


class array {
    static void min(int arr[]) {

        int min = arr[0];
        for(int i=1;i<arr.length;++i) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        System.out.println(min);

    }
    public static void main(String[] args)
    {
        int a[] = {24,3,2,7,9};

        min(a);
    }

}
