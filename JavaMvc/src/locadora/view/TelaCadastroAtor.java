/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

/**
 *
 * @author Usuario
 */
public class TelaCadastroAtor extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAtor
     */
    public TelaCadastroAtor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Titulo = new javax.swing.JLabel();
        jPanel1CadastroAtor = new javax.swing.JPanel();
        jLabel1Nome = new javax.swing.JLabel();
        jTextField1Nome = new javax.swing.JTextField();
        jLabel1Nacionalidade = new javax.swing.JLabel();
        jComboBox1Nacionalidade = new javax.swing.JComboBox<>();
        jButton1Salvar = new javax.swing.JButton();
        jButton1Limpar = new javax.swing.JButton();
        jButton1Cancelar = new javax.swing.JButton();
        jButton1Consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vídeo locadora Hora da Pipoca");
        setResizable(false);

        jLabel1Titulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabel1Titulo.setText("Cadastro de Ator");

        jPanel1CadastroAtor.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1Nome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1Nome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Nome.setText("Nome:");

        jTextField1Nome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField1Nome.setToolTipText("Informe o nome do ator");

        jLabel1Nacionalidade.setFont(jLabel1Nacionalidade.getFont().deriveFont(jLabel1Nacionalidade.getFont().getSize()+6f));
        jLabel1Nacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Nacionalidade.setText("Nacionalidade:");

        jComboBox1Nacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma nacionalidade", "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
        jComboBox1Nacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1NacionalidadeActionPerformed(evt);
            }
        });

        jButton1Salvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Salvar.setText("Salvar");

        jButton1Limpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Limpar.setText("Limpar");
        jButton1Limpar.setToolTipText("");

        jButton1Cancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Cancelar.setText("Cancelar");

        jButton1Consultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1Consultar.setText("Consultar");

        javax.swing.GroupLayout jPanel1CadastroAtorLayout = new javax.swing.GroupLayout(jPanel1CadastroAtor);
        jPanel1CadastroAtor.setLayout(jPanel1CadastroAtorLayout);
        jPanel1CadastroAtorLayout.setHorizontalGroup(
            jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1CadastroAtorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1CadastroAtorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1Nome))
                    .addGroup(jPanel1CadastroAtorLayout.createSequentialGroup()
                        .addComponent(jLabel1Nacionalidade)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1CadastroAtorLayout.createSequentialGroup()
                        .addComponent(jButton1Salvar)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1Limpar)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1Cancelar)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1Consultar))
                    .addComponent(jTextField1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel1CadastroAtorLayout.setVerticalGroup(
            jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1CadastroAtorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nome)
                    .addComponent(jTextField1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1Nacionalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1Nacionalidade))
                .addGap(70, 70, 70)
                .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel1CadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1Consultar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1CadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1Titulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1CadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1NacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1NacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1NacionalidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAtor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancelar;
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JButton jButton1Limpar;
    private javax.swing.JButton jButton1Salvar;
    private javax.swing.JComboBox<String> jComboBox1Nacionalidade;
    private javax.swing.JLabel jLabel1Nacionalidade;
    private javax.swing.JLabel jLabel1Nome;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JPanel jPanel1CadastroAtor;
    private javax.swing.JTextField jTextField1Nome;
    // End of variables declaration//GEN-END:variables
}