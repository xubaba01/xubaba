import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int nian;
        while(true){
            System.out.println("输入年份：");
            Scanner scanner = new Scanner(System.in);
            nian = scanner.nextInt();
            if(nian<-3200 || nian >3200){
                System.out.println("年份不正确");
            }
            else if(nian>0 && nian%4==0&&nian%100!=0||nian%400==0){
                System.out.println("公元后"+nian+"年是闰年");
            }else if(nian%4==-1 || nian%400==1){
                System.out.println("公元前"+nian+"年是闰年");
            }else{
                System.out.println(nian+"年不是闰年");
            }
        }

    }
    }

