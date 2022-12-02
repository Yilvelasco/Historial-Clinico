package modelo;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * The persistent class for the paciente database table.
 * 
 */
@Entity
@Table(name="Paciente")
public class Paciente  {
    @Id
    @Column(name = "IdPaciente")
    @GeneratedValue
	private Integer idPaciente;
    
    @Basic(optional = false)
    @Column(name = "NPaciente")
    private String nPaciente;
    
    @Basic(optional = false)
    @Column(name = "APaciente")
    private String aPaciente;
    @Basic(optional = false)
    
    @Column(name = "SexoPaciente")
    private Character sexoPaciente;
    @Basic(optional = false)
    
    @Column(name = "NacimientoPaciente")
    private String nacimientoPaciente;
    
    @Basic(optional = false)
    @Column(name = "CelPaciente")
    private String celPaciente;
    
    @Basic(optional = false)
    @Column(name = "DirPaciente")
    private String dirPaciente;
    
    @Basic(optional = false)
    @Column(name = "CorreoPaciente")
    private String correoPaciente;

	public Paciente() {
	}

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
	
    public Paciente(Integer idPaciente, String nPaciente, String aPaciente, Character sexoPaciente, String nacimientoPaciente, String celPaciente, String dirPaciente, String correoPaciente) {
        this.idPaciente = idPaciente;
        this.nPaciente = nPaciente;
        this.aPaciente = aPaciente;
        this.sexoPaciente = sexoPaciente;
        this.nacimientoPaciente = nacimientoPaciente;
        this.celPaciente = celPaciente;
        this.dirPaciente = dirPaciente;
        this.correoPaciente = correoPaciente;
    }

    
	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getAPaciente() {
		return this.aPaciente;
	}

	public void setAPaciente(String APaciente) {
		this.aPaciente = APaciente;
	}

	public String getCelPaciente() {
		return this.celPaciente;
	}

	public void setCelPaciente(String celPaciente) {
		this.celPaciente = celPaciente;
	}

	public String getCorreoPaciente() {
		return this.correoPaciente;
	}

	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}

	public String getDirPaciente() {
		return this.dirPaciente;
	}

	public void setDirPaciente(String dirPaciente) {
		this.dirPaciente = dirPaciente;
	}

	public String getNacimientoPaciente() {
		return this.nacimientoPaciente;
	}

	public void setNacimientoPaciente(String nacimientoPaciente) {
		this.nacimientoPaciente = nacimientoPaciente;
	}

	public String getNPaciente() {
		return this.nPaciente;
	}

	public void setNPaciente(String NPaciente) {
		this.nPaciente = NPaciente;
	}

	public Character getSexoPaciente() {
		return this.sexoPaciente;
	}

	public void setSexoPaciente(Character sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}

}