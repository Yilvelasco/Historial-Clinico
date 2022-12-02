/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

import modelo.Paciente;
import vista.ConsPacienteInternalFrame;

public class GestorPacienteControl implements ActionListener {

	PacienteJpaController pacientesModelo;
	ConsPacienteInternalFrame consultarPacienteVista;

	public GestorPacienteControl(ConsPacienteInternalFrame consultarPacienteVista) {
		this.consultarPacienteVista = consultarPacienteVista;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPacienteJPA");
		pacientesModelo = new PacienteJpaController(emf);
	}

	public void actionPerformed(ActionEvent e) {

		DefaultTableModel tmodelo;
		String valor = consultarPacienteVista.txt_valor.getText();
		LinkedList<Paciente> pacientes = new LinkedList<Paciente>();

		if (consultarPacienteVista.rdb_identificacion.isSelected()) {
			Paciente paciente = pacientesModelo.findPaciente(Integer.parseInt(valor));
			pacientes.add(paciente);
		}
		if (consultarPacienteVista.rdb_nombres.isSelected()) {
			List<Paciente> pacientesEncontrados = pacientesModelo.findByName(valor);

			for (Paciente p : pacientesEncontrados) {
				pacientes.add(p);
			}
		}
		if (consultarPacienteVista.rdb_apellidos.isSelected()) {
			List<Paciente> pacientesApellidos = pacientesModelo.encontrarPacientePorApellido(valor);

			for (Paciente p : pacientesApellidos) {
				pacientes.add(p);
			}

		}
		if (consultarPacienteVista.rdb_genero.isSelected()) {
			// Buscar por genero
		}

		if (consultarPacienteVista.rdb_direccion.isSelected()) {
			// Buscar por direccion
		}

		String registro[] = new String[5];

		String[] Titulos = { "Identificacion", "Nombre", "Apellidos", "Fecha Nacimiento", "Genero" };

		tmodelo = new DefaultTableModel();
		tmodelo.setColumnIdentifiers(Titulos);

		for (Paciente p : pacientes) {
			registro[0] = String.valueOf(p.getIdPaciente());
			registro[1] = p.getNPaciente();
			registro[2] = p.getAPaciente();
			registro[3] = p.getNacimientoPaciente();
			registro[4] = p.getSexoPaciente().toString();
			tmodelo.addRow(registro);
		}

		consultarPacienteVista.tbl_datos.setModel(tmodelo);
	}
}