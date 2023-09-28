package Card;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cardzin {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JTextField emailField;
    private JPasswordField passwordField;

    public Cardzin() {
        frame = new JFrame("Página simples blabla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(240, 260);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Página inicial
        JPanel homePanel = new JPanel();
        JLabel homeLabel = new JLabel("Bem-vindo à página inicial");
        homePanel.add(homeLabel);

        // Página de cadastro
        JPanel registerPanel = new JPanel();
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton registerButton = new JButton("Cadastrar");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar lógica para processar o cadastro
            }
        });
        registerPanel.add(new JLabel("Email: "));
        registerPanel.add(emailField);
        registerPanel.add(new JLabel("Senha: "));
        registerPanel.add(passwordField);
        registerPanel.add(registerButton);

        // Página de login
        JPanel loginPanel = new JPanel();
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar lógica para processar o login
            }
        });
        loginPanel.add(new JLabel("Email: "));
        loginPanel.add(emailField);
        loginPanel.add(new JLabel("Senha: "));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        // Adicionar cartões ao painel
        cardPanel.add(homePanel, "home");
        cardPanel.add(registerPanel, "register");
        cardPanel.add(loginPanel, "login");

        frame.add(cardPanel);

        // Botões de navegação entre páginas
        JButton registerButtonNav = new JButton("Cadastro");
        JButton loginButtonNav = new JButton("Login");
        JButton pagButton = new JButton("Página de ínicio");
        

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registerButtonNav);
        buttonPanel.add(pagButton);
        buttonPanel.add(loginButtonNav);
      

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Configurar ação do botão de cadastro
        registerButtonNav.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "register");
            }
        });

        // Configurar ação do botão de login
        loginButtonNav.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "login");
            }
        });

        pagButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                cardLayout.show(cardPanel, "home" );
            }
        });

        // Tornar o frame visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cardzin();
            }
        });
    }
}
