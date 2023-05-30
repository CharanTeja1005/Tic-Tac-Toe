
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author awesome_star
 */
public class TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    boolean clicked[] = new boolean[10];
    
    public TicTacToe() {
        initComponents();
    }
    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
            startGame = "O";
        else
            startGame = "X";
    }
    
    private void winningGame()
    {
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic2.getText();
        String b3 = jbtnTic3.getText();
        String b4 = jbtnTic4.getText();
        String b5 = jbtnTic5.getText();
        String b6 = jbtnTic6.getText();
        String b7 = jbtnTic7.getText();
        String b8 = jbtnTic8.getText();
        String b9 = jbtnTic9.getText();
        
        boolean res = false;
        
        //        1st Horizantal Row
        if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
        {
            jbtnTic1.setBackground(Color.RED);
            jbtnTic2.setBackground(Color.RED);
            jbtnTic3.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b1.equals("O") && b2.equals("O") && b3.equals("O"))
        {
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic3.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        2nd Horizantal Row
        else if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
        {
            jbtnTic4.setBackground(Color.RED);
            jbtnTic5.setBackground(Color.RED);
            jbtnTic6.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
        {
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        3rd Horizantal Row
        else if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
        {
            jbtnTic7.setBackground(Color.RED);
            jbtnTic8.setBackground(Color.RED);
            jbtnTic9.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
        {
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        1st Vertical Row
        else if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
        {
            jbtnTic1.setBackground(Color.RED);
            jbtnTic4.setBackground(Color.RED);
            jbtnTic7.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
        {
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        2nd Vertical Row
        else if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
        {
            jbtnTic2.setBackground(Color.RED);
            jbtnTic5.setBackground(Color.RED);
            jbtnTic8.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
        {
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        3rd Vertical Row
        else if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
        {
            jbtnTic3.setBackground(Color.RED);
            jbtnTic6.setBackground(Color.RED);
            jbtnTic9.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
        {
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        1st Diagonal
        else if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
        {
            jbtnTic1.setBackground(Color.RED);
            jbtnTic5.setBackground(Color.RED);
            jbtnTic9.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
        {
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
//        2nd Diagonal
        else if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
        {
            jbtnTic3.setBackground(Color.RED);
            jbtnTic5.setBackground(Color.RED);
            jbtnTic7.setBackground(Color.RED);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            res = true;
        }
        
        else if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
        {
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            
            res = true;
        }
        
        if(res)
            clear();
        
        if(!res && !(b1.length() == 0) && !(b2.length() == 0) && !(b3.length() == 0) && !(b4.length() == 0) && !(b5.length() == 0) && !(b6.length() == 0) && !(b7.length() == 0) && !(b8.length() == 0) && !(b9.length() == 0))
        {
            JOptionPane.showMessageDialog(this, "Draw Match!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
    }
    
    private void clear()
    {
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        allFalse();
    }
    
    private void allFalse()
    {
        for(int i=1;i<=9;i++)
            clicked[i] = false;
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
        jPanel2 = new javax.swing.JPanel();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        jbtnTic1.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });

        jbtnTic3.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });

        jbtnTic4.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });

        jbtnTic2.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });

        jbtnTic7.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });

        jbtnTic5.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });

        jbtnTic8.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });

        jbtnTic6.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });

        jbtnTic9.setFont(new java.awt.Font("Liberation Sans", 0, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jLabel1.setText("Player O :");

        jlblPlayerO.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);

        jlblPlayerX.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jLabel4.setText("Player X :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 500));

        jbtnExit.setFont(new java.awt.Font("Liberation Sans", 0, 70)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnExit.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnExit.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Liberation Sans", 0, 70)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnReset.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnReset.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnNewGame.setFont(new java.awt.Font("Liberation Sans", 0, 70)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(150, 150));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(150, 150));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(150, 150));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jLabel3.setText("TIC TAC TOE GAME");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        if(clicked[5])
            return;
        
        jbtnTic5.setText(startGame);
        clicked[5] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        if(clicked[8])
            return;
        
        jbtnTic8.setText(startGame);
        clicked[8] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        if(clicked[6])
            return;
        
        jbtnTic6.setText(startGame);
        clicked[6] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        if(clicked[9])
            return;
        
        jbtnTic9.setText(startGame);
        clicked[9] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        xCount = 0;
        oCount = 0;
        
        startGame = "X";
        
        clear();
    }//GEN-LAST:event_jbtnNewGameActionPerformed
    
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm ?", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        };
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        clear();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        if(clicked[1])
            return;
        
        jbtnTic1.setText(startGame);
        clicked[1] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        if(clicked[2])
            return;
        
        jbtnTic2.setText(startGame);
        clicked[2] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        if(clicked[3])
            return;
        
        jbtnTic3.setText(startGame);
        clicked[3] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        if(clicked[4])
            return;
        
        jbtnTic4.setText(startGame);
        clicked[4] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        if(clicked[7])
            return;
        
        jbtnTic7.setText(startGame);
        clicked[7] = true;
        
        if(startGame.equalsIgnoreCase("X"))
            checker = false;
        else
            checker = true;
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
