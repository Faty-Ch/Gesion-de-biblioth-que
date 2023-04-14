package IHM;

import static IHM.GestionExemplaires.getNbExemplaireLabelValue;
import static IHM.GestionExemplaires.setNbExemplaireLabelValue;

import control.ExemplaireControl;
import entite.Exemplaire;
import entite.Oeuvre;
import module.BibalExceptions;
import module.DBConnection;
import module.ModelTableau;

import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;
import static module.Utility.closeStatementResultSet;
import static module.Utility.initialiseRequetePreparee;
import static module.Utility.showMessageSucces;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * Interface d'ajout d'un exemplaire dans la base
 *
 * @author Diallo & Janati
 */
public class AjoutExemplaire extends javax.swing.JDialog {

    public AjoutExemplaire(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIdentifiant();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    /**
     * @wbp.parser.constructor
     */
    public AjoutExemplaire(java.awt.Frame parent, boolean modal, Oeuvre oeuvre) {
        this(parent, modal);
        this.oeuvre = oeuvre;
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
        titleLabel = new javax.swing.JLabel();
        panAjoutBas = new javax.swing.JPanel();
        etatExemplaireLabel = new javax.swing.JLabel();
        identifiantLabel = new javax.swing.JLabel();
        identifiantField = new javax.swing.JFormattedTextField();
        etatExemplaireCombo = new javax.swing.JComboBox();
        ajouterBouton = new javax.swing.JButton();
        annulerBouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter Exemplaire");

        jPanel1.setBackground(new Color(102, 204, 255));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titleLabel.setForeground(new Color(0, 0, 0));
        titleLabel.setText("Ajout Exemplaire");

        panAjoutBas.setBackground(new java.awt.Color(255, 255, 255));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        etatExemplaireLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etatExemplaireLabel.setForeground(new java.awt.Color(0, 0, 255));
        etatExemplaireLabel.setText("Etat");

        identifiantLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(0, 0, 255));
        identifiantLabel.setText("Identifiant ");

        identifiantField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        identifiantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiantField.setToolTipText("");
        identifiantField.setEnabled(false);
        identifiantField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantField.setPreferredSize(new java.awt.Dimension(123, 26));

        etatExemplaireCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        etatExemplaireCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Neuf", "Bon", "Vieux" }));
        etatExemplaireCombo.setPreferredSize(new java.awt.Dimension(123, 26));

        ajouterBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBasLayout.setHorizontalGroup(
        	panAjoutBasLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panAjoutBasLayout.createSequentialGroup()
        			.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, panAjoutBasLayout.createSequentialGroup()
        					.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(panAjoutBasLayout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(identifiantLabel))
        						.addGroup(panAjoutBasLayout.createSequentialGroup()
        							.addGap(40)
        							.addComponent(etatExemplaireLabel)))
        					.addGap(62)
        					.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.CENTER)
        						.addComponent(etatExemplaireCombo, 0, 233, Short.MAX_VALUE)
        						.addComponent(identifiantField, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
        				.addGroup(Alignment.LEADING, panAjoutBasLayout.createSequentialGroup()
        					.addGap(64)
        					.addComponent(annulerBouton)
        					.addGap(52)
        					.addComponent(ajouterBouton)))
        			.addContainerGap())
        );
        panAjoutBasLayout.setVerticalGroup(
        	panAjoutBasLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panAjoutBasLayout.createSequentialGroup()
        			.addGap(23)
        			.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(identifiantLabel, Alignment.TRAILING)
        				.addComponent(identifiantField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(etatExemplaireCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(etatExemplaireLabel))
        			.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
        			.addGroup(panAjoutBasLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(annulerBouton)
        				.addComponent(ajouterBouton))
        			.addContainerGap())
        );
        panAjoutBas.setLayout(panAjoutBasLayout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Méthode d'ajout d'un exemplaire dans la base
     *
     * @param evt
     */
    private void ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter

        try {
            Exemplaire exemplaire = getExempalireInfos();
            if (null != exemplaire) {
                ExemplaireControl.ajouter(oeuvre, exemplaire.getEtat());
                ((ModelTableau) GestionExemplaires.tableExemplaires.getModel())
                        .addRow(new Object[]{exemplaire.getId(), exemplaire.getEtat()});
                setNbExemplaireLabelValue((parseInt(getNbExemplaireLabelValue()) + 1) + "");
                showMessageSucces("Exemplaire ajouté avec succès");
                setIdentifiant();
            }
        } catch (BibalExceptions e) {
            System.out.println("IHM.AjoutExemplaire.ajouterBoutonActionPerformed()" + e.getMessage());
        }
    }//GEN-LAST:event_ajouter

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    /**
     * Récupère les information d'un exemplaire sur l'interface
     *
     * @return un exemplaire
     */
    private Exemplaire getExempalireInfos() {
        int id = parseInt(identifiantField.getText());
        String etatExemplaire = etatExemplaireCombo.getSelectedItem().toString();

        return new Exemplaire(id, etatExemplaire);
    }

    /**
     * Afficher l'identifiant de l'exemplaire qui sera ajouté
     */
    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM exemplaire ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            showMessageDialog(null, "Erreurs d'accès à la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

    public void setOeuvre(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
    }

    private Oeuvre oeuvre = new Oeuvre();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox etatExemplaireCombo;
    private javax.swing.JLabel etatExemplaireLabel;
    private javax.swing.JFormattedTextField identifiantField;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
