package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes;

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
        setBounds(0, 0, 300, 450);
        setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblGigabytes=new JLabel("Gigabytes: ");
        lblGigabytes.setBounds(50, 50, 80, 30);
        getContentPane().add(lblGigabytes);

        JLabel lblMegabytes=new JLabel("Megabytes: ");
        lblMegabytes.setBounds(50, 90, 80, 30);
        getContentPane().add(lblMegabytes);

        JLabel lblKilobytes=new JLabel("Kilobytes: ");
        lblKilobytes.setBounds(50, 130, 80, 30);
        getContentPane().add(lblKilobytes);

        JLabel lblBytes=new JLabel("Bytes: ");
        lblBytes.setBounds(50, 170, 80, 30);
        getContentPane().add(lblBytes);

        txtGigabytes = new JTextField();
        txtGigabytes.setBounds(150, 50, 80, 30);
        txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtGigabytes);

        txtMegabytes = new JTextField();
        txtMegabytes.setBounds(150, 90, 80, 30);
        txtMegabytes.setFocusable(false);
        txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMegabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMegabytes);

        txtKilobytes = new JTextField();
        txtKilobytes.setBounds(150, 130, 80, 30);
        txtKilobytes.setFocusable(false);
        txtKilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilobytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtKilobytes);

        txtBytes = new JTextField();
        txtBytes.setBounds(150, 170, 80, 30);
        txtBytes.setFocusable(false);
        txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBytes);

        JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 270, 100 ,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

    }
    protected void btnCalcular_actionPerformed() {
        double gigabytes = Double.parseDouble(txtGigabytes.getText());

        double megabytes = gigabytes *1024;
        double kilobytes = megabytes * 1024;
        double bytes = kilobytes * 1024;

        DecimalFormat df = new DecimalFormat("###.##");
        txtMegabytes.setText(df.format(megabytes));
        txtKilobytes.setText(df.format(kilobytes));
        txtBytes.setText(df.format(bytes));
    }
}