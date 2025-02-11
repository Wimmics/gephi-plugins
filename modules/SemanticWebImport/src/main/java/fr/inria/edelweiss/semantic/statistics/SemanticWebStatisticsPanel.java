/*
 * Copyright (c) 2011, INRIA
 * All rights reserved.
 */

/*
 * SemanticWebStatisticsPanel.java
 *
 * Created on Dec 13, 2011, 4:14:31 PM
 */
package fr.inria.edelweiss.semantic.statistics;

import org.gephi.statistics.spi.Statistics;

/**
 *
 * @author edemairy
 */
public class SemanticWebStatisticsPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 191053265603936122L;
    private Statistics statistics;

    /** Creates new form SemanticWebStatisticsPanel */
    public SemanticWebStatisticsPanel() {
        initComponents();
    }

    SemanticWebStatisticsPanel(Statistics statistics) {
        this.statistics = statistics;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(SemanticWebStatisticsPanel.class, "SemanticWebStatisticsPanel.jLabel1.text")); // NOI18N
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
