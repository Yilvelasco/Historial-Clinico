package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import controlador.exceptions.NonexistentEntityException;

import vista.ElimPacienteJInternalFrame;

public class ElimPacienteController implements ActionListener {
	ElimPacienteJInternalFrame pacienteVista;
	PacienteJpaController gestorpacienteModelo;

	public ElimPacienteController(ElimPacienteJInternalFrame pacienteVista) {
		this.pacienteVista = pacienteVista;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("historial-clinico");
		gestorpacienteModelo = new PacienteJpaController(emf);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource().equals(pacienteVista.jButton2)) {
			
			int identificacion = Integer.parseInt(pacienteVista.jTextField1.getText());
			 try {
				gestorpacienteModelo.destroy(identificacion);
				JOptionPane.showMessageDialog(null, "Paciente Eliminado");
			} catch (NonexistentEntityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Paciente No Encotrado");
			}
			
		
		}

	}
}
