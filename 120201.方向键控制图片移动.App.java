import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_feiji=new JLabel();
    JLabel label_beijing=new JLabel();
    int xu=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_feiji.setBounds(label_feiji.getX(),label_feiji.getY()-xu,xu,xu);
                }
                if(e.getKeyCode()==e.VK_DOWN){
                    label_feiji.setBounds(label_feiji.getX(),label_feiji.getY()+xu,xu,xu);
                }
                if(e.getKeyCode()==e.VK_LEFT){
                    label_feiji.setBounds(label_feiji.getX()-xu,label_feiji.getY(),xu,xu);
                }
                if(e.getKeyCode()==e.VK_RIGHT){
                    label_feiji.setBounds(label_feiji.getX()+xu,label_feiji.getY(),xu,xu);
                }
            }

        });
    }
    //显示窗体方法
    void go(){
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_feiji.setIcon(new ImageIcon(imgURL));
        label_feiji.setBounds(200,720,xu,xu);
        label_txt.setBounds(0,0,200,30);
        java.net.URL bjimgURL = App.class.getResource("img/g.jpg");
        label_beijing.setIcon(new ImageIcon(bjimgURL));
        label_beijing.setBounds(0,0,512,720);
        myPanel.add(label_feiji);
        myPanel.add(label_beijing);
        myPanel.setFocusable(true);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("雷霆战机1.0");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
