package D112301;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入字符");
            String i = scanner.next();
            if (i.equals("a")) {
                int x = random.nextInt(100) + 1;
                int y = random.nextInt(100) + 1;
                System.out.println("x的坐标为:" + x + "----y的坐标为:" + y);
                break;
            } else {
                System.out.println("输入字符错误");
            }
        }
    }
