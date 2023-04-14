package IHM;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
/**
 * 
 * @author Diallo & Janati
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Deconnecter = new javax.swing.JButton();
        Deconnecter.setBackground(new Color(255, 204, 204));
        GestionReservationsEmprunts = new javax.swing.JButton();
        GestionReservationsEmprunts.setBackground(new Color(153, 255, 255));
        GestionUsager = new javax.swing.JButton();
        GestionUsager.setBackground(new Color(204, 153, 255));
        GestionOeuvresExamplaires = new javax.swing.JButton();
        GestionOeuvresExamplaires.setBackground(new Color(153, 255, 153));
        bibliothequeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(410, 410));
        setResizable(false);

        jPanel1.setBackground(new Color(0, 204, 255));

        Deconnecter.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Deconnecter.setForeground(new Color(255, 0, 0));
        Deconnecter.setText("Déconnecter");
        Deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnecterActionPerformed(evt);
            }
        });

        GestionReservationsEmprunts.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        GestionReservationsEmprunts.setForeground(new Color(0, 0, 255));
        GestionReservationsEmprunts.setText("Gestion Reservations et Emprunts");
        GestionReservationsEmprunts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionReservationsEmpruntsActionPerformed(evt);
            }
        });

        GestionUsager.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        GestionUsager.setForeground(new Color(153, 0, 204));
        GestionUsager.setText("Gestion Des Usagers");
        GestionUsager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionUsagerActionPerformed(evt);
            }
        });

        GestionOeuvresExamplaires.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        GestionOeuvresExamplaires.setForeground(new Color(0, 102, 0));
        GestionOeuvresExamplaires.setText("Gestion Oeuvres et Examplaires");
        GestionOeuvresExamplaires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionOeuvresExamplairesActionPerformed(evt);
            }
        });

        bibliothequeLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bibliothequeLabel.setForeground(new Color(255, 51, 102));
        bibliothequeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bibliothequeLabel.setText("Gestion Bibliothèque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(bibliothequeLabel)
        			.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(GestionUsager, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
        				.addComponent(GestionOeuvresExamplaires, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
        				.addComponent(GestionReservationsEmprunts)
        				.addComponent(Deconnecter, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
        			.addGap(18))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(65)
        			.addComponent(GestionUsager, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(60)
        			.addComponent(GestionOeuvresExamplaires, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(57)
        			.addComponent(GestionReservationsEmprunts, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(58)
        			.addComponent(Deconnecter, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(128))
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(170)
        			.addComponent(bibliothequeLabel, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionUsagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionUsagerActionPerformed
        GestionUsager gu = new GestionUsager();
        this.dispose();
        gu.setVisible(true);
    }//GEN-LAST:event_GestionUsagerActionPerformed

    private void DeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnecterActionPerformed
        Authentification a = new Authentification();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_DeconnecterActionPerformed

    private void GestionOeuvresExamplairesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionOeuvresExamplairesActionPerformed
        GestionOeuvresExemplaires goe = new GestionOeuvresExemplaires();
        this.dispose();
        goe.setVisible(true);
    }//GEN-LAST:event_GestionOeuvresExamplairesActionPerformed

    private void GestionReservationsEmpruntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionReservationsEmpruntsActionPerformed
        GestionReservationsEmprunts gre = new GestionReservationsEmprunts();
        this.dispose();
        gre.setVisible(true);
    }//GEN-LAST:event_GestionReservationsEmpruntsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deconnecter;
    private javax.swing.JButton GestionOeuvresExamplaires;
    private javax.swing.JButton GestionReservationsEmprunts;
    private javax.swing.JButton GestionUsager;
    private javax.swing.JLabel bibliothequeLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
