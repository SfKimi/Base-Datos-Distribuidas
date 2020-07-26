
package co.edu.usbbog.adb.personaapp.vista;
//package co.edu.usbbog.adb.personaapp.vista.Principal;

import static javafx.application.Platform.exit;
import javax.swing.JPanel;


public class Login extends JPanel{

    Principal pr;
    

   
    public Login(Principal principal) {
        this.pr= principal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new java.awt.Panel();
        jTextUsuario = new javax.swing.JTextField();
        jTextContrasenia = new javax.swing.JTextField();
        buttonIngresar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonPostgreSQL = new javax.swing.JRadioButton();
        jRadioButtonMongoDB = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        jToggleButtonCerrar1 = new javax.swing.JToggleButton();
        jToggleButtonRedimencionar1 = new javax.swing.JToggleButton();
        jToggleButtonMinimizar1 = new javax.swing.JToggleButton();
        buttonRegistrarL = new java.awt.Button();

        buttonIngresar.setLabel("Ingresar");
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("LOGIN");

        jRadioButtonPostgreSQL.setText("PosgreSQL");

        jRadioButtonMongoDB.setText("MongoDB");

        jToolBar1.setRollover(true);

        jToggleButtonCerrar1.setText("X");
        jToggleButtonCerrar1.setFocusable(false);
        jToggleButtonCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonCerrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCerrar1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButtonCerrar1);

        jToggleButtonRedimencionar1.setText("■");
        jToggleButtonRedimencionar1.setFocusable(false);
        jToggleButtonRedimencionar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRedimencionar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonRedimencionar1);

        jToggleButtonMinimizar1.setText("-");
        jToggleButtonMinimizar1.setFocusable(false);
        jToggleButtonMinimizar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonMinimizar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonMinimizar1);

        buttonRegistrarL.setActionCommand("Registrarse");
        buttonRegistrarL.setLabel("Registrarse");
        buttonRegistrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(jRadioButtonPostgreSQL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonMongoDB)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)))
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jTextUsuario)))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(buttonRegistrarL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonPostgreSQL)
                            .addComponent(jRadioButtonMongoDB)))
                    .addComponent(buttonRegistrarL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed
        ingresar();
    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void jToggleButtonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCerrar1ActionPerformed
//Boton de cerrar aplicacion 
exit();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonCerrar1ActionPerformed

    private void buttonRegistrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarLActionPerformed
        VRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegistrarLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Panel Login;
    public java.awt.Button buttonIngresar;
    public java.awt.Button buttonRegistrarL;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JRadioButton jRadioButtonMongoDB;
    public javax.swing.JRadioButton jRadioButtonPostgreSQL;
    public javax.swing.JTextField jTextContrasenia;
    public javax.swing.JTextField jTextUsuario;
    public javax.swing.JToggleButton jToggleButtonCerrar1;
    public javax.swing.JToggleButton jToggleButtonMinimizar1;
    public javax.swing.JToggleButton jToggleButtonRedimencionar1;
    public javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void ingresar() {
        if(validar()){
            pr.deLoginAMenu(this);
        }
    }

    private boolean validar() {
        if(jTextUsuario.getText().equals("")){
            return false;
        }else if(jTextContrasenia.getText().equals("")){
            return false;
        }else if(pr.getGestion().iniciarSesion("postgres", jTextUsuario.getText(), jTextContrasenia.getText())){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    private void VRegistro() {
        pr.deLoginAEditar(this);
    }
    
    
}
