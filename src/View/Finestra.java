package View;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Finestra {
    private JPanel panel1;
    private JButton aggiungiButton;
    private JButton modificaButton;
    private JButton rimuoviButton;
    private JTable tabellaRubrica;
    private JButton importaButton;
    private JButton esportaButton;

    private JFrame frame;

    public Finestra(){
        frame=new JFrame();
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JButton getAggiungiButton() {
        return aggiungiButton;
    }

    public void setAggiungiButton(JButton aggiungiButton) {
        this.aggiungiButton = aggiungiButton;
    }

    public JButton getModificaButton() {
        return modificaButton;
    }

    public void setModificaButton(JButton modificaButton) {
        this.modificaButton = modificaButton;
    }

    public JButton getRimuoviButton() {
        return rimuoviButton;
    }

    public void setRimuoviButton(JButton rimuoviButton) {
        this.rimuoviButton = rimuoviButton;
    }

    public JButton getImportaButton() {
        return importaButton;
    }

    public void setImportaButton(JButton importaButton) {
        this.importaButton = importaButton;
    }

    public JButton getEsportaButton() {
        return esportaButton;
    }

    public void setEsportaButton(JButton esportaButton) {
        this.esportaButton = esportaButton;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    {
        $$$setupUI$$$();
    }
    private void $$$setupUI$$$(){
        panel1=new JPanel();
        panel1.setLayout(new BorderLayout(0,0));
        final JPanel panel2=new JPanel();
        panel2.setLayout(new BorderLayout(0,0));
        final JPanel panel3=new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
        panel2.add(panel3,BorderLayout.WEST);
        final JLabel label1=new JLabel();
        Font label1Font= this.$$$setupUI$$$(null,-1,24,label1.getFont());
        if(label1Font!=null){
            label1.setFont(label1Font);
        }
        label1.setText("Rubrica");
        panel3.add(label1);
        final JPanel panel4=new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.RIGHT,5,5));
        panel2.add(panel4,BorderLayout.CENTER);
        final JToolBar.Separator toolBar$Separator1=new JToolBar.Separator();
        panel4.add(toolBar$Separator1);
        final JToolBar.Separator toolBar$Separator2=new JToolBar.Separator();
        panel4.add(toolBar$Separator2);
        aggiungiButton=new JButton();
        aggiungiButton.setText("Aggiungi");
        panel4.add(aggiungiButton);
        rimuoviButton=new JButton();
        rimuoviButton.setText("Rimuovi");
        panel4.add(rimuoviButton);
        final JToolBar.Separator toolBar$Separator3=new JToolBar.Separator();
        panel4.add(toolBar$Separator3);
        importaButton=new JButton();
        importaButton.setText("Importa");
        panel4.add(importaButton);
        esportaButton=new JButton();
        esportaButton.setText("Esporta");
        panel4.add(esportaButton);
        final JScrollPane scrollPane1=new JScrollPane();
        scrollPane1.setEnabled(true);
        panel1.add(scrollPane1,BorderLayout.CENTER);
        scrollPane1.setBorder(BorderFactory.createTitledBorder(null,"Contatti", TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,null));
        tabellaRubrica=new JTable();
        scrollPane1.setViewportView(tabellaRubrica);
    }

    private Font $$$setupUI$$$(String fontName, int style, int size, Font currentFont) {
        if(currentFont==null){
            return null;
        }
        String resultName;
        if(currentFont==null){
            resultName=currentFont.getName();
        }else{
            Font testFont=new Font(fontName,Font.PLAIN,10);
            if(testFont.canDisplay('a')&&testFont.canDisplay('1')){
                resultName=fontName;
            }else{
                resultName=currentFont.getName();
            }
        }
        return new Font(resultName,style>=0? style:currentFont.getStyle(), size>=0? size : currentFont.getSize());
    }
    public JComponent $$$getRootComponent$$$(){
        return panel1;
    }
}
