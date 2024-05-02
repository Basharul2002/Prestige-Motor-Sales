package Classes;


import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.AccessDeniedException;
import java.awt.Font;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;
import Classes.*;


public class NewAdminAdd extends JFrame
{

    private Container c;
    private JLabel loginAdmin, newAdminID, newAdminPass, adminIDUnderlineforTf, adminPassUnerlineforTa;
    private JPanel panel1;
    private JTextField newAdminIdTf;
    private JPasswordField newAdminPassPf;
    private JButton previousBtn, newAdminBtn, signOut, showPass, hidePass;
    private ImageIcon icon;

    public NewAdminAdd(String textField1) {

      // Frame Layout
      this.setTitle("DAILY SUPERSHOP");
      this.setSize(1065, 650);
      this.setLocationRelativeTo(null);
      this.setResizable(false);

      c = this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.decode("#F2F2F2"));

      // Icon
      icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
      this.setIconImage(icon.getImage());


        panel1 = new JPanel();
        panel1.setBounds(0, 0, 700, 768);
        panel1.setBackground(new Color(25, 118, 211));

        lp1 = new JLabel();
        lp1.setIcon(new ImageIcon("image/addadmin2.png"));
        Dimension size = lp1.getPreferredSize();
        lp1.setBounds(100, 120, size.width, size.height);


        previousBtn = new JButton();
        previousBtn.setIcon(new ImageIcon("image/Previous.png"));
        previousBtn.setBounds(15, 8, 35, 40);
        previousBtn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        previousBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        previousBtn.setFocusPainted(false);
        previousBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        previousBtn.setContentAreaFilled(false);


        newAdminBtn = new JButton("Add New Admin");
        newAdminBtn.setBounds(850, 550, 400, 40);
        newAdminBtn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        newAdminBtn.setForeground(new Color(25, 118, 211));
        newAdminBtn.setBackground(new Color(255, 255, 255));
        newAdminBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        newAdminBtn.setFocusPainted(false);

/*
        label2 = new JLabel("");
        label2.setBounds(850, 80, 500, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        l1 = new JLabel("Add New Admin");
        l1.setBounds(930, 180, 300, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
        */

        newAdminID = new JLabel("ID");
        newAdminID.setBounds(850, 280, 300, 40);
        newAdminID.setForeground(Color.black);
        newAdminBtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));


        newAdminIdTf = new JTextField();
        newAdminIdTf.setBounds(855, 320, 380, 30);
        newAdminIdTf.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        newAdminIdTf.setForeground(Color.black);
        newAdminIdTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        newAdminIdTf.setCaretColor(Color.black);
        newAdminIdTf.setBorder(null);
        newAdminIdTf.setOpaque(false);

        adminIDUnderlineforTf = new JLabel("________________________________________________________");
        adminIDUnderlineforTf.setBounds(850, 330, 400, 40);
        adminIDUnderlineforTf.setForeground(Color.black);
        adminIDUnderlineforTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        newAdminPass = new JLabel("Password");
        newAdminPass.setBounds(850, 380, 150, 40);
        newAdminPass.setForeground(Color.black);
        newAdminPass.setFont(new Font("Segoe UI", Font.PLAIN, 20));


        newAdminPassPf = new JPasswordField();
        newAdminPassPf.setBounds(855, 420, 380, 30);
        newAdminPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        newAdminPassPf.setForeground(Color.black);
        newAdminPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        newAdminPassPf.setCaretColor(Color.black);
        newAdminPassPf.setBorder(null);
        newAdminPassPf.setOpaque(false);


        adminPassUnerlineforTa = new JLabel("________________________________________________________");
        adminPassUnerlineforTa.setBounds(850, 430, 400, 40);
        adminPassUnerlineforTa.setForeground(Color.black);
        adminPassUnerlineforTa.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        showPass = new JButton();
        showPass.setIcon(new ImageIcon("images/Show.png"));
        showPass.setBounds(1250, 430, 25, 20);
        showPass.setForeground(Color.black);
        showPass.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        showPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        showPass.setFocusPainted(false);
        showPass.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        showPass.setContentAreaFilled(false);
        showPass.setVisible(false);



        hidePass = new JButton();
        hidePass.setIcon(new ImageIcon("images/Hide.png"));
        hidePass.setBounds(1250, 430, 25, 20);
        hidePass.setForeground(Color.black);
        hidePass.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hidePass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hidePass.setFocusPainted(false);
        hidePass.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hidePass.setContentAreaFilled(false);



        loginAdmin = new JLabel("User :" + " " + textField1);
        loginAdmin.setBounds(1150, 50, 120, 25);
        loginAdmin.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        signOut = new JButton("Sign Out");
        signOut.setBounds(1260, 50, 90, 25);
        signOut.setFont(new Font("Segoe UI", Font.BOLD, 16));
        signOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signOut.setFocusPainted(false);
        signOut.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signOut.setContentAreaFilled(false);

        c.add(label3);
        c.add(signOut);

        // adding lebel

        c.add(label1);
        c.add(label2);
        c.add(l1);
        c.add(newAdminBtn);
        c.add(newAdminPass);
        c.add(adminIDUnderlineforTf);
        c.add(adminPassUnerlineforTa);
        c.add(lp1);

        c.add(newAdminIdTf);
        c.add(newAdminPassPf);

        // adding button

        c.add(previousBtn);
        c.add(newAdminBtn);
        c.add(signOut);
        c.add(showPass);

        // add
        c.add(label1);
        c.add(panel1);

        c.setSize(1366, 768);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLocationRelativeTo(null);
        c.setLayout(null);
        c.setVisible(true);
        c.setResizable(false);

        previousBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == previousBtn) {
                    new AdminDashBoard(textField1);
                    c.setVisible(false);
                }
            }
        });

        newAdminBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                String newAdminIdStore = newAdminIdTf.getText(); // Admin Id
                String newAdminPassStore = newAdminPassPf.getText(); // Password

                if ((!newAdminIdStore.isEmpty() || !newAdminPassStore.isEmpty()))
                {

                    try
                    {
                        File file = new File(".\\Data\\admin_data.txt");
                        if (!file.exists())
                        {
                            file.createNewFile();
                        }

                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);

                        printWritter.println("Admin ID: " +newAdminIdStore);
                        printWritter.println("Password: " +newAdminPassStore);
                        printWritter.println();
                        printWritter.println("-------------------------");
                        printWritter.println();
                        printWritter.close();

                        showMessageDialog(null, " New Admin Added Succesfully", "Registration Complete", 1);
                        new AdminDashBoard();
                        c.setVisible(false);
                    }

                    catch (Exception ex)
                    {
                        System.out.print(ex);
                    }

                    // c2.setVisible(true);
                }
            }
        });



        hidePass.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == signOut)
                {
                    if (newAdminPassPf.getEchoChar() != '\u0000')
                    {
                        newAdminPassPf.setEchoChar('\u0000');
                        signOut.setVisible(false);
                        showPass.setVisible(true);
                    }
                }
            }
        });

        showPass.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == showPass)
                {
                    newAdminPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    showPass.setVisible(false);
                    signOut.setVisible(true);
                }

                else
                {
                }
            }
        });

        signOut.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == signOut) {
                    new AdminLoginPage("textField1", "textField2");
                    c.setVisible(false);
                }
            }
        });

    }

    public static void main(String[] args)
    {
      new NewAdminAdd();
    }
}
