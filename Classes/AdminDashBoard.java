package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import Classes.*;

public class AdminDashBoard extends JFrame {
    private Container c;
    private ImageIcon icon, bgPictureImg, logoutIcon, cDataForAdminIcon, cAddIcon, adminDataIcon,
            adminAddIcon;
    private JLabel dashBoard, cDataForAdmin, adminIconLabel, bgPicture, cAdd, adminAdd, adminDataLabel;
    private JButton logoutBtn, cDataForAdminBtn, cAddBtn, adminDataBtn, adminAddBtn;
    protected String adminIDStore;

    public AdminDashBoard(String adminIDStore)
    {
        this.adminIDStore = adminIDStore;
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


        //Background Picture
        bgPictureImg = new ImageIcon(getClass().getResource("/images/Admin Dashboard.png"));
        bgPicture = new JLabel(bgPictureImg);
        bgPicture.setBounds(0, 0, bgPictureImg.getIconWidth(), bgPictureImg.getIconHeight());
        c.add(bgPicture);


        //DashBoard Title
        dashBoard = new JLabel("Admin DashBoard");
        dashBoard.setBounds(20, 35, 400, 40);
        Font titleFont = new Font("Segoe UI", Font.BOLD, 40);
        dashBoard.setFont(titleFont);
       // dashBoard.setForeground(Color.darkGray);
        bgPicture.add(dashBoard);


        //logout Button
        logoutIcon = new ImageIcon(getClass().getResource("/images/logout.png"));
        logoutBtn = new JButton(logoutIcon);
		logoutBtn.setBounds(950, 40, 140, 40);
		logoutBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setContentAreaFilled(false);
        c.add(logoutBtn);


        //Font for all button labeing
        Font labelFont = new Font("Segoe UI", Font.BOLD, 18);


        //Admin Data icon
        /*adminDataIcon = new ImageIcon(getClass().getResource("/images/Admin Icon.png"));
        adminIconLabel = new JLabel(adminDataIcon);
        adminIconLabel.setBounds(5, 50, adminDataIcon.getIconWidth(), adminDataIcon.getIconHeight());
        c.add(adminIconLabel); */

        cDataForAdmin = new JLabel("Customer Data");
        cDataForAdmin.setBounds(720, 230, 20, 50);
        cDataForAdmin.setFont(labelFont);
        c.add(cDataForAdmin);
    

        //Customer Data Icon
        cDataForAdminIcon = new ImageIcon(getClass().getResource("/images/customerInfo.png"));
        

        //Customer data button
        cDataForAdminBtn = new JButton(cDataForAdminIcon);
        cDataForAdminBtn.setBounds(870, 160, cDataForAdminIcon.getIconWidth(), cDataForAdminIcon.getIconHeight());
		cDataForAdminBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cDataForAdminBtn.setFocusPainted(false);
        cDataForAdminBtn.setContentAreaFilled(false);
        cDataForAdmin = new JLabel("Customer Data");
        cDataForAdmin.setBounds(890, 320, 200, 50);
        cDataForAdmin.setFont(labelFont);
        c.add(cDataForAdminBtn);
        c.add(cDataForAdmin);

/* 
        //Customer Add Button
        cAddIcon = new ImageIcon(getClass().getResource("/images/Customer add.png"));
        cAddBtn = new JButton(adminAddIcon);
        cAddBtn.setBounds(750, 20, cAddIcon.getIconWidth(), cAddIcon.getIconHeight());
        c.add(cAddBtn);


        //Customer Add Label
        cAdd = new JLabel("Customer Add");
        cAdd.setBounds(750, 200, 200, 20);
        cAdd.setFont(labelFont);
        c.add(cAdd);
*/

        //admin Information
        adminDataIcon = new ImageIcon(getClass().getResource("/images/adminData.png"));

        adminDataBtn = new JButton(adminDataIcon);
        adminDataBtn.setBounds(690, 160, adminDataIcon.getIconWidth(), adminDataIcon.getIconHeight());		
		adminDataBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminDataBtn.setFocusPainted(false);
        adminDataBtn.setContentAreaFilled(false);
        c.add(adminDataBtn);
		
		adminDataLabel = new JLabel("Admin Data");
        adminDataLabel.setBounds(720, 330, 170, 20);
		adminDataLabel.setFont(labelFont);
        c.add(adminDataLabel);


        //Admin Add 
        adminAddIcon = new ImageIcon(getClass().getResource("/images/addAdmin.png"));
        adminAddBtn = new JButton(adminAddIcon);
        adminAddBtn.setBounds(780, 360, adminAddIcon.getIconWidth(), adminAddIcon.getIconHeight());
		adminAddBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminAddBtn.setFocusPainted(false);
        adminAddBtn.setContentAreaFilled(false);
        adminAddBtn.setBackground(Color.decode("#FFFFFF"));
        c.add(adminAddBtn);



        //Admin Add Label
        adminAdd = new JLabel("Add Admin");
        adminAdd.setBounds(800, 540, 170, 20);
		adminAdd.setFont(labelFont);
        c.add(adminAdd);
        





        //Action Listener 

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
                new CustomerDataForAdmin(adminIDStore);
            }    
        });

        



        adminAddBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AddAdmin(adminIDStore);
            }    
        });


        adminDataBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                showMessageDialog(null, "This feature is not available right now", "Alert", JOptionPane.WARNING_MESSAGE);
            }    
        });


    


    }

    public static void main(String[] args) {
        AdminDashBoard frame = new AdminDashBoard("22");
        frame.setVisible(true);
    }
}
