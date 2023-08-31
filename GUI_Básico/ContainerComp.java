
import javax.swing.*;


public class ContainerComp extends JFrameComp{

    public ContainerComp() {
        super("Janela Principal");

        JPanel painel1 = new JPanel();

        this.getContentPane().add(painel1);

               painel1.add(new JLabel("Informe um número"));
               JTextField campo1 = new JTextField("Informe o Valor", 25);
               painel1.add(campo1);
               JButton botao1 = new JButton("Enviar");
               painel1.add(botao1);
               this.setDefaultCloseOperation(2);
               this.pack();
               this.setVisible(true);
               botao1.addActionListener(e->{
               int quant = Integer.parseInt(campo1.getText());
               for (int i = 0; i < quant; i++) {
                painel1.add(new JButton("" + i));

               }

               this.pack();

               }
               );
                

              


         

    }



}