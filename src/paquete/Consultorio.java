package paquete;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Autores: Jose Alejandro Luque, Pablo Cesar Arboleda, Juan Pablo Ballesteros
 */
public class Consultorio extends javax.swing.JFrame {

    static Dao<Paciente, Integer> base;

    private String tipo_documento;
    private long documento;
    private String nombre;
    private String apellido;
    private int peso_kg;
    private String contextura;
    private String ciudad;
    private String respiratorio;
    private String oculares;

    public Consultorio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setSize(744, 568);
        
        ImageIcon fondo = new ImageIcon("src/paquete/fondo.png");
        
        Icon iconoFondo = new ImageIcon(fondo.getImage().getScaledInstance(imagenFondo.getWidth(),
                imagenFondo.getHeight(), Image.SCALE_DEFAULT));
        imagenFondo.setIcon(iconoFondo);
        this.repaint();
        
    }
    
    @Override
    public Image getIconImage() { // para el icono en el JFrame
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("paquete/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoID = new javax.swing.JComboBox<>();
        cedulaTexto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameTexto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textoPeso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        context = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Oculares_Box = new javax.swing.JComboBox<>();
        resgistrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        comboRespiratorios = new javax.swing.JComboBox<>();
        mostrarPacientesPorRespiratorios = new javax.swing.JButton();
        comboCiudad = new javax.swing.JComboBox<>();
        mostrarPacientesPorCiudad = new javax.swing.JButton();
        mostrarDatos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Sintomas");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultorio Médico");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tipo de documento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 82, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consultorio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 18, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Informacion Personal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 52, -1, -1));

        jLabel3.setText("Numero de Documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 82, 164, -1));

        tipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Tarjeta de Identidad", "Pasaporte" }));
        getContentPane().add(tipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 114, 91, -1));

        cedulaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTextoActionPerformed(evt);
            }
        });
        getContentPane().add(cedulaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 114, 137, -1));

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 162, -1, -1));
        getContentPane().add(nameTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 189, 91, -1));

        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 162, -1, -1));
        getContentPane().add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 189, 111, -1));

        jLabel7.setText("Peso en Kg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 162, 146, -1));

        textoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPesoActionPerformed(evt);
            }
        });
        getContentPane().add(textoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 189, 98, -1));

        jLabel11.setText("Contextura");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 162, -1, -1));

        context.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delgado", "Gordo" }));
        context.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contextActionPerformed(evt);
            }
        });
        getContentPane().add(context, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 189, 100, -1));

        jLabel6.setText("Ciudad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 162, -1, -1));

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cali", "Medellin" }));
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 189, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 227, 657, 14));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Sintomas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel12.setText("Respiratorios");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tos", "Asma", "Bronquitis" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel13.setText("Oculares");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        Oculares_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enrojecimiento", "Cansancia", "Miopia" }));
        getContentPane().add(Oculares_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        resgistrar.setText("Guardar");
        resgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resgistrarActionPerformed(evt);
            }
        });
        getContentPane().add(resgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 398, 667, 14));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Consultas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        comboRespiratorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tos", "Asma", "Bronquitis" }));
        getContentPane().add(comboRespiratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 455, 115, -1));

        mostrarPacientesPorRespiratorios.setText("Por Sintomas Respitatorios");
        mostrarPacientesPorRespiratorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPacientesPorRespiratoriosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPacientesPorRespiratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 493, -1, -1));

        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cali", "Medellin" }));
        getContentPane().add(comboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 455, -1, -1));

        mostrarPacientesPorCiudad.setText("Por Ciudad");
        mostrarPacientesPorCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPacientesPorCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPacientesPorCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 493, -1, -1));

        mostrarDatos.setText("Por Documento de identificacion");
        mostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 493, -1, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 92, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/logo2.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 123));
        getContentPane().add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPacientesPorRespiratoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPacientesPorRespiratoriosActionPerformed
        hide();
        DatosPacientePorRespiratorio verDatos = new DatosPacientePorRespiratorio();
        String sintomaRespiratorio = comboRespiratorios.getSelectedItem().toString();
        verDatos.setValue(sintomaRespiratorio);
        verDatos.setVisible(true);
    }//GEN-LAST:event_mostrarPacientesPorRespiratoriosActionPerformed

    private void mostrarPacientesPorCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPacientesPorCiudadActionPerformed
        hide();
        DatosPacientePorCiudad verDatos = new DatosPacientePorCiudad();
        String nombreCiudad = comboCiudad.getSelectedItem().toString();
        verDatos.setValue(nombreCiudad);
        verDatos.setVisible(true);
    }//GEN-LAST:event_mostrarPacientesPorCiudadActionPerformed

    private void mostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDatosActionPerformed
        hide();
        DatosPaciente verDatos = new DatosPaciente();
        verDatos.setVisible(true);
    }//GEN-LAST:event_mostrarDatosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void textoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPesoActionPerformed

    }//GEN-LAST:event_textoPesoActionPerformed

    private void resgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resgistrarActionPerformed
        try {
            tipo_documento = tipoID.getSelectedItem().toString();
            documento = Integer.parseInt(cedulaTexto.getText());
            nombre = nameTexto.getText();
            apellido = textoApellido.getText();
            peso_kg = Integer.parseInt(textoPeso.getText());
            contextura = context.getSelectedItem().toString();
            ciudad = city.getSelectedItem().toString();
            respiratorio = jComboBox3.getSelectedItem().toString();
            oculares = Oculares_Box.getSelectedItem().toString();
            
            Paciente paciente = new Paciente(tipo_documento, documento, nombre, apellido,
                    peso_kg, contextura, ciudad, respiratorio, oculares);
            
            base.create(paciente);
            JOptionPane.showMessageDialog(null, "¡Paciente registrado exitosamente!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, revisa los datos que ingresaste!");
        }
    }//GEN-LAST:event_resgistrarActionPerformed

    private void cedulaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTextoActionPerformed

    private void contextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contextActionPerformed

    public static void main(String args[]) throws SQLException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String nuevoArchivo = "jdbc:h2:./paciente";

        ConnectionSource conexion = new JdbcConnectionSource(nuevoArchivo);
        
        base = DaoManager.createDao(conexion, Paciente.class);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Oculares_Box;
    private javax.swing.JTextField cedulaTexto;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboRespiratorios;
    private javax.swing.JComboBox<String> context;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton mostrarDatos;
    private javax.swing.JButton mostrarPacientesPorCiudad;
    private javax.swing.JButton mostrarPacientesPorRespiratorios;
    private javax.swing.JTextField nameTexto;
    private javax.swing.JButton resgistrar;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoPeso;
    private javax.swing.JComboBox<String> tipoID;
    // End of variables declaration//GEN-END:variables
}
