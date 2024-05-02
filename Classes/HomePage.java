package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;


public class HomePage extends JFrame
{
  private Container c; //For frame
  private JButton admin, customer, exit;
  private ImageIcon icon, img;
  private JLabel imgLabel, nameLabel;
  private Font font;
  private Cursor cursor;


  public HomePage()
  {
    //Frame size and Layout
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setTitle("Home Page");
    this.setLayout(null);
    this.setVisible(true);
  

    //page design
    this.setLocationRelativeTo(null);
    this.setResizable(false); //Maximize or minimize option close for false


    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#C5C6D0"));   //Background design is means background coloring


    //Icon
    icon = new ImageIcon(getClass().getResource("/images/icon.png"));
    this.setIconImage(icon.getImage());



    //Logo and images
    img = new ImageIcon(getClass().getResource("/images/homePagePicture.png"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(-8, 120, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);
	
	//Name
	nameLabel = new JLabel("Welcome To Prestige Motor Sales");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 45));
	nameLabel.setForeground(Color.BLACK);
	//nameLabel.setBackground(Color.BLACK);
	nameLabel.setBounds(150,-35,900,200);
	c.add(nameLabel);


    // Fonts
    font = new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 25);



    // Cursor for JButtons
    cursor = new Cursor(Cursor.HAND_CURSOR);  //When its use in a button and user when go this buttonm than button icon can br change and that is show hand



    //Admin
    admin = new JButton("Admin");    //Admin Button Create
    admin.setBounds(800, 180, 200, 60);  //Admin Button set boundry (x, y, width, height)
    admin.setFont(font);   //For Button font;
    admin.setCursor(cursor);
    admin.setForeground(Color.WHITE);
    admin.setBackground(Color.decode("#000000"));   //For button background color #C00000(RED)
	admin.setFocusPainted(false);
    c.add(admin);   //admin option add




    // Customer
    customer = new JButton("Customer");    //Customer Button Create
    customer.setBounds(800, 280, 200, 60);   //Customer Button set boundry (x, y, width, height)
    customer.setFont(font);
    customer.setCursor(cursor);
    customer.setForeground(Color.WHITE);   //Button
    customer.setBackground(Color.decode("#000000"));   //#2E75B6   #ED9121   #90EE90
	customer.setFocusPainted(false);
    c.add(customer);   //Customer option add



    // EXIT
    exit = new JButton("Exit");
    exit.setBounds(800, 380, 200, 60);
    exit.setFont(font);
    exit.setCursor(cursor);
    exit.setForeground(Color.WHITE);
    exit.setBackground(Color.decode("#FF0000"));
	exit.setFocusPainted(false);
    c.add(exit);


    // Action Action Listener
    // Exit Button
    exit.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent ae) 
      {
        System.exit(0);
      }
    });

  
    //Admin Button
    admin.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        AdminLoginPage frame = new AdminLoginPage();
        frame.setVisible(true);
      }
    });
  
    // Customer Button Action Listener
    customer.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        new CustomerLoginPage();
        //frame.setVisible(true);
      }
    });
    
  }


  public static void main(String[] args)
  {
    HomePage frame = new HomePage();
    frame.setVisible(true);
  }
}
