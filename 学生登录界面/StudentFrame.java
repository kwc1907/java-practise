package java大作业;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class StudentFrame extends JFrame {    //创建一个登录界面
      Vector<Student> v = new Vector<Student>();           //创建一个动态数组的对象
     // Student student;         
    StudentLogin student = new StudentLogin();     //创建一个atm对象
    int num;
    String num1;    
    Container pane;          //content pane是container的一个对象
    CardLayout cc = new CardLayout();    //卡片布局
    JLabel labTop = new JLabel("学生信息管理系统");     //创建了一个标签写着欢迎你
    JLabel labTop2 = new JLabel("  "); //创建了另外一个空标签
    JLabel labTop3 = new JLabel("  "); //创建了另外一个空标签
    JLabel labTop4 = new JLabel("  "); //创建了另外一个空标签
    JLabel labTop5 = new JLabel("  "); //创建了另外一个空标签
    JTextField txtName = new JTextField(15);           //名字输入控制在15个字符以内
    JPasswordField txtPassword = new JPasswordField(15);   //密码输入控制在15个字符以内
    JButton butOK = new JButton("  登录  ");                 //创建一个OK按钮
    JButton butexit = new JButton("  退出  ");   
    public StudentFrame() {                                  //登录窗体标题框内容
        super("用户登录");
        initalInterface();
    }   
    private void initalInterface() {    //初始化设置       
        //设置登录按钮的字体
        Font font = new Font("Dialog", Font.BOLD, 16);
        butOK.setFont(font);
       //设置退出按钮的字体
        Font font2 = new Font("Dialog", Font.BOLD, 16);
        butexit.setFont(font2);        
       //设置"学生信息管理系统"的字体
        Font font1 = new Font("Dialog", Font.BOLD, 30);
        labTop.setFont(font1);              
        //开始构建菜单
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;      
        //创建菜单条
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);       
        //创建File菜单
        menu = new JMenu("文件");
        menuBar.add(menu);
        menuItem=new JMenuItem("打开");
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("退出");     
        //给菜单项Exit添加活动事件处理程序
        menuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            finish();
            System.exit(0);
        }
        });
        menu.add(menuItem);
        //创建Help菜单
        menu=new JMenu("帮助");
        menuBar.add(menu);
        menuItem=new JMenuItem("关于");
        menu.add(menuItem);
        //给菜单项About添加活动事件处理程序
        menuItem.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);              
            }
        });
        //结束构建菜单
        
        //构建第一张卡片panLogin
        JPanel panLogin = new JPanel();
        BoxLayout v = new BoxLayout(panLogin, BoxLayout.Y_AXIS);
        panLogin.setLayout(v);
        JPanel pt = new JPanel();
        panLogin.add(pt);
        pt = new JPanel();
        labTop.setForeground(Color.BLACK);
        pt.add(labTop);
        panLogin.add(pt);
        pt = new JPanel();
        pt.add(new JLabel("用户名："));
        pt.add(txtName);
        panLogin.add(pt);
        pt = new JPanel();
        pt.add(new JLabel("密码："));
        pt.add(txtPassword);
        panLogin.add(pt);
        //给OK按钮添加活动事件处理程序
        butOK.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOKActionPerformed(evt);
            }
        });
        pt = new JPanel();    
        pt.add(butOK);
        panLogin.add(pt);
        panLogin.add(new JPanel());
        //第一张卡片panLogin构建结束
        
        //构建第二张卡片panOperation
        JPanel panOperation = new JPanel();
        panOperation.setLayout(new BorderLayout());
        panOperation.add(labTop2, BorderLayout.NORTH);
        panOperation.add(new JLabel("  "), BorderLayout.SOUTH);      
        JLabel labTop7;   
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5, 3));
        JButton bPut = new JButton("添加学生信息");
       JButton bGet = new JButton("");
        JButton bSearch = new JButton("查询学生信息");
        JButton bQuit = new JButton("退出");
        //给四个按钮分别添加活动事件处理程
        bPut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPutActionPerformed(evt);
            }
        });
        bSearch.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        bQuit.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitActionPerformed(evt);
            }
        });
        p2.add(new JLabel(" "));
        p2.add(new JLabel(" "));
        p2.add(new JLabel(" "));
 
        p2.add(new JLabel(" "));
        p2.add(bPut);
        p2.add(new JLabel(" "));
 
        p2.add(new JLabel(" "));
         p2.add(new JLabel(" "));
       // p2.add(bGet);
        p2.add(new JLabel(" "));
 
        p2.add(new JLabel(" "));
        p2.add(bSearch);
        p2.add(new JLabel(" "));
 
        p2.add(new JLabel(" "));
       // p2.add(bQuit);
        p2.add(new JLabel(" "));
 
        panOperation.add(p2, BorderLayout.CENTER);
        //第二张卡片panOperation
 
        //在主窗口中添加前面构建的两张卡片panLogin和panOperation
        pane = getContentPane();
        pane.setLayout(cc);
        pane.add(panLogin, "login");
        pane.add(panOperation, "operation");
        //添加窗口关闭事件
        this.addWindowListener(new WindowAdapter() {
 
            //表示下面的方法是覆盖父类的方法
            @Override
            public void windowClosing(WindowEvent e) {
                finish();
            }
        });
        setSize(550, 550);
        //让起始窗口停在屏幕的中央
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dim = kit.getScreenSize();
        setLocation(dim.width / 2 - 150, dim.height / 2 - 100);
        //禁止用户改变窗口的大小
        this.setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
    }  
    private void finish(){
        student.saveData();
    }
    //由菜单About调用的方法
    private void aboutActionPerformed(java.awt.event.ActionEvent evt){
         JOptionPane.showMessageDialog(this,"欢迎使用温娉哲开发的学生信息管理系统！","欢迎使用",JOptionPane.INFORMATION_MESSAGE);
    }         
    //分别由五个按钮活动事件处理程序调用的方法
    private void butOKActionPerformed(java.awt.event.ActionEvent evt) {
        String no = txtName.getText();
        String pw = new String(txtPassword.getPassword());
        if (student.check(no, pw)) {
            labTop.setForeground(Color.black);
            labTop.setText("欢迎使用");
            txtName.setText("");
            txtPassword.setText("");
            cc.show(pane, "operation");
        } else {
            labTop.setForeground(Color.red);
            labTop.setText("您的账号或密码错误，请重新输入！");
        }
    }
    public void bPutActionPerformed(java.awt.event.ActionEvent evt) {
        num = Integer.parseInt(JOptionPane.showInputDialog(this, "请添加学生学号:"));
       labTop2.setText("添加的学生学号为:" + num);
       
        num1 = String.format(JOptionPane.showInputDialog(this, "请添加学生姓名:"));           
       //num1 = student.getCurrent(). inputName(num1);
       labTop2.setText("添加的学生姓名为:" + num1);
   }
   public void bSearchActionPerformed(java.awt.event.ActionEvent evt) {
      
      num = Integer.parseInt(JOptionPane.showInputDialog(this, "请输入要查询的学生学号:"));
        
      labTop2.setText("学号为" + num+"的学生姓名为"+num1);
   }
   private void bQuitActionPerformed(java.awt.event.ActionEvent evt) {
       labTop2.setText("");
       cc.show(pane, "login");
       txtName.requestFocusInWindow();
   }
   public static void main(String[] args) {
       StudentFrame student = new StudentFrame();
   }
}
