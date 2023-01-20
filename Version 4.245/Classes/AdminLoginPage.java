package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

import Classes.*;



public class AdminLoginPage extends JFrame
{
  private Container c;
  private ImageIcon img, icon, homeLogo, passShowIcon, passHideIcon, login;
  private JLabel adminIDLabel, adminPassLabel, imgLabel, idPlaceLabel, passPlaceLabel, adminLogInLabel;
  private JTextField adminIDTf;
  private JPasswordField adminPassPf;
  private JButton passShowBtn, passHideBtn, adminLoginBtn, adminLoginHomePageBtn;
  private Font font;
  private String name, id, email, phoneNumber, address, bloodGroup, password;

  public AdminLoginPage()
  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setLayout(null);
    this.setVisible(true);
    this.setTitle("Prestige Motor Sales");

    //Page design
    this.setLocationRelativeTo(null);
    this.setResizable(false);


    //Backgroud coloring
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#3944BC"));

	
	  font = new Font(/*Font Name*/ "Times New Roman", Font.BOLD, /*Font Size*/ 15);

    //Icon
    icon = new ImageIcon(getClass().getResource("/images/icon.png"));
    this.setIconImage(icon.getImage());


    //Backgound images
    img = new ImageIcon(getClass().getResource("/images/login.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(-25, 0, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);


    //Home Button Logo
    homeLogo = new ImageIcon(getClass().getResource("/images/homeButton.png"));
    //Admin Login Page to Home Page Button
    adminLoginHomePageBtn = new JButton(homeLogo);
    adminLoginHomePageBtn.setBounds(40, 20,homeLogo.getIconWidth(), homeLogo.getIconHeight());
	  adminLoginHomePageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    adminLoginHomePageBtn.setBorder(null);
    adminLoginHomePageBtn.setContentAreaFilled(false);
    adminLoginHomePageBtn.setFocusPainted(false);
    imgLabel.add(adminLoginHomePageBtn);

    adminLogInLabel = new JLabel("Admin Login In");
	  adminLogInLabel.setBounds(730, 80, 400, 100);
	  adminLogInLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
    adminLogInLabel.setForeground(Color.WHITE);
	  c.add(adminLogInLabel);


    //Admin ID
    adminIDLabel = new JLabel("Admin ID");
	  adminIDLabel.setFont(font);
    adminIDLabel.setBounds(700, 190, 80, 60);
    adminIDLabel.setForeground(Color.WHITE);
    adminIDLabel.setVisible(true);
    c.add(adminIDLabel);
    

    adminIDTf = new JTextField();
    adminIDTf.setBounds(700, 230, 200, 40);
	  adminIDTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminIDTf.setForeground(Color.white);
    adminIDTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminIDTf.setCaretColor(Color.white);
    adminIDTf.setVisible(true);
	  adminIDTf.setBorder(null);
    adminIDTf.setOpaque(false);
    c.add(adminIDTf);


    //Extra Work
	  idPlaceLabel = new JLabel("_______________________________");
    idPlaceLabel.setBounds(700, 240, 200, 40);
    idPlaceLabel.setForeground(Color.white);
    idPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    c.add(idPlaceLabel);

	  
    //Admin Password
    adminPassLabel = new JLabel("Password");
    adminPassLabel.setBounds(700, 280, 70, 60);
    adminPassLabel.setForeground(Color.WHITE);
    adminPassLabel.setFont(font);
    c.add(adminPassLabel);


    adminPassPf = new JPasswordField();
    adminPassPf.setBounds(700, 320, 200, 40);
	  adminPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminPassPf.setForeground(Color.white);
    adminPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminPassPf.setCaretColor(Color.white);
    adminPassPf.setBorder(null);
	  adminPassPf.setBorder(null);
    adminPassPf.setOpaque(false);
    c.add(adminPassPf);


    passPlaceLabel = new JLabel("_______________________________");
    passPlaceLabel.setBounds(700, 330, 213, 40);
    passPlaceLabel.setForeground(Color.white);
    passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	  c.add(passPlaceLabel);


    passHideIcon = new ImageIcon(getClass().getResource("/Images/Hide.png"));
    passHideBtn = new JButton(passHideIcon);
    passHideBtn.setBounds(900, 323, 35, 35);
    passHideBtn.setFocusPainted(false);
    passHideBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    passHideBtn.setBackground(Color.decode("#3944BC"));
    passHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    passHideBtn.setVisible(true);
    c.add(passHideBtn);

    passShowIcon = new ImageIcon(getClass().getResource("/Images/Show.png")); 
    passShowBtn = new JButton(passShowIcon);
    passShowBtn.setBounds(900, 324, 32, 32);
    passShowBtn.setFocusPainted(false);
    passShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    passShowBtn.setBackground(Color.decode("#3944BC"));
    passShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    passShowBtn.setVisible(false);
    c.add(passShowBtn);
	
	  


    //Login button logo
    login = new ImageIcon(getClass().getResource("/images/login Button.png"));
    //Admin Login button
    adminLoginBtn = new JButton(login);
    adminLoginBtn.setBounds(750, 400, 128, 47);
	  adminLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    adminLoginBtn.setFocusPainted(false);
    adminLoginBtn.setBackground(Color.decode("#3944BC"));
    c.add(adminLoginBtn);
	

    //Action Listener start

    //Action Listener for Home Page Button
    adminLoginHomePageBtn.addActionListener(new ActionListener()
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
        if(adminPassPf.getEchoChar() != '\u0000')
        {
          adminPassPf.setEchoChar('\u0000');
          passHideBtn.setVisible(false);
          passShowBtn.setVisible(true);
        }
      }
    });


    passShowBtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        adminPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
        passShowBtn.setVisible(false);
        passHideBtn.setVisible(true);
      }
    });

    

    //Action Listener for login button
    adminLoginBtn.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent ae)
      {
        String adminIdStore = adminIDTf.getText();    //ID store from textfield
        String adminPassStore = adminPassPf.getText();   //Password store from passwordField

        if(adminIdStore.isEmpty() || adminPassStore.isEmpty())
	      {
          //If cannot given anything at textfield and Passwordfield  
          showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
	      }

        else
        {
          try 
          {
            String adminId = "ID: "+adminIdStore;   //Store in this type because we store ID in textfield (ID: 22-47903-2) in this style
            String adminPass = "Password: "+adminIdStore;     //Store in this type because we store Password in passwordfield (Password: 223358815868) in this style

            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));  //For read text file

            boolean idCheck = false;
            boolean passCheck = false;

  

            int totalLines = 0;
            while(reader.readLine() != null)
            {
              totalLines++;
              //For identify, Number of line in text file
            }
            reader.close();

            for(int i=0; i<totalLines-1; i++)
            {
              String adminTextFileID = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);  //Store Admin ID from textfile
              // System.out.println(adminTextFileID);
              // System.out.println(adminId);
              
              if(adminTextFileID.equals(adminId))   //textfile ID and login page stored ID match
              {
                idCheck = true;
                String adminTextFilePass = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+1);   //Store Admin Password from textfile
                // System.out.println(adminTextFilePass); 
                // System.out.println(adminPass);               

                if(adminTextFilePass.equals(adminPass))   //textfile pass and login page stored pass match 
                {
                  passCheck = true; 
                  id = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i).substring(4);
                  password = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+1).substring(10);
                  name = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+2).substring(6);
                  email = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+3).substring(7);
                  phoneNumber = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+4).substring(13);
                  address = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+5).substring((8));
                  bloodGroup = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+6).substring(12);
                  // Substring means starting index

                  // System.out.println(adminTextFilePass); 
                  // System.out.println(adminPass);   
                }
              }
            }

            if(idCheck == true) 
            {
              if(passCheck == true)
              {
                setVisible(false);
                new AdminDashBoard(name, id, email, phoneNumber, address, bloodGroup, password);
              }

              else 
              {
                showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.WARNING_MESSAGE);
              }
            }

            else 
            {
              showMessageDialog(null, "Invalid Id", "Warning", JOptionPane.WARNING_MESSAGE);
            }
          }

          catch(Exception ex)
          {
            System.out.println(ex);
          }
        }
      }
      
    });

  }

/* 

  public static void main(String[] args)
  {
    AdminLoginPage Frame = new AdminLoginPage();
    Frame.setVisible(true);

  }

  */
}
