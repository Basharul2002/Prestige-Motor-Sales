package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

import Classes.*;



  public class CustomerLoginPage extends JFrame
  {
      private Container c;
      private ImageIcon icon, img, homeLogo, passHideIcon, passShowIcon, login;
      private JLabel imgLabel, cEmail, cPass, cReg, customerLoginLabel, helloLabel, emailPlaceLabel, passPlaceLabel, regUnderLine;
      private JTextField cEmailTf;
      private JPasswordField cPassPf;
      private JButton cLoginHomePageBtn, passHideBtn, passShowBtn, cLoginBtn, cForgotPass, cNewAccBtn;
      private Font font;

      private String name, email, address, phoneNum, password;



      public CustomerLoginPage()
      {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setTitle("Prestige Motor Sales");
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
        //customer Login Page to Home Page Button
        cLoginHomePageBtn = new JButton(homeLogo);
        cLoginHomePageBtn.setBounds(40, 20, 24, 24);
        cLoginHomePageBtn.setFocusPainted(false);
        cLoginHomePageBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cLoginHomePageBtn.setContentAreaFilled(false);
        cLoginHomePageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        imgLabel.add(cLoginHomePageBtn);


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



        //Email
        cEmail = new JLabel("Email");
        cEmail.setFont(font);
        cEmail.setBounds(700, 160, 60, 40);
        cEmail.setForeground(Color. WHITE);
        cEmail.setVisible(true);
        c.add(cEmail);


        cEmailTf = new JTextField();
		    cEmailTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        cEmailTf.setBounds(700, 190, 220, 40);
		    cEmailTf.setForeground(Color.white);
		    cEmailTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		    cEmailTf.setCaretColor(Color.white);
		    cEmailTf.setBorder(null);
	      cEmailTf.setBorder(null);
		    cEmailTf.setOpaque(false);
        c.add(cEmailTf);

        emailPlaceLabel = new JLabel("____________________________________");
        emailPlaceLabel.setBounds(700, 200, 230, 40);
        emailPlaceLabel.setForeground(Color.white);
        emailPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        c.add(emailPlaceLabel);

        

        //Password
        cPass = new JLabel("Password");
        cPass.setBounds(700, 250, 160, 40);
        cPass.setFont(font);
        cPass.setForeground(Color. WHITE);
        c.add(cPass);

        cPassPf = new JPasswordField();
        cPassPf.setBounds(700, 280, 220, 40);
		    cPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		    cPassPf.setForeground(Color.white);
		    cPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		    cPassPf.setCaretColor(Color.white);
		    cPassPf.setBorder(null);
	      cPassPf.setBorder(null);
		    cPassPf.setOpaque(false);
        c.add(cPassPf);

        passPlaceLabel = new JLabel("____________________________________");
        passPlaceLabel.setBounds(700, 290, 230, 40);
        passPlaceLabel.setForeground(Color.white);
        passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        //passPlaceLabel.setBounds(770, 180, 200, 40);
        c.add(passPlaceLabel);

        String cPassStore = cPassPf.getText();  // To store password which is user typed


        passHideIcon = new ImageIcon(getClass().getResource("/Images/Hide.png"));
        passHideBtn = new JButton(passHideIcon);
        passHideBtn.setBounds(930, 285, 35, 35);
        passHideBtn.setFocusPainted(false);
        passHideBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        passHideBtn.setBackground(Color.decode("#3944BC"));
        passHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passHideBtn.setVisible(true);
        c.add(passHideBtn);


        passShowIcon = new ImageIcon(getClass().getResource("/Images/Show.png")); 
        passShowBtn = new JButton(passShowIcon);
        passShowBtn.setBounds(930, 285, 32, 32);
        passShowBtn.setFocusPainted(false);
        passShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        passShowBtn.setBackground(Color.decode("#3944BC"));
        passShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passShowBtn.setVisible(false);
        c.add(passShowBtn);
   

        login = new ImageIcon(getClass().getResource("/images/Login Button.png"));   //Login button logo

        //Customer Login 
        cLoginBtn = new JButton(login);
        cLoginBtn.setBounds(750, 400, 127, 47);
		    cLoginBtn.setForeground(Color.white);
        cLoginBtn.setFont(new Font("Segoe UI", Font.BOLD, 25));
        cLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cLoginBtn.setFocusPainted(false);
        // cLoginBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
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
        cReg.setBounds(720, 460, 140, 50);
        cReg.setForeground(Color.white);
        c.add(cReg);

        cNewAccBtn = new JButton("Sign Up");
        cNewAccBtn.setBounds(853, 470, 70, 28);
        cNewAccBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        cNewAccBtn.setForeground(Color.white);
        cNewAccBtn.setFocusPainted(false);
        cNewAccBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cNewAccBtn.setContentAreaFilled(false);
        cNewAccBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(cNewAccBtn);


        regUnderLine = new JLabel("________");
        regUnderLine.setBounds(863, 482, 60, 13);
        regUnderLine.setForeground(Color.white);
        regUnderLine.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c.add(regUnderLine);
	






        // Action Listener for Home Page Button
        cLoginHomePageBtn.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent ae)
          {
            setVisible(false);
            HomePage frame = new HomePage();
            frame.setVisible(true);
          }
        });


      passHideBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          if(cPassPf.getEchoChar() != '\u0000')
          {
            cPassPf.setEchoChar('\u0000');
            passHideBtn.setVisible(false);
            passShowBtn.setVisible(true);
          }
        }
      });


      passShowBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          cPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
          passShowBtn.setVisible(false);
          passHideBtn.setVisible(true);
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

              boolean emailCheck = false;
              boolean passCheck = false;

              int totalLines = 0;
              while(reader.readLine() != null)
              {
                totalLines++;
              }
              reader.close();

              for(int i = 0; i< totalLines; i++)
              {
                //This is for email what is store in text file
                String textFileEmailStore = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i);
                // System.out.println(textFileEmailStore);

                if(textFileEmailStore.equals(cEmail))  //Cheak text file email and customer entered email
                {
                  emailCheck = true;
                  //This is pass what is store in text file
                  String textFilePassStore = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+4);
                  // System.out.println(textFilePassStore);

                  if(textFilePassStore.equals(cPass))   //Cheak text file password and customer entered password
                  {
                    passCheck = true;

                  
                  String line = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+1);
                  String x = line.substring(0, 8);
                  

                if(x.equals("Customer"))
                  { 

                    email = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i).substring(7);  //Name
                    name = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+1).substring(14);  //email
                    phoneNum = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+2).substring(14);  //Phone Number
                    address = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+3).substring(9);  // Address
                    password = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+4).substring((9));  // Password
                    
                }
                    
                  }
                      
                }
            }

              if(emailCheck==true) 
              {
                if(passCheck==true)
                {
                  setVisible(false);
                  new CustomerDashBoard(name, email, address, phoneNum, password);
                }

                else 
                {
                  JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.WARNING_MESSAGE);
                }
              }

              else 
              {
                JOptionPane.showMessageDialog(null, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
              }
            }

            catch(Exception ex)
            {
              System.out.println(ex);
            }
          }

        }
      });



      //Action Listner for forgot password
      cForgotPass.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          setVisible(false);
          new ForgetPassword();
        }
      });



      //Action Listiner for new account regestration
      cNewAccBtn.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          setVisible(false);
          new CustomerRegistrationForm();    
        }
      });
  }

}
