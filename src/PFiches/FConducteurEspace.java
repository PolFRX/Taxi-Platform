package PFiches;

import java.io.IOException; //pour gérer les erreurs de fichier
import javax.swing.JOptionPane; //Pour afficher des messages
import projetvtc.Utilisateur; //Pour gérer les utilisateurs et les conducteurs
import projetvtc.Conducteur;

public class FConducteurEspace extends javax.swing.JDialog {

    private Utilisateur Conducteur; //Variable qui stockera le conducteur qui se connecte ou s'inscrit

    public FConducteurEspace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Conducteur = null; //On initialise le conducteur
    }

    public void initCond(Conducteur C) { //Pour récupérer le conducteur qui se connecte ou s'inscrit
        Conducteur = C;
        lMsg.setText("Bienvenue " + Conducteur.getNom() + "."); //On personnalise le message de bienvenue
        (((Accueil) getParent()).getFicheDispo()).initCond(C); //On envoie les infos du conducteurs à la fiche des disponibilités
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lMsg = new javax.swing.JLabel();
        bDispo = new javax.swing.JButton();
        bProfil = new javax.swing.JButton();
        bDeconnexion = new javax.swing.JButton();
        bAvis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        bDispo.setText("Gérer ses disponibilités");
        bDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDispoActionPerformed(evt);
            }
        });

        bProfil.setText("Modifier son profil");
        bProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfilActionPerformed(evt);
            }
        });

        bDeconnexion.setText("se déconnecter");
        bDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeconnexionActionPerformed(evt);
            }
        });

        bAvis.setText("Consulter ses avis");
        bAvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lMsg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bDeconnexion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAvis, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDispo)
                            .addComponent(bProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(bDispo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bProfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAvis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(bDeconnexion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeconnexionActionPerformed
        Conducteur = null; //On réinitialise l'objet conducteur puis on affiche la page précédente
        this.setVisible(false);
        ((Accueil) getParent()).getFicheC().setVisible(true);
    }//GEN-LAST:event_bDeconnexionActionPerformed

    private void bDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDispoActionPerformed
        this.setVisible(false); //On rend invisible cette page et on affiche la page des disponibilités
        ((Accueil) getParent()).getFicheDispo().setVisible(true);
    }//GEN-LAST:event_bDispoActionPerformed

    private void bProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfilActionPerformed
        this.setVisible(false); //On rend invisible cette page et on affiche la page du profil du conducteur
        ((Accueil) getParent()).getFicheProfilCond().setVisible(true);
    }//GEN-LAST:event_bProfilActionPerformed

    private void bAvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvisActionPerformed
        this.setVisible(false); //On rend invisible cette page et on affiche la page des avis
        ((Accueil) getParent()).getFicheAvisCond().setVisible(true);
    }//GEN-LAST:event_bAvisActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            (((Accueil) getParent()).getSite()).sauvegarde(); //On sauvegarde toutes les infos tout en gérant les possibles problèmes
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erreur inconnue de sauvegarde.");
        } finally {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FConducteurEspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FConducteurEspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FConducteurEspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FConducteurEspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FConducteurEspace dialog = new FConducteurEspace(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAvis;
    private javax.swing.JButton bDeconnexion;
    private javax.swing.JButton bDispo;
    private javax.swing.JButton bProfil;
    private javax.swing.JLabel lMsg;
    // End of variables declaration//GEN-END:variables
}
