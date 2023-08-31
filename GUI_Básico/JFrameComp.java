import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.FlowLayout;

public class JFrameComp extends JFrameEx{
    public JFrameComp(String string) {
        super("Janela Pricipal");
        this.setBounds(500, 250, 500, 500);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        for (int i = 0; i < 100; i++) {
            this.add(new JButton("" +i));

            this.setDefaultCloseOperation(2);
            this.setVisible(true);
            
        }
    }
    
}
