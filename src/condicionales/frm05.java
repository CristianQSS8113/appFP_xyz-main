package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtMayorNumero;

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
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero (4 cifras):");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblMayorNumero = new JLabel("Mayor numero:");
        lblMayorNumero.setBounds(50, 70, 120, 30);
        getContentPane().add(lblMayorNumero);


        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        txtMayorNumero = new JTextField();
        txtMayorNumero.setBounds(180, 70, 100, 30);
        txtMayorNumero.setFocusable(false);
        txtMayorNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMayorNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 120, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int millar = numero / 1000;

        int mayor = millar; 
        if (decena > mayor) mayor = decena;
        if (centena > mayor) mayor = centena;
        if (unidad > mayor) mayor = unidad;

        int menor = millar; 
        if (decena < menor) menor = decena;
        if (centena < menor) menor = centena;
        if (unidad < menor) menor = unidad;

        int mayorNumero = mayor * 10 + menor;

        txtMayorNumero.setText(String.valueOf(mayorNumero));
    }
}
