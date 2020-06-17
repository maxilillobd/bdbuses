package Ventanas;

import clases.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Interfaz_Vendedor extends javax.swing.JFrame {
   
    public Interfaz_Vendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
 public static String user = "";
        String pass;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Icon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1User = new javax.swing.JTextField();
        jPasswordField1Pass = new javax.swing.JPasswordField();
        jButton2Acceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1Fondo2 = new javax.swing.JLabel();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin.png"))); // NOI18N
        getContentPane().add(jLabel1Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 270, 270));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario      :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jTextField1User.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1User.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1UserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, -1));

        jPasswordField1Pass.setBackground(new java.awt.Color(0, 0, 102));
        jPasswordField1Pass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, -1));

        jButton2Acceder.setBackground(new java.awt.Color(0, 51, 255));
        jButton2Acceder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2Acceder.setForeground(new java.awt.Color(255, 204, 0));
        jButton2Acceder.setText("Acceder");
        jButton2Acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2AccederMouseClicked(evt);
            }
        });
        getContentPane().add(jButton2Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("VENDEDOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("TerraChile");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 120, 150, 40));

        jLabel1Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 380));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper bus dentro.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1UserActionPerformed

    private void jButton2AccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2AccederMouseClicked
            user = jTextField1User.getText().trim().toUpperCase();
        pass = jPasswordField1Pass.getText().trim(); 

      Statement stmt = null;
      String consulta;
        if (!user.equals("") || !pass.equals("")){
      try {
         Connection c = conexion.conectar();  
         stmt = c.createStatement();
         consulta = "select tipo_usuario_id_t_usuario from usuario where upper (nombre) ='"+user
                +"' and pass ='"+pass+"'";
         
          ResultSet rs = stmt.executeQuery(consulta);
          if(rs.next()){
             int tipo_usuario=rs.getInt("tipo_usuario_id_t_usuario");
              
              if(tipo_usuario ==(1)){
                 dispose();
                 new Vendedor().setVisible(true);
              }
             if(tipo_usuario ==(2)){
                dispose();
                  new Administrador().setVisible(true);   
            }
           stmt.close();
         c.close();    
          }else{
           JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos"); 
           jTextField1User.setText("");
            jPasswordField1Pass.setText("");
         }

      }  
      catch(SQLException e) {
          System.err.println("Error en el boton ingresar"+ e);    
           JOptionPane.showMessageDialog(null, "error al iniciar sesion, contacte al administrador");
      } 
        } else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");
        }
    }//GEN-LAST:event_jButton2AccederMouseClicked


    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel1Fondo2;
    private javax.swing.JLabel jLabel1Icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1Pass;
    private javax.swing.JTextField jTextField1User;
    // End of variables declaration//GEN-END:variables

}
