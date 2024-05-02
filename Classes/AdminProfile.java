package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;


public class AdminProfile extends JFrame
{
    private Container c;
    private ImageIcon icon;
    private JLabel title, type, ID, name, email, phoneNumber, bloodGroup, address, Password;
    private JTextField typeTf, IDTf, nameTf, emailTf, phoneNumberTf, bloodGroupTf, addressTf, adminPassword;
    private JButton backBtn, refreshBtn;
    private String adminNameStore, adminIDStore, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore, adminPassStore;


    AdminProfile(String adminNameStore, String adminIDStore, String adminEmailStore, String adminPhoneNumberStore, String adminAddressStore, String adminBloodGroupStore, String adminPassStore)
    {
        this.adminNameStore = adminNameStore;
        this.adminIDStore = adminIDStore;
        this.adminEmailStore = adminEmailStore;
        this.adminPhoneNumberStore = adminPhoneNumberStore;
        this.adminAddressStore = adminAddressStore;
        this.adminBloodGroupStore = adminBloodGroupStore;
        this.adminPassStore = adminPassStore;


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

        title = new JLabel("Basic Information");
        title.setBounds(370, 30, 500, 50);
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        c.add(title);

        Font f1 = new Font("Segoe UI", Font.BOLD, 18);
        Font f2 = new Font("Segoe UI", Font.PLAIN, 18);

        type = new JLabel("User Type: ");
        type.setBounds(200, 110, 150, 50);
        type.setFont(f1);
        c.add(type);

        typeTf = new JTextField("  Admin");
        typeTf.setBounds(340, 124, 80, 30);
        typeTf.setFont(f2);
        typeTf.setEditable(false);
        c.add(typeTf);


        // ID
        ID = new JLabel("User ID:");
        ID.setBounds(200, 170, 150, 50);
        ID.setFont(f1);
        c.add(ID);

        IDTf = new JTextField(" "+adminIDStore);
        IDTf.setBounds(340, 180, 300, 30);
        IDTf.setEditable(false);
        IDTf.setFont(f2);
        c.add(IDTf);


        // Name
        name = new JLabel("Name:");
        name.setBounds(200, 230, 150, 50);
        name.setFont(f1);
        c.add(name);

        nameTf = new JTextField(" "+adminNameStore);
        nameTf.setBounds(340, 240, 300, 30);
        nameTf.setEditable(false);
        nameTf.setFont(f2);
        c.add(nameTf);


        // Email
        email = new JLabel("Email:");
        email.setBounds(200, 290, 150, 50);
        email.setFont(f1);
        c.add(email);

        emailTf = new JTextField(" "+adminEmailStore);
        emailTf.setBounds(340, 300, 300, 30);
        emailTf.setEditable(false);
        emailTf.setFont(f2);
        c.add(emailTf);


        // Phone Number
        phoneNumber = new JLabel("Phone Number:");
        phoneNumber.setBounds(200, 360, 150, 50);
        phoneNumber.setFont(f1);
        c.add(phoneNumber);

        phoneNumberTf = new JTextField(" "+adminPhoneNumberStore);
        phoneNumberTf.setBounds(340, 372, 300, 30);
        phoneNumberTf.setEditable(false);
        phoneNumberTf.setFont(f2);
        c.add(phoneNumberTf);



        // Blood Group
        bloodGroup = new JLabel("Blood Group: ");
        bloodGroup.setBounds(200, 440, 150, 50);
        bloodGroup.setFont(f1);
        c.add(bloodGroup);

        bloodGroupTf = new JTextField(" "+adminBloodGroupStore);
        bloodGroupTf.setBounds(340, 454, 300, 30);
        bloodGroupTf.setEditable(false);
        bloodGroupTf.setFont(f2);
        c.add(bloodGroupTf);


        // Address
        address = new JLabel("Address:");
        address.setBounds(200, 510, 150, 50);
        address.setFont(f1);
        c.add(address);

        addressTf = new JTextField(" "+adminAddressStore);
        addressTf.setBounds(340, 522, 300, 30);
        addressTf.setEditable(false);
        addressTf.setFont(f2);
        c.add(addressTf);


        // Back Button
        backBtn = new JButton("Back");
        backBtn.setBounds(700, 250, 150, 50);
        backBtn.setFont(f2);
        backBtn.setCursor(cursor);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.decode("#2E75B6"));
        c.add(backBtn);


        // Refresh Button 
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
                new AdminDashBoard(adminNameStore, adminIDStore, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }
        });


        refreshBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminProfile(adminNameStore, adminIDStore, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }
        });
        
        
    }

    /* 
    public static void main(String[] args)
    {
        new AdminProfile("22", "24", "23", "22", "22", "22" , "22");
    }
    */
}
