package JAVA_EXAM;

import java.util.Scanner;

public class in_max_temp {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[][] temp=new int[10][6];
            int i,j;
            for(i=1;i<6;i++) {
                if(i==1) {
                    System.out.println("Enter the Temperatures of first 10 days for Delhi");
                }
                else if(i==2) {
                    System.out.println("Enter the Temperatures of first 10 days for Mumbai for first 10 days:");
                }
                else if(i==3) {
                    System.out.println("Enter the Temperatures of first 10 days for Kolkata for first 10 days:");
                }
                else if(i==4) {
                    System.out.println("Enter the Temperatures of first 10 days for Chennai for first 10 days:");
                }
                else {
                    System.out.println("Enter the Temperatures of first 10 days for Dehradun for first 10 days:");
                }
                for(j=0;j<10;j++) {
                    temp[j][i]=sc.nextInt();
                }
            }
            System.out.println("Day\tDelhi\t\tMumbai\t\tKolkata\t\tChennai\t\tDehradun");
            for(i=0;i<10;i++) {
                System.out.print(i+1+"\t");
                for(j=1;j<6;j++) {
                    System.out.print(temp[i][j]+"\t\t");
                }
                System.out.print("\n");
            }
        }

    }