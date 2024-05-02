import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Cursor;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;



public class AdminData extends JFrame
{

    private Container c;
    private JLabel title;
    private JButton refreshBtn, deleteBtn, exitBtn, backBtn;
    private JTable table;
    private DefaultTableModel model;
    private ImageIcon icon;
    private Cursor cursor;
    private JScrollPane scroll;

    private String[] column = { "User Name", "ID", "Email", "Phone Number", "Password", "Address", "Blood Group"};
    private String[] row = new String[7];

    protected String adminNameStore, adminID, adminEmailStore, adminPhoneNumber, adminAddressStore, adminBloodGroupStore,adminPassStore;


    public AdminData(String adminNameStore, String adminIDStore, String adminEmailStore, String adminPhoneNumberStore, String adminAddressStore, String adminBloodGroupStore, String adminPassStore) 
    {
        this.adminID = adminIDStore;
        this.adminNameStore = adminNameStore;
        this.adminEmailStore = adminEmailStore;
        this.adminPhoneNumber = adminPhoneNumberStore;
        this.adminAddressStore = adminAddressStore;
        this.adminBloodGroupStore = adminBloodGroupStore;
        this.adminPassStore = adminPassStore;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Prestige Motor Sales");


        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));  //Background Coloring


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Fonts
        Font f1 = new Font("Segoe UI Black", Font.BOLD, 32);
        Font f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        title = new JLabel("Admin Information");
        title.setBounds(330, 10, 450, 35);
        title.setFont(f1);
        c.add(title);

        // JButtons
        refreshBtn = new JButton("Refresh");
        refreshBtn.setBounds(54, 418, 184, 50);
        refreshBtn.setFont(f2);
        refreshBtn.setCursor(cursor);
        refreshBtn.setForeground(Color.WHITE);
        refreshBtn.setBackground(Color.decode("#2E75B6"));
        c.add(refreshBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(248, 418, 184, 50);
        deleteBtn.setFont(f2);
        deleteBtn.setCursor(cursor);
        deleteBtn.setForeground(Color.WHITE);
        deleteBtn.setBackground(Color.decode("#2E75B6"));
        c.add(deleteBtn);


        exitBtn = new JButton("Exit");
        exitBtn.setBounds(54, 480, 278, 50);
        exitBtn.setFont(f2);
        exitBtn.setCursor(cursor);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setBackground(Color.decode("#C00000"));
        c.add(exitBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(342, 480, 284, 50);
        backBtn.setFont(f2);
        backBtn.setCursor(cursor);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.decode("#2E75B6"));
        c.add(backBtn);


        // Table
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        Font tableFont = new Font("Segoe UI", Font.PLAIN, 20);
        table.setFont(tableFont);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Table Columns
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(300);
        table.getColumnModel().getColumn(4).setPreferredWidth(300);
        table.getColumnModel().getColumn(5).setPreferredWidth(300);
        table.getColumnModel().getColumn(6).setPreferredWidth(300);

        // Scroll Pane for scroll table
        scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(150, 96, 700, 300);  //Change
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        String file = ".\\Data\\admin_data.txt";
        String temp = ".\\Data\\admin_temp.txt";


        // To input data in the table
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while ((reader.readLine()) != null)
            {
                totalLines++;
            }
            reader.close();

            System.out.println(totalLines);
            for (int i=0; i<totalLines; i++) 
            {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 2);
                
                
                if(x.equals("ID"))
                {
                    // Table Rows
                    row[0] = Files.readAllLines(Paths.get(file)).get(i+2).substring(5); // Admin Name
                    row[1] = Files.readAllLines(Paths.get(file)).get((i)).substring(3); // Admin ID
                    row[2] = Files.readAllLines(Paths.get(file)).get((i+3)).substring(6); // Email
                    row[3] = Files.readAllLines(Paths.get(file)).get((i+4)).substring(9); // Phone Number
                    row[4] = Files.readAllLines(Paths.get(file)).get((i+1)).substring(9); // Password
                    row[5] = Files.readAllLines(Paths.get(file)).get((i+5)).substring(8); // Address
                    row[6] = Files.readAllLines(Paths.get(file)).get((i+6)).substring(12); // Blood Group
                    // row[7] = Files.readAllLines(Paths.get(file)).get((i+7)).substring(11); // Date and Time
                    model.addRow(row);
                    
                }
            }

        } 
        
        catch (Exception ex) 
        {
            System.out.println("1" +ex);
        }

        backBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminDashBoard(adminNameStore, adminIDStore, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore, adminPassStore);
            }
        });


        deleteBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(table.getSelectionModel().isSelectionEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!", JOptionPane.WARNING_MESSAGE);
                }

                else 
                {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try 
                    {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        
                        int totalLines = 0;
                        while (reader.readLine() != null)
                        {
                            totalLines++;
                        }
                        reader.close();

                        for (int i = 0; i < totalLines; i++) 
                        {
                           String line = Files.readAllLines(Paths.get(file)).get(i);
                           String x = line.substring(0, 2);

                           if(x.equals("ID")){
                    
                            String userName = Files.readAllLines(Paths.get(file)).get(i);
                                
                            if (userName.substring(5).equals(removeUser)) 
                            {
                                q = i;
                            }
                        }
                        }
                    }
                    
                    catch (Exception ex) 
                    {
                        System.out.print("2" +ex);
                    }


                    try 
                    {
                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                        {
                            totalLines++;
                        }
                        reader.close();

                        for (int j = 0; j < totalLines; j++) 
                        {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 8);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3))) 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } 
                            
                            else 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } 
                    
                    catch (Exception ex) 
                    {
                        System.out.print("3" +ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    AdminData frame = new AdminData(adminNameStore, adminID, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore,adminPassStore);
                    frame.setVisible(true);
                }
            }
        });

        refreshBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                AdminData frame = new AdminData( adminNameStore, adminID, adminEmailStore, adminPhoneNumberStore, adminAddressStore, adminBloodGroupStore,adminPassStore);
                frame.setVisible(true);
            }
        });


    }

    /* 
    public static void main(String[] arg)
    {
        AdminData frame = new AdminData("22", "22", "22", "22", "22", "22", "22");
        frame.setVisible(true);
    }
    */
}
