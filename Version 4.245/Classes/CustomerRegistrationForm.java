package Classes;

import java.lang.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;  //For border

import java.io.*;  //Field Backgorund/ Foreground color
import static javax.swing.JOptionPane.showMessageDialog;  //Panal Message
import java.nio.file.*;  // Text File Read
import java.time.*;
import java.time.format.*;
import java.net.*;

import Classes.*;



public class CustomerRegistrationForm extends JFrame
{
    private Container c;
    private ImageIcon icon, homeLogo, img, passShowIcon, passHideIcon, confirmPassShowIcon, confirmPassHideIcon;
    private JLabel imgLabel, cNameReg, cPhnNumReg, cEmailReg, cAddressReg, cCreatePass, cConfirmPass, createAccLabel;
    private JTextField cNameRegTf, cPhnNumRegTf, cEmailRegTf;
    private JTextArea cAddressRegTa;
    private JPasswordField cCreatePassPf, cConfirmPassPf;
    private JButton passShowBtn, passHideBtn, confirmPassShowBtn, confirmPassHideBtn, cRegExit, cRegSubmitBtn;
    private JScrollPane scroll;
    private Font font;
    private String IP;


    public CustomerRegistrationForm()
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
		
		//Logo and images
		img = new ImageIcon(getClass().getResource("/images/signUp.png"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		c.add(imgLabel);

		font = new Font(/*Font Name*/ "Times New Roman", Font.PLAIN, /*Font Size*/ 15);

        //Home Button Logo
        homeLogo = new ImageIcon(getClass().getResource("/images/Previous.png"));
        //Admin Login Page to Home Page Button
        cRegExit = new JButton(homeLogo);
        cRegExit.setBounds(20, 20,homeLogo.getIconWidth(), homeLogo.getIconHeight());
		cRegExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cRegExit.setFocusPainted(false);
        cRegExit.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cRegExit.setContentAreaFilled(false);
        imgLabel.add(cRegExit);


        // extra
		createAccLabel = new JLabel("Create Account");
		createAccLabel.setBounds(650, 7, 250, 47);
		createAccLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		createAccLabel.setForeground(Color.WHITE);
		c.add(createAccLabel);


        //Name
        cNameReg = new JLabel("Name");
        cNameReg.setFont(font);
        cNameReg.setForeground(Color.WHITE);
        cNameReg.setBounds(570, 80, 160, 40);
        c.add(cNameReg);


        cNameRegTf = new JTextField();
        cNameRegTf.setBounds(570, 110, 200, 40);
		cNameRegTf.setForeground(Color.BLACK);
		cNameRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cNameRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cNameRegTf.setCaretColor(Color.BLACK);
        cNameRegTf.setBorder(null);
        c.add(cNameRegTf);



        //Phone Number
        cPhnNumReg = new JLabel("Phone Number");
        cPhnNumReg.setBounds(570, 150, 160, 40);
        cPhnNumReg.setFont(font);
        cPhnNumReg.setForeground(Color.WHITE);
        c.add(cPhnNumReg);

        cPhnNumRegTf = new JTextField();
        cPhnNumRegTf.setBounds(570, 180, 200, 40);
		cPhnNumRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cPhnNumRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cPhnNumRegTf.setCaretColor(Color.BLACK);
        cPhnNumRegTf.setBorder(null);
        c.add(cPhnNumRegTf);



        //Email
        cEmailReg = new JLabel("Email");
        cEmailReg.setBounds(800, 150, 160, 40);
        cEmailReg.setFont(font);
        cEmailReg.setForeground(Color.WHITE);
        c.add(cEmailReg);

        cEmailRegTf = new JTextField();
        cEmailRegTf.setBounds(800, 180, 200, 40);
        cEmailRegTf.setForeground(Color.BLACK);
		cEmailRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cEmailRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cEmailRegTf.setCaretColor(Color.BLACK);
        cEmailRegTf.setBorder(null);
        c.add(cEmailRegTf);

		
		cAddressReg = new JLabel("Address");
        cAddressReg.setBounds(570, 220, 160, 40);
        cAddressReg.setFont(font);
        cAddressReg.setForeground(Color.WHITE);
        c.add(cAddressReg);

        cAddressRegTa = new JTextArea();
        scroll = new JScrollPane(cAddressRegTa);
        scroll.setBounds(570, 250, 400, 70);
		cAddressRegTa.setLineWrap(true);    //For this when line is complete then next line start
        cAddressRegTa.setWrapStyleWord(true);   //When line is complete then word is strat form next line
		cAddressRegTa.setForeground(Color.BLACK);
		cAddressRegTa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cAddressRegTa.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cAddressRegTa.setCaretColor(Color.BLACK);
        cAddressRegTa.setBorder(null);
        c.add(scroll);





        //Password Create
        cCreatePass = new JLabel("Password");
        cCreatePass.setBounds(570, 320, 160, 40);
        cCreatePass.setFont(font);
        cCreatePass.setForeground(Color.WHITE);
        c.add(cCreatePass);


        cCreatePassPf = new JPasswordField();
        cCreatePassPf.setBounds(570, 350, 175, 40);
		cCreatePassPf.setForeground(Color.BLACK);
		cCreatePassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cCreatePassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cCreatePassPf.setCaretColor(Color.BLACK);
        cCreatePassPf.setBorder(null);
        c.add(cCreatePassPf);


        passHideIcon = new ImageIcon(getClass().getResource("/Images/hide1.png"));
        passHideBtn = new JButton(passHideIcon);
        passHideBtn.setBounds(745, 350, 35, 40);
        passHideBtn.setFocusPainted(false);
        passHideBtn.setBorder(null);
        passHideBtn.setBackground(Color.white);
        passHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passHideBtn.setVisible(true);
        c.add(passHideBtn);

        passShowIcon = new ImageIcon(getClass().getResource("/Images/show1.png")); 
        passShowBtn = new JButton(passShowIcon);
        passShowBtn.setBounds(745, 350, 35, 40);
        passShowBtn.setFocusPainted(false);
        passShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        passShowBtn.setBackground(Color.white);
        passShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passShowBtn.setVisible(false);
        c.add(passShowBtn);
	



        //Confirm Password
		cConfirmPass = new JLabel("Confirm Password");
        cConfirmPass.setBounds(800, 320, 160, 40);
        cConfirmPass.setFont(font);
        cConfirmPass.setForeground(Color.WHITE);
        c.add(cConfirmPass);

        cConfirmPassPf = new JPasswordField();
        cConfirmPassPf.setBounds(800, 350, 200, 40);
		cConfirmPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cConfirmPassPf.setForeground(Color.BLACK);
		cConfirmPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cConfirmPassPf.setCaretColor(Color.BLACK);
        cConfirmPassPf.setBorder(null);
        c.add(cConfirmPassPf);


        confirmPassHideIcon = new ImageIcon(getClass().getResource("/Images/hide1.png"));
        confirmPassHideBtn = new JButton(passHideIcon);
        confirmPassHideBtn.setBounds(1000, 350, 35, 40);
        confirmPassHideBtn.setFocusPainted(false);
        confirmPassHideBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        confirmPassHideBtn.setBackground(Color.WHITE);
        confirmPassHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassHideBtn.setVisible(true);
        c.add(confirmPassHideBtn);

        confirmPassShowIcon = new ImageIcon(getClass().getResource("/Images/show1.png")); 
        confirmPassShowBtn = new JButton(passShowIcon);
        confirmPassShowBtn.setBounds(1000, 350, 35, 40);
        confirmPassShowBtn.setFocusPainted(false);
        confirmPassShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        confirmPassShowBtn.setBackground(Color.WHITE);
        confirmPassShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassShowBtn.setVisible(false);
        c.add(confirmPassShowBtn);
	



        //Submit Button
        //submit = new ImageIcon(getClass().getResource("/images/Submit2.png"));
        cRegSubmitBtn = new JButton("Submit");
        cRegSubmitBtn.setBounds(570, 430, 140,35);		
        cRegSubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));		
        cRegSubmitBtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cRegSubmitBtn.setBackground(Color.decode("#4CBB17"));
        c.add(cRegSubmitBtn);

