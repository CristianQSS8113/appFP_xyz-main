package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtA, txtB, txtC, txtRaiz1, txtRaiz2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {   
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 350);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblA = new JLabel("Coeficiente a:");
        lblA.setBounds(50, 30, 100, 30);
        getContentPane().add(lblA);

        JLabel lblB = new JLabel("Coeficiente b:");
        lblB.setBounds(50, 70, 100, 30);
        getContentPane().add(lblB);

        JLabel lblC = new JLabel("Coeficiente c:");
        lblC.setBounds(50, 110, 100, 30);
        getContentPane().add(lblC);

        JLabel lblRaiz1 = new JLabel("Raíz 1:");
        lblRaiz1.setBounds(50, 170, 100, 30);
        getContentPane().add(lblRaiz1);

        JLabel lblRaiz2 = new JLabel("Raíz 2:");
        lblRaiz2.setBounds(50, 210, 100, 30);
        getContentPane().add(lblRaiz2);

        txtA = new JTextField();
        txtA.setBounds(150, 30, 80, 30);
        txtA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(150, 70, 80, 30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setBounds(150, 110, 80, 30);
        txtC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtC.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtC);

        txtRaiz1 = new JTextField();
        txtRaiz1.setBounds(150, 170, 80, 30);
        txtRaiz1.setFocusable(false);
        txtRaiz1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRaiz1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRaiz1);

        txtRaiz2 = new JTextField();
        txtRaiz2.setBounds(150, 210, 80, 30);
        txtRaiz2.setFocusable(false);
        txtRaiz2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRaiz2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRaiz2);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 270, 140, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        DecimalFormat df = new DecimalFormat("###.##");

        double raiz1 = (-b + Math.sqrt(Math.abs(discriminante))) / (2 * a);
        double raiz2 = (-b - Math.sqrt(Math.abs(discriminante))) / (2 * a);

        txtRaiz1.setText(discriminante >= 0 ? df.format(raiz1) : "NaN");
        txtRaiz2.setText(discriminante >= 0 ? df.format(raiz2) : "NaN");
    }
}