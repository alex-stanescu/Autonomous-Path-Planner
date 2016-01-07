/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonomouspathplanner.GUI;

import autonomouspathplanner.GUI.objects.GUIObject;
import autonomouspathplanner.GUI.objects.SmoothLine;
import autonomouspathplanner.GUI.objects.StraightLine;
import autonomouspathplanner.PositionUtil;

/**
 * Helper class that provides UI for the modification of the location of a point to a very specific location
 * @author Alex
 */
public class PointLocChange extends javax.swing.JFrame {
    double x = 0;
    double y = 0;
    
    int objIndex;
    int pointIndex;
    AutoPathCanvas canv;
    
    /**
     * Creates new form PointLocChange
     */
    public PointLocChange() {
        initComponents();
    }
    
    /**
     * Creates a new form to modify the point represented point represented by <code>PointIndex</code> in the line at <code>ObjIndex</code> 
     * in the <code>objs</code> Array of the AutoPathCanvas <code>Canv</code>
     * @param ObjIndex the index of the line where the point exists
     * @param PointIndex the index of the point on the line
     * @param Canv the AutoPathCanvas
     * @throws UnknownClassException if the programmer is a dipshit and the object represented by <code>canv.objs.get(objIndex)</code> is not
     * a StraightLine or a SmoothLine
     */
    public PointLocChange(int ObjIndex, int PointIndex, AutoPathCanvas Canv) throws UnknownClassException
    {
        initComponents();
        objIndex = ObjIndex;
        pointIndex = PointIndex;
        canv = Canv;
        if(!(canv.objs.get(objIndex) instanceof StraightLine || canv.objs.get(objIndex) instanceof SmoothLine)) 
        {
            throw new UnknownClassException("Class " + canv.objs.get(objIndex).getClass().toString()+ " is unsupported");
        }
        GUIObject obj = canv.objs.get(ObjIndex);
        if(obj instanceof StraightLine)
        {
            if(pointIndex == 0)
            {
                x = roundToTwo(((StraightLine)obj).initialPosition.getX());
                y = roundToTwo(((StraightLine)obj).initialPosition.getY());
                xText.setText("" + roundToTwo(x*PositionUtil.meters_per_tic));
                yText.setText("" + roundToTwo((AutoPathCanvas.time_loc_interface_y-y)*PositionUtil.meters_per_tic));
            }
            else 
            {
                x = roundToTwo(((StraightLine)obj).finalPosition.getX());
                y = roundToTwo(((StraightLine)obj).finalPosition.getY());
                xText.setText("" + roundToTwo(x*PositionUtil.meters_per_tic));
                yText.setText("" + roundToTwo((AutoPathCanvas.time_loc_interface_y-y)*PositionUtil.meters_per_tic));
            }
        }
        else if(obj instanceof SmoothLine)
        {
            x = roundToTwo(((SmoothLine)obj).coordinates.get(pointIndex).getX());
            y = roundToTwo(((SmoothLine)obj).coordinates.get(pointIndex).getY());
            xText.setText("" + roundToTwo(x*PositionUtil.meters_per_tic));
            yText.setText("" + roundToTwo((AutoPathCanvas.time_loc_interface_y-y)*PositionUtil.meters_per_tic));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xText = new javax.swing.JTextField();
        yText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xText.setText("0.0");
        xText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTextActionPerformed(evt);
            }
        });

        yText.setText("0.0");
        yText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yTextActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        jLabel2.setText("Y");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel3.setText("Change Location of this Point");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(ok))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The user wants to update the values. Let him/her do that.
     * @param evt 
     */
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try{
            //x = Double.parseDouble(xText.getText())/PositionUtil.meters_per_tic;
            //y = AutoPathCanvas.time_loc_interface_y - Double.parseDouble(yText.getText())/PositionUtil.meters_per_tic;
        }
        catch(NumberFormatException ex)
        {
            return;
        }
        
        GUIObject obj = canv.objs.get(objIndex);
        if(obj instanceof StraightLine)
        {
            System.out.println(pointIndex);
            System.out.println(objIndex);
            StraightLine sl = (StraightLine)obj;
            if(pointIndex == 0)
            {
                sl.initialPosition.setLocation(x, y);
                for(int i = objIndex-1; i>=4; i--)
                {
                    if(canv.objs.get(i) instanceof StraightLine)
                    {
                        ((StraightLine)canv.objs.get(i)).finalPosition.setLocation(x, y);
                        break;
                    }
                    else if(canv.objs.get(i) instanceof SmoothLine)
                    {
                        ((SmoothLine)canv.objs.get(i)).coordinates.get(((SmoothLine)canv.objs.get(i)).coordinates.size()-1).setLocation(x, y);
                        break;
                    }
                }
            }
            else if(pointIndex == 1)
            {
                sl.finalPosition.setLocation(x,y);
                for(int i = objIndex+1; i<canv.objs.size(); i++)
                {
                    if(canv.objs.get(i) instanceof StraightLine)
                    {
                        ((StraightLine)canv.objs.get(i)).initialPosition.setLocation(x, y);
                        break;
                    }
                    else if(canv.objs.get(i) instanceof SmoothLine)
                    {
                        ((SmoothLine)canv.objs.get(i)).coordinates.get(((SmoothLine)canv.objs.get(i)).coordinates.size()-1).setLocation(x, y);
                        break;
                    }
                }
            }
        }
        else
        {
            SmoothLine sl = (SmoothLine)obj;
            sl.coordinates.get(pointIndex).setLocation(x,y);
            if(pointIndex == 0)
            {
                for(int i = objIndex-1; i>=4; i--)
                {
                    if(canv.objs.get(i) instanceof StraightLine)
                    {
                        ((StraightLine)canv.objs.get(i)).finalPosition.setLocation(x, y);
                        break;
                    }
                    else if(canv.objs.get(i) instanceof SmoothLine)
                    {
                        ((SmoothLine)canv.objs.get(i)).coordinates.get(((SmoothLine)canv.objs.get(i)).coordinates.size()-1).setLocation(x, y);
                        break;
                    }
                }
            }
            else if(pointIndex == sl.coordinates.size()-1)
            {
                for(int i = objIndex+1; i<canv.objs.size(); i++)
                {
                    if(canv.objs.get(i) instanceof StraightLine)
                    {
                        ((StraightLine)canv.objs.get(i)).initialPosition.setLocation(x, y);
                        break;
                    }
                    else if(canv.objs.get(i) instanceof SmoothLine)
                    {
                        ((SmoothLine)canv.objs.get(i)).coordinates.get(((SmoothLine)canv.objs.get(i)).coordinates.size()-1).setLocation(x, y);
                        break;
                    }
                }
            }
        }
        canv.repaint();
        this.dispose();
    }//GEN-LAST:event_okActionPerformed

    /**
     * For the sake of robustness, make sure that the user doesn't make a non-double as the x - position
     * @param evt 
     */
    private void xTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTextActionPerformed
        try{
            x = Double.parseDouble(xText.getText())/PositionUtil.meters_per_tic;
        }
        catch(NumberFormatException ex)
        {
            
        }
    }//GEN-LAST:event_xTextActionPerformed

    /**
     * For the sake of robustness, make sure that the user doesn't make a non-double as the y - position
     * @param evt 
     */
    private void yTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yTextActionPerformed
        try{
            y = AutoPathCanvas.time_loc_interface_y - Double.parseDouble(yText.getText())/PositionUtil.meters_per_tic;
        }
        catch(NumberFormatException ex)
        {
            
            
        }
    }//GEN-LAST:event_yTextActionPerformed

    public double roundToTwo(double d)
    {
        double temp = 100*d;
        temp = Math.round(temp);
        return temp/100;
    }
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
            java.util.logging.Logger.getLogger(PointLocChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PointLocChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PointLocChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PointLocChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PointLocChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ok;
    private javax.swing.JTextField xText;
    private javax.swing.JTextField yText;
    // End of variables declaration//GEN-END:variables
}