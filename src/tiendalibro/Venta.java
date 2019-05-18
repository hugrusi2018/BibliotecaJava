package tiendalibro;

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

public class Venta extends javax.swing.JFrame {
    private DefaultTableModel  modelo1, modelo2;

    private String Datos[][] = {};
    private String[] Encabezado1 = {"ISBN", "Título","Autor", "Precio Unitario"};
    private String[] Encabezado2 = {"ISBN", "Título", "Cantidad", "Precio Unitario"};

    public Venta() {
        initComponents();
  
        setExtendedState(MAXIMIZED_BOTH);
        
            
        modelo1 = new DefaultTableModel(Datos, Encabezado1);
        TablaLibros.setModel(modelo1);
        
        modelo2 = new  DefaultTableModel (Datos, Encabezado2);
        TablaCarritoCompras.setModel(modelo2);    
        
        TablaCarritoCompras.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                double sub = 0;
                for(int i : TablaCarritoCompras.getSelectedRows())
                    sub += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
                CampoSubtotal.setText(sub+"");
            }
        });
    }

    public void cargar(){
        
        String AISBN = "1029345087";
        String ATitulo = "Cien Años de Soledad";
        String Aautor = "Gabriel Garcias Marquez";
        String APrecio = "4300";
        String Datos[] = {AISBN, ATitulo, Aautor, APrecio};
        modelo1.addRow(Datos);
        //-------------------------------------------------
        String BISBN = "9873602938";
        String BTitulo = "Don Quijote de la Mancha Part1";
        String Bautor = "Miguel de Cervantes Saavedra";
        String BPrecio = "12400";
        String BDatos[] = {BISBN, BTitulo, Bautor, BPrecio};
        modelo1.addRow(BDatos);
        //---------------------------------------------------
        String CISBN = "9873602938";
        String CTitulo = "Don Quijote de la Mancha Part2";
        String Cautor = "Miguel de Cervantes Saavedra";
        String CPrecio = "12600";
        String CDatos[] = {CISBN, CTitulo, Cautor, CPrecio};
        modelo1.addRow(CDatos);
        //---------------------------------------------------
        String DISBN = "4029382734";
        String DTitulo = "El Diario de Ana Frank";
        String Dautor = "Anne Frank";
        String DPrecio = "8700";
        String DDatos[] = {DISBN, DTitulo, Dautor, DPrecio};
        modelo1.addRow(DDatos);
        //---------------------------------------------------
        String EISBN = "1023435546";
        String ETitulo = "El Codigo Da Vinci";
        String Eautor = "Dan Brown";
        String EPrecio = "2300";
        String EDatos[] = {EISBN, ETitulo, Eautor, EPrecio};
        modelo1.addRow(EDatos);
        //---------------------------------------------------
        String FISBN = "1023435546";
        String FTitulo = "El Perfume";
        String Fautor = "Patrik Süskind";
        String FPrecio = "8700";
        String FDatos[] = {FISBN, FTitulo, Fautor, FPrecio};
        modelo1.addRow(FDatos);
        //---------------------------------------------------
        String GISBN = "1013145009";
        String GTitulo = "La mil y una noches";
        String Gautor = "Abu Abd-Allah Muhammad";
        String GPrecio = "23000";
        String GDatos[] = {GISBN, GTitulo, Gautor, GPrecio};
        modelo1.addRow(GDatos);
         //---------------------------------------------------
        String HISBN = "9043636036";
        String HTitulo = "La Metamorfosis";
        String Hautor = "Franz Kafka";
        String HPrecio = "8100";
        String HDatos[] = {HISBN, HTitulo, Hautor, HPrecio};
        modelo1.addRow(HDatos);
         //---------------------------------------------------
        String IISBN = "7906463200";
        String ITitulo = "El Secreto";
        String Iautor = "Rhonda Byrne";
        String IPrecio = "11800";
        String IDatos[] = {IISBN, ITitulo, Iautor, IPrecio};
        modelo1.addRow(IDatos);
         //---------------------------------------------------
        String jISBN = "7638900844";
        String jTitulo = "La Caverna";
        String jautor = "Jose Saramago";
        String jPrecio = "11800";
        String jDatos[] = {jISBN, jTitulo, jautor, jPrecio};
        modelo1.addRow(jDatos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLibros = new javax.swing.JPanel();
        ScrollPanelLibros = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        BotonComprar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonCargarLibros = new javax.swing.JButton();
        BotonNuevoLibro = new javax.swing.JButton();
        PanelCarritoCompras = new javax.swing.JPanel();
        ScrollPanelCarritoCompras = new javax.swing.JScrollPane();
        TablaCarritoCompras = new javax.swing.JTable();
        EtiquetaSubtotal = new javax.swing.JLabel();
        CampoSubtotal = new javax.swing.JTextField();
        BotonCalcularTotal = new javax.swing.JButton();
        EtiquetaMonto = new javax.swing.JLabel();
        CampoTotal = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        EtiquetaVentasLibros = new javax.swing.JLabel();
        EtiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas de Libros: Sistema de Biblioteca en Java - Por Raúl GC");
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
                "ISBN", "Titulo", "Autor", "Precio"
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

        BotonComprar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonComprar.setText("Comprar Libro");
        BotonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprarActionPerformed(evt);
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
                        .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(BotonComprar)
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

        PanelCarritoCompras.setBackground(new java.awt.Color(204, 204, 255));
        PanelCarritoCompras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrito de Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        TablaCarritoCompras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablaCarritoCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Cantidad", "Precio Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPanelCarritoCompras.setViewportView(TablaCarritoCompras);

        EtiquetaSubtotal.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        EtiquetaSubtotal.setText("Subtotal");

        CampoSubtotal.setEditable(false);

        BotonCalcularTotal.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonCalcularTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendalibro/Setup.png"))); // NOI18N
        BotonCalcularTotal.setText("Calcular Total");
        BotonCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularTotalActionPerformed(evt);
            }
        });

        EtiquetaMonto.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        EtiquetaMonto.setText("Monto");

        CampoTotal.setEditable(false);

        BotonSalir.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCarritoComprasLayout = new javax.swing.GroupLayout(PanelCarritoCompras);
        PanelCarritoCompras.setLayout(PanelCarritoComprasLayout);
        PanelCarritoComprasLayout.setHorizontalGroup(
            PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarritoComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanelCarritoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addGroup(PanelCarritoComprasLayout.createSequentialGroup()
                        .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCarritoComprasLayout.createSequentialGroup()
                                .addComponent(EtiquetaMonto)
                                .addGap(18, 18, 18)
                                .addComponent(CampoTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCarritoComprasLayout.createSequentialGroup()
                                .addComponent(EtiquetaSubtotal)
                                .addGap(28, 28, 28)
                                .addComponent(CampoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(BotonCalcularTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelCarritoComprasLayout.setVerticalGroup(
            PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarritoComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelCarritoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCarritoComprasLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaSubtotal)
                            .addComponent(CampoSubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaMonto)
                            .addComponent(CampoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCarritoComprasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelCarritoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCarritoComprasLayout.createSequentialGroup()
                                .addComponent(BotonSalir)
                                .addContainerGap())
                            .addComponent(BotonCalcularTotal, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        EtiquetaVentasLibros.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        EtiquetaVentasLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendalibro/book (2).png"))); // NOI18N
        EtiquetaVentasLibros.setText("Ventas de Libros");

        EtiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendalibro/book (3).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCarritoCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(EtiquetaVentasLibros)
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
                    .addComponent(EtiquetaVentasLibros, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(PanelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PanelCarritoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprarActionPerformed
        int s = TablaLibros.getSelectedRow();

        if(s==-1) 
           JOptionPane.showMessageDialog(this, "Seleccione el libro que desea comprar."); 
        else{
            int pos = buscarEnCarrito(s);
            if( pos != -1 ) {
                String cantidad = JOptionPane.showInputDialog("Ya se ha adquirido este libro. Ingrese la nueva cantidad que desea adquirir:");
                if(cantidad.equals("0"))
                    modelo2.removeRow(pos);
                else modelo2.setValueAt(cantidad, pos, 2);
                return;
            }
            String cantidad = JOptionPane.showInputDialog("Ingrese cantidad a comprar:");
            Object fila [] = new Object[modelo2.getColumnCount()];
            fila[0] = modelo1.getValueAt(s, 0); // ISBN.
            fila[1] = modelo1.getValueAt(s, 1); // Título.
            fila[3] = modelo1.getValueAt(s, 3); // Precio unitario.
            fila[2] = cantidad;
            modelo2.addRow(fila);
        }
    }//GEN-LAST:event_BotonComprarActionPerformed

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
        String Precio = JOptionPane.showInputDialog("Ingrese el precio del libro:");
       
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

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed

        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonCargarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarLibrosActionPerformed
        cargar();
    }//GEN-LAST:event_BotonCargarLibrosActionPerformed

    private void BotonCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularTotalActionPerformed
        double precio = 0;
        for(int i=0; i<modelo2.getRowCount(); ++i)
        precio += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
        CampoTotal.setText(precio+"");
    }//GEN-LAST:event_BotonCalcularTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCalcularTotal;
    private javax.swing.JButton BotonCargarLibros;
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonNuevoLibro;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField CampoSubtotal;
    private javax.swing.JTextField CampoTotal;
    private javax.swing.JLabel EtiquetaImagen;
    private javax.swing.JLabel EtiquetaMonto;
    private javax.swing.JLabel EtiquetaSubtotal;
    private javax.swing.JLabel EtiquetaVentasLibros;
    private javax.swing.JPanel PanelCarritoCompras;
    private javax.swing.JPanel PanelLibros;
    private javax.swing.JScrollPane ScrollPanelCarritoCompras;
    private javax.swing.JScrollPane ScrollPanelLibros;
    private javax.swing.JTable TablaCarritoCompras;
    private javax.swing.JTable TablaLibros;
    // End of variables declaration//GEN-END:variables
}
