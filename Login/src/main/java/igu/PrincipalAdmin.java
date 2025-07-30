/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author etien
 */
public class PrincipalAdmin extends javax.swing.JFrame {
    
    Controladora control;
    Usuario usuario;

    
    public PrincipalAdmin(Controladora control, Usuario user) {
        initComponents();
        this.control= control;
        this.usuario=user;
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        txtNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuarios);

        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar Usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar Tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setText("Crear nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        txtNombreUser.setEditable(false);
        txtNombreUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreUser.setText("jTextField1");
        txtNombreUser.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.txtNombreUser.setText(usuario.getNombreUsuario());
                cargarTabla();


    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed

       AltaUsuarios altaUsuarios= new AltaUsuarios(control);
       altaUsuarios.setVisible(true);
       altaUsuarios.setLocationRelativeTo(null);
      // this.dispose();
        




    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed


        int id_usuario=-1;
        //validar que la tabla tenga elementos
        if(TablaUsuarios.getRowCount()>0)
        {
            //Controlar que se haya seleccionado un elemento
            if(TablaUsuarios.getSelectedRow()!=-1)
            {
                id_usuario= Integer.parseInt(String.valueOf(TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(),0)));
            
            
            //llamo al metodo borrar
            control.borrarUsuario(id_usuario);
            
            //avisar al usuario que se borro correctamente
                mostrarMensaje("Se borro el usuario correctamente","Info","Eliminacion Correcta");
            
            
            cargarTabla();
            
            
            
            }
            else
            {
                mostrarMensaje("No selecciono ningun registro","Error","Error al borrar");
            }
        }
        else
        {
            mostrarMensaje("La tabla esta vacia","Error","Error la borrar");
        }
        
  

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     
        int id_usuario=-1;
        //validar que la tabla tenga elementos
        if(TablaUsuarios.getRowCount()>0)
        {
            //Controlar que se haya seleccionado un elemento
            if(TablaUsuarios.getSelectedRow()!=-1)
            {
                id_usuario= Integer.parseInt(String.valueOf(TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(),0)));
            
            
            //llamo a la ventana edicion
      
            EdicionUsuarios edicionUsuarios = new EdicionUsuarios(control,id_usuario);
            edicionUsuarios.setVisible(true);
            edicionUsuarios.setLocationRelativeTo(null);
            
            
            
            
            
            
              }
            else
            {
                mostrarMensaje("No selecciono ningun registro","Error","Error al borrar");
            }
        }
        else
        {
            mostrarMensaje("La tabla esta vacia","Error","Error la borrar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    

    
     public void mostrarMensaje(String mensaje,String tipo,String titulo)
   {
        JOptionPane optionPane=new JOptionPane(mensaje);
        if(tipo.equals("info"))
        {
         optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error"))
        {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
       
        }
        
          JDialog dialog=optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   }
    
    
    
 private void cargarTabla() {
        
        
        DefaultTableModel modeloTabla= new DefaultTableModel()
        {
            @Override
            public boolean  isCellEditable(int row,int column)
            {
                return false;
            }
        };
        
        String  titulos[]={"Id","Usuario","Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        //Traer de la bd la lista de usuarios
        
        List<Usuario>listaUsuarios= control.traerUsuarios();
        
        //Vemos si esta vacia
        if(listaUsuarios!=null)
        {
            //recorrer lista usuarios
            for(Usuario usu: listaUsuarios)
            {
                Object[] objeto ={usu.getId(),usu.getNombreUsuario(),usu.getUnRol().getNombrerol()};
                modeloTabla.addRow(objeto);
            }
        }
        TablaUsuarios.setModel(modeloTabla);
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables
}
