package tiendalibro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raúl García Cortés | GarciaCortes.Raul@gmail.com | http://javaeditados.wordpress.com/
 * 
 */

public class Prestamo extends javax.swing.JFrame {
    private DefaultTableModel  modelo1, modelo2;

    private String Datos[][] = {};
    private String[] Encabezado1 = {"ISBN", "Título","Autor", "Estado"};
    private String[] Encabezado2 = {"Codigo Estudiantes", "ISBN", "Titulo", "Fecha Entrega"};
    int disp = 0;

    public Prestamo() {
        initComponents();
  
        campoSub.setVisible(false);
        setExtendedState(MAXIMIZED_BOTH);
        
         Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formateador.format(fechaActual);
        CampoFecha.setText(fecha);
        
        modelo1 = new DefaultTableModel(Datos, Encabezado1);
        TablaLibros.setModel(modelo1);
        
        modelo2 = new  DefaultTableModel (Datos, Encabezado2);
        TablaCarritoPrestamo.setModel(modelo2);    
        
        TablaCarritoPrestamo.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            
            
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                double sub = 0;
                for(int i : TablaCarritoPrestamo.getSelectedRows())
                    sub += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
                campoSub.setText(sub+"");
            }
        });
    }

    public void cargar(){
        
        String AISBN = "1029345087";
        String ATitulo = "Cien Años de Soledad";
        String Aautor = "Gabriel Garcias Marquez";
        String APrecio = "DISPONIBLE";
        String Datos[] = {AISBN, ATitulo, Aautor, APrecio};
        modelo1.addRow(Datos);
        //-------------------------------------------------
        String BISBN = "9873602938";
        String BTitulo = "Don Quijote de la Mancha Part1";
        String Bautor = "Miguel de Cervantes Saavedra";
        String BPrecio = "DISPONIBLE";
        String BDatos[] = {BISBN, BTitulo, Bautor, BPrecio};
        modelo1.addRow(BDatos);
        //---------------------------------------------------
        String CISBN = "9873602938";
        String CTitulo = "Don Quijote de la Mancha Part2";
        String Cautor = "Miguel de Cervantes Saavedra";
        String CPrecio = "DISPONIBLE";
        String CDatos[] = {CISBN, CTitulo, Cautor, CPrecio};
        modelo1.addRow(CDatos);
        //---------------------------------------------------
        String DISBN = "4029382734";
        String DTitulo = "El Diario de Ana Frank";
        String Dautor = "Anne Frank";
        String DPrecio = "DISPONIBLE";
        String DDatos[] = {DISBN, DTitulo, Dautor, DPrecio};
        modelo1.addRow(DDatos);
        //---------------------------------------------------
        String EISBN = "1023435546";
        String ETitulo = "El Codigo Da Vinci";
        String Eautor = "Dan Brown";
        String EPrecio = "DISPONIBLE";
        String EDatos[] = {EISBN, ETitulo, Eautor, EPrecio};
        modelo1.addRow(EDatos);
        //---------------------------------------------------
        String FISBN = "1023435546";
        String FTitulo = "El Perfume";
        String Fautor = "Patrik Süskind";
        String FPrecio = "DISPONIBLE";
        String FDatos[] = {FISBN, FTitulo, Fautor, FPrecio};
        modelo1.addRow(FDatos);
        //---------------------------------------------------
        String GISBN = "1013145009";
        String GTitulo = "La mil y una noches";
        String Gautor = "Abu Abd-Allah Muhammad";
        String GPrecio = "DISPONIBLE";
        String GDatos[] = {GISBN, GTitulo, Gautor, GPrecio};
        modelo1.addRow(GDatos);
         //---------------------------------------------------
        String HISBN = "9043636036";
        String HTitulo = "La Metamorfosis";
        String Hautor = "Franz Kafka";
        String HPrecio = "DISPONIBLE";
        String HDatos[] = {HISBN, HTitulo, Hautor, HPrecio};
        modelo1.addRow(HDatos);
         //---------------------------------------------------
        String IISBN = "7906463200";
        String ITitulo = "El Secreto";
        String Iautor = "Rhonda Byrne";
        String IPrecio = "NO DISPONIBLE";
        String IDatos[] = {IISBN, ITitulo, Iautor, IPrecio};
        modelo1.addRow(IDatos);
         //---------------------------------------------------
        String jISBN = "7638900844";
        String jTitulo = "La Caverna";
        String jautor = "Jose Saramago";
        String jPrecio = "DISPONIBLE";
        String jDatos[] = {jISBN, jTitulo, jautor, jPrecio};
        modelo1.addRow(jDatos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLibros = new javax.swing.JPanel();
        ScrollPanelLibros = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        BotonPrestar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonCargarLibros = new javax.swing.JButton();
        BotonNuevoLibro = new javax.swing.JButton();
        PanelCarritoPrestamo = new javax.swing.JPanel();
        ScrollPanelCarritoPrestamo = new javax.swing.JScrollPane();
        TablaCarritoPrestamo = new javax.swing.JTable();
        BotonCalcular = new javax.swing.JButton();
        campoSub = new javax.swing.JTextField();
        EtiquetaFecha = new javax.swing.JLabel();
        CampoFecha = new javax.swing.JTextField();
        EtiquetaTitulo = new javax.swing.JLabel();
        EtiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Préstamo de Libros: Sistema de Biblioteca en Java - Por Raúl GC");
        setLocationByPlatform(true);

        PanelLibros.setBackground(new java.awt.Color(204, 204, 255));
        PanelLibros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libros enlistados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        TablaLibros.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Autor", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPanelLibros.setViewportView(TablaLibros);

        BotonPrestar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonPrestar.setText("Prestar");
        BotonPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrestarActionPerformed(evt);
            }
        });

        BotonBorrar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonCargarLibros.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonCargarLibros.setText("Cargar Libros");
        BotonCargarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarLibrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLibrosLayout = new javax.swing.GroupLayout(PanelLibros);
        PanelLibros.setLayout(PanelLibrosLayout);
        PanelLibrosLayout.setHorizontalGroup(
            PanelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLibrosLayout.createSequentialGroup()
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BotonPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCargarLibros))
                    .addComponent(ScrollPanelLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelLibrosLayout.setVerticalGroup(
            PanelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLibrosLayout.createSequentialGroup()
                .addComponent(ScrollPanelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPrestar)
                    .addComponent(BotonBorrar)
                    .addComponent(BotonCargarLibros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonNuevoLibro.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonNuevoLibro.setText("Nuevo Libro");
        BotonNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoLibroActionPerformed(evt);
            }
        });

        PanelCarritoPrestamo.setBackground(new java.awt.Color(204, 204, 255));
        PanelCarritoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrito de Préstamos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        TablaCarritoPrestamo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaCarritoPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo estudiantes", "ISBN", "Titulo", "Fecha entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPanelCarritoPrestamo.setViewportView(TablaCarritoPrestamo);

        BotonCalcular.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonCalcular.setText("Salir");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        campoSub.setEditable(false);

        EtiquetaFecha.setText("Fecha");

        javax.swing.GroupLayout PanelCarritoPrestamoLayout = new javax.swing.GroupLayout(PanelCarritoPrestamo);
        PanelCarritoPrestamo.setLayout(PanelCarritoPrestamoLayout);
        PanelCarritoPrestamoLayout.setHorizontalGroup(
            PanelCarritoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarritoPrestamoLayout.createSequentialGroup()
                .addGroup(PanelCarritoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCarritoPrestamoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPanelCarritoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
                    .addGroup(PanelCarritoPrestamoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(EtiquetaFecha)
                        .addGap(18, 18, 18)
                        .addComponent(CampoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelCarritoPrestamoLayout.setVerticalGroup(
            PanelCarritoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarritoPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelCarritoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PanelCarritoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonCalcular)
                    .addGroup(PanelCarritoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EtiquetaFecha)
                        .addComponent(CampoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoSub)))
                .addContainerGap())
        );

        EtiquetaTitulo.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        EtiquetaTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendalibro/book (2).png"))); // NOI18N
        EtiquetaTitulo.setText("Préstamos de Libros");

        EtiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendalibro/book (3).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCarritoPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(EtiquetaTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EtiquetaImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaImagen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonNuevoLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(PanelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PanelCarritoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrestarActionPerformed
        int s = TablaLibros.getSelectedRow();
        
        String dispond = (String) TablaLibros.getValueAt(s, 3);
        
        if(dispond=="DISPONIBLE"){
           
      
        
        if(s==-1) {
           JOptionPane.showMessageDialog(this, "Seleccione el libro que desea comprar."); 
        }
        else{
            int pos = buscarEnCarrito(s);
            if( pos != -1 ) {
                String cantidad = JOptionPane.showInputDialog("Ya se ha adquirido este libro. Ingrese la nueva cantidad que desea adquirir:");
                if(cantidad.equals("0"))
                    modelo2.removeRow(pos);
                else modelo2.setValueAt(cantidad, pos, 2);
                return;
            }
            String codigo = JOptionPane.showInputDialog("Ingrese El codigo de estudiantes:");
            String fecha = CampoFecha.getText();
            Object fila [] = new Object[modelo2.getColumnCount()];
            fila[0] = codigo;
            fila[1] = modelo1.getValueAt(s, 0); // ISBN.
            fila[3] = fecha; // Precio unitario.
            fila[2] = modelo1.getValueAt(s, 1);//titulo
            modelo2.addRow(fila);
  
              // poner no disponible cuando va prestar libro
               int filasn = TablaLibros.getSelectedRow();          
               modelo1.setValueAt("NO DISPONIBLE", filasn,3);
            
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "LIBRO NO DISPONIBLE"); 
        }
    }//GEN-LAST:event_BotonPrestarActionPerformed

    private int buscarEnCarrito(int s) {
        String ISBN = (String) modelo1.getValueAt(s, 0);
        String Titulo = (String) modelo1.getValueAt(s, 1);
        
        for(int i=0; i<modelo2.getRowCount(); ++i) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) modelo2.getDataVector().get(i);
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return i;
        }
        return -1;        
    }
    
    private void BotonNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoLibroActionPerformed
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String Titulo = JOptionPane.showInputDialog("Ingrese el Titulo del libro:");
        String autor= JOptionPane.showInputDialog("Ingrese el Autor del libro:");
        String Precio = "DISPONIBLE";
       
        if( existeLibro(ISBN, Titulo) ) 
            JOptionPane.showMessageDialog(this, "El libro ya se encuentra registrado.");
        else {
            JOptionPane.showMessageDialog(this, "El libro se ha registrado correctamente.");        
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Datos[] = {ISBN, Titulo, autor, Precio};
            modelo1.addRow(Datos);
        }
    }//GEN-LAST:event_BotonNuevoLibroActionPerformed

    private boolean existeLibro(String ISBN, String Titulo) {
        Iterator it = modelo1.getDataVector().iterator();
        while(it.hasNext()) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) it.next();
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return true;
        }
        return false;
    }
    
    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        int s = TablaLibros.getSelectedRow();
        if(s==-1) 
           JOptionPane.showMessageDialog(this,"Por favor seleccione una fila."); 
        else modelo1.removeRow(s);        
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void BotonCargarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarLibrosActionPerformed
        cargar();
    }//GEN-LAST:event_BotonCargarLibrosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Prestamo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JButton BotonCargarLibros;
    private javax.swing.JButton BotonNuevoLibro;
    private javax.swing.JButton BotonPrestar;
    private javax.swing.JTextField CampoFecha;
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaImagen;
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.JPanel PanelCarritoPrestamo;
    private javax.swing.JPanel PanelLibros;
    private javax.swing.JScrollPane ScrollPanelCarritoPrestamo;
    private javax.swing.JScrollPane ScrollPanelLibros;
    private javax.swing.JTable TablaCarritoPrestamo;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JTextField campoSub;
    // End of variables declaration//GEN-END:variables

}
