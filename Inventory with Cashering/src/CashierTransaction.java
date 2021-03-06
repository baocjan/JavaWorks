
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupB
 */
public class CashierTransaction extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form CashierTransaction
     */
    public CashierTransaction() {
        initComponents();
        showDate();
        showTime();
        showTableData();
        Getcashiername();
        
        useremail.setText(String.valueOf(LoginForm.email).toString());
        admin_name.setText(String.valueOf(LoginForm.name).toString());
    }
        public void showTableData() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorywithcashiering", "root", "");
            String sql = "SELECT ctransactionid, inventoryid, productsold, quantity, sellingprice, totalprice, userid, date FROM cashiertransaction";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            cashiertransactiontbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        void showDate(){
        Date dat= new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        petsa.setText(s.format(dat));
        
    }
    void showTime(){
        new Timer(0, new ActionListener() {
            
            

            @Override
            public void actionPerformed(ActionEvent e) {
                Date dat= new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                oras.setText(s.format(dat));
            }
        }
        ).start();
    }
        private void Getcashiername(){
    try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorywithcashiering","root","");
             String query = "SELECT * FROM users";
             pst = con.prepareStatement(query);
            
             rs=pst.executeQuery();
             while(rs.next()){
                if (rs.getString(6).equals("cashier")){
                 String empty = "";
                 String Mycname = rs.getString("fname");
                 user_role.addItem(Mycname + empty);
             }
             }
             
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashiertransactiontbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        admin_name = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        useremail = new javax.swing.JLabel();
        refresh1 = new javax.swing.JButton();
        user_role = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        filterwithcashier = new javax.swing.JButton();
        filterwithdate = new javax.swing.JButton();
        refresh4 = new javax.swing.JButton();
        petsa = new javax.swing.JLabel();
        oras = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddAdmin = new javax.swing.JLabel();
        Viewstransaction = new javax.swing.JLabel();
        manageuser = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ViewLowProducts = new javax.swing.JLabel();
        ViewTotalIncome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("JAppliances Shop");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\rsz_2j&r_appliances.png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Good Quality Appliances");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Appliances Makes Everything Better");

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        cashiertransactiontbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Id", "Inventory Id", "Product Sold", "Quantity", "Selling Price", "Tolal Price", "User Id", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(cashiertransactiontbl);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\boss.png")); // NOI18N

        admin_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        admin_name.setForeground(new java.awt.Color(0, 153, 153));
        admin_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Admin.setBackground(new java.awt.Color(255, 51, 51));
        Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Admin.setForeground(new java.awt.Color(0, 153, 153));
        Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admin.setText("Admin email:");
        Admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));

        useremail.setBackground(new java.awt.Color(255, 0, 0));
        useremail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        useremail.setForeground(new java.awt.Color(0, 153, 153));
        useremail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        useremail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));

        refresh1.setBackground(new java.awt.Color(102, 255, 255));
        refresh1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh1.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\refresh.png")); // NOI18N
        refresh1.setText("Refresh");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        user_role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        user_role.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_roleMouseClicked(evt);
            }
        });
        user_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_roleActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cashier Transactions");

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\fees.png")); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        filterwithcashier.setBackground(new java.awt.Color(102, 255, 255));
        filterwithcashier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        filterwithcashier.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\filtering.png")); // NOI18N
        filterwithcashier.setText("Filter With Cashier");
        filterwithcashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterwithcashierActionPerformed(evt);
            }
        });

        filterwithdate.setBackground(new java.awt.Color(102, 255, 255));
        filterwithdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        filterwithdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\filtering.png")); // NOI18N
        filterwithdate.setText("Filter With Date");
        filterwithdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterwithdateActionPerformed(evt);
            }
        });

        refresh4.setBackground(new java.awt.Color(102, 255, 255));
        refresh4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh4.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\refresh.png")); // NOI18N
        refresh4.setText("Refresh");
        refresh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh4ActionPerformed(evt);
            }
        });

        petsa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        petsa.setForeground(new java.awt.Color(0, 153, 153));
        petsa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        petsa.setText("Date");

        oras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oras.setForeground(new java.awt.Color(0, 153, 153));
        oras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oras.setText("Time");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\calendar.png")); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\clock.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(admin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Admin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(useremail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refresh1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(petsa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(oras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))
                                .addComponent(refresh4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(filterwithcashier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user_role, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filterwithdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(admin_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user_role, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filterwithcashier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filterwithdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(useremail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Admin))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refresh4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(petsa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jLabel11.setBackground(new java.awt.Color(0, 102, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\logout.png")); // NOI18N
        jLabel11.setText("Logout");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        AddAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddAdmin.setForeground(new java.awt.Color(204, 255, 255));
        AddAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\boss.png")); // NOI18N
        AddAdmin.setText("Add New Admin");
        AddAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAdminMouseClicked(evt);
            }
        });

        Viewstransaction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Viewstransaction.setForeground(new java.awt.Color(204, 255, 255));
        Viewstransaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Viewstransaction.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\inventory1.png")); // NOI18N
        Viewstransaction.setText("View Staff Transaction");
        Viewstransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewstransactionMouseClicked(evt);
            }
        });

        manageuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageuser.setForeground(new java.awt.Color(204, 255, 255));
        manageuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageuser.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\management1.png")); // NOI18N
        manageuser.setText("Manage Users");
        manageuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\close.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        ViewLowProducts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewLowProducts.setForeground(new java.awt.Color(204, 255, 255));
        ViewLowProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewLowProducts.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\package1.png")); // NOI18N
        ViewLowProducts.setText("View Low Stock Products");
        ViewLowProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewLowProductsMouseClicked(evt);
            }
        });

        ViewTotalIncome1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewTotalIncome1.setForeground(new java.awt.Color(204, 255, 255));
        ViewTotalIncome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewTotalIncome1.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\sales.png")); // NOI18N
        ViewTotalIncome1.setText("View Total Income");
        ViewTotalIncome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewTotalIncome1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manageuser)
                                    .addComponent(AddAdmin)))
                            .addComponent(Viewstransaction)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ViewLowProducts))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ViewTotalIncome1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(31, 31, 31)
                        .addComponent(AddAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(manageuser)
                        .addGap(18, 18, 18)
                        .addComponent(Viewstransaction)
                        .addGap(18, 18, 18)
                        .addComponent(ViewLowProducts)
                        .addGap(18, 18, 18)
                        .addComponent(ViewTotalIncome1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1416, 630);

        setSize(new java.awt.Dimension(1240, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewLowProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLowProductsMouseClicked
        new LowStocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewLowProductsMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void manageuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseClicked
        new Users().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageuserMouseClicked

    private void ViewstransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewstransactionMouseClicked
        new StaffTransaction().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewstransactionMouseClicked

    private void AddAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAdminMouseClicked
        new AdminAddition().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddAdminMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void refresh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh4ActionPerformed
        showTableData();
        DefaultTableModel model = (DefaultTableModel)cashiertransactiontbl.getModel();
        TableRowSorter < DefaultTableModel > tr = new TableRowSorter < DefaultTableModel > (model);
        cashiertransactiontbl.setRowSorter(tr);
            
    }//GEN-LAST:event_refresh4ActionPerformed

    private void filterwithdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterwithdateActionPerformed
        
        try{
            String emp = null;
            SimpleDateFormat sDate = new SimpleDateFormat("yy-MM-dd");
            String date = sDate.format(jDateChooser1.getDate());
            DefaultTableModel model = (DefaultTableModel)cashiertransactiontbl.getModel();
            TableRowSorter < DefaultTableModel > tr = new TableRowSorter < DefaultTableModel > (model);
            cashiertransactiontbl.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(date.trim()));
            user_role.setSelectedItem(emp);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }

    }//GEN-LAST:event_filterwithdateActionPerformed

    private void filterwithcashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterwithcashierActionPerformed
        try{
            Date emp = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorywithcashiering","root","");
            String sql ="SELECT * FROM cashiertransaction WHERE cashiername='"+user_role.getSelectedItem().toString()+"'";
            //           pst.setString(1,category.getSelectedItem().toString()+"");
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            cashiertransactiontbl.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel)cashiertransactiontbl.getModel();
            TableRowSorter < DefaultTableModel > tr = new TableRowSorter < DefaultTableModel > (model);
            cashiertransactiontbl.setRowSorter(tr);
            jDateChooser1.setDate(emp);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_filterwithcashierActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked

    }//GEN-LAST:event_adminMouseClicked

    private void user_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_roleActionPerformed

    }//GEN-LAST:event_user_roleActionPerformed

    private void user_roleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_roleMouseClicked

    }//GEN-LAST:event_user_roleMouseClicked

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        showTableData();
    }//GEN-LAST:event_refresh1ActionPerformed

    private void ViewTotalIncome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewTotalIncome1MouseClicked
        new TotalIncome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewTotalIncome1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAdmin;
    private javax.swing.JLabel Admin;
    private javax.swing.JLabel ViewLowProducts;
    private javax.swing.JLabel ViewTotalIncome1;
    private javax.swing.JLabel Viewstransaction;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin_name;
    private javax.swing.JTable cashiertransactiontbl;
    private javax.swing.JButton filterwithcashier;
    private javax.swing.JButton filterwithdate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageuser;
    private javax.swing.JLabel oras;
    private javax.swing.JLabel petsa;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton refresh4;
    private javax.swing.JComboBox<String> user_role;
    private javax.swing.JLabel useremail;
    // End of variables declaration//GEN-END:variables
}
