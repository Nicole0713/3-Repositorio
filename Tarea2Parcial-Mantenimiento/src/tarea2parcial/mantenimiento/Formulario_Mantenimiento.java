/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2parcial.mantenimiento;


import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Formulario_Mantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Mantenimiento
     */
    public Formulario_Mantenimiento() {
        initComponents();
        jPanel1.setVisible(false);
    }

    public void guardar_asignar(){
        String ncliente=jTextField_nomcliente.getText();
        String ncedula=jTextField_cedulacliente.getText();
        String nmecanico=jTextField_nombremecanico.getText();
        String tipovehiculo="";
        if(jRadioButton_Carro.isSelected()){
           tipovehiculo=jRadioButton_Carro.getText();
        }else if(jRadioButton_Camioneta.isSelected()){
            tipovehiculo=jRadioButton_Camioneta.getText();
        }else if(jRadioButton_Furgoneta.isSelected()){
            tipovehiculo=jRadioButton_Furgoneta.getText();
        }
        String diagnostico=jTextArea_Diagnostico.getText();
        String trabajos=jTextArea_Trabajos.getText();
        String tipomantenimiento="";
        if(jRadioButton_Preventivo.isSelected()){
            tipomantenimiento=jRadioButton_Preventivo.getText();
        }else if(jRadioButton_Correctivo.isSelected()){
            tipomantenimiento=jRadioButton_Correctivo.getText();
        }
        
        String rp1=jTextField_repuesto1.getText();
        String rp2=jTextField_repuesto2.getText();
        double vrp1=Double.parseDouble(jTextField_preciorp1.getText());
        double vrp2=Double.parseDouble(jTextField_preciorp2.getText());
        
        String serv="";
        String serv2="";
        String serv3="";
        String serv4="";
        if(jRadioButton_ACEITE.isSelected()){
            serv=jRadioButton_ACEITE.getText();
        }if(jRadioButton_ALINEACION.isSelected()){
            serv2=jRadioButton_ALINEACION.getText();
        }if(jRadioButton_BALANCEADO.isSelected()){
            serv3=jRadioButton_BALANCEADO.getText();
        }if(jRadioButton_LAVADO.isSelected()){
            serv4=jRadioButton_LAVADO.getText();
        }
        
        
        Mantenimineto mantenimiento;
        
        mantenimiento=new Mantenimineto(ncliente,ncedula,nmecanico,tipovehiculo,
                diagnostico,trabajos,tipomantenimiento,rp1,rp2,vrp1,
                vrp2,serv,serv2,serv3,serv4) {

            @Override
            public double calcularprecio() {
                int valorcarro=20;
                int valorcamioneta=25;
                int valorfurgoneta=30;
                int lavado=5;
                int aceite=7;
                int alineacion=15;
                int balanceado=12;
                int rep1;
                int rep2;
                
                int subtotal = 0;
                int total = 0;
                
                   
                if(jRadioButton_Carro.isSelected()){
                    subtotal=valorcarro;
                    if(jRadioButton_Correctivo.isSelected()){
                        subtotal=(int) (subtotal+vrp1+vrp2);
                    }
                    
                    if(jRadioButton_LAVADO.isSelected()){
                        total=subtotal+lavado;
                    }
                    if(jRadioButton_ACEITE.isSelected()){
                        total=subtotal+aceite;
                    }
                    if(jRadioButton_ALINEACION.isSelected()){
                        total=subtotal+alineacion;
                    }
                    if(jRadioButton_BALANCEADO.isSelected()){
                        total=subtotal+balanceado;
                    }    
            }  
                if(jRadioButton_Camioneta.isSelected()){
                    subtotal=valorcarro;
                    if(jRadioButton_Correctivo.isSelected()){
                        subtotal=(int) (subtotal+vrp1+vrp2);
                    }
                    
                    if(jRadioButton_LAVADO.isSelected()){
                        total=subtotal+lavado;
                    }
                    if(jRadioButton_ACEITE.isSelected()){
                        total=subtotal+aceite;
                    }
                    if(jRadioButton_ALINEACION.isSelected()){
                        total=subtotal+alineacion;
                    }
                    if(jRadioButton_BALANCEADO.isSelected()){
                        total=subtotal+balanceado;
                    }    
            }   
                if(jRadioButton_Furgoneta.isSelected()){
                    subtotal=valorcarro;
                    if(jRadioButton_Correctivo.isSelected()){
                        subtotal=(int) (subtotal+vrp1+vrp2);
                    }
                    
                    if(jRadioButton_LAVADO.isSelected()){
                        total=subtotal+lavado;
                    }
                    if(jRadioButton_ACEITE.isSelected()){
                        total=subtotal+aceite;
                    }
                    if(jRadioButton_ALINEACION.isSelected()){
                        total=subtotal+alineacion;
                    }
                    if(jRadioButton_BALANCEADO.isSelected()){
                        total=subtotal+balanceado;
                    }    
            }   
                
                
                
                return total;
               
            }
        };
        double total=mantenimiento.calcularprecio();
        JOptionPane.showMessageDialog(this, "Los datos de la consulta son " + mantenimiento.toString()); 
        JOptionPane.showMessageDialog(this, "El precio es "+total );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_tipovehiculo = new javax.swing.ButtonGroup();
        buttonGroup_TipoMantenimiento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_Preventivo = new javax.swing.JRadioButton();
        jRadioButton_Correctivo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField_repuesto1 = new javax.swing.JTextField();
        jTextField_repuesto2 = new javax.swing.JTextField();
        jTextField_preciorp1 = new javax.swing.JTextField();
        jTextField_preciorp2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton_Carro = new javax.swing.JRadioButton();
        jRadioButton_Camioneta = new javax.swing.JRadioButton();
        jRadioButton_Furgoneta = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton_LAVADO = new javax.swing.JRadioButton();
        jRadioButton_ALINEACION = new javax.swing.JRadioButton();
        jRadioButton_BALANCEADO = new javax.swing.JRadioButton();
        jRadioButton_ACEITE = new javax.swing.JRadioButton();
        jButton_GUARDAR = new javax.swing.JButton();
        jTextField_nomcliente = new javax.swing.JTextField();
        jTextField_cedulacliente = new javax.swing.JTextField();
        jTextField_nombremecanico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Diagnostico = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Trabajos = new javax.swing.JTextArea();
        jDateChooser_Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE DEL CLIENTE");

        jLabel2.setText("CEDULA DEL CLIENTE");

        jLabel3.setText("NOMBRE DEL MECANICO");

        jLabel4.setText("TIPO DE VEHICULO");

        jLabel5.setText("FECHA DE MANTENIMIENTO");

        jLabel6.setText("EL MANTENIMIENTO FUE");

        buttonGroup_TipoMantenimiento.add(jRadioButton_Preventivo);
        jRadioButton_Preventivo.setText("PREVENTIVO");

        buttonGroup_TipoMantenimiento.add(jRadioButton_Correctivo);
        jRadioButton_Correctivo.setText("CORRECTIVO");
        jRadioButton_Correctivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton_CorrectivoStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CORRECTIVO"));

        jLabel7.setText("REPUESTO");

        jLabel8.setText("PRECIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_repuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_repuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_preciorp1)
                    .addComponent(jTextField_preciorp2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_repuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_preciorp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_repuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_preciorp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        buttonGroup_tipovehiculo.add(jRadioButton_Carro);
        jRadioButton_Carro.setText("CARRO");

        buttonGroup_tipovehiculo.add(jRadioButton_Camioneta);
        jRadioButton_Camioneta.setText("CAMIONETA");

        buttonGroup_tipovehiculo.add(jRadioButton_Furgoneta);
        jRadioButton_Furgoneta.setText("FURGONETA");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SERVICIOS"));

        jRadioButton_LAVADO.setText("LAVADO");

        jRadioButton_ALINEACION.setText("ALINEACION");

        jRadioButton_BALANCEADO.setText("BALANCEADO");

        jRadioButton_ACEITE.setText("CAMBIO ACEITE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton_ALINEACION)
                    .addComponent(jRadioButton_LAVADO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_BALANCEADO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton_ACEITE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_LAVADO)
                    .addComponent(jRadioButton_BALANCEADO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_ALINEACION)
                    .addComponent(jRadioButton_ACEITE))
                .addGap(17, 17, 17))
        );

        jButton_GUARDAR.setText("GUARDAR Y MOSTRAR");
        jButton_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GUARDARActionPerformed(evt);
            }
        });

        jLabel9.setText("DIAGNOSTICO");

        jTextArea_Diagnostico.setColumns(20);
        jTextArea_Diagnostico.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Diagnostico);

        jLabel10.setText("TRABAJOS REALIZADOS");

        jTextArea_Trabajos.setColumns(20);
        jTextArea_Trabajos.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Trabajos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cedulacliente)
                            .addComponent(jTextField_nombremecanico)
                            .addComponent(jTextField_nomcliente))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton_Furgoneta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButton_Carro)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButton_Camioneta)
                        .addContainerGap(90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(34, 34, 34)
                                .addComponent(jRadioButton_Preventivo)
                                .addGap(57, 57, 57)
                                .addComponent(jRadioButton_Correctivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton_GUARDAR)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_cedulacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_nombremecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton_Carro)
                    .addComponent(jRadioButton_Camioneta)
                    .addComponent(jRadioButton_Furgoneta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton_Preventivo)
                        .addComponent(jRadioButton_Correctivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GUARDARActionPerformed
        // TODO add your handling code here:
        this.guardar_asignar();
        Calendar cal= jDateChooser_Fecha.getCalendar();
        Date d =cal.getTime();
        System.out.println("fecha seleccionada: " + d.toString());
    }//GEN-LAST:event_jButton_GUARDARActionPerformed

    private void jRadioButton_CorrectivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton_CorrectivoStateChanged
        // TODO add your handling code here:
        if(jRadioButton_Correctivo.isSelected()){
            jPanel1.setVisible(true);
}
    }//GEN-LAST:event_jRadioButton_CorrectivoStateChanged

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
            java.util.logging.Logger.getLogger(Formulario_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_TipoMantenimiento;
    private javax.swing.ButtonGroup buttonGroup_tipovehiculo;
    private javax.swing.JButton jButton_GUARDAR;
    private com.toedter.calendar.JDateChooser jDateChooser_Fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_ACEITE;
    private javax.swing.JRadioButton jRadioButton_ALINEACION;
    private javax.swing.JRadioButton jRadioButton_BALANCEADO;
    private javax.swing.JRadioButton jRadioButton_Camioneta;
    private javax.swing.JRadioButton jRadioButton_Carro;
    private javax.swing.JRadioButton jRadioButton_Correctivo;
    private javax.swing.JRadioButton jRadioButton_Furgoneta;
    private javax.swing.JRadioButton jRadioButton_LAVADO;
    private javax.swing.JRadioButton jRadioButton_Preventivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Diagnostico;
    private javax.swing.JTextArea jTextArea_Trabajos;
    private javax.swing.JTextField jTextField_cedulacliente;
    private javax.swing.JTextField jTextField_nombremecanico;
    private javax.swing.JTextField jTextField_nomcliente;
    private javax.swing.JTextField jTextField_preciorp1;
    private javax.swing.JTextField jTextField_preciorp2;
    private javax.swing.JTextField jTextField_repuesto1;
    private javax.swing.JTextField jTextField_repuesto2;
    // End of variables declaration//GEN-END:variables
}
