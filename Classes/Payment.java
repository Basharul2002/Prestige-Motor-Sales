package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

import Classes.*;


public class Payment extends JFrame
{  
    private Container c;
    private ImageIcon icon;
    private JButton backBtn, confirmPaymentBtn;
    private ImageIcon backImg, logoImg, masterCardImg, visaCardImg;
    private JLabel title, logo, acceptCard, masterCard, visaCard, cardDetails, cardNum, cardName, cardExpDate, expDate, cvv, amount, vat;
    private JRadioButton masterCardOption, visaCardOption;
    private ButtonGroup grp;
    private JTextField cardNumTf, cardNameTf, cardExpDateTf, cvvTf;
    protected String email, price;

    public Payment(String email, String price)
    {
        this.email = email;
        this.price = price;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        //Icon 
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        //Back image Icon
        backImg = new ImageIcon(getClass().getResource("/images/Previous.png"));

        backBtn = new JButton(backImg);
        backBtn.setBounds(5, 5, 24, 24);
        backBtn.setBackground(Color.decode("#F2F2F2"));
        backBtn.setCursor(cursor);
        c.add(backBtn);

        //Logo
        logoImg = new ImageIcon(getClass().getResource("/images/Payment.png"));
        logo = new JLabel(logoImg);
        logo.setBounds(5, 120, logoImg.getIconWidth(), logoImg.getIconHeight());
        c.add(logo);


        //Title
        title = new JLabel("Complete Your Payment");
        title.setBounds(550, 25, 600, 40);
        Font titleFont = new Font("Segeo UI Black", Font.BOLD, 35);
        title.setFont(titleFont);
        title.setForeground(Color.decode("#8B8000"));
        c.add(title);

        //Acpect card label
        acceptCard = new JLabel("We Accept Only");
        acceptCard.setBounds(570, 70, 300, 30);
        Font acceptCardFont = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        acceptCard.setFont(acceptCardFont);
        acceptCard.setForeground(Color.decode("#8B8000"));
        c.add(acceptCard);


        //Master Card
        masterCardImg = new ImageIcon(getClass().getResource("/images/masterCard.png"));
        masterCard = new JLabel(masterCardImg);
        masterCard.setBounds(780, 67, masterCardImg.getIconWidth(), masterCardImg.getIconHeight());
        c.add(masterCard);


        //Master Card
        visaCardImg = new ImageIcon(getClass().getResource("/images/visaCard.png"));
        visaCard = new JLabel(visaCardImg);
        visaCard.setBounds(870, 67, visaCardImg.getIconWidth(), visaCardImg.getIconHeight());
        c.add(visaCard);


        //Card Details
        cardDetails = new JLabel("Card Details");
        cardDetails.setBounds(570, 150, 450, 30);
        Font cardDetailsFont = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        cardDetails.setFont(cardDetailsFont);
        cardDetails.setForeground(Color.decode("#8B8000"));
        c.add(cardDetails);


        // Card Selection
        cardName = new JLabel("Select a Card");
        cardName.setBounds(570, 200, 500, 50);
        Font cardNameFont = new Font("Segoe UI", Font.PLAIN, 20);
        cardName.setFont(cardNameFont);
        c.add(cardName);
        

        //Master Card Option
        masterCardOption = new JRadioButton("Master Card");
        masterCardOption.setBounds(720, 210, 100, 30);
        masterCardOption.setBackground(Color.WHITE);
        c.add(masterCardOption);

        //Visa Card Option
        visaCardOption = new JRadioButton("Visa Card");
        visaCardOption.setBounds(820, 210, 130, 30);
        visaCardOption.setBackground(Color.WHITE);
        c.add(visaCardOption);


        //For choose only one option
        grp = new ButtonGroup();
        grp.add(masterCardOption);
        grp.add(visaCardOption);


        Font font = new Font("Segoe UI", Font.PLAIN, 15);

        //Card Num
        cardNum = new JLabel("Card Number :");
        cardNum.setBounds(570, 260, 130, 30);
        cardNum.setFont(font);
        c.add(cardNum);

        cardNumTf = new JTextField();
        cardNumTf.setBounds(700, 260, 200, 30);
        c.add(cardNumTf);


        //Card name
        cardName = new JLabel("Name On Card :");
        cardName.setBounds(570, 300, 130, 30);
        cardName.setFont(font);
        c.add(cardName);

        cardNameTf = new JTextField();
        cardNameTf.setBounds(700, 300, 200, 30);
        c.add(cardNameTf);

        //Exp. date
        cardExpDate = new JLabel("Expiration :");
        expDate = new JLabel("(MM//YY)");
        cardExpDate.setBounds(570, 340, 130, 30);
        expDate.setBounds(575, 360, 70, 30);
        cardExpDate.setFont(font);
        expDate.setFont(font);
        c.add(cardExpDate);
        c.add(expDate);

        cardExpDateTf = new JTextField();
        cardExpDateTf.setBounds(700, 340, 200, 30);
        c.add(cardExpDateTf);

        //Security Code
        cvv = new JLabel("CVV :");
        cvv.setBounds(570, 400, 130, 30);
        cvv.setFont(font);
        c.add(cvv);

        
        cvvTf = new JTextField();
        cvvTf.setBounds(700, 400, 200, 30);
        c.add(cvvTf);

        amount = new JLabel("Total Amount: BDT "+price);
        amount.setBounds(570, 460, 250, 30);
        amount.setFont(font);
        c.add(amount);

        vat = new JLabel("VAT included, where applicable");
        vat.setBounds(570, 490, 300, 30);
        c.add(vat);

        confirmPaymentBtn = new JButton("Confirm Payment");
        confirmPaymentBtn.setBounds(800, 530, 200, 40);
        confirmPaymentBtn.setForeground(Color.WHITE);
        confirmPaymentBtn.setBackground(Color.RED);
        confirmPaymentBtn.setCursor(cursor);
        c.add(confirmPaymentBtn);

        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerDashBoard(email);
            }
        });


        confirmPaymentBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String cardNumStore = cardNumTf.getText();
                String cardNameStore = cardNameTf.getText();
                String cardExpStore = cardExpDateTf.getText();
                String cvvStore = cvvTf.getText();

                if(cardNumStore.isEmpty() || cardNameStore.isEmpty() || cardExpStore.isEmpty() || cvvStore.isEmpty())
                {
                    showMessageDialog(null, "Please Fill Up All Info", "Warning!", JOptionPane.WARNING_MESSAGE);
                }

                else 
                {
                    if(visaCardOption.isSelected())
                    {
                        try 
		                { 
			                Integer.parseInt(cardNumStore); 
			                Integer.parseInt(cardExpStore);
                            Integer.parseInt(cvvStore);

                            setVisible(false);
                            showMessageDialog(null, "Payment Confirmed.Your order is Successful", "Payment Confirmation!", JOptionPane.PLAIN_MESSAGE);
                            new CustomerDashBoard(email);
		                }  
		        
                        catch (Exception ex)  
		                { 
                            showMessageDialog(null, "Your Information Incorrect", "Alert!", JOptionPane.WARNING_MESSAGE);
		                }
                    }

                    else if(masterCardOption.isSelected())
                    {
                        try 
		                { 
			                Integer.parseInt(cardNumStore); 
			                Integer.parseInt(cardExpStore);
                            Integer.parseInt(cvvStore);

                            setVisible(false);
                            showMessageDialog(null, "Payment Confirmed.Your order is Successful", "Payment Confirmation!", JOptionPane.PLAIN_MESSAGE);
                            new CustomerDashBoard(email);
		                }  
		        
                        catch (Exception ex)  
		                { 
                            showMessageDialog(null, "Your Information Incorrect", "Alert!", JOptionPane.WARNING_MESSAGE);
		                }
                    }

                    else 
                    {
                        showMessageDialog(null, "Please select a card", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });




    }

    public static void main(String[] args)
    {
        new Payment("22", "3");
    }
}