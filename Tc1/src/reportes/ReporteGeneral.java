package reportes;

public class ReporteGeneral {
	private String mes;
    private String sede;
    private String asesorDestacado;
    private String profesorDestacado;
    private String arteMarcialPopular;
    private double ingresoTotal;
	public ReporteGeneral() {
	}
	public ReporteGeneral(String mes, String sede, String asesorDestacado, String profesorDestacado,
			String arteMarcialPopular, double ingresoTotal) {
		super();
		this.mes = mes;
		this.sede = sede;
		this.asesorDestacado = asesorDestacado;
		this.profesorDestacado = profesorDestacado;
		this.arteMarcialPopular = arteMarcialPopular;
		this.ingresoTotal = ingresoTotal;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getAsesorDestacado() {
		return asesorDestacado;
	}
	public void setAsesorDestacado(String asesorDestacado) {
		this.asesorDestacado = asesorDestacado;
	}
	public String getProfesorDestacado() {
		return profesorDestacado;
	}
	public void setProfesorDestacado(String profesorDestacado) {
		this.profesorDestacado = profesorDestacado;
	}
	public String getArteMarcialPopular() {
		return arteMarcialPopular;
	}
	public void setArteMarcialPopular(String arteMarcialPopular) {
		this.arteMarcialPopular = arteMarcialPopular;
	}
	public double getIngresoTotal() {
		return ingresoTotal;
	}
	public void setIngresoTotal(double ingresoTotal) {
		this.ingresoTotal = ingresoTotal;
	}
    
}
