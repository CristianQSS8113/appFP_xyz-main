package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPalabra;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm10 frame = new frm10();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPalabra = new JLabel("Palabra:");
        lblPalabra.setBounds(50, 30, 100, 30);
        getContentPane().add(lblPalabra);

        txtPalabra = new JTextField();
        txtPalabra.setBounds(150, 30, 100, 30);
        txtPalabra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPalabra);

        lblResultado = new JLabel("Palabra Invertida:");
        lblResultado.setBounds(50, 100, 300, 30);
        getContentPane().add(lblResultado);

        JButton btnInvertir = new JButton("Invertir");
        btnInvertir.setBounds(100, 140, 150, 30);
        getContentPane().add(btnInvertir);

        btnInvertir.addActionListener(e -> btnInvertir_actionPerformed());
    }

    protected void btnInvertir_actionPerformed() {
        String palabra = txtPalabra.getText();
        String resultado = invertirPalabra(palabra);
        lblResultado.setText("Palabra Invertida: " + resultado);
    }

    // para invertir una palabra
    public String invertirPalabra(String palabra) {
        if (palabra.isEmpty()) {
            return palabra; // palabra está vacía se retorna la cadena vacía
        }
        //  toma el último carácter y lo concatena con la inversión del resto de la palabra
        return palabra.charAt(palabra.length() - 1) + invertirPalabra(palabra.substring(0, palabra.length() - 1));
    }
}
