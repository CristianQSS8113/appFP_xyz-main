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

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número (n):");
		lblNumero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblNumero);

		lblResultado = new JLabel("<html>Tabla de multiplicar:</html>");
		lblResultado.setBounds(50, 90, 250, 150);
		getContentPane().add(lblResultado);

		txtNumero = new JTextField();
		txtNumero.setBounds(150, 50, 60, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);

		JButton btnCalcular = new JButton("Generar");
		btnCalcular.setBounds(100, 220, 100, 30);
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
		StringBuilder resultado = new StringBuilder("<html>Tabla de multiplicar:<br>");

		for (int i = 1; i <= 12; i++) {
			resultado.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("<br>");
		}
		resultado.append("</html>");

		lblResultado.setText(resultado.toString());
	}
}
