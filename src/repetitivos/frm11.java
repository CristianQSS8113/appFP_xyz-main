package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 200);
		setLayout(null);
		setLocationRelativeTo(null);

		lblResultado = new JLabel("Cantidad de números capicúas de 3 cifras: ");
		lblResultado.setBounds(50, 50, 300, 30);
		getContentPane().add(lblResultado);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 100, 100, 30);
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
		int cantidad = 0;

		// Iterar a través de todos los números de 3 cifras
		for (int i = 100; i <= 999; i++) {
			int centenas = i / 100;
			int unidades = i % 10;

			// Comprobar si el número es capicúa
			if (centenas == unidades) {
				cantidad++;
			}
		}

		lblResultado.setText("Cantidad de números capicúas de 3 cifras: " + cantidad);
	}
}
