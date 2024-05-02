package Classes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;
import java.nio.file.*;


import Classes.*;

public class ForgetPassword2 extends JFrame 
{
    private Container c;
    private JLabel phone;
    private JTextField phoneNumberTf;
    private JButton nextBtn, backBtn;
    private ImageIcon forgotUser;
    private Cursor cursor;
    private static boolean loginFlag;

    int totalLines;

    public ForgetPassword2()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 850, 550);
        this.setTitle("Prestige Motor Sales");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        c = this.getContentPane();
        c.setBackground(Color.decode("#24292e"));
  

        ImageIcon icon = new ImageIcon("images/icon.png");
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);

        cursor = new Cursor(Cursor.HAND_CURSOR);



        JLabel title = new JLabel("Reset Password");
        title.setBounds(375, 0, 200, 50);
        Font titleFont = new Font("Times New Roman", Font.BOLD, 22);
        title.setFont(titleFont);
        title.setForeground(Color.white);
        c.add(title);



        forgotUser = new ImageIcon("images/Forget Password 2.png");
        JLabel imgLabel = new JLabel(forgotUser);
        imgLabel.setBounds(0, 115, forgotUser.getIconWidth(), forgotUser.getIconHeight());
        c .add(imgLabel);



        phone = new JLabel("Phone No :");
        phone.setBounds(385, 230, 180, 50);
        Font phoneFont = new Font("Verdana", Font.PLAIN, 18);
        phone.setFont(phoneFont);
        phone.setForeground(Color.white);
        phone.setVisible(true);
        c .add(phone);

        phoneNumberTf = new JTextField();
        phoneNumberTf.setBounds(510, 242, 180, 30);
        Font phoneNumberTfFont = new Font("Times New Roman", Font.BOLD, 18);
        phoneNumberTf.setFont(phoneNumberTfFont);
        phoneNumberTf.setOpaque(false);
        phoneNumberTf.setForeground(new Color(219, 226, 233));
        phoneNumberTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		phoneNumberTf.setCaretColor(Color.white);
        phoneNumberTf.setBorder(BorderFactory.createEmptyBorder());
        Border redBorder1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(179, 63, 64));
        phoneNumberTf.setBorder(redBorder1);
        phoneNumberTf.setVisible(true);
        c .add(phoneNumberTf);



        ImageIcon next = new ImageIcon("images/next.png");
        nextBtn = new JButton(next);
        nextBtn.setBounds(652, 278, 45, 45);
        nextBtn.setBackground(new Color(0, 0, 0, 0));
        nextBtn.setOpaque(false);
        nextBtn.setBorder(BorderFactory.createEmptyBorder());
        nextBtn.setCursor(cursor);
        nextBtn.setVisible(true);
        nextBtn.setFocusPainted(false);
        c .add(nextBtn);


        ImageIcon backImg = new ImageIcon("images/previous.png");
        backBtn = new JButton(backImg);
        backBtn.setBounds(3, 10, backImg.getIconWidth(), backImg.getIconHeight());
        backBtn.setBackground(Color.black);
        backBtn.setOpaque(false);
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        c .add(backBtn);



        try 
        {
            File userfile = new File(".\\data\\customer_data.txt");
            int k = ((ForgetPassword.deleteLine) + 2);
            String line1 = Files.readAllLines(Paths.get(".\\data\\customer_data.txt")).get(k);
            String line2 = "";
        } 
        
        catch (Exception ex) 
        {
            System.out.println(ex);
        }

    

        nextBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {

                String user = "Phone Number: "+ phoneNumberTf.getText();
                String user1 = phoneNumberTf.getText();
                boolean userEmpty = user1.isEmpty();
                boolean yes = false;
                boolean yes2 = false;
        
                try 
                {
                    File userfile = new File(".\\data\\customer_data.txt");

                    if (userEmpty == true) 
                    {

                        showMessageDialog(null, "Enter phone number", "Error", JOptionPane.WARNING_MESSAGE);

                    } 
                    
                    else if (userEmpty == false) 
                    {

                        int n = ((ForgetPassword.deleteLine) + 1);
                        BufferedReader readFile = new BufferedReader(new FileReader(".\\data\\customer_data.txt"));
                        String line = Files.readAllLines(Paths.get(".\\data\\customer_data.txt")).get(n);
                        System.out.println(line);
                        System.out.println(user);

                        if (line.equals(user)) 
                        {
                            yes = true;

                            setVisible(false);
                            new ForgetPassword3();

                        } 
                        
                        else 
                        {
                            System.out.println(line);
                            System.out.println(user);
                            yes = false;
                        }

                       /*  if (yes == false) 
                        {
                            showMessageDialog(null, "Phone number not found!", "Error", JOptionPane.WARNING_MESSAGE);
                        } 
                        
                        else if(yes == true)
                        {
                            c.setVisible(false);
                            new ForgetPassword3();
                        }*/
                        readFile.close();

                    }

                } 
                
                catch (Exception ex) 
                {
                    System.out.print(ex);

                }
            }
        });
            
        

        backBtn.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e) 
            {
                setVisible(false);
                new ForgetPassword();
            }
        });
    }
/* 
    public static void main(String[] args)
    {
        new ForgetPassword2();
    }
*/

}
