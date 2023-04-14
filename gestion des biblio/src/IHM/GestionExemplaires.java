package IHM;

import control.EmpruntControl;
import control.ExemplaireControl;
import entite.Exemplaire;
import entite.Livre;
import entite.Magazine;
import entite.Oeuvre;
import module.BibalExceptions;
import module.ModelTableau;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showConfirmDialog;
import static module.Utility.showMessageSucces;
/**
 * 
 * @author Diallo & Janati
 */
public class GestionExemplaires extends javax.swing.JDialog implements MouseListener {

    public GestionExemplaires(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tableExemplaires.addMouseListener(this);
        tableExemplaires.addMouseListener(this);
        tableExemplaires.setModel(new ModelTableau(new Object[0][0],
                new String[]{"ID", "Etat"}));
        tableExemplaires.setRowHeight(30);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    /**
     * @wbp.parser.constructor
     */
    public GestionExemplaires(java.awt.Frame parent, boolean modal,
            Oeuvre oeuvre) {
        this(parent, modal);

        identifiantLabelValue.setText(oeuvre.getId() + "");
        titreLabelValue.setText(oeuvre.getTitre());
        categorieLabelValue.setText(oeuvre.getCategorie());
        typeOeuvreLabelValue.setText(oeuvre.getClass().getSimpleName());
        auteurLabelValue.setText(oeuvre.getAuteur());
        nbExemplaireLabelValue.setText(oeuvre.getExamplairesOeuvre().size() + "");
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
        panAjoutOeuvre = new javax.swing.JPanel();
        pan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        typeOeuvreLabel = new javax.swing.JLabel();
        identifiantLabel = new javax.swing.JLabel();
        auteurLabel = new javax.swing.JLabel();
        titreLabel = new javax.swing.JLabel();
        categorieLabel = new javax.swing.JLabel();
        nbExemplaire = new javax.swing.JLabel();
        identifiantLabelValue = new javax.swing.JLabel();
        titreLabelValue = new javax.swing.JLabel();
        categorieLabelValue = new javax.swing.JLabel();
        typeOeuvreLabelValue = new javax.swing.JLabel();
        auteurLabelValue = new javax.swing.JLabel();
        nbExemplaireLabelValue = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ajouterButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        retirerButton = new javax.swing.JButton();
        afficherButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        panExemplaires = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExemplaires = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion Exemplaire");
        setResizable(false);

        jPanel1.setBackground(new Color(102, 204, 153));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        panAjoutOeuvre.setBackground(new java.awt.Color(255, 255, 255));

        pan.setBackground(new Color(0, 204, 153));
        pan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        typeOeuvreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        typeOeuvreLabel.setForeground(new java.awt.Color(0, 0, 255));
        typeOeuvreLabel.setText("Type de l'oeuvre");

        identifiantLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(0, 0, 255));
        identifiantLabel.setText("Identifiant ");

        auteurLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        auteurLabel.setForeground(new java.awt.Color(0, 0, 255));
        auteurLabel.setText("Auteur");

        titreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titreLabel.setForeground(new java.awt.Color(0, 0, 255));
        titreLabel.setText("Titre");

        categorieLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categorieLabel.setForeground(new java.awt.Color(0, 0, 255));
        categorieLabel.setText("Catégorie");

        nbExemplaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nbExemplaire.setForeground(new java.awt.Color(0, 0, 255));
        nbExemplaire.setText("Nombre \nd'exemplaire");

        identifiantLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabelValue.setText("1");

        titreLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titreLabelValue.setText("1");

        categorieLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categorieLabelValue.setText("1");

        typeOeuvreLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        typeOeuvreLabelValue.setText("1");

        auteurLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        auteurLabelValue.setText("1");

        nbExemplaireLabelValue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nbExemplaireLabelValue.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(identifiantLabel)
                        .addGap(18, 18, 18)
                        .addComponent(identifiantLabelValue))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categorieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categorieLabelValue)
                            .addComponent(titreLabelValue))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeOeuvreLabel)
                    .addComponent(nbExemplaire)
                    .addComponent(auteurLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(auteurLabelValue)
                    .addComponent(nbExemplaireLabelValue)
                    .addComponent(typeOeuvreLabelValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeOeuvreLabel)
                            .addComponent(typeOeuvreLabelValue))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(auteurLabel)
                            .addComponent(auteurLabelValue))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbExemplaire)
                            .addComponent(nbExemplaireLabelValue)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identifiantLabel)
                            .addComponent(identifiantLabelValue))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titreLabel)
                            .addComponent(titreLabelValue))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorieLabelValue)
                            .addComponent(categorieLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(51, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ajouterButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ajouterButton.setText("Ajouter");
        ajouterButton.setPreferredSize(new java.awt.Dimension(95, 31));
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        modifierButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modifierButton.setText("Modifier");
        modifierButton.setEnabled(false);
        modifierButton.setPreferredSize(new java.awt.Dimension(95, 31));
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        retirerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        retirerButton.setText("Retirer");
        retirerButton.setEnabled(false);
        retirerButton.setPreferredSize(new java.awt.Dimension(95, 31));
        retirerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirer(evt);
            }
        });

        afficherButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        afficherButton.setText("Afficher");
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficher(evt);
            }
        });

        annulerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afficherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retirerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(afficherButton)
                .addGap(40, 40, 40)
                .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(retirerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(annulerButton)
                .addGap(22, 22, 22))
        );

        panExemplaires.setBackground(new Color(0, 204, 204));
        panExemplaires.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplaires"));

        jScrollPane2.getViewport().setBackground(Color.white);
        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tableExemplaires.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Etat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableExemplaires.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableExemplaires.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableExemplaires);

        javax.swing.GroupLayout panExemplairesLayout = new javax.swing.GroupLayout(panExemplaires);
        panExemplaires.setLayout(panExemplairesLayout);
        panExemplairesLayout.setHorizontalGroup(
            panExemplairesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panExemplairesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2))
        );
        panExemplairesLayout.setVerticalGroup(
            panExemplairesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(panExemplaires, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panExemplaires, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout panAjoutOeuvreLayout = new javax.swing.GroupLayout(panAjoutOeuvre);
        panAjoutOeuvre.setLayout(panAjoutOeuvreLayout);
        panAjoutOeuvreLayout.setHorizontalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panAjoutOeuvreLayout.setVerticalGroup(
            panAjoutOeuvreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutOeuvreLayout.createSequentialGroup()
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titleLabel.setForeground(new Color(0, 0, 0));
        titleLabel.setText("Fiche Oeuvre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(2, 2, 2)
                .addComponent(panAjoutOeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
        Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            AjoutExemplaire ajoutExemplaire = new AjoutExemplaire(null, true, oeuvre);
            ajoutExemplaire.setLocationRelativeTo(null);
            ajoutExemplaire.setVisible(true);
        }
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed

        Exemplaire exemplaire = getExempalireInfos();
        if (null != exemplaire) {
            ModificationExemplaire modificationExemplaire
                    = new ModificationExemplaire(null, true, exemplaire);
            modificationExemplaire.setLocationRelativeTo(null);
            modificationExemplaire.setVisible(true);
        }
    }//GEN-LAST:event_modifierButtonActionPerformed

    private void afficher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficher
        try {
            Oeuvre oeuvre = getOeuvreInfos();
            ArrayList<Exemplaire> listExemplaires = ExemplaireControl.find(oeuvre);
            if (null != listExemplaires) {
                fillExemplaireJtable(listExemplaires);
            } else {
                showMessageSucces("Aucun exemplaire trouvé");
            }

        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionOeuvre.afficherButtonActionPerformed()");
        }
    }//GEN-LAST:event_afficher

    private void retirer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirer
        String message = "\nSupprimer cet exempalaire ?\n"
                + "Cela supprimera aussi tous les emprunts de cet exemplaire\n";

        int reponse = showConfirmDialog(null, message,
                "Avertissement", JOptionPane.OK_CANCEL_OPTION);
        if (reponse == JOptionPane.OK_OPTION) {
            try {
                Exemplaire exemplaire = getExempalireInfos();
                if (null != exemplaire) {
                    EmpruntControl.supprimer(exemplaire);
                    ExemplaireControl.supprimer(exemplaire);
                    ((ModelTableau) tableExemplaires.getModel()).removeRow(tableExemplaires.getSelectedRow());
                    showMessageSucces("L'exemplaire a bien été supprimée");
                    modifierButton.setEnabled(false);
                    retirerButton.setEnabled(false);
                }

            } catch (BibalExceptions ex) {
                System.out.println("IHM.Exemplaires.retirerButtonActionPerformed()" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_retirer

    private Oeuvre getOeuvreInfos() {
        int id = Integer.parseInt(identifiantLabelValue.getText());
        String titre = titreLabelValue.getText();
        String auteur = auteurLabelValue.getText();
        String categorie = categorieLabelValue.getText();
        String typeOeuvre = typeOeuvreLabelValue.getText();
        Oeuvre oeuvre;
        if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
            oeuvre = new Magazine(id, titre, auteur, categorie);
        } else {
            oeuvre = new Livre(id, titre, auteur, categorie);
        }
        return oeuvre;
    }

    private Exemplaire getExempalireInfos() {
        int id = Integer.parseInt(dataLigneSelected[0].toString());
        String etatExemplaire = dataLigneSelected[1].toString();
        return new Exemplaire(id, etatExemplaire);
    }

    private void fillExemplaireJtable(ArrayList<Exemplaire> listExemplaires) {
        String titre[] = new String[]{"ID", "Etat"};
        if (listExemplaires.size() > 0) {
//            pour le findByID si l'objet ajouté est null
            int nbLigne = (null == listExemplaires.get(0)) ? 0 : listExemplaires.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Exemplaire exemplaire = listExemplaires.get(i);
                data[i][0] = exemplaire.getId();
                data[i][1] = exemplaire.getEtat();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableExemplaires.setModel(model);
            tableExemplaires.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableExemplaires.setModel(model);
            tableExemplaires.setRowHeight(1);
        }
        modifierButton.setEnabled(false);
        retirerButton.setEnabled(false);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int row = tableExemplaires.getSelectedRow();
        int nbreCol = tableExemplaires.getColumnCount();

        dataLigneSelected = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableExemplaires.getModel().getValueAt(row, i);
            }
            modifierButton.setEnabled(true);
            retirerButton.setEnabled(true);
        } else {
            modifierButton.setEnabled(false);
            retirerButton.setEnabled(false);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public static void setNbExemplaireLabelValue(String value) {
        GestionExemplaires.nbExemplaireLabelValue.setText(value);
    }

    public static String getNbExemplaireLabelValue() {
        return nbExemplaireLabelValue.getText();
    }

    private Object dataLigneSelected[];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JButton annulerButton;
    private javax.swing.JLabel auteurLabel;
    private javax.swing.JLabel auteurLabelValue;
    private javax.swing.JLabel categorieLabel;
    private javax.swing.JLabel categorieLabelValue;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JLabel identifiantLabelValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifierButton;
    private javax.swing.JLabel nbExemplaire;
    private static javax.swing.JLabel nbExemplaireLabelValue;
    private javax.swing.JPanel pan;
    private javax.swing.JPanel panAjoutOeuvre;
    private javax.swing.JPanel panExemplaires;
    private javax.swing.JButton retirerButton;
    public static javax.swing.JTable tableExemplaires;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JLabel titreLabelValue;
    private javax.swing.JLabel typeOeuvreLabel;
    private javax.swing.JLabel typeOeuvreLabelValue;
    // End of variables declaration//GEN-END:variables
}
