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

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtCantidad;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número (n):");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);

		JLabel lblCantidad = new JLabel("Cantidad (m):");
		lblCantidad.setBounds(50, 90, 80, 30);
		getContentPane().add(lblCantidad);

		lblResultado = new JLabel("Múltiplos:");
		lblResultado.setBounds(50, 130, 250, 30);
		getContentPane().add(lblResultado);

		txtNumero = new JTextField();
		txtNumero.setBounds(150, 50, 60, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(150, 90, 60, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
		btnCalcular.setMnemonic('a');
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
		int cantidad = Integer.parseInt(txtCantidad.getText());
		StringBuilder resultado = new StringBuilder("Múltiplos: ");

		// Generar y mostrar los múltiplos
		for (int i = 1; i <= cantidad; i++) {
			resultado.append(numero * i);
			if (i < cantidad) {
				resultado.append(", ");
			}
		}

		lblResultado.setText(resultado.toString());
	}
}
