import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App1 {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_beijing=new JLabel();
    JLabel label_m=new JLabel();
    JLabel label_s=new JLabel();
    int xu=64;
    //构造方法
    public App1() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_s.setBounds(label_s.getX(),label_s.getY()-xu,xu,xu);
                }
                if(e.getKeyCode()==e.VK_DOWN){
                    label_s.setBounds(label_s.getX(),label_s.getY()+xu,xu,xu);
                }
                if(e.getKeyCode()==e.VK_LEFT){
                    label_s.setBounds(label_s.getX()-xu,label_s.getY(),xu,xu);
                }
                if(e.getKeyCode()==e.VK_RIGHT){
                    label_s.setBounds(label_s.getX()+xu,label_s.getY(),xu,xu);
                }
//                System.out.println(label_s.getX());
//                System.out.println(label_s.getY());
                if(label_s.getX()==960&&label_s.getY()==704){
                    JOptionPane.showMessageDialog(null,"你个孤儿，终于找到你妈妈了");
                }
            }
        });
    }
    //显示窗体方法
    void go(){

        label_txt.setBounds(0,0,200,30);
        java.net.URL simgURL = App1.class.getResource("img/s.png");
        label_s.setIcon(new ImageIcon(simgURL));
        label_s.setBounds(0,0,64,64);

        java.net.URL imgURL = App1.class.getResource("img/m.png");
        label_m.setIcon(new ImageIcon(imgURL));
        label_m.setBounds(960,704,64,64);

        java.net.URL bjimgURL = App1.class.getResource("img/b.png");
        label_beijing.setIcon(new ImageIcon(bjimgURL));
        label_beijing.setBounds(0,0,1024,768);
        myPanel.add(label_s);
        myPanel.add(label_m);
        myPanel.add(label_beijing);
        myPanel.setFocusable(true);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1117,850);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App1().go();
    }
}
