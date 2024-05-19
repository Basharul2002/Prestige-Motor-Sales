package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;
import java.nio.file.*;

import Classes.*;



public class ForgetPassword extends JFrame
{
    private JLabel username;
    private JTextField userNameTf;
    private JButton nextBtn, backBtn;
    private Container c;
    private ImageIcon forgotUser;
    private Cursor cursor;
    protected static boolean loginFlag;
    protected static int deleteLine;

    public ForgetPassword() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(850, 550);
        this.setTitle("Prestige Motor Sales");
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        c = this.getContentPane();
        c.setBackground(Color.decode("#24292e"));
        c.setLayout(null);
        

        ImageIcon icon = new ImageIcon("images/icon.png");
        this.setIconImage(icon.getImage());

        cursor = new Cursor(Cursor.HAND_CURSOR);

        forgotUser = new ImageIcon("images/Forgot User.png");
        JLabel imgLabel = new JLabel(forgotUser);
        imgLabel.setBounds(0, 100, forgotUser.getIconWidth(), forgotUser.getIconHeight());
        c.add(imgLabel);

        JLabel forget = new JLabel("Reset Password");
        forget.setBounds(375, 0, 200, 50);
        Font forgetFont = new Font("Times New Roman", Font.PLAIN, 22);
        forget.setFont(forgetFont);
        forget.setForeground(Color.white);
        c.add(forget);

        username = new JLabel("User Name :");
        username.setBounds(385, 230, 180, 50);
        Font usernameFont = new Font("Verdana", Font.PLAIN, 18);
        username.setVisible(true);
        username.setFont(usernameFont);
        username.setForeground(Color.white);
        c.add(username);

        userNameTf = new JTextField();
        userNameTf.setBounds(510, 242, 180, 30);
        Font userNameTfFont = new Font("Times New Roman", Font.BOLD, 18);
        userNameTf.setFont(userNameTfFont);
        userNameTf.setVisible(true);
        userNameTf.setOpaque(false);
        userNameTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		userNameTf.setCaretColor(Color.white);
        userNameTf.setForeground(new Color(219, 226, 233));
        userNameTf.setBorder(BorderFactory.createEmptyBorder());
        Border redBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(179, 63, 64));
        userNameTf.setBorder(redBorder);
        c.add(userNameTf);

        ImageIcon next = new ImageIcon("images/next.png");
        nextBtn = new JButton(next);
        nextBtn.setBounds(652, 278, 45, 45);
        nextBtn.setBackground(new Color(0, 0, 0, 0));
        nextBtn.setOpaque(false);
        nextBtn.setBorder(null);
        nextBtn.setCursor(cursor);
        nextBtn.setFocusPainted(false);
        nextBtn.setVisible(true);
        c.add(nextBtn);

    

        ImageIcon backimg = new ImageIcon("images/previous.png");
        backBtn = new JButton(backimg);
        backBtn.setBounds(3, 10, backimg.getIconWidth(), backimg.getIconHeight());
        backBtn.setBackground(Color.black);
        backBtn.setOpaque(false);
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        c.add(backBtn);

        

        nextBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String user = "Customer Name: " + userNameTf.getText();
                String user1 = userNameTf.getText();
                boolean userEmpty = user1.isEmpty();
                boolean yes = false;
                int totalLines = 0;
                
                try 
                {
                    File userfile = new File(".\\data\\customer_data.txt");
                    if (userfile.exists()) 
                    {
                        BufferedReader readFile = new BufferedReader(new FileReader(".\\data\\customer_data.txt"));
    
                        while (readFile.readLine() != null) {
                            totalLines++;
                        }
                        readFile.close();
                    }
    
                    if (userEmpty == true) 
                    {
                        showMessageDialog(null, "Enter User Name", "Error", JOptionPane.WARNING_MESSAGE);
                        yes = false;
                    } 
                    
                    else 
                    {
                        for (int i = 0; i<totalLines; i++) 
                        {
    
                            String line = Files.readAllLines(Paths.get(".\\data\\customer_data.txt")).get(i);
                            if (line.equals(user)) 
                            {
                                deleteLine = i;
                                yes = true;
                                break;
    
                            }
                        }
    
    
                        if (yes == true) 
                        {
                            setVisible(false);
                            new ForgetPassword2();
                        } 
                        
                        else 
                        {
                            showMessageDialog(null, "Username not found", "Error", JOptionPane.WARNING_MESSAGE);
                        }
    
                    }
    
                } 
                
                catch (Exception ex) 
                {
                    System.out.println(ex);
    
                }
    
            } 
        });

        
        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                setVisible(false);
                new CustomerLoginPage();
            }
        });
    }
}
