package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
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
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(50, 100, 300, 30);
		getContentPane().add(lblResultado);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 140, 100, 30);
		btnCalcular.setMnemonic('c');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		boolean esPrimo = true;

		// Verificar si el número es primo
		if (numero <= 1) {
			esPrimo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		// Mostrar resultado
		if (esPrimo) {
			lblResultado.setText("El número " + numero + " es primo.");
		} else {
			lblResultado.setText("El número " + numero + " no es primo.");
		}
	}
}
