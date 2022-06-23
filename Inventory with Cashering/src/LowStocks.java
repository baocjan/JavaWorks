

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
public class LowStocks extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     * Creates new form LowStocks
     */
    public LowStocks() {
        initComponents();
        ShowOutOfStocks();
        showDate();
        showTime();
        useremail.setText(String.valueOf(LoginForm.email).toString());
        admin_name.setText(String.valueOf(LoginForm.name).toString());
    }
    
            void showDate(){
        Date dat= new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        jLabel2.setText(s.format(dat));
        
    }
    void showTime(){
        new Timer(0, new ActionListener() {
            
            

            @Override
            public void actionPerformed(ActionEvent e) {
                Date dat= new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                jLabel1.setText(s.format(dat));
            }
        }
        ).start();
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
        LowProductstbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        admin_name = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        useremail = new javax.swing.JLabel();
        refresh1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddAdmin = new javax.swing.JLabel();
        Viewstransaction1 = new javax.swing.JLabel();
        manageuser = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Viewstransaction = new javax.swing.JLabel();
        ViewTotalIncome = new javax.swing.JLabel();

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

        LowProductstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name ", "Description", "Buying Price", "Quantity", "Selling Price", "Category", "Status"
            }
        ));
        jScrollPane1.setViewportView(LowProductstbl);

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

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Products With Low Stock");

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\package.png")); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\calendar.png")); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\clock.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useremail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh1)
                                .addGap(113, 113, 113))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 205, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(useremail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Admin))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

        Viewstransaction1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Viewstransaction1.setForeground(new java.awt.Color(204, 255, 255));
        Viewstransaction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Viewstransaction1.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\fees1.png")); // NOI18N
        Viewstransaction1.setText("View Cashier Transaction");
        Viewstransaction1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Viewstransaction1MouseClicked(evt);
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

        ViewTotalIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewTotalIncome.setForeground(new java.awt.Color(204, 255, 255));
        ViewTotalIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewTotalIncome.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Desktop\\Javajan\\sales.png")); // NOI18N
        ViewTotalIncome.setText("View Total Income");
        ViewTotalIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewTotalIncomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddAdmin)
                                .addComponent(manageuser))
                            .addGap(56, 56, 56))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Viewstransaction1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Viewstransaction))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ViewTotalIncome)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(766, 766, 766)
                        .addComponent(jLabel10))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(29, 29, 29)
                        .addComponent(AddAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(manageuser)
                        .addGap(18, 18, 18)
                        .addComponent(Viewstransaction1)
                        .addGap(18, 18, 18)
                        .addComponent(Viewstransaction)
                        .addGap(18, 18, 18)
                        .addComponent(ViewTotalIncome))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1500, 580);

        setSize(new java.awt.Dimension(1215, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewstransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewstransactionMouseClicked
        new StaffTransaction().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewstransactionMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void manageuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseClicked
        new Users().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageuserMouseClicked

    private void Viewstransaction1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Viewstransaction1MouseClicked
        new CashierTransaction().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Viewstransaction1MouseClicked

    private void AddAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAdminMouseClicked
        new AdminAddition().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddAdminMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked

    }//GEN-LAST:event_adminMouseClicked

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed

    }//GEN-LAST:event_refresh1ActionPerformed

    private void ViewTotalIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewTotalIncomeMouseClicked
        new TotalIncome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewTotalIncomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public void ShowOutOfStocks(){
       

       
    try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorywithcashiering","root","");
            String sql ="SELECT * FROM managingproducts WHERE quantity <= 10";
            
            //           pst.setString(1,category.getSelectedItem().toString()+"");
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            LowProductstbl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
}
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
            java.util.logging.Logger.getLogger(LowStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LowStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LowStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LowStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LowStocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAdmin;
    private javax.swing.JLabel Admin;
    private javax.swing.JTable LowProductstbl;
    private javax.swing.JLabel ViewTotalIncome;
    private javax.swing.JLabel Viewstransaction;
    private javax.swing.JLabel Viewstransaction1;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageuser;
    private javax.swing.JButton refresh1;
    private javax.swing.JLabel useremail;
    // End of variables declaration//GEN-END:variables
}