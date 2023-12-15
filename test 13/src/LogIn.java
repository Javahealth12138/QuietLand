import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.io.FileOutputStream;

import javax.swing.*;

public class LogIn extends JFrame implements ActionListener {
    JTextField jtf1;
    JPasswordField jtf2;
    Font font = new Font("宋体", 0, 20);

    public LogIn() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        this.setLayout((LayoutManager)null);
        this.setTitle("登录界面");
        this.setSize(380, 750);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        setResizable(false); //不可放大
        JLabel jl1 = new JLabel("用户名：");
        JLabel jl2 = new JLabel("密  码：");
        JLabel jl = new JLabel(new ImageIcon("src/pic/bac.png"));
        jl1.setFont(this.font);
        jl2.setFont(this.font);
        this.jtf1 = new JTextField();
        this.jtf2 = new JPasswordField();
        this.jtf1.setFont(this.font);
        this.jtf2.setFont(this.font);
        JButton jb1 = new JButton("确定登陆");
        JButton jb2 = new JButton("注册新用户");
        JButton jb3 = new JButton("忘记密码？");
        jb1.setFont(this.font);
        jb2.setFont(this.font);
        jb3.setFont(this.font);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jl1.setBounds(80, 320, 80, 30);
        this.jtf1.setBounds(170, 320, 150, 30);
        jl2.setBounds(80, 400, 80, 30);
        this.jtf2.setBounds(170, 400, 150, 30);
        jb1.setBounds(100, 490, 160, 30);
        jb2.setBounds(190, 650, 150, 30);
        jb3.setBounds(30, 650, 140, 30);
        jl.setBounds(0,0,380,750);
        this.add(jl1);
        this.add(this.jtf1);
        this.add(jl2);
        this.add(this.jtf2);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jl);
    }

    public void actionPerformed(ActionEvent e) {
        String userName = this.jtf1.getText().trim();
        String passWord = this.jtf2.getText().trim();
        //UserService us = new UserService();  //逻辑层名字
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("确定登陆")) {
            //逻辑层名字引入后删除
                this.dispose();
                new MainFrame();
            //逻辑层名字确定后引入
//            if (us.isRight(userName, passWord)) {
//                this.dispose();
//                new MainFrame();
//            } else {
//                JOptionPane.showMessageDialog((Component)null, "用户名或密码不正确 ，请重新输入！", "错误", 0);
//            }
        } else if (e.getActionCommand().equals("注册新用户")) {
            this.jtf1.setText("");
            this.jtf2.setText("");
            this.jtf1.requestFocus();  //获取光标
            this.dispose();
            Register register = null;
            try {
                register = new Register();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (InstantiationException instantiationException) {
                instantiationException.printStackTrace();
            } catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                unsupportedLookAndFeelException.printStackTrace();
            }
            register.setVisible(true);
        }else if (e.getActionCommand().equals("忘记密码？")){
            this.dispose();
            new Forget();
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        LogIn LogIn = new LogIn();
        LogIn.setVisible(true);
    }
}


