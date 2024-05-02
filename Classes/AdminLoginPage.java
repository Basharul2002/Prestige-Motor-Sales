package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

import Classes.*;


public class AdminLoginPage extends JFrame
{
  private Container c;
  private ImageIcon img, icon, homeLogo, login;
  private JLabel adminIDLabel, adminPassLabel, imgLabel, idPlaceLabel, passPlaceLabel, adminLogInLabel;
  private JTextField adminIDTf;
  private JPasswordField adminPassPf;
  private JButton adminLoginBtn, adminLoginHomePageBtn;
  private Font font;
  //private String adminIdStore, adminPassStore;


  public AdminLoginPage()
  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setLayout(null);
    this.setVisible(true);
    this.setTitle("Admin Login Page");

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
    adminLoginHomePageBtn.setFocusPainted(false);
    imgLabel.add(adminLoginHomePageBtn);




    //Admin ID
    adminIDLabel = new JLabel("Admin ID");
    adminIDTf = new JTextField();
	adminIDLabel.setFont(font);
    adminIDLabel.setBounds(700, 190, 80, 60);
    adminIDLabel.setForeground(Color.WHITE);
    
    adminIDTf.setBounds(700, 230, 200, 40);

	adminIDTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminIDTf.setForeground(Color.white);
    adminIDTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminIDTf.setCaretColor(Color.white);
	
    adminIDLabel.setVisible(true);
    adminIDTf.setVisible(true);
	adminIDTf.setBorder(null);
	adminIDTf.setBorder(null);
    adminIDTf.setOpaque(false);
    c.add(adminIDLabel);
    c.add(adminIDTf);

	  



    //Admin Password
    adminPassLabel = new JLabel("Password");
    adminPassPf = new JPasswordField();
    adminPassLabel.setBounds(700, 280, 70, 60);
    adminPassLabel.setForeground(Color.WHITE);
    adminPassPf.setBounds(700, 320, 200, 40);
	
	adminPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminPassPf.setForeground(Color.white);
    adminPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminPassPf.setCaretColor(Color.white);
	
	adminPassPf.setBorder(null);
	adminPassLabel.setFont(font);
	adminPassPf.setBorder(null);
    adminPassPf.setOpaque(false);
    c.add(adminPassLabel);
    c.add(adminPassPf);
	
	  


    //Login button logo
    login = new ImageIcon(getClass().getResource("/images/login Button.png"));


    //Admin Login button
    adminLoginBtn = new JButton(login);
    adminLoginBtn.setBounds(750, 400, 128, 47);
	adminLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    adminLoginBtn.setFocusPainted(false);
    adminLoginBtn.setBackground(Color.decode("#3944BC"));
    c.add(adminLoginBtn);
	
	
	//Extra Work
	idPlaceLabel = new JLabel("_______________________________");
    idPlaceLabel.setBounds(700, 240, 400, 40);
    idPlaceLabel.setForeground(Color.white);
    idPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	//idPlaceLabel.setBounds(770, 180, 200, 40);
	c.add(idPlaceLabel);
	
	passPlaceLabel = new JLabel("______________________________");
    passPlaceLabel.setBounds(700, 330, 400, 40);
    passPlaceLabel.setForeground(Color.white);
    passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	//passPlaceLabel.setBounds(770, 180, 200, 40);
	c.add(passPlaceLabel);
	
	
	adminLogInLabel = new JLabel("Admin Login In");
	adminLogInLabel.setBounds(730, 80, 400, 100);
	adminLogInLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
    adminLogInLabel.setForeground(Color.WHITE);
	c.add(adminLogInLabel);

 

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

            int totalLines = 0;
            while(reader.readLine() != null)
            {
              totalLines++;
              //For identify, Number of line
            }
            reader.close();

            for(int i=0; i<=totalLines; i++)
            {
              String idLine = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+1);  //Store Admin ID from textfile
          
              if(idLine.equals(adminId))   //textfile ID and login page stored ID match
              {
                String passLine = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+2);   //Store Admin Password from textfile

                if(passLine.equals(adminPass))   //textfile pass and login page stored pass match 
                {
                  setVisible(false);
                  AdminDashBoard frame = new AdminDashBoard(adminIdStore);
                  frame.setVisible(true);
                  break;
                }
              }
            }
          }

          catch(Exception ex)
          {
            showMessageDialog(null, "Invalid Id or Password", "Warning", JOptionPane.WARNING_MESSAGE);
          }
        }
      }
    });

    

  }



  public static void main(String[] args)
  {
    AdminLoginPage Frame = new AdminLoginPage();
    Frame.setVisible(true);

  }
}
