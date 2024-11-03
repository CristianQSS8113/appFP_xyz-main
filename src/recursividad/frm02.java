package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm02 frame = new frm02();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm02() {
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

        JButton btnComprobar = new JButton("Comprobar");
        btnComprobar.setBounds(100, 140, 120, 30);
        getContentPane().add(btnComprobar);

        btnComprobar.addActionListener(e -> btnComprobar_actionPerformed());
    }

    protected void btnComprobar_actionPerformed() {
        String numero = txtNumero.getText();
        if (numero.isEmpty()) {
            lblResultado.setText("Por favor, ingrese un número.");
            return;
        }

        boolean esBinario = esNumeroBinario(numero);
        lblResultado.setText(esBinario ? "El número es binario." : "El número no es binario.");
    }

    // Método recursivo para comprobar si un número es binario
    public boolean esNumeroBinario(String numero) {
        return esNumeroBinarioRecursivo(numero, 0);
    }

    private boolean esNumeroBinarioRecursivo(String numero, int index) {
        if (index >= numero.length()) return true;
        return (numero.charAt(index) == '0' || numero.charAt(index) == '1') &&
            esNumeroBinarioRecursivo(numero, index + 1);
    }
}
