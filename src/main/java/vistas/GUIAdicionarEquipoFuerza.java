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
public class GUIAdicionarEquipoFuerza extends javax.swing.JFrame {
    private EquipoController equipoController = EquipoController.getInstancia();


    /**
     * Creates new form GUIAdicionarNoPerecedero
     */
    public GUIAdicionarEquipoFuerza() {
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

        btnCrearEquipoFuerza = new javax.swing.JButton();
        scrollPanelCrear = new javax.swing.JScrollPane();
        panelCrear = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        ftxtMarca = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        ftxtEstado = new javax.swing.JFormattedTextField();
        lblTEjercicio = new javax.swing.JLabel();
        ftxtPMax = new javax.swing.JFormattedTextField();
        lblPMax = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        ftxtTEjercicio = new javax.swing.JFormattedTextField();
        ftxtMaterial = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar equipo fuerza");
        setResizable(false);

        btnCrearEquipoFuerza.setBackground(new java.awt.Color(215, 13, 12));
        btnCrearEquipoFuerza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearEquipoFuerza.setText("Crear");
        btnCrearEquipoFuerza.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCrearEquipoFuerza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoFuerzaActionPerformed(evt);
            }
        });

        scrollPanelCrear.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelCrear.setPreferredSize(new java.awt.Dimension(400, 620));

        panelCrear.setPreferredSize(new java.awt.Dimension(400, 600));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Nombre del producto");
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

        lblTEjercicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTEjercicio.setText("Tipo De Ejercicio");

        ftxtPMax.setFormatterFactory(null);
        ftxtPMax.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        ftxtPMax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxtPMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPMaxActionPerformed(evt);
            }
        });

        lblPMax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPMax.setText("Peso Maximo");

        lblMaterial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaterial.setText("Material");

        ftxtTEjercicio.setFormatterFactory(null);
        ftxtTEjercicio.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        ftxtTEjercicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxtTEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTEjercicioActionPerformed(evt);
            }
        });

        ftxtMaterial.setFormatterFactory(null);
        ftxtMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaterial)
                    .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPMax)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(lblMarca)
                        .addComponent(ftxtMarca)
                        .addComponent(lblEstado)
                        .addComponent(ftxtEstado)
                        .addComponent(lblTEjercicio)
                        .addComponent(ftxtPMax)
                        .addComponent(ftxtTEjercicio)
                        .addComponent(ftxtMaterial)))
                .addContainerGap(172, Short.MAX_VALUE))
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
                .addComponent(lblTEjercicio)
                .addGap(18, 18, 18)
                .addComponent(ftxtTEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPMax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftxtPMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftxtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
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
                    .addComponent(btnCrearEquipoFuerza, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCrearEquipoFuerza)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEquipoFuerzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoFuerzaActionPerformed
        // TODO add your handling code here:
    
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

    if (ftxtTEjercicio.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Tipo Ejercicio\n");
        ftxtTEjercicio.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtTEjercicio.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtPMax.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Peso Maximo\n");
        ftxtPMax.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtPMax.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    if (ftxtMaterial.getText().trim().isEmpty()) {
        errores.append("Debe llenar el campo Material\n");
        ftxtMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
    } else {
        ftxtMaterial.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
    }

    // Si hay errores, los muestra todos juntos
    if (errores.length() > 0) {
        JOptionPane.showMessageDialog(null, errores.toString(), "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String nombre = txtNombre.getText();
    String marca = ftxtMarca.getText();
    String estado = ftxtEstado.getText();
    String tipoEjercicio = ftxtTEjercicio.getText();
    double pesoMaximo = Double.parseDouble(ftxtPMax.getText());
    String material = ftxtMaterial.getText();

    equipoController.insertarEquipoFuerza(nombre, marca, estado, tipoEjercicio, pesoMaximo, material);
    JOptionPane.showMessageDialog(this, "Equipo de Fuerza agregado con éxito");

    // Limpiar campos
    txtNombre.setText("");
    ftxtMarca.setText("");
    ftxtEstado.setText("");
    ftxtTEjercicio.setText("");
    ftxtPMax.setText("");
    ftxtMaterial.setText("");
    }//GEN-LAST:event_btnCrearEquipoFuerzaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void ftxtTEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTEjercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTEjercicioActionPerformed

    private void ftxtPMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtPMaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEquipoFuerza;
    private javax.swing.JFormattedTextField ftxtEstado;
    private javax.swing.JFormattedTextField ftxtMarca;
    private javax.swing.JFormattedTextField ftxtMaterial;
    private javax.swing.JFormattedTextField ftxtPMax;
    private javax.swing.JFormattedTextField ftxtTEjercicio;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPMax;
    private javax.swing.JLabel lblTEjercicio;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JScrollPane scrollPanelCrear;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
