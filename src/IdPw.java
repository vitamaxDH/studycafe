/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class IdPw extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public IdPw() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_top = new javax.swing.JPanel();
        l_main = new javax.swing.JLabel();
        b_min = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        p_input = new javax.swing.JPanel();
        p_id = new javax.swing.JPanel();
        l_title = new javax.swing.JLabel();
        b_idFind = new javax.swing.JButton();
        l_tel2 = new javax.swing.JLabel();
        cb_telid = new javax.swing.JComboBox<>();
        tf_telid = new javax.swing.JTextField();
        tf_telid2 = new javax.swing.JTextField();
        p_pw = new javax.swing.JPanel();
        l_title2 = new javax.swing.JLabel();
        l_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        b_pwFind = new javax.swing.JButton();
        l_tel1 = new javax.swing.JLabel();
        cb_telpw = new javax.swing.JComboBox<>();
        tf_telpw = new javax.swing.JTextField();
        tf_telpw2 = new javax.swing.JTextField();
        b_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        p_top.setBackground(new java.awt.Color(241, 194, 125));

        l_main.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        l_main.setForeground(new java.awt.Color(255, 255, 255));
        l_main.setText("강남 IT 스터디 카페");

        b_min.setBackground(new java.awt.Color(0, 102, 255));
        b_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minActionPerformed(evt);
            }
        });

        b_exit.setBackground(new java.awt.Color(255, 51, 51));
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_topLayout = new javax.swing.GroupLayout(p_top);
        p_top.setLayout(p_topLayout);
        p_topLayout.setHorizontalGroup(
            p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_topLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(l_main, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(b_min, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        p_topLayout.setVerticalGroup(
            p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_topLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_min, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        p_input.setBackground(new java.awt.Color(52, 73, 94));
        p_input.setPreferredSize(new java.awt.Dimension(755, 550));

        p_id.setBackground(new java.awt.Color(107, 185, 240));
        p_id.setPreferredSize(new java.awt.Dimension(250, 300));

        l_title.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        l_title.setForeground(new java.awt.Color(255, 255, 255));
        l_title.setText("아이디");

        b_idFind.setBackground(new java.awt.Color(37, 116, 169));
        b_idFind.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        b_idFind.setForeground(new java.awt.Color(255, 255, 255));
        b_idFind.setText("검색하기");

        l_tel2.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        l_tel2.setForeground(new java.awt.Color(255, 255, 255));
        l_tel2.setText("TEL");

        cb_telid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "010", "011", "016", "017","018","019" }));

        javax.swing.GroupLayout p_idLayout = new javax.swing.GroupLayout(p_id);
        p_id.setLayout(p_idLayout);
        p_idLayout.setHorizontalGroup(
            p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_idLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_idLayout.createSequentialGroup()
                        .addComponent(b_idFind, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_idLayout.createSequentialGroup()
                        .addComponent(l_title)
                        .addGap(80, 80, 80))))
            .addGroup(p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_idLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(l_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(cb_telid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_telid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_telid2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        p_idLayout.setVerticalGroup(
            p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_idLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l_title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_idFind, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_idLayout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addGroup(p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_telid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_telid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_telid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        p_pw.setBackground(new java.awt.Color(107, 185, 240));

        l_title2.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        l_title2.setForeground(new java.awt.Color(255, 255, 255));
        l_title2.setText("비밀번호");

        l_id.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        l_id.setForeground(new java.awt.Color(255, 255, 255));
        l_id.setText("ID");

        b_pwFind.setBackground(new java.awt.Color(37, 116, 169));
        b_pwFind.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        b_pwFind.setForeground(new java.awt.Color(255, 255, 255));
        b_pwFind.setText("검색하기");

        l_tel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        l_tel1.setForeground(new java.awt.Color(255, 255, 255));
        l_tel1.setText("TEL");

        cb_telpw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "010", "011", "016", "017","018","019" }));

        javax.swing.GroupLayout p_pwLayout = new javax.swing.GroupLayout(p_pw);
        p_pw.setLayout(p_pwLayout);
        p_pwLayout.setHorizontalGroup(
            p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pwLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_pwLayout.createSequentialGroup()
                        .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_id))
                        .addGap(12, 12, 12)
                        .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_pwLayout.createSequentialGroup()
                                .addComponent(cb_telpw, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_telpw, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_telpw2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_id))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pwLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pwLayout.createSequentialGroup()
                                .addComponent(b_pwFind, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pwLayout.createSequentialGroup()
                                .addComponent(l_title2)
                                .addGap(62, 62, 62))))))
        );
        p_pwLayout.setVerticalGroup(
            p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pwLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(l_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_telpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_telpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_telpw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(b_pwFind, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        b_back.setBackground(new java.awt.Color(255, 51, 51));
        b_back.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        b_back.setForeground(new java.awt.Color(255, 255, 255));
        b_back.setText("뒤로가기");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_inputLayout = new javax.swing.GroupLayout(p_input);
        p_input.setLayout(p_inputLayout);
        p_inputLayout.setHorizontalGroup(
            p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inputLayout.createSequentialGroup()
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_inputLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(p_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_inputLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(b_back)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        p_inputLayout.setVerticalGroup(
            p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inputLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_id, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(p_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(b_back)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_input, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_input, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        dispose();
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        dispose();
    }//GEN-LAST:event_b_backActionPerformed

    private void b_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_b_minActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdPw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_idFind;
    private javax.swing.JButton b_min;
    private javax.swing.JButton b_pwFind;
    private javax.swing.JComboBox<String> cb_telid;
    private javax.swing.JComboBox<String> cb_telpw;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_main;
    private javax.swing.JLabel l_tel1;
    private javax.swing.JLabel l_tel2;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel l_title2;
    private javax.swing.JPanel p_id;
    private javax.swing.JPanel p_input;
    private javax.swing.JPanel p_pw;
    private javax.swing.JPanel p_top;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_telid;
    private javax.swing.JTextField tf_telid2;
    private javax.swing.JTextField tf_telpw;
    private javax.swing.JTextField tf_telpw2;
    // End of variables declaration//GEN-END:variables
}
