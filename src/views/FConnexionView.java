package views;

import javax.swing.*;
import java.awt.*;
import rojerusan.RSMaterialButtonRectangle;
import utils.WindowManager;

public class FConnexionView extends JFrame {

    private JButton quitterButton;
    private JPanel jPanel1;
    private JLabel jLabel1;
    private RSMaterialButtonRectangle connexionButton;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField passwordField;
    private JTextField userField;

    public FConnexionView() {
        // Configuration de la fenêtre
        setTitle("Connexion");
        WindowManager.setupWindow(this);
        setSize(520, 520);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialisation des composants
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        userField = new JTextField();
        passwordField = new JPasswordField();
        jLabel2 = new JLabel("Nom d'utilisateur :");
        jLabel3 = new JLabel("Mot de passe :");
        connexionButton = new RSMaterialButtonRectangle();

        // Configuration des propriétés des composants
        setPreferredSize(new Dimension(520, 520));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(UIManager.getDefaults().getColor("Actions.Blue"));
        setBounds(new Rectangle(0, 0, 100, 100));
        setForeground(Color.red);
        setPreferredSize(new Dimension(520, 520));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(520, 520));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/views/LogoAichi.png")));
        userField.setHorizontalAlignment(JTextField.CENTER);
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        connexionButton.setBackground(new Color(56, 182, 255));
        connexionButton.setHorizontalAlignment(SwingConstants.CENTER); // Correction : Utiliser SwingConstants
        connexionButton.setText("Se connecter");

        // Utilisation de GroupLayout pour un meilleur contrôle du layout, surtout pour le centrage et le redimensionnement.
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, GroupLayout.Alignment.CENTER) // Centrer le logo
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(userField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                                        .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(connexionButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE) // Le bouton prend sa taille préférée
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(connexionButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack(); // Ajuste la taille de la fenêtre à son contenu
    }

    public JTextField getUserField() {
        return userField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getConnexionButton() {
        return connexionButton;
    }

    public JButton getQuitterButton() {
        return quitterButton;
    }
}
