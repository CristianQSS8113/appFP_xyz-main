package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNumero2);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero2);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 130, 300, 30);
        getContentPane().add(lblResultado);

        JButton btnCalcular = new JButton("Calcular MCD");
        btnCalcular.setBounds(100, 170, 180, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String num1Str = txtNumero1.getText();
        String num2Str = txtNumero2.getText();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            lblResultado.setText("Por favor, ingrese dos números.");
            return;
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int resultado = mcd(num1, num2);
        lblResultado.setText("MCD de " + num1 + " y " + num2 + " es: " + resultado);
    }

    // Método recursivo para calcular el MCD usando el algoritmo de Euclides
    public int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
}
