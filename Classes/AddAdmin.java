package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;  //For border

import java.io.*;  //Field Backgorund/ Foreground color
import static javax.swing.JOptionPane.showMessageDialog;  //Panal Message
import java.time.*;
import java.time.format.*;

import java.nio.file.*;  // Text File Read

import Classes.*;





public class AddAdmin extends JFrame
{
    private Container c;
    private ImageIcon icon, addAdminBgImg, previousIcon, signOutLogo, hide, show;
    private JLabel title, addAdminBg, name, addAdminID, password, cofirmPassword, email, phoneNum , address, bloodGroup, namePlaceLabel, idPlaceLabel, phoneNumPlaceLabel, emailPlaceLabel, passPlaceLabel, addressPlaceLabel, passsPlaceLabel;
    private JTextField nameTf, emailTf, phoneNumberTf, addressTf, addAdminIDTf;
	private JPasswordField passwordPf, confirmPasswordPf;
	private JButton adminProfileBtn, confirmBtn, previousBtn, signOutBtn, passHideBtn, passShowBtn, confirmPassHideBtn, confirmPassShowBtn;

    private JComboBox bloodGroupNameCb, bloodGroupTypeCb;
    private String[] bloodGroupName = {"", "A ", "B ", "AB", "O"};
    private String[] bloodGroupType = {"", "+ve", "-ve"};

    private String adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore;


    public AddAdmin(String adminNameStore, String adminIDStore, String adminEmailStore, String adminPhnNumStore, String adminAddressStore, String adminBloodGroupStore, String adminPassStore)
    {
        
        this.adminNameStore = adminNameStore;
        this.adminIDStore = adminIDStore;
        this.adminEmailStore = adminEmailStore;
        this.adminPhnNumStore = adminPhnNumStore;
        this.adminAddressStore = adminAddressStore;
        this.adminBloodGroupStore = adminBloodGroupStore;
        this.adminPassStore = adminPassStore;
        

        this.setSize(1065, 650);
        this.setTitle("Prestige Motor Sales");
        this.setLayout(null);
        this.setVisible(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);

		
		//Backgroud coloring
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.decode("#3944BC"));


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setIconImage(icon.getImage());

        Font font = new Font(/*Font Name*/ "Times New Roman", Font.PLAIN, /*Font Size*/ 20);
        

        //image
        addAdminBgImg = new ImageIcon(getClass().getResource("/images/Add Admin Bg.png"));
        addAdminBg = new JLabel(addAdminBgImg);
        addAdminBg.setBounds(-30,0, addAdminBgImg.getIconWidth(), addAdminBgImg.getIconHeight());
        c.add(addAdminBg);

        //Title
        title = new JLabel("ADD ADMIN");
        title.setBounds(250, 15, 600, 30);
        Font titleFont = new Font(/*Font Name*/ "Times New Roman", Font.BOLD, /*Font Size*/ 40);
        title.setFont(titleFont);
        addAdminBg.add(title);


        // Loging Admin ID 
        adminProfileBtn = new JButton(adminIDStore);
        adminProfileBtn.setBounds(930, 10, 60, 30);
        adminProfileBtn.setFont(font);
        adminProfileBtn.setOpaque(false);
        adminProfileBtn.setBackground(Color.decode("#3944BC"));
        adminProfileBtn.setForeground(Color.white);
        adminProfileBtn.setBorder(null);
        adminProfileBtn.setFocusPainted(false);
        c.add(adminProfileBtn);



        //SignOut Button Logo
        signOutLogo = new ImageIcon(getClass().getResource("/images/logout.png"));
        //Admin Login Page to Home Page Button
        signOutBtn = new JButton(signOutLogo);
        signOutBtn.setBounds(990, 13,signOutLogo.getIconWidth(), signOutLogo.getIconHeight());
        signOutBtn.setForeground(Color.red);
		signOutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signOutBtn.setFocusPainted(false);
        signOutBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signOutBtn.setContentAreaFilled(false);
        c.add(signOutBtn);



		
		// Name
		name = new JLabel("Name");
        name.setBounds(730, 50, 160, 40);
        name.setFont(font);
        name.setForeground(Color.WHITE);
        c.add(name);

