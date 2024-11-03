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

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtAltura;
	JLabel lblResultado;

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
		setBounds(0, 0, 400, 350);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblAltura = new JLabel("Altura (n >= 4):");
		lblAltura.setBounds(50, 30, 100, 30);
		getContentPane().add(lblAltura);

		lblResultado = new JLabel("<html>Rectángulo de asteriscos:</html>");
		lblResultado.setBounds(50, 100, 300, 200);
		getContentPane().add(lblResultado);

		txtAltura = new JTextField();
		txtAltura.setBounds(150, 30, 60, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);

		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(100, 70, 100, 30);
		btnGenerar.setMnemonic('g');
		getContentPane().add(btnGenerar);

		btnGenerar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnGenerar_actionPerformed();	
			}
		});
	}

	protected void btnGenerar_actionPerformed() {
		int altura = Integer.parseInt(txtAltura.getText());

		if (altura < 4) {
			lblResultado.setText("<html>Error: La altura debe ser >= 4.</html>");
			return;
		}

		int ancho = 2 * altura;
		StringBuilder resultado = new StringBuilder("<html>Rectángulo de asteriscos:<br>");

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < ancho; j++) {
				resultado.append("*");
			}
			resultado.append("<br>");
		}
		resultado.append("</html>");

		lblResultado.setText(resultado.toString());
	}
}
