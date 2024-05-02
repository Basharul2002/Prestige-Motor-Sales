package Classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Classes.*;

public class Admin extends JFrame 
{

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton uDataBtn, previousBtn, exitBtn, adminPassInfoChngBtn, nBtn;
    private Cursor cursor;

    public Admin()
    {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travel Agency");
        this.setSize(650, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/Admin.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(127, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setBounds(123, 420, 433, 50);
        label1.setFont(f1);
        c.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        uDataBtn = new JButton("User Data");
        uDataBtn.setBounds(64, 510, 207, 50);
        uDataBtn.setFont(f2);
        uDataBtn.setCursor(cursor);
        uDataBtn.setForeground(Color.WHITE);
        uDataBtn.setBackground(Color.decode("#2E75B6"));
        c.add(uDataBtn);

        previousBtn = new JButton("Back");
        previousBtn.setBounds(299, 581, 270, 50);
        previousBtn.setFont(f2);
        previousBtn.setCursor(cursor);
        previousBtn.setForeground(Color.WHITE);
        previousBtn.setBackground(Color.decode("#2E75B6"));
        c.add(previousBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(64, 581, 207, 50);
        exitBtn.setFont(f2);
        exitBtn.setCursor(cursor);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setBackground(Color.decode("#C00000"));
        c.add(exitBtn);

        adminPassInfoChngBtn = new JButton("Admin Password");
        adminPassInfoChngBtn.setBounds(299, 510, 270, 50);
        adminPassInfoChngBtn.setFont(f2);
        adminPassInfoChngBtn.setCursor(cursor);
        adminPassInfoChngBtn.setForeground(Color.WHITE);
        adminPassInfoChngBtn.setBackground(Color.decode("#2E75B6"));
        c.add(adminPassInfoChngBtn);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // User Data
        uDataBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                CuatomerDataTableForAdmin frame = new CustomerDataTableForAdmin();
                frame.setVisible(true);
            }
        });

        // Exit Button
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back
        previousBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new HomePage();
                frame.setVisible(true);
            }
        });

        // Admin Password
        adminPassInfoChngBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdminPassword frame = new AdminPassword();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
    }
}
