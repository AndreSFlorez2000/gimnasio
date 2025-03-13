/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controlador.EquipoController;
import javax.swing.JOptionPane;


/**
 *
 * @author Alexander
 */
public class GUIAdicionarEquipoCardio extends javax.swing.JFrame {
    private EquipoController equipoController = EquipoController.getInstancia();
    
    /**
     * Creates new form GUIAdicionarNoPerecedero
     */
    public GUIAdicionarEquipoCardio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearEquipoCardio = new javax.swing.JButton();
        scrollPanelCrear = new javax.swing.JScrollPane();
        panelCrear = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        ftxtMarca = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        ftxtEstado = new javax.swing.JFormattedTextField();
        lblVMaxima = new javax.swing.JLabel();
        ftxtVMax = new javax.swing.JFormattedTextField();
        lblNvlResistencia = new javax.swing.JLabel();
        ftxtNvlResistencia = new javax.swing.JFormattedTextField();
        lblTPantalla = new javax.swing.JLabel();
        ftxtTPantalla = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar equipo cardio");
        setResizable(false);

        btnCrearEquipoCardio.setBackground(new java.awt.Color(215, 13, 2));
        btnCrearEquipoCardio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearEquipoCardio.setText("Crear");
        btnCrearEquipoCardio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCrearEquipoCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoCardioActionPerformed(evt);
            }
        });

        scrollPanelCrear.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelCrear.setPreferredSize(new java.awt.Dimension(400, 620));

        panelCrear.setPreferredSize(new java.awt.Dimension(400, 600));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Nombre del equipo");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca");

        ftxtMarca.setFormatterFactory(null);
        ftxtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setText("Estado");

        ftxtEstado.setFormatterFactory(null);
        ftxtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblVMaxima.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVMaxima.setText("Velocidad Maxima");

        ftxtVMax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtVMax.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        ftxtVMax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxtVMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtVMaxActionPerformed(evt);
            }
        });

        lblNvlResistencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNvlResistencia.setText("Nivel De Resistencia");

        ftxtNvlResistencia.setFormatterFactory(null);
        ftxtNvlResistencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTPantalla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTPantalla.setText("Tipo De Pantalla");

        ftxtTPantalla.setFormatterFactory(null);
        ftxtTPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxtNvlResistencia)
                    .addComponent(lblNvlResistencia)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(lblMarca)
                    .addComponent(ftxtMarca)
                    .addComponent(lblEstado)
                    .addComponent(ftxtEstado)
                    .addComponent(lblVMaxima)
                    .addComponent(ftxtVMax)
                    .addComponent(lblTPantalla)
                    .addComponent(ftxtTPantalla))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblVMaxima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtVMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNvlResistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtNvlResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblTPantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtTPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        scrollPanelCrear.setViewportView(panelCrear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(btnCrearEquipoCardio, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCrearEquipoCardio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnCrearEquipoCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoCardioActionPerformed
        // TODO add your handling code here:String nombre = txtNombre.getText();
    StringBuilder errores = new StringBuilder(); 

    if (txtNombre.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Nombre\n");
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY)); 
    }

    if (ftxtMarca.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Marca\n");
        ftxtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtEstado.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Estado\n");
        ftxtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtVMax.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Velocidad Máxima\n");
        ftxtVMax.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtVMax.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtNvlResistencia.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Nivel de Resistencia\n");
        ftxtNvlResistencia.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtNvlResistencia.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtTPantalla.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Tipo de Pantalla\n");
        ftxtTPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtTPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    // Si hay errores, los muestra todos juntos
    if (errores.length() > 0) {
        JOptionPane.showMessageDialog(null, errores.toString(), "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
        return;
    }    
    
    String nombre = txtNombre.getText();
    String marca = ftxtMarca.getText();
    String estado = ftxtEstado.getText();
    double velocidadMax = Double.parseDouble(ftxtVMax.getText());
    double nivelResistencia = Double.parseDouble(ftxtNvlResistencia.getText());
    String tipoPantalla = ftxtTPantalla.getText();

    equipoController.insertarEquipoCardio(nombre, marca, estado, velocidadMax, nivelResistencia, tipoPantalla);
    JOptionPane.showMessageDialog(this, "Equipo de Cardio agregado con éxito");

    // Limpiar campos
    txtNombre.setText("");
    ftxtMarca.setText("");
    ftxtEstado.setText("");
    ftxtVMax.setText("");
    ftxtNvlResistencia.setText("");
    ftxtTPantalla.setText("");
    }//GEN-LAST:event_btnCrearEquipoCardioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void ftxtVMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtVMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtVMaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEquipoCardio;
    private javax.swing.JFormattedTextField ftxtEstado;
    private javax.swing.JFormattedTextField ftxtMarca;
    private javax.swing.JFormattedTextField ftxtNvlResistencia;
    private javax.swing.JFormattedTextField ftxtTPantalla;
    private javax.swing.JFormattedTextField ftxtVMax;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNvlResistencia;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblVMaxima;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JScrollPane scrollPanelCrear;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
