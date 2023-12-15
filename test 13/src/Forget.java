import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Forget extends JFrame {
    JLabel jl;
    public Forget(){
        //this.setLayout(null);// 取消布局管理,默认是BorderLayout
        this.setTitle("忘记密码");
        this.setSize(380, 750);
        this.setLocationRelativeTo(null);// 居中显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl = new JLabel(new ImageIcon("src/pic/icon.bmp"));
        this.add(this.jl);
        this.setVisible(true);
        setResizable(false); //不可放大
    }
}
