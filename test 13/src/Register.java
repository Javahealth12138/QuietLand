import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.*;

public class Register extends JFrame implements ActionListener{
    //ComboBoxduoxuan

    JTextField jtf4;
    JTextField jtf5;
    JPasswordField jtf6;
    JPasswordField jtf7;
    private JPanel pan0 = new JPanel();
    private JPanel pan1 = new JPanel();     //创建面板1
    private JPanel pan2 = new JPanel();
    private JPanel pan3 = new JPanel();
    private JPanel pan4 = new JPanel();
    private JPanel pan5 = new JPanel();
    private JPanel pan6 = new JPanel();
    private JPanel pan7 = new JPanel();
    private JPanel pan8 = new JPanel();
    private JPanel pan3s1 = new JPanel();
    private ButtonGroup bg = new ButtonGroup();  //性别选项
    private String[] heart = {"无","高血压","高血糖","高血脂","冠心病","房间隔缺损"};
    private JComboBox heartcombo = new JComboBox(heart);
    private String[] breath = {"无","哮喘","支气管炎","肺炎","鼻炎","咽炎"};
    private JComboBox breathcombo = new JComboBox(breath);
    private String[] digest = {"无","胃炎","胃食管反流","消化性溃疡","食管肿瘤","肠炎"};
    private JComboBox digestCombo = new JComboBox(digest);
    private String[] liver = {"无","肝炎","肝硬化","肝肿囊","脂肪肝","肝内胆管结石"};
    private JComboBox liverCombo = new JComboBox(liver);
    private String[] brain = {"无","面神经炎","三叉神经痛","癫痫","脑梗塞","脑栓塞"};
    private JComboBox brainCombo = new JComboBox(brain);
    private String[] immu = {"无","风湿性关节炎","艾滋病","系统性红斑狼疮","接触性皮炎","皮肌炎"};
    private JComboBox immuCombo = new JComboBox(immu);
    private String[] meta = {"无","糖尿病","高血糖","痛风","高血脂","脂肪肝"};
    private JComboBox metaCombo = new JComboBox(meta);
    Font font0 = new Font("宋体", 0, 40);
    Font font = new Font("宋体", 0, 20);
    Font font1 = new Font("宋体", 0, 16);


    public Register() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        this.setLayout((LayoutManager)null);
        this.setTitle("注册界面");
        this.setSize(380, 750);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        setResizable(false);    //不可放大

        JLabel jl0 = new JLabel("用户注册");
        JLabel jl1 = new JLabel("性别：");
        JLabel jl2 = new JLabel("既往病史：");
        JLabel jl2s1 = new JLabel("心血管疾病：");
        JLabel jl2s2 = new JLabel("呼吸系统疾病：");
        JLabel jl2s3 = new JLabel("消化系统疾病：");
        JLabel jl2s4 = new JLabel("肝脏系统疾病：");
        JLabel jl2s5 = new JLabel("神经系统疾病：");
        JLabel jl2s6 = new JLabel("免疫系统疾病：");
        JLabel jl2s7 = new JLabel("代谢性疾病：");
        JLabel jl3 = new JLabel("偏好口味：");
        JLabel jl4 = new JLabel("地区：");
        JLabel jl5 = new JLabel("用户名：");
        JLabel jl6 = new JLabel("密  码：");
        JLabel jl7 = new JLabel("确认密码：");
        JLabel jl = new JLabel(new ImageIcon("src/pic/bac.png"));

        JRadioButton male= new JRadioButton("男");
        JRadioButton female = new JRadioButton("女");

        JCheckBox spicy = new JCheckBox("辣");
        JCheckBox notspicy = new JCheckBox("不辣");

        jl0.setFont(this.font0);
        jl1.setFont(this.font);
        male.setFont(this.font);
        female.setFont(this.font);
        spicy.setFont(this.font);
        notspicy.setFont(this.font);

        jl2s1.setFont(this.font1);
        jl2s2.setFont(this.font1);
        jl2s3.setFont(this.font1);
        jl2s4.setFont(this.font1);
        jl2s5.setFont(this.font1);
        jl2s6.setFont(this.font1);
        jl2s7.setFont(this.font1);

        jl2.setFont(this.font);
        jl3.setFont(this.font);
        jl4.setFont(this.font);
        jl5.setFont(this.font);
        jl6.setFont(this.font);
        jl7.setFont(this.font);

        pan0.setOpaque(false);     //设置JPanel背景色透明
        pan1.setOpaque(false);
        pan2.setOpaque(false);
        pan3.setOpaque(false);
        pan4.setOpaque(false);
        pan5.setOpaque(false);
        pan6.setOpaque(false);
        pan7.setOpaque(false);
        pan8.setOpaque(false);
        pan3s1.setOpaque(false);

        male.setOpaque(false);  //设置选项透明
        female.setOpaque(false);
        spicy.setOpaque(false);
        notspicy.setOpaque(false);

