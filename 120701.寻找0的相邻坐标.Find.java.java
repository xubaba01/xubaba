package Xu;

import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws InterruptedException {
        int arry[][]={
                {100,555},
                {200,444},
                {300,333},
                {400,222},
                {500,111},
        };
        Random random=new Random();

        while (true){
            int i = random.nextInt(4)+1;
            Thread.sleep(1000);
        System.out.println(arry[i][0]+"-----"+arry[i][1]);
        }

    }


}
