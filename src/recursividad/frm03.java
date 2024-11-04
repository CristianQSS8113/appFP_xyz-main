package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm03 frame = new frm03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm03() {
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

        JButton btnCalcular = new JButton("Calcular Suma");
        btnCalcular.setBounds(100, 140, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String numeroStr = txtNumero.getText();
        if (numeroStr.isEmpty()) {
            lblResultado.setText("Por favor, ingrese un número.");
            return;
        }

        int numero = Integer.parseInt(numeroStr);
        int suma = sumaDigitos(numero);
        lblResultado.setText("La suma de los dígitos es: " + suma);
    }

    //  para calcular la suma de los dígitos
    public int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + sumaDigitos(numero / 10);
    }
}
