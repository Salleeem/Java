import javax.swing.JFrame;


public class JFrameEx extends JFrame{
    public JFrameEx() {
        super("Minha Primiera janela JFrame GUISwing");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JFrameEx(String string) {
    }
}
