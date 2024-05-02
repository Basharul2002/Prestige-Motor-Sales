package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.AccessDeniedException;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;


import Classes.*;

public class CustomerLoginPage extends JFrame
{
    private Container c;
    private ImageIcon icon, img, homeLogo, login;
    private JLabel imgLabel, cEmail, cPass, cReg, customerLoginLabel, helloLabel, emailPlaceLabel, passPlaceLabel;
    private JTextField cEmailTf;
    private JPasswordField cPassPf;
    private JButton cLoginBtn, cForgotPass, cNewAccBtn, cLoginHomePageBtn;
    private Font font;



    public CustomerLoginPage()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setTitle("Customer Login Page");
        this.setLayout(null);
        this.setVisible(true);

        this.setResizable(false);
        this.setLocationRelativeTo(null);


        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#3944BC"));

        //Icon
        icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setIconImage(icon.getImage());


        //Images
        //Background image
        img = new ImageIcon(getClass().getResource("/images/customerLogin.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(-30, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);



        //Font
        font = new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 15);

        //Home Button Logo
        homeLogo = new ImageIcon(getClass().getResource("/images/homeButton.png"));
        //Admin Login Page to Home Page Button
        cLoginHomePageBtn = new JButton(homeLogo);
        cLoginHomePageBtn.setBounds(40, 20, 24, 24);
        cLoginHomePageBtn.setFocusPainted(false);
        cLoginHomePageBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cLoginHomePageBtn.setContentAreaFilled(false);
        cLoginHomePageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        imgLabel.add(cLoginHomePageBtn);



        //Email
        cEmail = new JLabel("Email");
        cEmail.setFont(font);
        cEmail.setForeground(Color. WHITE);
        cEmailTf = new JTextField();
        cEmail.setBounds(700, 160, 60, 40);
		
		    cEmailTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		    cEmailTf.setForeground(Color.white);
		  cEmailTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		  cEmailTf.setCaretColor(Color.white);
	
        cEmail.setVisible(true);
        cEmailTf.setBounds(700, 190, 200, 40);
		cEmailTf.setBorder(null);
	    cEmailTf.setBorder(null);
		cEmailTf.setOpaque(false);
        c.add(cEmail);
        c.add(cEmailTf);

        

        //Password
        cPass = new JLabel("Password");
        cPass.setFont(font);
        cPass.setForeground(Color. WHITE);
        cPassPf = new JPasswordField();
        cPass.setBounds(700, 250, 160, 40);
        cPassPf.setBounds(700, 280, 200, 40);
		
		cPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cPassPf.setForeground(Color.white);
		cPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cPassPf.setCaretColor(Color.white);
		cPassPf.setBorder(null);
	    cPassPf.setBorder(null);
		cPassPf.setOpaque(false);
        c.add(cPass);
        c.add(cPassPf);

        String cPassStore = cPassPf.getText();


   

        login = new ImageIcon(getClass().getResource("/images/Login Button.png"));   //Login button logo

        //Customer Login 
        cLoginBtn = new JButton(login);
        cLoginBtn.setBounds(750, 400, 127, 47);
		cLoginBtn.setForeground(Color.white);
        cLoginBtn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        cLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cLoginBtn.setFocusPainted(false);
        cLoginBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cLoginBtn.setContentAreaFilled(false);
        c.add(cLoginBtn);



        //Forget Password
        cForgotPass = new JButton("Forgot Password?");
        cForgotPass.setBounds(800, 320, 150, 40);
		cForgotPass.setForeground(Color.white);
        cForgotPass.setFont(new Font("Segoe UI", Font.BOLD, 15));
        cForgotPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cForgotPass.setFocusPainted(false);
        cForgotPass.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cForgotPass.setContentAreaFilled(false);
        c.add(cForgotPass);



        //Resgistration From
        cReg = new JLabel("Dont't have an account?");
        cNewAccBtn = new JButton("Sign Up");
        cReg.setBounds(720, 460, 200, 50);
        cReg.setForeground(Color.white);
        cNewAccBtn.setBounds(865, 472, 70, 20);
		cNewAccBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cNewAccBtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        cNewAccBtn.setForeground(Color.white);
        cNewAccBtn.setFocusPainted(false);
        cNewAccBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cNewAccBtn.setContentAreaFilled(false);
        c.add(cReg);
        c.add(cNewAccBtn);
		
		//extra 
		
		customerLoginLabel = new JLabel("Login In");
		customerLoginLabel.setBounds(780, 8, 400, 100);
		customerLoginLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		customerLoginLabel.setForeground(Color.WHITE);
		c.add(customerLoginLabel);
		
		helloLabel = new JLabel("Hello! Let's get Started");
		helloLabel.setBounds(750, 38, 400, 100);
		helloLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		helloLabel.setForeground(Color.WHITE);
		c.add(helloLabel);
		
		emailPlaceLabel = new JLabel("____________________________________");
		emailPlaceLabel.setBounds(700, 200, 400, 40);
		emailPlaceLabel.setForeground(Color.white);
		emailPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		//idPlaceLabel.setBounds(770, 180, 200, 40);
		c.add(emailPlaceLabel);
	
		passPlaceLabel = new JLabel("____________________________________");
		passPlaceLabel.setBounds(700, 290, 400, 40);
		passPlaceLabel.setForeground(Color.white);
		passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		//passPlaceLabel.setBounds(770, 180, 200, 40);
		c.add(passPlaceLabel);



        //Action Listener for Home Page Button
    cLoginHomePageBtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        HomePage frame = new HomePage();
        frame.setVisible(true);
      }
    });

        cLoginBtn.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent ae)
          {
            String cEmailStore = cEmailTf.getText();   //For email collect
            String cPassStore = cPassPf.getText();   //For password collect

            if(cEmailStore.isEmpty() || cPassStore.isEmpty())
            {
              JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
            }

            else
            {
              try
              {
                String cEmail = "Email: " +cEmailStore;
                String cPass = "Password: " +cPassStore;
                BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\customer_data.txt"));

                int totalLines = 0;
                while(reader.readLine() != null)
                {
                  totalLines++;
                }
                reader.close();

                for(int i = 0; i<= totalLines; i++)
                {
                  //This is for email what is store in text file
                  String line = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i);

                  if(line.equals(cEmail))  //Cheak text file email and customer entered email
                  {
                    //This is pass what is store in text file
                    String line2 = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+3);

                    if(line2.equals(cPass))   //Cheak text file password and customer entered password
                    {
                      setVisible(false);
                      CustomerDashBoard frame = new CustomerDashBoard(cEmail);
                      frame.setVisible(true);
                      break;
                    }

                    else
                    {
                      JOptionPane.showMessageDialog(null, "Invalid Email or Password", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                  }
                }
              }

              catch(Exception ex)
              {
                
              }
            }

          }
        });

/* 

        //Action Listner for forgot password
        cForgotPass.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                CustomerForgotPassword frame = new CustomerForgotPassword();
                frame.setVisible(true);
            }
        });
*/


        //Action Listiner for new account regestration
        cNewAccBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                CustomerRegistrationForm frame = new CustomerRegistrationForm();
                frame.setVisible(true);
            }
        });



    }

    public static void main(String[] args)
    {
        CustomerLoginPage Frame = new CustomerLoginPage();
        Frame.setVisible(true);
    }
}
