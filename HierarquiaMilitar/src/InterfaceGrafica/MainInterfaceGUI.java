/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import MilitarPackage.Exercito;
import MilitarPackage.ForcaAerea;
import MilitarPackage.Marinha;
import MilitarPackage.Militares;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Douglas
 */
public final class MainInterfaceGUI extends JFrame implements WindowListener
{
    
  
    JLabel lblBackgroundImg = new JLabel();
    protected static ArrayList<Militares> soldados = new ArrayList();
    protected ArrayList<JPanel> frames = new ArrayList();
    private int numeroDeFrames;
    protected JFrame tela2;
    /**
     * Creates new form MainInterfaceGUI
     */
    public MainInterfaceGUI()
    {
        initComponents();
        addImagemFundo();
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
        panelPrincipal = new javax.swing.JPanel();
        jLayeredPanel = new javax.swing.JLayeredPane();
        lblEsquadraoVazio = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));

        lblEsquadraoVazio.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblEsquadraoVazio.setForeground(new java.awt.Color(153, 153, 153));
        lblEsquadraoVazio.setText("Esquadrão Vazio!");
        lblEsquadraoVazio.setBounds(30, 110, 445, 66);
        jLayeredPanel.add(lblEsquadraoVazio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnStart.setText("Adcionar Soldado");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        btnStart.setBounds(30, 450, 167, 63);
        jLayeredPanel.add(btnStart, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
         tela2 = new AdcionarSoldado();
         tela2.addWindowListener(this);
         tela2.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainInterfaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new MainInterfaceGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLayeredPane jLayeredPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEsquadraoVazio;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
   
    public void addImagemFundo()
    {
        
        lblBackgroundImg.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblBackgroundImg.setBounds(0,0,800,600);
        setLblBackgroundImg("background", lblBackgroundImg);
        jLayeredPanel.add(lblBackgroundImg);
        jLayeredPanel.moveToBack(lblBackgroundImg);
        jLayeredPanel.moveToFront(btnStart);
        jLayeredPanel.moveToFront(lblEsquadraoVazio);
    }
    
    
    public void setLblBackgroundImg(String nomeImagem, JLabel label)
    {
       String urlImagem;
       urlImagem = "..\\zMisc\\Imagens\\" + nomeImagem + ".png";
       ImageIcon icone = createImageIcon(urlImagem, nomeImagem);
       if (icone !=null)
       {
            label.setIcon(icone);
            label.setText("");
       }
       else
       {
           label.setText("Erro Imagem Não encontrada" + urlImagem);
       }
    
    }
    protected ImageIcon createImageIcon(String path, String description)
    {
       java.net.URL imgURL = getClass().getResource(path);
       if (imgURL != null) {
           return new ImageIcon(imgURL, description);
       } else {
           return null;
       }
   }
 
    public void setBackgroundSize()
    {
        setBounds(0, 0, 800, 600);
    }
    
    public void adcionarSoldado()
    {
        int tamanhoArray;
        int numeroColunas;
        int numeroLinhas;
        
        JLabel imagem = new JLabel();
        JCheckBox caixaSelecao = new JCheckBox();
        tamanhoArray = soldados.size();
        numeroColunas = (numeroDeFrames+1)/10;
        
        if ((numeroDeFrames+1)%10 == 0)
        {
            numeroLinhas = 0;
        }
        else
        {
            numeroLinhas = numeroDeFrames/(numeroColunas+1);
        }
       
        frames.add(new JPanel());
            
        frames.get(numeroDeFrames).setBounds(30+(60*numeroLinhas), 120+(numeroColunas*110), 50, 110);
        imagem.setBounds(0,0,40,90);
        imagem.setOpaque(false);
        setLblBackgroundImg(getTipoSoldado(soldados.get(tamanhoArray-1)) + "_tiny", imagem);
        caixaSelecao.setBounds(16, 85, 4, 4);
       
        caixaSelecao.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaCaixa(evt);
            }
        });
        
        frames.get(tamanhoArray-1).add(imagem);
        frames.get(tamanhoArray-1).add(caixaSelecao);
        
        jLayeredPanel.add(frames.get(numeroDeFrames));
        jLayeredPanel.moveToFront(frames.get(numeroDeFrames));
        lblEsquadraoVazio.setText("");
        numeroDeFrames++;

    }
    public String getTipoSoldado(Militares milico)
    {
        if (milico instanceof Exercito)
        {
            return "Exercito";
        }
        else if(milico instanceof Marinha)
        {
            return "Marinha";
        }
        else if(milico instanceof ForcaAerea)
        {
            return "Aeronautica";
        }
        return null;
    }

    public void selecionaCaixa(ActionEvent evt){
        
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
    }

    @Override
    public void windowClosed(WindowEvent we) {
        if (we.getWindow().equals(tela2))
        {
            adcionarSoldado();
        }
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }

}


