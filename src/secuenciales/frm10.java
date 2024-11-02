package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtNumeroInvertido;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {   
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero (4 cifras):");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblNumeroInvertido = new JLabel("Numero invertido:");
        lblNumeroInvertido.setBounds(50, 90, 120, 30);
        getContentPane().add(lblNumeroInvertido);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtNumeroInvertido = new JTextField();
        txtNumeroInvertido.setBounds(180, 90, 80, 30);
        txtNumeroInvertido.setFocusable(false);
        txtNumeroInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroInvertido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroInvertido);

        JButton btnInvertir = new JButton("Invertir");
        btnInvertir.setBounds(100, 150, 100, 30);
        btnInvertir.setMnemonic('i');
        getContentPane().add(btnInvertir);

        btnInvertir.addActionListener(e -> btnInvertir_actionPerformed());
    }

    protected void btnInvertir_actionPerformed() {
            int numero = Integer.parseInt(txtNumero.getText());
            int millar = numero / 1000;
            int centena = (numero / 100) % 10;
            int decena = (numero / 10) % 10;
            int unidad = numero % 10;

            int numeroInvertido = unidad * 1000 + decena * 100 + centena * 10 + millar;
            txtNumeroInvertido.setText(String.valueOf(numeroInvertido));
    }
}
