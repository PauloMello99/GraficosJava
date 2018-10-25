/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author 0040481722019
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtInfo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelGraf = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatística");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new java.awt.GridLayout(1, 8, 5, 0));

        jButton1.setText("Plot XY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setText("Pizza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setText("ScatterPlot");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setText("Barra 2D");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setText("Barra 3D");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckg_img/save-16.png"))); // NOI18N
        jButton6.setText("Salvar Gráfico");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        txtInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInfoKeyPressed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        Lista.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(Lista);

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Limpar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(5, 5, 5))
        );

        panelGraf.setBackground(new java.awt.Color(255, 51, 51));
        panelGraf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelGrafLayout = new javax.swing.GroupLayout(panelGraf);
        panelGraf.setLayout(panelGrafLayout);
        panelGrafLayout.setHorizontalGroup(
            panelGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGrafLayout.setVerticalGroup(
            panelGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       private DefaultListModel modelo  = new DefaultListModel (); 
       
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try
        {
            String campo = txtInfo.getText().replace(",",".");
            Double numero = Double.parseDouble(campo);
            modelo.addElement(numero);
            Lista.setModel(modelo);
            txtInfo.setText("");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao formatar número.", "Erro", JOptionPane.CANCEL_OPTION);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        modelo.clear();
        Lista.setModel(modelo);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            int indice = Lista.getSelectedIndex();
            modelo.remove(indice);
            Lista.setModel(modelo);
        }
        catch(IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Indice fora do limite.", "Erro ao excluir", JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        opened = 1;
        DefaultCategoryDataset dados = new DefaultCategoryDataset();
        for(int i=0;i<modelo.getSize();i++)
        {
            String numStr = String.valueOf(modelo.get(i));
            Double num = Double.parseDouble(numStr);
            dados.addValue(num, "Número",""+ (i+1));
        }
        grafXY = ChartFactory.createLineChart(
            "Estatística",
            "Indices",
            "Valores",
            dados,
            PlotOrientation.VERTICAL,
            true, 
            true ,
            false);
        ChartPanel panel = new ChartPanel(grafXY);
        int largura = panelGraf.getWidth();
        int altura = panelGraf.getHeight();
        panel.setPreferredSize(new Dimension(largura,altura));
        panelGraf.setLayout(new BorderLayout());
        panelGraf.add(panel,BorderLayout.CENTER);
        panelGraf.validate();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        opened = 2;
        DefaultPieDataset dados = new DefaultPieDataset( );
        for(int i=0;i<modelo.getSize();i++)
        {
            String numStr = String.valueOf(modelo.get(i));
            Double num = Double.parseDouble(numStr);
            dados.setValue(""+ (i+1),num);
        }
        grafPizza = ChartFactory.createPieChart("Pizza", dados);
        ChartPanel panel = new ChartPanel(grafPizza);
        int largura = panelGraf.getWidth();
        int altura = panelGraf.getHeight();
        panel.setPreferredSize(new Dimension(largura,altura));
        panelGraf.setLayout(new BorderLayout());
        panelGraf.add(panel,BorderLayout.CENTER);
        panelGraf.validate();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInfoKeyPressed
        int tecla = evt.getKeyCode();
        if(tecla == KeyEvent.VK_ENTER)
        {
            btnAdd.doClick();
        }
    }//GEN-LAST:event_txtInfoKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtInfo.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        opened = 3;
        XYSeriesCollection dados = new XYSeriesCollection();
        XYSeries grupo = new XYSeries("Números");
        for(int i=0;i<modelo.getSize();i++)
        {
            String numStr = String.valueOf(modelo.get(i));
            Double num = Double.parseDouble(numStr);
            grupo.add(i, num);
        }
        dados.addSeries(grupo);
        grafPlot = ChartFactory.createScatterPlot("ScatterPlot", "X", "Y", dados);
        ChartPanel panel = new ChartPanel(grafPlot);
        int largura = panelGraf.getWidth();
        int altura = panelGraf.getHeight();
        panel.setPreferredSize(new Dimension(largura,altura));
        panelGraf.setLayout(new BorderLayout());
        panelGraf.add(panel,BorderLayout.CENTER);
        panelGraf.validate();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        opened = 4;
        DefaultCategoryDataset dados = new DefaultCategoryDataset();
        for(int i=0;i<modelo.getSize();i++)
        {
            String numStr = String.valueOf(modelo.get(i));
            Double num = Double.parseDouble(numStr);
            dados.addValue(num, "Número",""+ (i+1));
        }
        grafBarra2D = ChartFactory.createBarChart("Barra 2D", "Categoria", "Valor", dados);
        ChartPanel panel = new ChartPanel(grafBarra2D);
        int largura = panelGraf.getWidth();
        int altura = panelGraf.getHeight();
        panel.setPreferredSize(new Dimension(largura,altura));
        panelGraf.setLayout(new BorderLayout());
        panelGraf.add(panel,BorderLayout.CENTER);
        panelGraf.validate();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        opened = 5;
        DefaultCategoryDataset dados = new DefaultCategoryDataset();
        XYSeries grupo = new XYSeries("Números");
        for(int i=0;i<modelo.getSize();i++)
        {
            String numStr = String.valueOf(modelo.get(i));
            Double num = Double.parseDouble(numStr);
            dados.addValue(num, "Número",""+ (i+1));
        }
        grafBarra3D = ChartFactory.createBarChart3D("Barra 2D", "Categoria", "Valor", dados);
        ChartPanel panel = new ChartPanel(grafBarra3D);
        int largura = panelGraf.getWidth();
        int altura = panelGraf.getHeight();
        panel.setPreferredSize(new Dimension(largura,altura));
        panelGraf.setLayout(new BorderLayout());
        panelGraf.add(panel,BorderLayout.CENTER);
        panelGraf.validate();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(opened!=0)
        {
            JFileChooser fileChooser = new JFileChooser();
            int select = fileChooser.showSaveDialog(null);
            if (select == JFileChooser.APPROVE_OPTION) 
            {
                String cam = fileChooser.getSelectedFile().getAbsolutePath();
                File salvar = new File(cam+".JPEG");


                switch (opened) {
                        case 1:
                            try {
                                if(!salvar.exists())
                                    ChartUtilities.saveChartAsJPEG(salvar, grafXY, 400, 600);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.CANCEL_OPTION);
                            }       break;
                        case 2:
                            try {
                                if(!salvar.exists())
                                    ChartUtilities.saveChartAsJPEG(salvar, grafPizza, 400, 600);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.CANCEL_OPTION);
                            }       break;
                        case 3:
                            try {
                                if(!salvar.exists())
                                    ChartUtilities.saveChartAsJPEG(salvar, grafPlot, 400, 600);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.CANCEL_OPTION);
                            }       break;
                        case 4:
                            try {
                                if(!salvar.exists())
                                    ChartUtilities.saveChartAsJPEG(salvar, grafBarra2D, 400, 600);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.CANCEL_OPTION);
                            }       break;
                        default:
                            try {
                                if(!salvar.exists())
                                    ChartUtilities.saveChartAsJPEG(salvar, grafBarra3D, 400, 600);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, ex, "Erro", JOptionPane.CANCEL_OPTION);
                            }       break;
                    }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nenhum Gráfico foi selecionado ainda", "Erro", JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    public JFreeChart grafXY;
    public JFreeChart grafPizza;
    public JFreeChart grafPlot;
    public JFreeChart grafBarra2D;
    public JFreeChart grafBarra3D;
    public int opened = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGraf;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
}
