package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEnvios {

	private JFrame frmCalculadoraEnvo;
	private JTextField txtOrigen;
	private JTextField txtDestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEnvios window = new VentanaEnvios();
					window.frmCalculadoraEnvo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaEnvios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraEnvo = new JFrame();
		frmCalculadoraEnvo.setTitle("Calculadora Envío");
		frmCalculadoraEnvo.setBounds(100, 100, 547, 300);
		frmCalculadoraEnvo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraEnvo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		lblNewLabel.setBounds(10, 49, 109, 14);
		frmCalculadoraEnvo.getContentPane().add(lblNewLabel);
		
		txtOrigen = new JTextField();
		txtOrigen.setBounds(107, 46, 414, 20);
		frmCalculadoraEnvo.getContentPane().add(txtOrigen);
		txtOrigen.setColumns(10);
		
		JRadioButton rdbtnNacional = new JRadioButton("Nacional");
		rdbtnNacional.setSelected(true);
		rdbtnNacional.setBounds(172, 73, 109, 23);
		frmCalculadoraEnvo.getContentPane().add(rdbtnNacional);
		
		JRadioButton rdbtnExtranjero = new JRadioButton("Extranjero");
		
		rdbtnExtranjero.setBounds(320, 73, 109, 23);
		frmCalculadoraEnvo.getContentPane().add(rdbtnExtranjero);
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino:");
		lblCiudadDestino.setBounds(10, 106, 109, 14);
		frmCalculadoraEnvo.getContentPane().add(lblCiudadDestino);
		
		txtDestino = new JTextField();
		txtDestino.setColumns(10);
		txtDestino.setBounds(107, 103, 414, 20);
		frmCalculadoraEnvo.getContentPane().add(txtDestino);
		
				
		JLabel lblTipoEnvio = new JLabel("Tipo envio:");
		lblTipoEnvio.setBounds(36, 169, 83, 14);
		frmCalculadoraEnvo.getContentPane().add(lblTipoEnvio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10h", "Paq 24 - al dia siguiente"}));
		comboBox.setBounds(107, 165, 414, 22);
		frmCalculadoraEnvo.getContentPane().add(comboBox);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(46, 201, 43, 14);
		frmCalculadoraEnvo.getContentPane().add(lblPeso);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		spinner.setBounds(107, 198, 43, 20);
		frmCalculadoraEnvo.getContentPane().add(spinner);
		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setBounds(160, 198, 61, 14);
		frmCalculadoraEnvo.getContentPane().add(lblKg);
		
		
		
		JRadioButton rdbtnDNacional = new JRadioButton("Nacional");
		rdbtnDNacional.setSelected(true);
		rdbtnDNacional.setBounds(172, 135, 109, 23);
		frmCalculadoraEnvo.getContentPane().add(rdbtnDNacional);
		
		JRadioButton rdbtnDExtranjero = new JRadioButton("Extranjero");
		rdbtnDExtranjero.setBounds(320, 135, 109, 23);
		frmCalculadoraEnvo.getContentPane().add(rdbtnDExtranjero);
		
		JButton btnNewButton = new JButton("Calcular precio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Origen = txtOrigen.getText();
				String Destino = txtOrigen.getText();
				boolean ONacional = rdbtnNacional.isSelected();
				boolean OExtranjero = rdbtnExtranjero.isSelected();
				boolean DNacional = rdbtnDNacional.isSelected();
				boolean DExtranjero = rdbtnDExtranjero.isSelected();
				
				if (Origen.isEmpty() || Destino.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Origen y/o destinos vacios", "Calcula Envio", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
				
			}
			
			
		});
		
		btnNewButton.setBounds(221, 227, 122, 23);
		frmCalculadoraEnvo.getContentPane().add(btnNewButton);
		
		ButtonGroup Origen = new ButtonGroup();
		Origen.add(rdbtnNacional);
		Origen.add(rdbtnExtranjero);
		
		ButtonGroup Destino = new ButtonGroup();
		Destino.add(rdbtnDNacional);
		Destino.add(rdbtnDExtranjero);
		
	}
}
