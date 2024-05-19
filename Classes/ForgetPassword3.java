package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.*;

import Classes.*;

public class ForgetPassword3 extends JFrame
{
    private Container c;
    private JLabel title, newPassLabel, confirmPassLabel;
    private JPasswordField newPassPf, confirmPassPf;
    private JButton nextBtn, backBtn, passShowBtn, passHideBtn, confirmPassHideBtn, confirmPassShowBtn;

    private ImageIcon hide, show;
    private ImageIcon forgotUser;
    private Cursor cursor;
    protected static boolean loginFlag;
    protected static String USERNAME;
    private int totalLines;

    public ForgetPassword3() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 850, 550);
        this.setTitle("Prestige Motor Sales");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        c = this.getContentPane();
        c.setBackground(Color.WHITE);
    

        ImageIcon icon = new ImageIcon("images/icon.png");
        this.setIconImage(icon.getImage());
    

        cursor = new Cursor(Cursor.HAND_CURSOR);


        title = new JLabel("Reset Password");
        title.setBounds(300, 0, 350, 50);
        Font titleFont = new Font("Times New Roman", Font.BOLD, 32);
        title.setFont(titleFont);
        title.setForeground(Color.black);
        c.add(title);

        
        newPassLabel = new JLabel("New Password :");
        newPassLabel.setBounds(385, 230, 180, 50);
        Font newPassFont = new Font("Verdana", Font.PLAIN, 18);
        newPassLabel.setFont(newPassFont);
        newPassLabel.setVisible(true);
        newPassLabel.setForeground(Color.BLACK);
        c.add(newPassLabel);

        
        confirmPassLabel = new JLabel("Confirm Password :");
        confirmPassLabel.setBounds(385, 266, 185, 50);
        Font confirmPassLabelFont = new Font("Verdana", Font.PLAIN, 18);
        confirmPassLabel.setFont(confirmPassLabelFont);
        confirmPassLabel.setForeground(Color.black);
        confirmPassLabel.setVisible(true);
        c.add(confirmPassLabel);



        forgotUser = new ImageIcon("images/Forget Password 3.png");
        JLabel imgLabel = new JLabel(forgotUser);
        imgLabel.setBounds(2, 70, forgotUser.getIconWidth(), forgotUser.getIconHeight());
        c.add(imgLabel);



        newPassPf = new JPasswordField();
        newPassPf.setBounds(575, 242, 180, 30);
        Font newPassPfFont = new Font("Monospace", Font.BOLD, 18);
        newPassPf.setFont(newPassPfFont);
        newPassPf.setVisible(true);
        newPassPf.setOpaque(false);
        newPassPf.setForeground(Color.BLACK);
        newPassPf.setBorder(BorderFactory.createEmptyBorder());
        Border redBorder2 = BorderFactory.createMatteBorder(2, 2, 2, 0, new Color(179, 63, 64));
        newPassPf.setBorder(redBorder2);
        newPassPf.setEchoChar('*');
        c.add(newPassPf);

        hide = new ImageIcon("images/hide1.png");
        show = new ImageIcon("images/show1.png");


        passHideBtn = new JButton(hide);
        passHideBtn.setBounds(755, 242, 40, 30);
        passHideBtn.setFocusPainted(false);
        passHideBtn.setBorder(null);
        passHideBtn.setBackground(Color.WHITE);
        passHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passHideBtn.setVisible(true);
        Border redBorderHideShow = BorderFactory.createMatteBorder(2, 0, 2, 2, new Color(179, 63, 64));
        passHideBtn.setBorder(redBorderHideShow);
        c.add(passHideBtn);

        passShowBtn = new JButton(show);
        passShowBtn.setBounds(755, 242, 40, 30);
        passShowBtn.setFocusPainted(false);
        passShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        passShowBtn.setBackground(Color.WHITE);
        passShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passShowBtn.setVisible(false);
        passShowBtn.setBorder(redBorderHideShow);
        c.add(passShowBtn);


        confirmPassPf = new JPasswordField();
        confirmPassPf.setBounds(575, 278, 180, 30);
        Font confirmPassPfFont = new Font("Monospace", Font.BOLD, 18);
        confirmPassPf.setFont(confirmPassPfFont);
        confirmPassPf.setOpaque(false);
        confirmPassPf.setForeground(Color.BLACK);
        confirmPassPf.setBorder(BorderFactory.createEmptyBorder());
        Border redBorder3 = BorderFactory.createMatteBorder(2, 2, 2, 0, new Color(179, 63, 64));
        confirmPassPf.setBorder(redBorder3);
        confirmPassPf.setVisible(true);
        confirmPassPf.setEchoChar('*');
        c.add(confirmPassPf);


        confirmPassHideBtn = new JButton(hide);
        confirmPassHideBtn.setBounds(755, 278, 40, 30);
        confirmPassHideBtn.setFocusPainted(false);
        confirmPassHideBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        confirmPassHideBtn.setBackground(Color.WHITE);
        confirmPassHideBtn.setForeground(Color.RED);
        confirmPassHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassHideBtn.setVisible(true);
        redBorderHideShow = BorderFactory.createMatteBorder(2, 0, 2, 2, new Color(179, 63, 64));
        confirmPassHideBtn.setBorder(redBorderHideShow);
        c.add(confirmPassHideBtn);

	
        confirmPassShowBtn = new JButton(show);
        confirmPassShowBtn.setBounds(755, 278, 40, 30);
        confirmPassShowBtn.setFocusPainted(false);
        confirmPassShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        confirmPassShowBtn.setForeground(Color.RED);
        confirmPassShowBtn.setBackground(Color.WHITE);
        confirmPassShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassShowBtn.setVisible(false);
        confirmPassShowBtn.setBorder(redBorderHideShow);
        c.add(confirmPassShowBtn);



        ImageIcon next = new ImageIcon("images/Next.png");
        nextBtn = new JButton(next);
        nextBtn.setBounds(752, 316, 45, 45);
        nextBtn.setBackground(new Color(0, 0, 0, 0));
        nextBtn.setOpaque(false);
        nextBtn.setBorder(BorderFactory.createEmptyBorder());
        nextBtn.setCursor(cursor);
        nextBtn.setVisible(true);
        nextBtn.setBorder(null);
        c.add(nextBtn);

        ImageIcon backimg = new ImageIcon("images/previous.png");
        backBtn = new JButton(backimg);
        backBtn.setBounds(3, 10, backimg.getIconWidth(), backimg.getIconHeight());
        backBtn.setBackground(Color.black);
        backBtn.setOpaque(false);
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        c.add(backBtn);

        


    


        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)  
            {
                setVisible(false);
                new ForgetPassword();
            } 
        });

        
         passHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(newPassPf.getEchoChar() != '\u0000')
            {
            newPassPf.setEchoChar('\u0000');
            passShowBtn.setVisible(true);
            passHideBtn.setVisible(false);
            
            }
        }
        });


        passShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            newPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            passHideBtn.setVisible(true);
            passShowBtn.setVisible(false);
        }
        });


        confirmPassHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(confirmPassPf.getEchoChar() != '\u0000')
            {
                confirmPassPf.setEchoChar('\u0000');
                confirmPassShowBtn.setVisible(true);
                confirmPassHideBtn.setVisible(false);
            
            }
        }
        });


        confirmPassShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            confirmPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            confirmPassHideBtn.setVisible(true);
            confirmPassShowBtn.setVisible(false);
        }
        });


        nextBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                boolean yes = false;
                try 
                {
                    File userfile = new File(".\\data\\customer_data.txt");

                    if (userfile.exists()) 
                    {
                        BufferedReader readFile = new BufferedReader(new FileReader(".\\data\\customer_data.txt"));

                        while (readFile.readLine() != null) 
                        {
                            totalLines++;
                        }
                        readFile.close();
                    }

                    String newPassPf1 = newPassPf.getText();
                    String newPassPf2 = "Password : " + newPassPf.getText();
                    boolean newPassPf3 = newPassPf1.isEmpty();

                    String confirmPassPf1 = confirmPassPf.getText();
                    String confirmPassPf2 = "Password : " + confirmPassPf.getText();
                    boolean confirmPassPf3 = confirmPassPf1.isEmpty();
                    boolean check = newPassPf1.equals(confirmPassPf1);

                    if (newPassPf3 == true || confirmPassPf3 == true) 
                    {
                        showMessageDialog(null, "Enter password", "Error", JOptionPane.WARNING_MESSAGE);
                    } 
                            
                    else if (check == false) 
                    {
                        showMessageDialog(null, "Password not matching", "Error", JOptionPane.WARNING_MESSAGE);
                    } 
                    
                    else 
                    {
                        String tempfile = ".\\data\\temp.txt";
                        File oldFile = new File(".\\data\\customer_data.txt");
                        File newFile = new File(".\\data\\temp.txt");
                        int l = 0;
                        String currentline;

                        FileWriter fileWriter = new FileWriter(tempfile, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);

                        FileReader fr = new FileReader(".\\data\\customer_data.txt");
                        BufferedReader br = new BufferedReader(fr);

                        int n = (ForgetPassword.deleteLine) + 4;
                        while ((currentline = br.readLine()) != null) 
                        {
                            l++;
                            if (n != l) 
                            {
                                printWriter.println(currentline);
                            } 
                                
                            else 
                            {
                                printWriter.println(confirmPassPf2);
                            }
                        }
                        printWriter.flush();
                        printWriter.close();
                        fr.close();
                        br.close();
                        bufferedWriter.close();
                        fileWriter.close();

                        oldFile.delete();
                        File dumb = new File(".\\data\\customer_data.txt");
                        newFile.renameTo(dumb);
                        
                        
                        setVisible(false);
                        new CustomerLoginPage();
                    }
                        
                }

                catch (Exception ex) 
                {
                    System.out.println(ex);
                }
            }

        });
           
    }
}
