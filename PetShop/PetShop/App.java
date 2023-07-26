package JavaPt2.PetShop;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class App {
  

    public static void main(String[] args) {

        Cat gatin[] = new Cat[10];
        Dog doguin[] = new Dog[10];
        boolean bixin = true;
        int contCat = 0;
        int contDog = 0;


        while (bixin) {
            int action = Integer.parseInt(JOptionPane.showInputDialog("Seu animal é de qual espécie"
            + "\n 1-Gato"
            + "\n 2-Cachorro"
            + "\n 3-Coelho"
            
            ));
            

            if (action==1) {
            gatin[contCat] = new Cat();
            gatin[contCat].setNome(JOptionPane.showInputDialog("Informe o nome do gatinho"));
            gatin[contCat].setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do gatinho")));
            gatin[contCat].setPorte(JButton.BORDER_PAINTED_CHANGED_PROPERTY);
                
            }

            if (action==2) {
            


                
            } else {
                
            }
        }

        

    }
}
