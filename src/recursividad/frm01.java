package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtExponente;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblBase = new JLabel("Base:");
		lblBase.setBounds(50, 30, 100, 30);
		getContentPane().add(lblBase);

		txtBase = new JTextField();
		txtBase.setBounds(150, 30, 100, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);

		JLabel lblExponente = new JLabel("Exponente:");
		lblExponente.setBounds(50, 70, 100, 30);
		getContentPane().add(lblExponente);

		txtExponente = new JTextField();
		txtExponente.setBounds(150, 70, 100, 30);
		txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtExponente.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExponente);

		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(50, 140, 300, 30);
		getContentPane().add(lblResultado);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 180, 100, 30);
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
		int base = Integer.parseInt(txtBase.getText());
		int exponente = Integer.parseInt(txtExponente.getText());
		int resultado = potencia(base, exponente);
		lblResultado.setText(base + "^" + exponente + " = " + resultado);
	}

	//para calcular la potencia
	public int potencia(int base, int exponente) {
		if (exponente == 0) return 1;
		return base * potencia(base, exponente - 1);
	}
}
