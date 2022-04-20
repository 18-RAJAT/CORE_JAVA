package practice;

public class MultidiamensialArray {
    public static void main(String[]args)
    {
        int arr[][] = {{2,3,11},{1,4,7},{3,6,8}};

        for(int i=0;i<3;++i)
        {
            for(int j=0;j<3;++j)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