        nameTf = new JTextField();
        nameTf.setBounds(730, 75, 200, 40);
		nameTf.setForeground(Color.WHITE);
		nameTf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		nameTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		nameTf.setCaretColor(Color.WHITE);
		nameTf.setVisible(true);
		nameTf.setBorder(null);
		nameTf.setOpaque(false);
        c.add(nameTf);

        namePlaceLabel = new JLabel("____________________________________");
		namePlaceLabel.setBounds(730, 80, 400, 40);
		namePlaceLabel.setForeground(Color.white);
		namePlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(namePlaceLabel);



        // Admin ID
		addAdminID = new JLabel("ID");
		addAdminID.setFont(font);
		addAdminID.setBounds(730, 100, 60, 60);
		addAdminID.setForeground(Color.WHITE);  
        c.add(addAdminID);
        
        
        addAdminIDTf = new JTextField();
		addAdminIDTf.setBounds(730, 130, 200, 40);
		addAdminIDTf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		addAdminIDTf.setForeground(Color.white);
		addAdminIDTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminIDTf.setCaretColor(Color.white);
		addAdminID.setVisible(true);
		addAdminIDTf.setVisible(true);
		addAdminIDTf.setBorder(null);
		addAdminIDTf.setOpaque(false);
		c.add(addAdminIDTf);


        idPlaceLabel = new JLabel("____________________________________");
		idPlaceLabel.setBounds(730, 135, 400, 40);
		idPlaceLabel.setForeground(Color.white);
		idPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(idPlaceLabel);


        // Email		
		email = new JLabel("Email");
        email.setBounds(730, 170, 160, 40);
        email.setFont(font);
        email.setForeground(Color.WHITE);
        c.add(email);

        emailTf = new JTextField();
        emailTf.setBounds(730, 190, 200, 40);
		emailTf.setForeground(Color.WHITE);
		emailTf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		emailTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		emailTf.setCaretColor(Color.WHITE);
		emailTf.setVisible(true);
		emailTf.setBorder(null);
		emailTf.setOpaque(false);
        c.add(emailTf);

        emailPlaceLabel = new JLabel("____________________________________");
		emailPlaceLabel.setBounds(730, 195, 400, 40);
		emailPlaceLabel.setForeground(Color.white);
		emailPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(emailPlaceLabel);

        phoneNum = new JLabel("Phone Number");
        phoneNum.setBounds(730, 230, 160, 40);
        phoneNum.setFont(font);
        phoneNum.setForeground(Color.WHITE);
        c.add(phoneNum);

        phoneNumberTf = new JTextField();
        phoneNumberTf.setBounds(730, 253, 200, 40);
        phoneNumberTf.setForeground(Color.WHITE);
		phoneNumberTf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		phoneNumberTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		phoneNumberTf.setCaretColor(Color.WHITE);
		phoneNumberTf.setVisible(true);
		phoneNumberTf.setBorder(null);
		phoneNumberTf.setOpaque(false);
        c.add(phoneNumberTf);


        phoneNumPlaceLabel = new JLabel("____________________________________");
		phoneNumPlaceLabel.setBounds(730, 258, 400, 40);
		phoneNumPlaceLabel.setForeground(Color.white);
		phoneNumPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(phoneNumPlaceLabel);


        address = new JLabel("Address");
        address.setBounds(730, 290, 160, 40);
        address.setFont(font);
        address.setForeground(Color.WHITE);
        c.add(address);

        addressTf = new JTextField();
        addressTf.setBounds(730, 315, 200, 40);
		addressTf.setForeground(Color.WHITE);
		addressTf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		addressTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addressTf.setCaretColor(Color.WHITE);
		addressTf.setVisible(true);
		addressTf.setBorder(null);
		addressTf.setOpaque(false);
        c.add(addressTf);

        addressPlaceLabel = new JLabel("____________________________________");
		addressPlaceLabel.setBounds(730, 320, 400, 40);
		addressPlaceLabel.setForeground(Color.white);
		addressPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(addressPlaceLabel);

