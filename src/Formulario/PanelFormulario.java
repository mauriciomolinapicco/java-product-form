package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelFormulario extends JPanel {
	private JButton botonGuardar;
	private JButton botonLimpiar;
	
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField rubro;
	
	public PanelFormulario() {
		armar();
	}
	
	private void armar() {
		//this.setLayout(new FlowLayout());
		this.setLayout(new GridLayout(10, 10, 10, 10)); 
		
		botonGuardar = new JButton("Guardar");
		botonLimpiar= new JButton("Limpiar");
		
		JLabel nombreLbl = new JLabel("Ingrese el nombre:");
		JLabel descripcionLbl = new JLabel("Ingrese la descripcion:");
		JLabel rubroLbl = new JLabel("Ingrese el rubro");

		this.nombre = new JTextField(20);
		this.descripcion = new JTextField(35);
		this.rubro = new JTextField(20);
				
		this.add(nombreLbl);
		this.add(nombre);
		this.add(descripcionLbl);
		this.add(descripcion);
		this.add(rubroLbl);
		this.add(rubro);
		
		this.add(botonGuardar);
		this.add(botonLimpiar);
		
		botonGuardar.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String inputNombre = nombre.getText();
					String inputDescripcion = descripcion.getText();
					String inputRubro = rubro.getText();
					
					Producto prod = new Producto(inputNombre, inputDescripcion, inputRubro);
					
					ProductoDAOGenericImpl dao = new ProductoDAOGenericImpl();
					dao.crearProducto(prod);
				}
			});
		
		botonLimpiar.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nombre.setText("");
					descripcion.setText("");
					rubro.setText("");
				}
			});
	}
}
