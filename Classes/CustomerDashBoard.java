package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


import Classes.*;


public class CustomerDashBoard extends JFrame
{  
    private Container c;
    private JButton customerProfileBtn, backBtn, bmwBtn, jeepCompassBtn, nissanAltimaBtn, toyotaPriusBtn, landRoverRangeRoverBtn, ferrariRomaBtn, searchBtn;
    private ImageIcon icon, backImg, bmwIcon,  jeepCompassIcon, nissanAltimaIcon, toyotaPriusIcon, landRoverRangeRoverIcon, ferrariRomaIcon, searchIcon;
    private JLabel search, bmw, jeepCompass, nissanAltima, toyotaPrius, landRoverRangeRover, ferrariRoma;
    private JTextField searchBarTf;
    protected String cars[] = {"bmw", "jeep compass", "jeep", "compass", "nissan altima", "nissan",  "altima", "toyota prius" , "toyota", "prius", "land rover range rover", "land", "rover", "range" , "land rover", "range rover","ferrari roma" , "ferrari", " roma"};
    protected String email, check,  cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore;

    public CustomerDashBoard(String cNameStore, String cEmailStore, String cAddressStore, String cPhoneNumberStore, String cPassStore)
    {
        this.cNameStore = cNameStore;
        this.cEmailStore = cEmailStore;
        this.cAddressStore = cAddressStore;
        this.cPhoneNumberStore = cPhoneNumberStore;
        this.cPassStore = cPassStore;


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Prestige Motor Sales");


        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        //Icon 
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        customerProfileBtn = new JButton(cNameStore);
        customerProfileBtn.setBounds(1000, 5, 50, 30);
        customerProfileBtn.setCursor(cursor);
        customerProfileBtn.setForeground(Color.WHITE);
        customerProfileBtn.setBackground(Color.decode("#3944BC"));
        customerProfileBtn.setBorder(null);
        customerProfileBtn.setFocusPainted(false);
        c.add(customerProfileBtn);


        //Back image Icon
        backImg = new ImageIcon(getClass().getResource("/images/Previous.png"));

        backBtn = new JButton(backImg);
        backBtn.setBounds(5, 5, 24, 24);
        backBtn.setBorder(null);
        backBtn.setBackground(Color.decode("#F2F2F2"));
        backBtn.setCursor(cursor);
        c.add(backBtn);


        search = new JLabel("Search Your Favourite Car Here: ");
        Font searchFont = new Font("Segeo UI Black", Font.BOLD, 15);
        search.setBounds(170, 20, 300, 30);
        search.setFont(searchFont);
        c.add(search);


        searchBarTf = new JTextField();
        searchBarTf.setBounds(420, 20, 320, 30);
        c.add(searchBarTf);

    

        Font font = new Font("Times New Roman", Font.BOLD, 25);

        searchIcon = new ImageIcon(getClass().getResource("/images/Search.png"));
        searchBtn = new JButton(searchIcon);
        searchBtn.setBounds(740, 20, 24, 24);
        searchBtn.setBorder(null);
        searchBtn.setBackground(Color.decode("#F2F2F2"));
        c.add(searchBtn);

        

        bmwIcon = new ImageIcon(getClass().getResource("/images/D BMW.png"));
        bmwBtn = new JButton(bmwIcon);
        bmwBtn.setBounds(35, 70, 280, 180);
        bmwBtn.setCursor(cursor);
        c.add(bmwBtn);

        bmw = new JLabel("BMW X7");
        bmw.setBounds(95, 260, 300, 30);
        bmw.setFont(font);
        c.add(bmw);



        jeepCompassIcon = new ImageIcon(getClass().getResource("/images/D Jeep Compass.png"));
        jeepCompassBtn = new JButton(jeepCompassIcon);
        jeepCompassBtn.setBounds(370, 70, 280, 180);
        jeepCompassBtn.setCursor(cursor);
        c.add(jeepCompassBtn);

        jeepCompass = new JLabel("Jeep Compass");
        jeepCompass.setBounds(415, 260, 300, 30);
        jeepCompass.setFont(font);
        c.add(jeepCompass);



        nissanAltimaIcon = new ImageIcon(getClass().getResource("/images/D Nissan.png"));
        nissanAltimaBtn = new JButton(nissanAltimaIcon);
        nissanAltimaBtn.setBounds(710, 70, 280, 180);
        c.add(nissanAltimaBtn);

        nissanAltima = new JLabel("Nissan Altima");
        nissanAltima.setBounds(770, 260, 300, 30);
        nissanAltima.setFont(font);
        c.add(nissanAltima);



        toyotaPriusIcon = new ImageIcon(getClass().getResource("/images/D Toyota Prius.png"));
        toyotaPriusBtn = new JButton(toyotaPriusIcon);
        toyotaPriusBtn.setBounds(35, 350, 280, 180);
        toyotaPriusBtn.setCursor(cursor);
        c.add(toyotaPriusBtn);

        toyotaPrius = new JLabel("Toyota Prius");
        toyotaPrius.setBounds(95, 530, 300, 30);
        toyotaPrius.setFont(font);
        c.add(toyotaPrius);



        landRoverRangeRoverIcon = new ImageIcon(getClass().getResource("/images/D Range Rover.png"));
        landRoverRangeRoverBtn = new JButton(landRoverRangeRoverIcon);
        landRoverRangeRoverBtn.setBounds(370, 350, 280, 180);
        landRoverRangeRoverBtn.setCursor(cursor);
        c.add(landRoverRangeRoverBtn);

        landRoverRangeRover = new JLabel("Land Rover Range Rover");
        landRoverRangeRover.setBounds(375, 530, 300, 30);
        landRoverRangeRover.setFont(font);
        c.add(landRoverRangeRover);


        
        ferrariRomaIcon = new ImageIcon(getClass().getResource("/images/D Ferarri.png"));
        ferrariRomaBtn = new JButton(ferrariRomaIcon);
        ferrariRomaBtn.setBounds(710, 350, 280, 180);
        ferrariRomaBtn.setCursor(cursor);
        c.add(ferrariRomaBtn);

        ferrariRoma = new JLabel("Ferrari Roma");
        ferrariRoma.setBounds(770, 530, 300, 30);
        ferrariRoma.setFont(font);
        c.add(ferrariRoma);


                
        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerLoginPage();
            }
        });

        customerProfileBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerProfile(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });



        searchBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                for(int i=0; i<cars.length; i++)
                {
                    if(cars[i].equals(searchBarTf.getText().toLowerCase()))
                    {
                        check = cars[i];
                    }
                } 
                
                if(check == "bmw")
                {
                        setVisible(false);
                        new BMW(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }
    
                else if(check == "jeep compass" || check == "jeep" || check == "compass")
                {
                    setVisible(false);
                    new JeepCompass(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }
    
                else if(check == "nissan altima" || check == "nissan" || check == "altima")
                {
                    setVisible(false);
                    new NissanAltima(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }
    
                else if (check == "toyota prius" || check == "toyota" || check == "prius")
                {
                    setVisible(false);
                    new TOYOTAPRIUS(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }
    
                else if(check == "land rover range rover" || check == "land" || check == "rover" || check == "range" || check == "land rover" || check == "range rover")
                {
                    setVisible(false);
                    new LandRoverRangeRover(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }
    
                else if( check == "ferrari roma" || check ==  "ferrari" || check == " roma")
                {
                    setVisible(false);
                    new FerrariRoma(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                }

                else if((searchBarTf.getText().toLowerCase()).isEmpty())
                {
                    showMessageDialog(null, "Empty", "Alert", JOptionPane.WARNING_MESSAGE);
                }

                else 
                {
                    showMessageDialog(null, "Car not found", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
 
        });


        bmwBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new BMW(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });



        jeepCompassBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new JeepCompass(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });



        nissanAltimaBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new NissanAltima(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });



        toyotaPriusBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new TOYOTAPRIUS(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });




        landRoverRangeRoverBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new LandRoverRangeRover(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });


        ferrariRomaBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new FerrariRoma(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
            }
        });


    }

    /* 
    public static void main(String[] args)
    {
        new CustomerDashBoard("H", "k", "k", "k", "k");
    }

    */

}