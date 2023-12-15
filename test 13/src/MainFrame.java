import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {
    JLabel jl;
    Font font0 = new Font("宋体", 0, 14);
    Font font1 = new Font("宋体", 0, 18);
    Font font2 = new Font("宋体", 0, 21);


    JTextField jtf1;

    public MainFrame() {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int)screensize.getWidth();
        int screenHeight = (int)screensize.getHeight();
        setResizable(false);    //不可放大
        this.setLayout((LayoutManager)null);
        this.setTitle("主界面");
        this.jl = new JLabel(new ImageIcon("picture"));
        this.add(this.jl);
        this.setSize(380, 750);
        this.setLocationRelativeTo(null);
//        this.setLocation(screenWidth - 500, 0);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.jtf1 = new JTextField();
        JButton jb1 = new JButton("搜索");
        JButton jb2 = new JButton("主 页");
        JButton jb3 = new JButton("我 的");
        //调养妙方区域
        JLabel jl1 = new JLabel("调养妙方");
        JButton jb1l1 = new JButton("...了解更多");
        JButton jb2l1 = new JButton("糖尿病");
        JButton jb3l1 = new JButton("高血压");
        //推荐三餐区域
        JLabel jl2 = new JLabel("推荐三餐");
        jb1.setFont(this.font1);
        jb2.setFont(this.font1);
        jb3.setFont(this.font1);
        jb2l1.setFont(this.font1);
        jb3l1.setFont(this.font1);
        jb3.setFont(this.font1);
        jb1l1.setFont(this.font0);
        jl1.setFont(this.font2);
        jl2.setFont(this.font2);
        jb1.setBounds(290,20,70,30);
        jb2.setBounds(30, 650, 140, 30);
        jb3.setBounds(190, 650, 150, 30);
        jb1l1.setBounds(230,220,130,30);     //了解更多按钮
        jb2l1.setBounds(50,350,100,30);
        jb3l1.setBounds(210,350,100,30);
        this.jtf1.setBounds(10, 20, 280, 30);
        jl1.setBounds(10,200,180,30);
        jl2.setBounds(10,400,180,30);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb1l1);
        this.add(jb2l1);
        this.add(jb3l1);
        this.add(this.jtf1);
        this.add(jl1);
        this.add(jl2);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
