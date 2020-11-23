import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        while (true){
        int x,y,z;
        System.out.println("请输入1：");
        Scanner scanner=new Scanner(System.in);
        z=scanner.nextInt();
            if(z==1){
        x=(int)(Math.random()*100);
        y=(int)(Math.random()*100);
        System.out.println("坐标："+"("+x+","+y+")");
    }
        else {
            System.out.println("输入错误：");
            }}
}}
