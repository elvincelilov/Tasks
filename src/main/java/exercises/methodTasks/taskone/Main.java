package exercises.methodTasks.taskone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();

        System.out.println(findmin(x,y));

    }

    public static int findmin(int a,int b){


        return a<b?a:b;
    }
}