        this.jtf4 = new JTextField();
        this.jtf5 = new JTextField();
        this.jtf6 = new JPasswordField();
        this.jtf7 = new JPasswordField();
        this.jtf4.setFont(this.font);
        this.jtf5.setFont(this.font);
        this.jtf6.setFont(this.font);
        this.jtf7.setFont(this.font);
        JButton jb1 = new JButton("注册");
        JButton jb2 = new JButton("重置");
        jb1.setFont(this.font);
        jb2.setFont(this.font);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jl2.setBounds(20, 130, 120, 30);
        jl3.setBounds(20, 370, 200, 30);
        jl4.setBounds(20, 410, 80, 30);
        this.jtf4.setBounds(100, 410, 150, 30);
        jl5.setBounds(20, 450, 80, 30);
        this.jtf5.setBounds(100, 450, 150, 30);
        jl6.setBounds(20, 490, 80, 30);
        this.jtf6.setBounds(100, 490, 150, 30);
        jl7.setBounds(20, 530, 120, 30);
        this.jtf7.setBounds(120, 530, 150, 30);
        jb1.setBounds(40, 580, 100, 30);
        jb2.setBounds(200, 580, 100, 30);
        jl.setBounds(0,0,380,750);

        pan0.setBounds(20, 20, 300, 60);
        pan1.setBounds(0,90,200,30);
        pan2.setBounds(10,160,275,30);
        pan3.setBounds(10,190,280,30);
        pan4.setBounds(10,220,290,30);
        pan5.setBounds(10,250,300,30);
        pan6.setBounds(10,280,290,30);
        pan7.setBounds(10,310,310,30);
        pan8.setBounds(10,340,248,30);
        pan3s1.setBounds(5,370,250,30);

        pan0.add(jl0);
        pan1.add(jl1);
        pan1.add(male);
        pan1.add(female);
        bg.add(male);
        bg.add(female);

        pan2.add(jl2s1);
        pan2.add(heartcombo);
        pan3.add(jl2s2);
        pan3.add(breathcombo);
        pan4.add(jl2s3);
        pan4.add(digestCombo);
        pan5.add(jl2s4);
        pan5.add(liverCombo);
        pan6.add(jl2s5);
        pan6.add(brainCombo);
        pan7.add(jl2s6);
        pan7.add(immuCombo);
        pan8.add(jl2s7);
        pan8.add(metaCombo);

        pan3s1.add(jl3);
        pan3s1.add(spicy);
        pan3s1.add(notspicy);

        this.add(pan0);
        this.add(pan1);
        this.add(pan2);
        this.add(pan3);
        this.add(pan4);
        this.add(pan5);
        this.add(pan6);
        this.add(pan7);
        this.add(pan8);
        this.add(pan3s1);
        this.add(jl2);
        this.add(jl4);
        this.add(this.jtf4);
        this.add(jl5);
        this.add(this.jtf5);
        this.add(jl6);
        this.add(this.jtf6);
        this.add(jl7);
        this.add(this.jtf7);
        this.add(jb1);
        this.add(jb2);
        this.add(jl);

    }

    public void actionPerformed(ActionEvent e) {
        String userName = this.jtf5.getText().trim();
        String passWord = this.jtf6.getText().trim();
        String passWord1 = this.jtf7.getText().trim();
        //逻辑层名字确定后引入
//        UserService us = new UserService();
        if (e.getActionCommand().equals("注册")) {
            if (!userName.equals("") && !passWord.equals("") && !passWord1.equals("")) {
                if (!passWord.equals(passWord1)) {
                    JOptionPane.showMessageDialog((Component)null, "密码和确认密码不一致！！！", "密码错误", 0);
                    this.jtf7.setText("");
                    this.jtf7.requestFocus();
                    return;
                }

//                User user = new User();
//                user.setPassWord(passWord);
//                user.setUserName(userName);
//                us.addUser(user);
                JOptionPane.showMessageDialog((Component)null, "用户注册成功！！！！！", "注册成功", 1);
                this.dispose();
                LogIn LogIn = null;

                try {
                    LogIn = new LogIn();
                } catch (ClassNotFoundException var9) {
                    var9.printStackTrace();
                } catch (InstantiationException var10) {
                    var10.printStackTrace();
                } catch (IllegalAccessException var11) {
                    var11.printStackTrace();
                } catch (UnsupportedLookAndFeelException var12) {
                    var12.printStackTrace();
                }

                LogIn.setVisible(true);
            } else {
                JOptionPane.showMessageDialog((Component)null, "用户名或密码不能为空！ ，请重新输入！", "错误", 0);
            }
        } else if (e.getActionCommand().equals("重置")) {

            this.jtf4.setText("");
            this.jtf5.setText("");
            this.jtf6.setText("");
            this.jtf7.setText("");
            this.jtf5.requestFocus();
        }

    }
}


