package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm07 frame = new frm07();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 100, 300, 30);
        getContentPane().add(lblResultado);

        JButton btnComprobar = new JButton("Comprobar Palíndromo");
        btnComprobar.setBounds(100, 140, 180, 30);
        getContentPane().add(btnComprobar);

        btnComprobar.addActionListener(e -> btnComprobar_actionPerformed());
    }

    protected void btnComprobar_actionPerformed() {
        String numero = txtNumero.getText();

        if (numero.isEmpty()) {
            lblResultado.setText("Por favor, ingrese un número.");
            return;
        }

        boolean esPalindromo = esNumeroPalindromo(numero);
        lblResultado.setText(esPalindromo ? "El número es palíndromo." : "El número no es palíndromo.");
    }

    // Método recursivo para comprobar si un número es palíndromo (igual de izquierda a derecha)
    public boolean esNumeroPalindromo(String numero) {
        return esNumeroPalindromoRecursivo(numero, 0, numero.length() - 1);
    }

    private boolean esNumeroPalindromoRecursivo(String numero, int inicio, int fin) {
        if (inicio >= fin) return true; // Caso base: todos los caracteres han sido comparados
        return (numero.charAt(inicio) == numero.charAt(fin)) &&
            esNumeroPalindromoRecursivo(numero, inicio + 1, fin - 1);
    }
}