       // System.out.println(InetAddress.getLocalHost().getHostAddress());

        // IP Address        
        try 
        {
            String IPAddress = InetAddress.getLocalHost().getHostAddress();
            IP = IPAddress;
        


        }

        catch(Exception ex)
        {
            System.out.println(ex);
        }


        //Action Listener for previous
        cRegExit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerLoginPage();

            }
        });
		
	


        passHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(cCreatePassPf.getEchoChar() != '\u0000')
            {
            cCreatePassPf.setEchoChar('\u0000');
            passShowBtn.setVisible(true);
            passHideBtn.setVisible(false);
            
            }
        }
        });


        passShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            cCreatePassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            passHideBtn.setVisible(true);
            passShowBtn.setVisible(false);
        }
        });


        // Confirm
        confirmPassHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(cConfirmPassPf.getEchoChar() != '\u0000')
            {
            cConfirmPassPf.setEchoChar('\u0000');
            confirmPassShowBtn.setVisible(true);
            confirmPassHideBtn.setVisible(false);
            
            }
        }
        });


        confirmPassShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            cConfirmPassPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            confirmPassHideBtn.setVisible(true);
            confirmPassShowBtn.setVisible(false);
            
        }
        });




        //Action Listener for submit button (Registation Page to customer login page)
        cRegSubmitBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String cNameStore = cNameRegTf.getText();  //Name
                String cPhoneNumberStore = cPhnNumRegTf.getText();   //Phone Number
                String cEmailStore = cEmailRegTf.getText();   //Email
                String cAddressStore = cAddressRegTa.getText();   //address
                String cCreatePassStore = cCreatePassPf.getText();   //Create password
                String cConfirmPassStore = cConfirmPassPf.getText();   //Confim Password

 

                //Phone Number validity check
                boolean phoneNumberCheck = false;
                String phoneNumberRegex = ("^(?:\\+88|88)?(01[3-9]\\d{8})$");
                if(cPhoneNumberStore.matches(phoneNumberRegex))
                {
                    phoneNumberCheck = true;
                }

                // Email validity check
                Boolean emailCheck = false;
                String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                if(cEmailStore.matches(emailRegex))
                {
                    emailCheck = true;
                }

                String cPhoneNum = "Phone Number: "+cPhoneNumberStore;
                String cEmail = "Email: "+cEmailStore;
                String textFileEmailStore, textFilePhnNumStore;
                boolean emailStoreCheck = false, phoneNumStoreCheck = false;


                try 
                {
                    BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\customer_data.txt"));

                    int totalLines = 0;
                    while(reader.readLine() != null)
                    {
                        totalLines++;
                    }
                    reader.close();

                    for(int i = 0; i< totalLines-2; i++)
                    {
                        //This is for email and Phone Number what is stored in text file
                        textFileEmailStore = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i);
                        textFilePhnNumStore = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i+2);
                        // System.out.println(textFileEmailStore);
                        // System.out.println(textFilePhnNumStore);

                        if(textFileEmailStore.equals(cEmail) || textFilePhnNumStore.equals(cPhoneNum)) 
                        {
                            if(textFileEmailStore.equals(cEmail))
                            {
                                emailStoreCheck = true;
                                if(textFilePhnNumStore.equals(cPhoneNum))
                                {
                                    phoneNumStoreCheck = true;
                                }
                            }
                        }
                        //break;
                        // System.out.println(textFileEmailStore);
                        // System.out.println(textFilePhnNumStore);
                    }
                    

                }

                catch(Exception ex)
                {
                    System.out.println("1st Exception: "+ex);
                }

                if(cNameStore.isEmpty() || cPhoneNumberStore.isEmpty() || cEmailStore.isEmpty() || cAddressStore.isEmpty() || cCreatePassStore.isEmpty() || cConfirmPassStore.isEmpty())
                {
                    showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
                }




                else 
                {
                    if(emailStoreCheck==true &&  phoneNumStoreCheck==true) 
                    {
                        showMessageDialog(null, "This Email and Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }


                    else if(emailStoreCheck==true)
                    {
                        showMessageDialog(null, "This Email Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }


                    else if(phoneNumStoreCheck==true)
                        {
                            showMessageDialog(null, "This Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                        }


                    else if(emailStoreCheck == false && phoneNumStoreCheck == false)
                    {
                        if(cCreatePassStore.equals(cConfirmPassStore))
                        {
                            if(phoneNumberCheck == true &&  emailCheck == true) 
                            {
                                try
                                {
                                    File file = new File(".\\Data\\customer_data.txt");
                                    if(!file.exists())
                                    {
                                        file.createNewFile();
                                    }
        
                                    FileWriter fileWriter = new FileWriter(file, true);
                                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
        
                                    LocalDateTime myDateObj = LocalDateTime.now();
                                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
        
                                    String timeAndDate = myDateObj.format(myFormatObj);
                                            
                                    printWriter.println("Email: " +cEmailStore);
                                    printWriter.println("Customer Name: "+cNameStore);
                                    printWriter.println("Phone Number: "+cPhoneNumberStore);
                                    printWriter.println("Address: "+cAddressStore);
                                    printWriter.println("Password: "+cCreatePassStore);
                                    printWriter.println("IP Address: "+IP);
                                    printWriter.println("Time & Date: "+timeAndDate);
                                    printWriter.println("===============================================");
                                    printWriter.println("===============================================");
                                    printWriter.close();
        
                                }
        
                                catch (Exception ex)
                                {
                                    System.out.print("2nd Exception: "+ex);
                                }
                                        
                                showMessageDialog(null, "Registration Successful", "Registration Complete", JOptionPane.WARNING_MESSAGE);
                                setVisible(false);
                                new CustomerLoginPage();
                            }
        
                            else 
                            {
                                if(phoneNumberCheck == true) 
                                {
                                    if(emailCheck == false) 
                                    {
                                        showMessageDialog(null, "Invalid Email","WARNING", JOptionPane.WARNING_MESSAGE);
                                    }
                                }
        
                                else
                                {
                                    if(phoneNumberCheck == false) 
                                    {
                                        showMessageDialog(null, "Invalid Mobile Number","WARNING", JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                            }
                        }

                        else
                        {
                            showMessageDialog(null, "Password does not match", "WARNING", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }  

            }

        });



    }
/* 
        public static void main(String[] args)
        {
            //setVisible(false);
            CustomerRegistrationForm frame = new CustomerRegistrationForm();
            frame.setVisible(true);
        }

*/

}
