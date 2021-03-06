
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import jdk.internal.org.objectweb.asm.Opcodes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Login extends javax.swing.JFrame {

    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    
    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        tf_id.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_id = new javax.swing.JDialog();
        dp_showTop = new javax.swing.JPanel();
        b_exit1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dp_showBot = new javax.swing.JPanel();
        dl_message = new javax.swing.JLabel();
        db_back = new javax.swing.JButton();
        d_pw = new javax.swing.JDialog();
        dp_showTop1 = new javax.swing.JPanel();
        b_exit2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dp_showBot1 = new javax.swing.JPanel();
        dl_message1 = new javax.swing.JLabel();
        db_back1 = new javax.swing.JButton();
        p_top = new javax.swing.JPanel();
        l_main = new javax.swing.JLabel();
        b_min = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        p_input = new javax.swing.JPanel();
        l_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        l_pw = new javax.swing.JLabel();
        b_login = new javax.swing.JButton();
        b_register = new javax.swing.JButton();
        b_idpw = new javax.swing.JButton();
        tf_pw = new javax.swing.JPasswordField();

        d_id.setBounds(760, 420, 400, 240);
        d_id.setAlwaysOnTop(true);
        d_id.setUndecorated(true);
        d_id.setPreferredSize(new java.awt.Dimension(400, 240));

        dp_showTop.setBackground(new java.awt.Color(243, 156, 18));

        b_exit1.setBackground(new java.awt.Color(255, 51, 51));
        b_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exit1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("오류");

        javax.swing.GroupLayout dp_showTopLayout = new javax.swing.GroupLayout(dp_showTop);
        dp_showTop.setLayout(dp_showTopLayout);
        dp_showTopLayout.setHorizontalGroup(
            dp_showTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(dp_showTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dp_showTopLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        dp_showTopLayout.setVerticalGroup(
            dp_showTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showTopLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(b_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dp_showTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dp_showTopLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        dp_showBot.setBackground(new java.awt.Color(103, 128, 159));

        dl_message.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        dl_message.setForeground(new java.awt.Color(255, 255, 255));
        dl_message.setText("아이디를 확인해 주세요.");

        db_back.setBackground(new java.awt.Color(65, 131, 215));
        db_back.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        db_back.setForeground(new java.awt.Color(255, 255, 255));
        db_back.setText("뒤로가기");
        db_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dp_showBotLayout = new javax.swing.GroupLayout(dp_showBot);
        dp_showBot.setLayout(dp_showBotLayout);
        dp_showBotLayout.setHorizontalGroup(
            dp_showBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showBotLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(dp_showBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showBotLayout.createSequentialGroup()
                        .addComponent(dl_message)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showBotLayout.createSequentialGroup()
                        .addComponent(db_back)
                        .addGap(131, 131, 131))))
        );
        dp_showBotLayout.setVerticalGroup(
            dp_showBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showBotLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dl_message)
                .addGap(34, 34, 34)
                .addComponent(db_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_idLayout = new javax.swing.GroupLayout(d_id.getContentPane());
        d_id.getContentPane().setLayout(d_idLayout);
        d_idLayout.setHorizontalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_showBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dp_showTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        d_idLayout.setVerticalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_idLayout.createSequentialGroup()
                .addComponent(dp_showTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_showBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d_id.setBounds(760, 420, 400, 240);
        d_pw.setAlwaysOnTop(true);
        d_pw.setUndecorated(true);
        d_pw.setPreferredSize(new java.awt.Dimension(400, 240));

        dp_showTop1.setBackground(new java.awt.Color(243, 156, 18));

        b_exit2.setBackground(new java.awt.Color(255, 51, 51));
        b_exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exit2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("오류");

        javax.swing.GroupLayout dp_showTop1Layout = new javax.swing.GroupLayout(dp_showTop1);
        dp_showTop1.setLayout(dp_showTop1Layout);
        dp_showTop1Layout.setHorizontalGroup(
            dp_showTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showTop1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(dp_showTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dp_showTop1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        dp_showTop1Layout.setVerticalGroup(
            dp_showTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showTop1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(b_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dp_showTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dp_showTop1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        dp_showBot1.setBackground(new java.awt.Color(103, 128, 159));

        dl_message1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        dl_message1.setForeground(new java.awt.Color(255, 255, 255));
        dl_message1.setText("비밀번호를 확인해 주세요.");

        db_back1.setBackground(new java.awt.Color(65, 131, 215));
        db_back1.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        db_back1.setForeground(new java.awt.Color(255, 255, 255));
        db_back1.setText("뒤로가기");
        db_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dp_showBot1Layout = new javax.swing.GroupLayout(dp_showBot1);
        dp_showBot1.setLayout(dp_showBot1Layout);
        dp_showBot1Layout.setHorizontalGroup(
            dp_showBot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showBot1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(dp_showBot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showBot1Layout.createSequentialGroup()
                        .addComponent(db_back1)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_showBot1Layout.createSequentialGroup()
                        .addComponent(dl_message1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        dp_showBot1Layout.setVerticalGroup(
            dp_showBot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_showBot1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dl_message1)
                .addGap(34, 34, 34)
                .addComponent(db_back1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_pwLayout = new javax.swing.GroupLayout(d_pw.getContentPane());
        d_pw.getContentPane().setLayout(d_pwLayout);
        d_pwLayout.setHorizontalGroup(
            d_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_showBot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dp_showTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        d_pwLayout.setVerticalGroup(
            d_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_pwLayout.createSequentialGroup()
                .addComponent(dp_showTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_showBot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        p_top.setBackground(new java.awt.Color(241, 194, 125));

        l_main.setBackground(new java.awt.Color(241, 194, 125));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        l_id.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        l_id.setForeground(new java.awt.Color(255, 255, 255));
        l_id.setText("      ID       :");

        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        l_pw.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        l_pw.setForeground(new java.awt.Color(255, 255, 255));
        l_pw.setText("PASSWORD :");

        b_login.setBackground(new java.awt.Color(65, 131, 215));
        b_login.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        b_login.setForeground(new java.awt.Color(255, 255, 255));
        b_login.setText("로그인");
        b_login.setPreferredSize(new java.awt.Dimension(105, 40));
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        b_register.setBackground(new java.awt.Color(240, 52, 52));
        b_register.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        b_register.setForeground(new java.awt.Color(255, 255, 255));
        b_register.setText("회원가입");
        b_register.setPreferredSize(new java.awt.Dimension(129, 40));
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });

        b_idpw.setBackground(new java.awt.Color(0, 177, 106));
        b_idpw.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        b_idpw.setForeground(new java.awt.Color(255, 255, 255));
        b_idpw.setText("아이디 / 비밀번호 찾기");
        b_idpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idpwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_inputLayout = new javax.swing.GroupLayout(p_input);
        p_input.setLayout(p_inputLayout);
        p_inputLayout.setHorizontalGroup(
            p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inputLayout.createSequentialGroup()
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_inputLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(l_pw)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_inputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l_id, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_pw)
                    .addComponent(b_idpw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_inputLayout.createSequentialGroup()
                        .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        p_inputLayout.setVerticalGroup(
            p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inputLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(p_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(b_idpw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    private void b_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registerActionPerformed
        new Register().setVisible(true);
    }//GEN-LAST:event_b_registerActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_idpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idpwActionPerformed
        new IdPw().setVisible(true);
    }//GEN-LAST:event_b_idpwActionPerformed

    private void b_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_minActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_b_minActionPerformed

    private void b_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exit1ActionPerformed
        d_id.dispose();
    }//GEN-LAST:event_b_exit1ActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        String id = tf_id.getText();
        if (id.length() == 0 || id.trim().equals("")){
            d_id.setVisible(true);
            db_back.requestFocus();
        }
    }//GEN-LAST:event_tf_idActionPerformed

    private void db_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_backActionPerformed
        d_id.setVisible(false);
    }//GEN-LAST:event_db_backActionPerformed

    private void b_exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_exit2ActionPerformed

    private void db_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_back1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_db_back1ActionPerformed

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_loginActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_exit1;
    private javax.swing.JButton b_exit2;
    private javax.swing.JButton b_idpw;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_min;
    private javax.swing.JButton b_register;
    private javax.swing.JDialog d_id;
    private javax.swing.JDialog d_pw;
    private javax.swing.JButton db_back;
    private javax.swing.JButton db_back1;
    private javax.swing.JLabel dl_message;
    private javax.swing.JLabel dl_message1;
    private javax.swing.JPanel dp_showBot;
    private javax.swing.JPanel dp_showBot1;
    private javax.swing.JPanel dp_showTop;
    private javax.swing.JPanel dp_showTop1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_main;
    private javax.swing.JLabel l_pw;
    private javax.swing.JPanel p_input;
    private javax.swing.JPanel p_top;
    private javax.swing.JTextField tf_id;
    private javax.swing.JPasswordField tf_pw;
    // End of variables declaration//GEN-END:variables
}
