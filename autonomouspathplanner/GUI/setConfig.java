/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonomouspathplanner.GUI;

import autonomouspathplanner.PositionUtil;
import autonomouspathplanner.calc.TrajectoryGenerator.Config;
/**
 * Helper to change the configuration settings for the robot
 * @author Alex
 */
public class setConfig extends javax.swing.JFrame {
    /**
     * The configuration for the robot
     */
    Config conf;
    /**
     * The parent AutoPathFrame
     */
    AutoPathFrame fr;
    /**
     * Creates new form setConfig
     */
    public setConfig() {
        initComponents();
    }
    
    /**
     * create a setConfig object based on the Config <code>cnfg</code> and the robot wheel base given within the framework of
     * the AutoPathFrame <code>f</code>
     * @param cnfg the configuration to base it off 
     * @param RobotWheelBase the size of the wheelbase
     * @param f the AutoPathFrame it springs from
     */
    public setConfig(Config cnfg, double RobotWheelBase, AutoPathFrame f)
    {
        initComponents();
        conf = cnfg;
        fr = f;
        
        this.max_accel.setText("" + (cnfg.max_acc)*PositionUtil.meters_per_tic);
        this.max_jerk.setText("" + (cnfg.max_jerk)*PositionUtil.meters_per_tic);
        this.max_vel.setText("" + (cnfg.max_vel)*PositionUtil.meters_per_tic);
        this.dt.setText("" + cnfg.dt*1000);
        this.rbt_whlbase.setText("" + (RobotWheelBase)*PositionUtil.meters_per_tic);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        max_vel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        max_accel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        max_jerk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbt_whlbase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setText("Change the Robot Configuration");

        max_vel.setText("0");
        max_vel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_velActionPerformed(evt);
            }
        });

        jLabel2.setText("Robot Maximum Velocity (m/s)");

        max_accel.setText("0");
        max_accel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_accelActionPerformed(evt);
            }
        });

        jLabel3.setText("Robot Maximum Acceleration (m/s^2)");

        max_jerk.setText("0");
        max_jerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_jerkActionPerformed(evt);
            }
        });

        jLabel4.setText("Robot Maximum Jerk (m/s^3)");

        rbt_whlbase.setText("0");
        rbt_whlbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_whlbaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Robot Wheelbase Width (m)");

        dt.setText("0");
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });

        jLabel6.setText("Robot Autonomous Loop Time (ms)");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(rbt_whlbase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(max_jerk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(max_accel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(max_vel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submit)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max_vel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max_accel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max_jerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_whlbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The user wants to send this crap back to the robot
     * @param evt 
     */
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        conf.dt = Double.parseDouble(dt.getText())/1000;
        conf.max_acc = Double.parseDouble(max_accel.getText())/PositionUtil.meters_per_tic;
        conf.max_jerk = Double.parseDouble(max_jerk.getText())/PositionUtil.meters_per_tic;
        conf.max_vel = Double.parseDouble(max_vel.getText())/PositionUtil.meters_per_tic;
        
        fr.cnfg = conf;
        
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    /**
     * Make sure the user doesn't try to set the max jerk to something ridiculous
     * @param evt 
     */
    private void max_jerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max_jerkActionPerformed
        try{
            double d = Double.parseDouble(max_jerk.getText());
        }
        catch(Exception ex)
        {
            max_jerk.setText("0");
        }
    }//GEN-LAST:event_max_jerkActionPerformed

    /**
     * Make sure the user doesn't try to set the max velocity to something ridiculous
     * @param evt 
     */
    private void max_velActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max_velActionPerformed
        try{
            double d = Double.parseDouble(max_vel.getText());
        }
        catch(Exception ex)
        {
            max_vel.setText("0");
        }
    }//GEN-LAST:event_max_velActionPerformed

    /**
     * Make sure the user doesn't try to set the max acceleration to something ridiculous
     * @param evt 
     */
    private void max_accelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_max_accelActionPerformed
        try{
            double d = Double.parseDouble(max_accel.getText());
        }
        catch(Exception ex)
        {
            max_accel.setText("0");
        }
    }//GEN-LAST:event_max_accelActionPerformed

    /**
     * Make sure the user doesn't try to set the robot wheelbase to something ridiculous
     * @param evt 
     */
    private void rbt_whlbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_whlbaseActionPerformed
        try{
            double d = Double.parseDouble(rbt_whlbase.getText());
        }
        catch(Exception ex)
        {
            rbt_whlbase.setText("0");
        }
    }//GEN-LAST:event_rbt_whlbaseActionPerformed

    /**
     * Make sure the user doesn't try to set the delta time to something ridiculous
     * @param evt 
     */
    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        try{
            double d = Double.parseDouble(dt.getText());
        }
        catch(Exception ex)
        {
            dt.setText("0");
        }
    }//GEN-LAST:event_dtActionPerformed

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
            java.util.logging.Logger.getLogger(setConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField max_accel;
    private javax.swing.JTextField max_jerk;
    private javax.swing.JTextField max_vel;
    private javax.swing.JTextField rbt_whlbase;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}