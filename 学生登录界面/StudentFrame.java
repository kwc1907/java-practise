package java����ҵ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class StudentFrame extends JFrame {    //����һ����¼����
      Vector<Student> v = new Vector<Student>();           //����һ����̬����Ķ���
     // Student student;         
    StudentLogin student = new StudentLogin();     //����һ��atm����
    int num;
    String num1;    
    Container pane;          //content pane��container��һ������
    CardLayout cc = new CardLayout();    //��Ƭ����
    JLabel labTop = new JLabel("ѧ����Ϣ����ϵͳ");     //������һ����ǩд�Ż�ӭ��
    JLabel labTop2 = new JLabel("  "); //����������һ���ձ�ǩ
    JLabel labTop3 = new JLabel("  "); //����������һ���ձ�ǩ
    JLabel labTop4 = new JLabel("  "); //����������һ���ձ�ǩ
    JLabel labTop5 = new JLabel("  "); //����������һ���ձ�ǩ
    JTextField txtName = new JTextField(15);           //�������������15���ַ�����
    JPasswordField txtPassword = new JPasswordField(15);   //�������������15���ַ�����
    JButton butOK = new JButton("  ��¼  ");                 //����һ��OK��ť
    JButton butexit = new JButton("  �˳�  ");   
    public StudentFrame() {                                  //��¼������������
        super("�û���¼");
        initalInterface();
    }   
    private void initalInterface() {    //��ʼ������       
        //���õ�¼��ť������
        Font font = new Font("Dialog", Font.BOLD, 16);
        butOK.setFont(font);
       //�����˳���ť������
        Font font2 = new Font("Dialog", Font.BOLD, 16);
        butexit.setFont(font2);        
       //����"ѧ����Ϣ����ϵͳ"������
        Font font1 = new Font("Dialog", Font.BOLD, 30);
        labTop.setFont(font1);              
        //��ʼ�����˵�
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;      
        //�����˵���
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);       
        //����File�˵�
        menu = new JMenu("�ļ�");
        menuBar.add(menu);
        menuItem=new JMenuItem("��");
        menu.add(menuItem);
        menu.addSeparator();
        menuItem = new JMenuItem("�˳�");     
        //���˵���Exit��ӻ�¼��������
        menuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            finish();
            System.exit(0);
        }
        });
        menu.add(menuItem);
        //����Help�˵�
        menu=new JMenu("����");
        menuBar.add(menu);
        menuItem=new JMenuItem("����");
        menu.add(menuItem);
        //���˵���About��ӻ�¼��������
        menuItem.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);              
            }
        });
        //���������˵�
        
        //������һ�ſ�ƬpanLogin
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
        pt.add(new JLabel("�û�����"));
        pt.add(txtName);
        panLogin.add(pt);
        pt = new JPanel();
        pt.add(new JLabel("���룺"));
        pt.add(txtPassword);
        panLogin.add(pt);
        //��OK��ť��ӻ�¼��������
        butOK.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOKActionPerformed(evt);
            }
        });
        pt = new JPanel();    
        pt.add(butOK);
        panLogin.add(pt);
        panLogin.add(new JPanel());
        //��һ�ſ�ƬpanLogin��������
        
        //�����ڶ��ſ�ƬpanOperation
        JPanel panOperation = new JPanel();
        panOperation.setLayout(new BorderLayout());
        panOperation.add(labTop2, BorderLayout.NORTH);
        panOperation.add(new JLabel("  "), BorderLayout.SOUTH);      
        JLabel labTop7;   
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5, 3));
        JButton bPut = new JButton("���ѧ����Ϣ");
       JButton bGet = new JButton("");
        JButton bSearch = new JButton("��ѯѧ����Ϣ");
        JButton bQuit = new JButton("�˳�");
        //���ĸ���ť�ֱ���ӻ�¼������
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
        //�ڶ��ſ�ƬpanOperation
 
        //�������������ǰ�湹�������ſ�ƬpanLogin��panOperation
        pane = getContentPane();
        pane.setLayout(cc);
        pane.add(panLogin, "login");
        pane.add(panOperation, "operation");
        //��Ӵ��ڹر��¼�
        this.addWindowListener(new WindowAdapter() {
 
            //��ʾ����ķ����Ǹ��Ǹ���ķ���
            @Override
            public void windowClosing(WindowEvent e) {
                finish();
            }
        });
        setSize(550, 550);
        //����ʼ����ͣ����Ļ������
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dim = kit.getScreenSize();
        setLocation(dim.width / 2 - 150, dim.height / 2 - 100);
        //��ֹ�û��ı䴰�ڵĴ�С
        this.setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
    }  
    private void finish(){
        student.saveData();
    }
    //�ɲ˵�About���õķ���
    private void aboutActionPerformed(java.awt.event.ActionEvent evt){
         JOptionPane.showMessageDialog(this,"��ӭʹ������ܿ�����ѧ����Ϣ����ϵͳ��","��ӭʹ��",JOptionPane.INFORMATION_MESSAGE);
    }         
    //�ֱ��������ť��¼����������õķ���
    private void butOKActionPerformed(java.awt.event.ActionEvent evt) {
        String no = txtName.getText();
        String pw = new String(txtPassword.getPassword());
        if (student.check(no, pw)) {
            labTop.setForeground(Color.black);
            labTop.setText("��ӭʹ��");
            txtName.setText("");
            txtPassword.setText("");
            cc.show(pane, "operation");
        } else {
            labTop.setForeground(Color.red);
            labTop.setText("�����˺Ż�����������������룡");
        }
    }
    public void bPutActionPerformed(java.awt.event.ActionEvent evt) {
        num = Integer.parseInt(JOptionPane.showInputDialog(this, "�����ѧ��ѧ��:"));
       labTop2.setText("��ӵ�ѧ��ѧ��Ϊ:" + num);
       
        num1 = String.format(JOptionPane.showInputDialog(this, "�����ѧ������:"));           
       //num1 = student.getCurrent(). inputName(num1);
       labTop2.setText("��ӵ�ѧ������Ϊ:" + num1);
   }
   public void bSearchActionPerformed(java.awt.event.ActionEvent evt) {
      
      num = Integer.parseInt(JOptionPane.showInputDialog(this, "������Ҫ��ѯ��ѧ��ѧ��:"));
        
      labTop2.setText("ѧ��Ϊ" + num+"��ѧ������Ϊ"+num1);
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