        bloodGroup = new JLabel("Blood Group");
        bloodGroup.setBounds(730, 358, 150, 30);
        bloodGroup.setFont(font);
        bloodGroup.setForeground(Color.WHITE);
        c.add(bloodGroup);



        bloodGroupNameCb = new JComboBox(bloodGroupName);
        bloodGroupNameCb.setBounds(850, 363, 50, 20);
        c.add(bloodGroupNameCb);
		
        bloodGroupTypeCb = new JComboBox(bloodGroupType);
        bloodGroupTypeCb.setBounds(920, 363, 50, 20);
        c.add(bloodGroupTypeCb);
		

		// Password		
		password = new JLabel("Password");
        password.setBounds(730, 388, 160, 40);
        password.setFont(font);
        password.setForeground(Color.WHITE);
        c.add(password);

        passwordPf = new JPasswordField();
        passwordPf.setBounds(730, 408, 221, 40);
		passwordPf.setForeground(Color.WHITE);
		passwordPf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		passwordPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		passwordPf.setCaretColor(Color.WHITE);
		passwordPf.setVisible(true);
		passwordPf.setBorder(null);
		passwordPf.setOpaque(false);
        c.add(passwordPf);

        passPlaceLabel = new JLabel("____________________________________");
		passPlaceLabel.setBounds(730, 413, 221, 40);
		passPlaceLabel.setForeground(Color.white);
		passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(passPlaceLabel);
		

        //Password hide and show
        hide= new ImageIcon(getClass().getResource("/Images/Hide.png"));
        show = new ImageIcon(getClass().getResource("/Images/Show.png"));
        
        
        passHideBtn = new JButton(hide);
        passHideBtn.setBounds(950, 405, 40, 40);
        passHideBtn.setFocusPainted(false);
        passHideBtn.setBorder(null);
        passHideBtn.setBackground(Color.decode("#3944BC"));
        passHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passHideBtn.setVisible(true);
        c.add(passHideBtn);

        passShowBtn = new JButton(show);
        passShowBtn.setBounds(950, 405, 40, 40);
        passShowBtn.setFocusPainted(false);
        passShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        passShowBtn.setBackground(Color.decode("#3944BC"));
        passShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passShowBtn.setVisible(false);
        c.add(passShowBtn);
		

		//confirm pass		
		cofirmPassword = new JLabel("Confirm Password");
        cofirmPassword.setBounds(730, 450, 160, 40);
        cofirmPassword.setFont(font);
        cofirmPassword.setForeground(Color.WHITE);
        c.add(cofirmPassword);

        confirmPasswordPf = new JPasswordField();
        confirmPasswordPf.setBounds(730, 470, 225, 40);
		confirmPasswordPf.setForeground(Color.WHITE);
		confirmPasswordPf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		confirmPasswordPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		confirmPasswordPf.setCaretColor(Color.WHITE);
		confirmPasswordPf.setVisible(true);
		confirmPasswordPf.setBorder(null);
		confirmPasswordPf.setOpaque(false);
        c.add(confirmPasswordPf);

        passsPlaceLabel = new JLabel("____________________________________");
		passsPlaceLabel.setBounds(730, 475, 225, 40);
		passsPlaceLabel.setForeground(Color.white);
		passsPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(passsPlaceLabel);


        confirmPassHideBtn = new JButton(hide);
        confirmPassHideBtn.setBounds(955, 468, 40, 40);
        confirmPassHideBtn.setFocusPainted(false);
        confirmPassHideBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        confirmPassHideBtn.setBackground(Color.decode("#3944BC"));
        confirmPassHideBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassHideBtn.setVisible(true);
        c.add(confirmPassHideBtn);

	
        confirmPassShowBtn = new JButton(show);
        confirmPassShowBtn.setBounds(955, 468, 40, 40);
        confirmPassShowBtn.setFocusPainted(false);
        confirmPassShowBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        confirmPassShowBtn.setBackground(Color.decode("#3944BC"));
        confirmPassShowBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmPassShowBtn.setVisible(false);
        c.add(confirmPassShowBtn);




