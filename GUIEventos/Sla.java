package GUIEventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

/**
 * ExemploNomeSobrenome
 */
public class Sla extends JFrame {

    //construtor
    public Sla() {
        super("Exemplo 1 Eventos");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        //criar o painel principal -> gridLayout 3x2
        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //criar os componentes
        mainPanel.add(new JLabel("Nome:"));
        JTextField caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Sobrenome:"));
        JTextField caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("Concatenar");
        mainPanel.add(botao);
        JLabel texto = new JLabel();
        mainPanel.add(texto);
        //set frame
        this.setVisible(true);
        //tratamento de Eventos (3 formas)
        // 1ª forma : e->{evento} /callback
        botao.addActionListener(e->{//listener(ouvinte/fofoqueira)
            //evento
            texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        });
        
    }
}