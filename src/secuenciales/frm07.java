package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtAltura, txtArea, txtPerimetro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblBase = new JLabel ("Base (b): ");
        lblBase.setBounds(50,50,80,30);
        getContentPane().add(lblBase);
        
        JLabel lblAltura = new JLabel ("Altura (h): ");
        lblAltura.setBounds(50,90,80,30);
        getContentPane().add(lblAltura);

        JLabel lblArea = new JLabel ("Area: ");
        lblArea.setBounds(50,130,80,30);
        getContentPane().add(lblArea);

        JLabel lblPerimetro = new JLabel ("Perimetro: ");
        lblPerimetro.setBounds(50,170,80,30);
        getContentPane().add(lblPerimetro);

        txtBase = new JTextField();
        txtBase.setBounds(150,50,80,30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 90, 80, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtArea = new JTextField();
        txtArea.setBounds(150, 130, 80, 30);
        txtArea.setFocusable(false);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtPerimetro = new JTextField();
        txtPerimetro.setBounds(150, 170, 80, 30);
        txtPerimetro.setFocusable(false);
        txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPerimetro.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPerimetro);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 270, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            double area = base * altura;
            double perimetro = 2 * (base + altura);

            DecimalFormat df = new DecimalFormat("###.##");
            txtArea.setText(df.format(area));
            txtPerimetro.setText(df.format(perimetro));

    }
}