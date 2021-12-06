package Electricity1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    String meter;
    Project(String meter, String person){
        super("Electricity Billing System");
        this.meter = meter;
        
        setSize(1920,1030);
        
        /* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/vaishu.gif"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
       
        /* First Column */
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        JMenuItem m3 = new JMenuItem("Deposit Details");
        JMenuItem m4 = new JMenuItem("Calculate Bill");
        master.setForeground(Color.BLUE);
        
        mb.setBackground(Color.cyan);
        
        /* ---- Customer Details ---- */
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        /* ---- Meter Details ---- */
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
         /* ---- Deposit Details  ----- */
        m3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);
        
        m4.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m4.setIcon(new ImageIcon(image5));
        m4.setMnemonic('B');
        m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        m4.setBackground(Color.WHITE);
        
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        
        
        
        //-----------------------------
        
        /* Second Column */
        JMenu info = new JMenu("Information");
        JMenuItem info1 = new JMenuItem("Update Information");
        JMenuItem info2 = new JMenuItem("View Information");
        
        info.setForeground(Color.RED);
        info.setBackground(Color.BLACK);
        info.setFont(new Font("tomaha",Font.BOLD,20));
        
       
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/info1.jfif"));
        Image image22 = icon12.getImage().getScaledInstance(100, 60,Image.SCALE_DEFAULT);
        info.setIcon(new ImageIcon(image22));
        info.setMnemonic('M');
       
        
    
        /* ---- Pay Bill ---- */
        info1.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon41 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon4.png"));
        Image image41 = icon41.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        info1.setIcon(new ImageIcon(image41));
        info1.setMnemonic('P');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        info1.setBackground(Color.YELLOW);
        
        /* ---- Last Bill ----*/
        info2.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon42 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon6.png"));
        Image image42 = icon42.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        info2.setIcon(new ImageIcon(image42));
        info2.setMnemonic('L');
        info2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        info2.setBackground(Color.MAGENTA);
        
        info1.addActionListener(this);
        info2.addActionListener(this);
        
        
        
        
        
        // --------------------------------------------------------------------------------------------
        
        
        /* Second Column */
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");
        
        JMenuItem u3 = new JMenuItem("Bill Details");
        
        user.setForeground(Color.BLUE);
        user.setFont(new Font("tomaha",Font.BOLD,20));
        ImageIcon icon13 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/shweta.jfif"));
        Image image23 = icon13.getImage().getScaledInstance(100, 60,Image.SCALE_DEFAULT);
        user.setIcon(new ImageIcon(image23));
        user.setMnemonic('M');
        
        
        
        /* ---- Pay Bill ---- */
        u1.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.YELLOW);
        
        /* ---- Last Bill ----*/
        u3.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.MAGENTA);
        
        u1.addActionListener(this);
        u3.addActionListener(this);
        
        
        // --------------------------------------------------------------------------------------------- 
        
        /* Third Column*/
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        
        report.setForeground(Color.BLUE);
        report.setFont(new Font("tomaha",Font.BOLD,20));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/report.png"));
        Image image24 = icon14.getImage().getScaledInstance(100, 60,Image.SCALE_DEFAULT);
        report.setIcon(new ImageIcon(image24));
        report.setMnemonic('M');
        
        
        /* ---- Report ---- */
        r1.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.YELLOW);
        
        r1.addActionListener(this);
        
        // -----------------------------------------------------------------------------------------------
        
        /* Fourth Column*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED); 
        utility.setFont(new Font("tomaha",Font.BOLD,20));
        ImageIcon icon15 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/utility1.jfif"));
        Image image25 = icon15.getImage().getScaledInstance(100, 60,Image.SCALE_DEFAULT);
        utility.setIcon(new ImageIcon(image25));
        utility.setMnemonic('M');
        
        
        /* ---- Calender ---- */
        ut1.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.YELLOW);
        
        /* ---- Calculator ---- */
        ut2.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.MAGENTA);
        
        /* ---- Web Browser ---- */
        ut3.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.CYAN);
        
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        // ---------------------------------------------------------------------------------------
        
        /*Fifth Column */
        JMenu exit = new JMenu("Logout");
        JMenuItem ex = new JMenuItem("Logout");
        exit.setForeground(Color.BLUE);
        exit.setFont(new Font("tomaha",Font.BOLD,20));
        
         ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/logout.png"));
        Image image26 = icon16.getImage().getScaledInstance(100, 60,Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image26));
        exit.setMnemonic('M');
        
        /* ---- Exit ---- */
        ex.setFont(new Font("monospaced",Font.PLAIN,18));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Electricity1/icon/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.YELLOW);
        
        ex.addActionListener(this);
        
        
        // ---------------------------------------------------------------------------------------------
               
        
        master.add(m1);
        master.add(m2);
        master.add(m3);
        master.add(m4);
        
        info.add(info1);
        info.add(info2);
        
        user.add(u1);
        user.add(u3);
        
        report.add(r1);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        exit.add(ex);
         
        if(person.equals("Admin")){
            mb.add(master);
        }else{             
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }
        mb.add(utility);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new CustomerDetails().setVisible(true);
            
        }else if(msg.equals("New Customer")){
            new NewCustomer().setVisible(true);
            
        }else if(msg.equals("Calculate Bill")){
            new CalculateBill().setVisible(true);
            
        }else if(msg.equals("Pay Bill")){
            new PayBill(meter).setVisible(true);
           
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Logout")){
            this.setVisible(false);
            new Login().setVisible(true);
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter).setVisible(true);
            
        }else if(msg.equals("Deposit Details")){
            new DepositDetails().setVisible(true);
        }else if(msg.equals("View Information")){
            new ViewInformation(meter).setVisible(true);
        }else if(msg.equals("Update Information")){
            new UpdateInformation(meter).setVisible(true);
        }else if(msg.equals("Bill Details")){
            new BillDetails(meter).setVisible(true);
        }
        
        
    }
    
    
    public static void main(String[] args){
        new Project("", "").setVisible(true);
    }
    
}