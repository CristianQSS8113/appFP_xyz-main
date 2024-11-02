package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtSumaCifras;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero (4 cifras):");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblSumaCifras = new JLabel("Suma de cifras:");
        lblSumaCifras.setBounds(50, 90, 120, 30);
        getContentPane().add(lblSumaCifras);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtSumaCifras = new JTextField();
        txtSumaCifras.setBounds(180, 90, 80, 30);
        txtSumaCifras.setFocusable(false);
        txtSumaCifras.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSumaCifras.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSumaCifras);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
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

            int sumaCifras = unidad + decena + centena + millar;
            txtSumaCifras.setText(String.valueOf(sumaCifras));

    }
}