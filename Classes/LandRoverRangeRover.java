package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;


public class LandRoverRangeRover extends JFrame
{
    private Container c;
    private ImageIcon icon, img, previousIcon;
    private JLabel imgLabel, brand, model, price, engine, fuel, gearBox;
    private JButton buyNowBtn, previousBtn;
    protected String cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore;

    public LandRoverRangeRover(String cNameStore, String cEmailStore, String cAddressStore, String cPhoneNumberStore, String cPassStore)
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

        //Page design
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        //Backgroud coloring
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#000000"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));   //App or software icon or logo
        this.setIconImage(icon.getImage());

        Font font = new Font("Segoe UI", Font.PLAIN, 25);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        previousIcon = new ImageIcon(getClass().getResource("/images/Previous.png"));
        previousBtn = new JButton(previousIcon);
        previousBtn.setBounds(5, 5, 24, 24);
        previousBtn.setCursor(cursor);
        c.add(previousBtn);

        img = new ImageIcon(getClass().getResource("/images/Land Rover Range Rover.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(30, 115, 500, 250);
        c.add(imgLabel);

        brand = new JLabel("Brand: Land Rover Range Rover");
        brand.setBounds(500, 100, 550, 30);
        brand.setFont(font);
        brand.setForeground(Color.WHITE);
        c.add(brand);


        model = new JLabel("Model: 4.4 I Petrol LWB SE 2022");
        model.setBounds(500, 150, 380, 30);
        model.setFont(font);
        model.setForeground(Color.WHITE);
        c.add(model);

        engine = new JLabel("Engine Size (cc): 4395 cc");
        engine.setBounds(500, 200, 280, 30);
        engine.setFont(font);
        engine.setForeground(Color.WHITE);
        c.add(engine);


        fuel = new JLabel("Fuel Type: Petrol");
        fuel.setBounds(500, 250, 280, 30);
        fuel.setFont(font);
        fuel.setForeground(Color.WHITE);
        c.add(fuel);

        gearBox = new JLabel("Gear Box: 9 Speed");
        gearBox.setBounds(500, 300, 280, 30);
        gearBox.setFont(font);
        gearBox.setForeground(Color.WHITE);
        c.add(gearBox);

        price = new JLabel("Price: BDT 40,391,520");
        price.setBounds(500, 350, 280, 30);
        price.setFont(font);
        price.setForeground(Color.WHITE);
        c.add(price);

        String p = "40,391,520";

        buyNowBtn = new JButton("Buy Now");
        buyNowBtn.setBounds(620, 430, 150, 40);
        Font f = new Font("Segoe UI", Font.BOLD, 25);
        buyNowBtn.setFont(f);
        buyNowBtn.setCursor(cursor);
        c.add(buyNowBtn);

   
        previousBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                CustomerDashBoard frame = new CustomerDashBoard(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore);
                frame.setVisible(true);
            }
        });


        buyNowBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                Payment frame = new Payment(cNameStore, cEmailStore, cAddressStore, cPhoneNumberStore, cPassStore, p);
                frame.setVisible(true);
            }
        });


    }
}

