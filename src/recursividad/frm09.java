package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm09 frame = new frm09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm09() {
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

        lblResultado = new JLabel("Cantidad de dígitos:");
        lblResultado.setBounds(50, 100, 300, 30);
        getContentPane().add(lblResultado);

        JButton btnCalcular = new JButton("Contar Dígitos");
        btnCalcular.setBounds(100, 140, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String numeroStr = txtNumero.getText();
        if (!numeroStr.matches("\\d+")) {
            lblResultado.setText("Por favor, ingrese un número entero positivo.");
            return;
        }
        
        int numero = Integer.parseInt(numeroStr);
        int cantidadDígitos = contarDigitos(numero);
        lblResultado.setText("Cantidad de dígitos: " + cantidadDígitos);
    }

    //para contar los dígitos de un número
    public int contarDigitos(int n) {
        if (n == 0) return 0; //  base: si n es 0, no hay dígitos
        return 1 + contarDigitos(n / 10); 
    }
}
