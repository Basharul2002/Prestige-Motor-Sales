package Classes;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

import Classes.*;


public class AdminDashBoard extends JFrame 
{
    private Container c;
    private ImageIcon icon, bgPictureImg, logoutIcon, cDataForAdminIcon, adminDataIcon, adminAddIcon, carUpdateIcon;
    private JLabel dashBoard, cDataForAdmin, bgPicture, adminAdd, adminDataLabel, carUpdateLabel;
    private JButton adminProfileBtn, logoutBtn, cDataForAdminBtn, adminDataBtn, adminAddBtn, carUpdateBtn;
    private String adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore,adminPassStore;

    public AdminDashBoard(String adminNameStore, String adminIDStore, String adminEmailStore, String adminPhnNumStore, String adminAddressStore, String adminBloodGroupStore, String adminPassStore)
    {
        this.adminNameStore = adminNameStore;
        this.adminIDStore = adminIDStore;
        this.adminEmailStore = adminEmailStore;
        this.adminPhnNumStore = adminPhnNumStore;
        this.adminAddressStore = adminAddressStore;
        this.adminBloodGroupStore = adminBloodGroupStore;
        this.adminPassStore = adminPassStore;


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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


        //Background Picture
        bgPictureImg = new ImageIcon(getClass().getResource("/images/Admin Dashboard.png"));
        bgPicture = new JLabel(bgPictureImg);
        bgPicture.setBounds(0, 0, bgPictureImg.getIconWidth(), bgPictureImg.getIconHeight());
        c.add(bgPicture);


        //DashBoard Title
        dashBoard = new JLabel("Admin DashBoard");
        dashBoard.setBounds(150, 22, 400, 40);
        Font titleFont = new Font("Segoe UI", Font.BOLD, 40);
        dashBoard.setFont(titleFont);
        bgPicture.add(dashBoard);


        // Admin profile 
        adminProfileBtn = new JButton(adminIDStore);
        adminProfileBtn.setBounds(948, 12, 60, 40);
        adminProfileBtn.setFont(new Font("Segeo UI Black", Font.BOLD, 18));
        adminProfileBtn.setForeground(Color.white);
        adminProfileBtn.setBackground(Color.decode("#3944BC"));
        adminProfileBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminProfileBtn.setFocusPainted(false);
        adminProfileBtn.setBorder(null);
        c.add(adminProfileBtn);


        //logout Button
        logoutIcon = new ImageIcon(getClass().getResource("/images/logout.png"));
        logoutBtn = new JButton(logoutIcon);
		logoutBtn.setBounds(1010, 20, 24, 24);
		logoutBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setContentAreaFilled(false);
        c.add(logoutBtn);


        //Font for all button labeing
        Font labelFont = new Font("Segoe UI", Font.BOLD, 18);


        //admin Information
        adminDataIcon = new ImageIcon(getClass().getResource("/images/adminData.png"));

        adminDataBtn = new JButton(adminDataIcon);
        adminDataBtn.setBounds(690, 145, adminDataIcon.getIconWidth(), adminDataIcon.getIconHeight());		
		adminDataBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminDataBtn.setFocusPainted(false);
        adminDataBtn.setContentAreaFilled(false);
        c.add(adminDataBtn);
		
		adminDataLabel = new JLabel("Admin Data");
        adminDataLabel.setBounds(720, 317, 170, 20);
		adminDataLabel.setFont(labelFont);
        c.add(adminDataLabel);


        // Customer Data for admin
        //Customer Data Icon
        cDataForAdminIcon = new ImageIcon(getClass().getResource("/images/customerInfo.png"));
    
        //Customer data button
        cDataForAdminBtn = new JButton(cDataForAdminIcon);
        cDataForAdminBtn.setBounds(870, 145, cDataForAdminIcon.getIconWidth(), cDataForAdminIcon.getIconHeight());
		cDataForAdminBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cDataForAdminBtn.setFocusPainted(false);
        cDataForAdminBtn.setContentAreaFilled(false);
        c.add(cDataForAdminBtn);

        cDataForAdmin = new JLabel("Customer Data");
        cDataForAdmin.setBounds(890, 303, 200, 50);
        cDataForAdmin.setFont(labelFont);
        c.add(cDataForAdmin);
    



        //Admin Add 
        adminAddIcon = new ImageIcon(getClass().getResource("/images/addAdmin.png"));
        adminAddBtn = new JButton(adminAddIcon);
        adminAddBtn.setBounds(690, 365, adminAddIcon.getIconWidth(), adminAddIcon.getIconHeight());
		adminAddBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminAddBtn.setFocusPainted(false);
        adminAddBtn.setContentAreaFilled(false);
        adminAddBtn.setBackground(Color.decode("#FFFFFF"));
        c.add(adminAddBtn);



        //Admin Add Label
        adminAdd = new JLabel("Add Admin");
        adminAdd.setBounds(710, 545, 170, 20);
		adminAdd.setFont(labelFont);
        c.add(adminAdd);


        carUpdateIcon = new ImageIcon(getClass().getResource("/images/Car Add.png"));
        carUpdateBtn = new JButton(carUpdateIcon);
        carUpdateBtn.setBounds(870, 365, carUpdateIcon.getIconWidth(), carUpdateIcon.getIconHeight());
        carUpdateBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        carUpdateBtn.setFocusPainted(false);
        carUpdateBtn.setContentAreaFilled(false);
        c.add(carUpdateBtn);
        

        carUpdateLabel = new JLabel("Car Update");
        carUpdateLabel.setBounds(895, 540, 200, 30);
        carUpdateLabel.setFont(labelFont);
        c.add(carUpdateLabel);



        //Action Listener 

        // admin profile Button
        adminProfileBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminProfile(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }
        });


        //logout button
        logoutBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminLoginPage();
            }
        });


        cDataForAdminBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerDataForAdmin(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }    
        });

        



        adminAddBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AddAdmin(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }    
        });


        adminDataBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                // showMessageDialog(null, "This feature is not available right now", "Alert", JOptionPane.WARNING_MESSAGE);
                setVisible(false);
                new AdminData(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }    
        });

        carUpdateBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                showMessageDialog(null, "This feature is not available right now", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        });


    


    }
/* 
    public static void main(String[] args) 
    {
        AdminDashBoard frame = new AdminDashBoard("22", "22", "22", "22", "22", "22", "22");
        frame.setVisible(true);
    }

    */
}
