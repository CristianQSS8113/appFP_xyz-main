package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm37 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtVotosPamela, txtVotosCarol, txtVotosFanny, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm37 frame = new frm37();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm37() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);

        JLabel lblVotosPamela = new JLabel("Votos para Pamela:");
        lblVotosPamela.setBounds(30, 30, 150, 30);
        add(lblVotosPamela);

        JLabel lblVotosCarol = new JLabel("Votos para Carol:");
        lblVotosCarol.setBounds(30, 70, 150, 30);
        add(lblVotosCarol);

        JLabel lblVotosFanny = new JLabel("Votos para Fanny:");
        lblVotosFanny.setBounds(30, 110, 150, 30);
        add(lblVotosFanny);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 190, 150, 30);
        add(lblResultado);

        txtVotosPamela = new JTextField();
        txtVotosPamela.setBounds(180, 30, 150, 30);
        add(txtVotosPamela);

        txtVotosCarol = new JTextField();
        txtVotosCarol.setBounds(180, 70, 150, 30);
        add(txtVotosCarol);

        txtVotosFanny = new JTextField();
        txtVotosFanny.setBounds(180, 110, 150, 30);
        add(txtVotosFanny);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 190, 150, 30);
        txtResultado.setEditable(false);
        add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 150, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularResultado());
    }

    private void calcularResultado() {
        try {
            int votosPamela = Integer.parseInt(txtVotosPamela.getText());
            int votosCarol = Integer.parseInt(txtVotosCarol.getText());
            int votosFanny = Integer.parseInt(txtVotosFanny.getText());

            int totalVotos = votosPamela + votosCarol + votosFanny;
            int mitadVotos = totalVotos / 2 + 1;

            if (totalVotos == 0) {
                txtResultado.setText("No hay votos emitidos.");
                return;
            }

            if (votosPamela >= mitadVotos) {
                txtResultado.setText("Ganadora: Pamela");
            } else if (votosCarol >= mitadVotos) {
                txtResultado.setText("Ganadora: Carol");
            } else if (votosFanny >= mitadVotos) {
                txtResultado.setText("Ganadora: Fanny");
            } else {
                if (votosPamela == votosCarol && votosCarol == votosFanny) {
                    txtResultado.setText("Empate entre los tres. Elección anulada.");
                } else if (votosPamela == votosCarol || votosCarol == votosFanny || votosPamela == votosFanny) {
                    txtResultado.setText("Empate por el segundo puesto. Elección anulada.");
                } else {
                    String ganador = "";
                    String segundo = "";
                    if (votosPamela > votosCarol && votosPamela > votosFanny) {
                        ganador = "Pamela";
                        segundo = votosCarol > votosFanny ? "Carol" : "Fanny";
                    } else if (votosCarol > votosPamela && votosCarol > votosFanny) {
                        ganador = "Carol";
                        segundo = votosPamela > votosFanny ? "Pamela" : "Fanny";
                    } else {
                        ganador = "Fanny";
                        segundo = votosPamela > votosCarol ? "Pamela" : "Carol";
                    }
                    txtResultado.setText("Ganador: " + ganador + ", Segundo: " + segundo);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
