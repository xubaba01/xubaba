import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份:");
        int nian=scanner.nextInt();
        if(nian%4==0 && nian%100!=0 || nian%400==0) {
            System.out.println("是闰年");
        }
        else {System.out.println("不是闰年");
        }
    }
    }

