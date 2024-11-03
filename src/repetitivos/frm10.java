package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel lblResultado, lblCantidad;

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
		setBounds(0, 0, 400, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		lblResultado = new JLabel("<html>Números de 4 cifras que cumplen la condición:<br></html>");
		lblResultado.setBounds(50, 30, 300, 250);
		getContentPane().add(lblResultado);

		lblCantidad = new JLabel("Cantidad de números encontrados: ");
		lblCantidad.setBounds(50, 300, 300, 30);
		getContentPane().add(lblCantidad);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 330, 100, 30);
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
		StringBuilder resultado = new StringBuilder("<html>Números de 4 cifras que cumplen la condición:<br>");
		int cantidad = 0;

		// Iterar a través de todos los números de 4 cifras
		for (int i = 1000; i <= 9999; i++) {
			int numero = i;
			int sumaPares = 0;
			int sumaImpares = 0;

			// Obtener cada dígito y calcular las sumas de pares e impares
			for (int j = 0; j < 4; j++) {
				int digito = numero % 10;
				if (digito % 2 == 0) {
					sumaPares += digito;
				} else {
					sumaImpares += digito;
				}
				numero /= 10;
			}

			// Comprobar la condición
			if (sumaPares == sumaImpares) {
				resultado.append(i).append("<br>");
				cantidad++;
			}
		}
		resultado.append("</html>");

		lblResultado.setText(resultado.toString());
		lblCantidad.setText("Cantidad de números encontrados: " + cantidad);
	}
}
