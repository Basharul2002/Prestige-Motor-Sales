package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;



public class CustomerProfile extends JFrame
{
    private Container c;
    private ImageIcon icon;
    private JLabel title, type, cName, cEmail, cPhoneNumber, cAddress;
    private JTextField typeTf, cNameTf, cEmailTf, cPhoneNumberTf, cAddressTf ;
    private JButton backBtn, refreshBtn;
    private String cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore;


    CustomerProfile(String cNameStore, String cEmailStore, String cAddressStore, String cPhoneNumberStore, String cPassStore)
    {
        this.cNameStore = cNameStore;
        this.cEmailStore = cEmailStore;
        this.cAddressStore = cAddressStore;
        this.cPhoneNumberStore = cPhoneNumberStore;
        this.cPassStore = cPassStore;


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setUndecorated(true);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Prestige Motor Sales");


        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#3944BC"));  //Background Coloring


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setIconImage(icon.getImage());

        // Cursor for JButtons
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        title = new JLabel("Customer Basic Information");
        title.setBounds(370, 30, 500, 50);
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        c.add(title);

        Font f1 = new Font("Segoe UI", Font.BOLD, 18);
        Font f2 = new Font("Segoe UI", Font.PLAIN, 18);

        type = new JLabel("User Type:");
        type.setBounds(150, 150, 150, 50);
        type.setFont(f1);
        c.add(type);

        typeTf = new JTextField(" Customer");
        typeTf.setBounds(290, 164, 100, 30);
        typeTf.setFont(f2);
        typeTf.setEditable(false);
        c.add(typeTf);


        cName = new JLabel("Name:");
        cName.setBounds(150, 220, 150, 50);
        cName.setFont(f1);
        c.add(cName);

        cNameTf = new JTextField(" "+cNameStore);
        cNameTf.setBounds(290, 234, 350, 30);
        cNameTf.setEditable(false);
        cNameTf.setFont(f2);
        c.add(cNameTf);

        cEmail = new JLabel("Email:");
        cEmail.setBounds(150, 290, 150, 50);
        cEmail.setFont(f1);
        c.add(cEmail);

        cEmailTf = new JTextField(" "+cEmailStore);
        cEmailTf.setBounds(290, 304, 350, 30);
        cEmailTf.setEditable(false);
        cEmailTf.setFont(f2);
        c.add(cEmailTf);


        cPhoneNumber = new JLabel("Phone Number: ");
        cPhoneNumber.setBounds(150, 360, 150, 50);
        cPhoneNumber.setFont(f1);
        c.add(cPhoneNumber);

        cPhoneNumberTf = new JTextField(" "+cPhoneNumberStore);
        cPhoneNumberTf.setBounds(290, 374, 350, 30);
        cPhoneNumberTf.setEditable(false);
        cPhoneNumberTf.setFont(f2);
        c.add(cPhoneNumberTf);

        cAddress = new JLabel("Address:");
        cAddress.setBounds(150, 410, 150, 50);
        cAddress.setFont(f1);
        c.add(cAddress);

        cAddressTf = new JTextField(" "+cAddressStore);
        cAddressTf.setBounds(290, 424, 350, 30);
        cAddressTf.setEditable(false);
        cAddressTf.setFont(f2);
        c.add(cAddressTf);


        backBtn = new JButton("Back");
        backBtn.setBounds(700, 250, 150, 50);
        backBtn.setFont(f2);
        backBtn.setCursor(cursor);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.decode("#2E75B6"));
        c.add(backBtn);

        refreshBtn = new JButton("Refresh");
        refreshBtn.setBounds(700, 350, 150, 50);
        refreshBtn.setFont(f2);
        refreshBtn.setCursor(cursor);
        refreshBtn.setForeground(Color.WHITE);
        refreshBtn.setBackground(Color.decode("#2E75B6"));
        c.add(refreshBtn);


        backBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerDashBoard(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });


        refreshBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerProfile(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });
        
        
    }
/* 
    public static void main(String[] args)
    {
        new CustomerProfile("22", "24", "23", "22", "22");
    }

*/


}
