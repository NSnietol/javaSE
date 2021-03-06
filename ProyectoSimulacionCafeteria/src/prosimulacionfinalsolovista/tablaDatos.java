/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosimulacionfinalsolovista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Corrida;

/**
 *
 * @author andre
 */
public class tablaDatos extends javax.swing.JDialog {

    /**
     * Creates new form Simulacion
     */
    Corrida actual;
    public tablaDatos(java.awt.Frame parent, boolean modal,Corrida actual,int num) {
        super(parent,true);
        setLocationRelativeTo(null);
        initComponents();
        setTitle("DATOS GENERALES-CORRIDA : "+num);
        jLabelNum.setText(num+"");
        this.actual= actual;
        llenarTabla();
        jLabelCantidad.setText(""+actual.getClientes().size());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Corridas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tiempo Llegada", "Tiempo Espera", "Tipo", "Genero", "Comida"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Corrida Simulación :");

        jLabel2.setText("Número de clientes ");

        jLabelCantidad.setText("jLabel3");

        jLabelNum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabelCantidad)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (; model.getRowCount() > 0;) {
            model.removeRow(0);
        }



        for (int i = 0; i < actual.getClientes().size(); i++) {
            String comida = "";
            for (int j = 0; j < actual.getClientes().get(i).getComida().size(); j++) {
                comida = comida + actual.getClientes().get(i).getComida().get(j) + ", ";
            }
            model.addRow(new Object[]{actual.getClientes().get(i).getTiempoLlegada() + "", "" + (int) actual.getClientes().get(i).getTiempoServicio(), actual.getClientes().get(i).getTipo(), actual.getClientes().get(i).getGenero(), comida});

        }
        
        System.out.println("------------------ Total "+ actual.getClientes().size());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
