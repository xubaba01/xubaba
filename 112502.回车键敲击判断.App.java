import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public APP() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (textArea_A.getText().equals("蔡徐坤")) {
                        textArea_B.setText("回答正确");
                    }else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        textArea_B.setText("丑拒");

                }}
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,100,100);
        textArea_B.setBounds(100,300,100,100);
        textArea_A.setBackground(Color.yellow);
        textArea_B.setBackground(Color.green);
        textArea_A.setText("魔镜，谁最丑");
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("照亮你的美");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