		// Button confirmBtn
		confirmBtn = new JButton("Confirm");
        confirmBtn.setBounds(780, 530, 140,35);		
        confirmBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));		
        confirmBtn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        confirmBtn.setBackground(Color.decode("#4CBB17"));
        c.add(confirmBtn);

		
		
		
		//Home Button Logo
        previousIcon = new ImageIcon(getClass().getResource("/images/Previous.png"));
        //Admin Login Page to Home Page Button
        previousBtn = new JButton(previousIcon);
        previousBtn.setBounds(50, 20,previousIcon.getIconWidth(), previousIcon.getIconHeight());
		previousBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        previousBtn.setFocusPainted(false);
        previousBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        previousBtn.setContentAreaFilled(false);
        addAdminBg.add(previousBtn);


        passHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(passwordPf.getEchoChar() != '\u0000')
            {
            passwordPf.setEchoChar('\u0000');
            passShowBtn.setVisible(true);
            passHideBtn.setVisible(false);
            
            }
        }
        });


        passShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            passwordPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            passHideBtn.setVisible(true);
            passShowBtn.setVisible(false);
        }
        });


        confirmPassHideBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            if(confirmPasswordPf.getEchoChar() != '\u0000')
            {
                confirmPasswordPf.setEchoChar('\u0000');
                confirmPassShowBtn.setVisible(true);
                confirmPassHideBtn.setVisible(false);
            
            }
        }
        });


        confirmPassShowBtn.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
            confirmPasswordPf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            confirmPassHideBtn.setVisible(true);
            confirmPassShowBtn.setVisible(false);
        }
        });
		


        previousBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				AdminDashBoard frame = new AdminDashBoard(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
				frame.setVisible(true);
			}
		});


		signOutBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				AdminLoginPage frame = new AdminLoginPage();
				frame.setVisible(true);
			}
		});

        confirmBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String nameStore = nameTf.getText();
                String IDStore = addAdminIDTf.getText();
                String emailStore = emailTf.getText();
                String phnNumberStore = phoneNumberTf.getText();
                String addressStore = addressTf.getText();
                String bloodGroupNameStore = bloodGroupNameCb.getSelectedItem().toString();
                String bloodGroupTypeStore = bloodGroupTypeCb.getSelectedItem().toString();
                String passwordStore = passwordPf.getText();
                String confirmPasswordStore = confirmPasswordPf.getText();

                // System.out.println(phnNumberStore+"\n \n");

                // Email validity check
                Boolean emailCheck = false;
                String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                if(emailStore.matches(emailRegex))
                {
                    emailCheck = true;
                }
                 
                // Phone Number validity check
                boolean phoneNumberCheck = false;
                String phoneNumberRegex = ("^(?:\\+88|88)?(01[3-9]\\d{8})$");
                if(phnNumberStore.matches(phoneNumberRegex))
                {
                    phoneNumberCheck = true;
                }

                String ID = "ID: "+IDStore;
                String adminPhoneNum = "Phone Number: "+phnNumberStore;
                String adminEmail = "Email: "+emailStore;
                String textFileIdStore, textFileEmailStore, textFilePhnNumStore;
                boolean idCheck = false, emailStoreCheck = false, phoneNumStoreCheck = false;

                // System.out.println(ID);
                // System.out.println(adminPhoneNum);
                // System.out.println(adminEmail+"\n \n");


                try 
                {
                    BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                    int totalLines = 0;
                    while(reader.readLine() != null)
                    {
                        totalLines++;
                    }
                    reader.close();

                    for(int i = 0; i< totalLines; i++)
                    {
                        //This is for email and Phone Number what is stored in text file
                        textFileIdStore = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                        textFileEmailStore = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+3);
                        textFilePhnNumStore = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+4);
            

                        if(textFileIdStore.equals(ID) || textFileEmailStore.equals(adminEmail) || textFilePhnNumStore.equals(adminPhoneNum)) 
                        {
                            if(textFileIdStore.equals(ID))
                            {
                               // System.out.println((i+2)+ "I "+textFileIdStore);
                                idCheck =true;
                            }
                            
                            if(textFileEmailStore.equals(adminEmail))
                            {
                               // System.out.println(i+ " Em"+textFileEmailStore);
                                emailStoreCheck = true; 
                            }
                            
                            if(textFilePhnNumStore.equals(adminPhoneNum))
                            {
                                // System.out.println(i+ "Num"+textFilePhnNumStore);
                                phoneNumStoreCheck = true;
                            }
                        }
                        
                    }
                    

                }

                catch(Exception ex)
                {
                    System.out.println("1st Exception: "+ex);
                }    

    
                if(nameStore.isEmpty() || IDStore.isEmpty() || emailStore.isEmpty() || addressStore.isEmpty() || bloodGroupNameStore.isEmpty() || bloodGroupTypeStore.isEmpty() || passwordStore.isEmpty() || confirmPasswordStore.isEmpty())
                {
                    showMessageDialog(null, "Please fill all of the fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
                }

                else
                {
                    
                    if(idCheck==true && emailStoreCheck==true &&  phoneNumStoreCheck==true) 
                    {
                        showMessageDialog(null, "This ID, Email and Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                    else if(idCheck==true && emailStoreCheck==true) 
                    {
                        showMessageDialog(null, "This ID and Email Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                    else if(idCheck==true  &&  phoneNumStoreCheck==true) 
                    {
                        showMessageDialog(null, "This ID and Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                    else if(emailStoreCheck==true &&  phoneNumStoreCheck==true) 
                    {
                        showMessageDialog(null, "This Email and Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }



                    else if(idCheck==true)
                    {
                        showMessageDialog(null, "This ID Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }


                    else if(emailStoreCheck==true)
                    {
                        showMessageDialog(null, "This Email Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }


                    else if(phoneNumStoreCheck==true)
                    {
                            showMessageDialog(null, "This Phone Number Already Registered", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                
                    else if(idCheck == false && emailStoreCheck == false && phoneNumStoreCheck == false)
                    {
                        if(passwordStore.equals(confirmPasswordStore))
                        {
                            if(phoneNumberCheck == true &&  emailCheck == true) 
                            {
                                try 
                                {
                                    File file = new File(".\\Data\\admin_data.txt");
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

                        
                                    printWriter.println("ID: "+IDStore);
                                    printWriter.println("Password: "+passwordStore);
                                    printWriter.println("Name: "+nameStore);
                                    printWriter.println("Email: "+emailStore);
                                    printWriter.println("Phone Number: "+phnNumberStore);
                                    printWriter.println("Address: "+addressStore);
                                    printWriter.println("Blood Group: "+bloodGroupNameStore+ " ("+ bloodGroupTypeStore+")");
                                    printWriter.println("Time & Date: "+timeAndDate);
                                    printWriter.println("===============================================");
                                    printWriter.println("===============================================");
                                    printWriter.close();

                                    showMessageDialog(null, "Admin Regestration Successful", "Regestration Confirmation", -1);
                                    setVisible(false);
                                    new AdminLoginPage();

                                }

                                catch (Exception ex)
                                {
                                    System.out.println("2 "+ex);
                                } 
                            }

                            
                            else 
                            {
                              
                                if(phoneNumberCheck==true)
                                {
                                    if(emailCheck == false) 
                                    {
                                        showMessageDialog(null, "Invalid Email","WARNING", JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                                
        
                                if(emailCheck==true) 
                                {
                                    if(phoneNumberCheck == false) 
                                    {
                                        showMessageDialog(null, "Invalid Mobile Number","WARNING", JOptionPane.WARNING_MESSAGE);
                                    }
                                }

                                else if(emailCheck==false && phoneNumberCheck==false)
                                {
                                    showMessageDialog(null, "Invalid Email & Mobile Number","WARNING", JOptionPane.WARNING_MESSAGE);
                                }
                                
                            }
                        }

                        else 
                        {
                            showMessageDialog(null, "Password not same", "WARNING", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            }
        });

        adminProfileBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminProfile(adminNameStore, adminIDStore, adminEmailStore, adminPhnNumStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            
            }
        });
    }

}
