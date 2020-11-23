import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        while (true){
        int x,y;
        System.out.println("输入一个随机数：");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        x=(int)(Math.random()*100);
        y=(int)(Math.random()*100);
        System.out.println("坐标："+"("+x+","+y+")");
    }
}}
