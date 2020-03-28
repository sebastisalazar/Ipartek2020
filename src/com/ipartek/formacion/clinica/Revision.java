package com.ipartek.formacion.clinica;

public class Revision extends Clinica {

	private String fechaRevision;
	private int idDoctor;
	private int idMascota;
	private String motivo;
	private String diagnostico;
	private String tratamiento;

	// CONSTRUCTOR
	public Revision() {
		super();
		this.fechaRevision = "";
		this.idDoctor = 0;
		this.idMascota = 0;
		this.motivo = "";
		this.diagnostico = "";
		this.tratamiento = "";
	}

	public Revision(String fechaRevision, int idDoctor, int idMascota, String motivo, String diagnostico,
			String tratamiento) {
		super();
		this.fechaRevision = fechaRevision;
		this.idDoctor = idDoctor;
		this.idMascota = idMascota;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	// GETTERS AND SETTERS
	public String getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(String fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Revision fecha" + fechaRevision + ", id_Doctor=" + idDoctor + " id_Mascota=, motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + super.toString();
	}

}
