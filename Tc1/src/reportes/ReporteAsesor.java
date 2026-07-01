package reportes;

public class ReporteAsesor {
	private String mes;
    private String sede;
    private String asesor;
    private int nVentas;
    private double ingresoGenerado;
    private double comision;
	public ReporteAsesor() {
		
	}
	public ReporteAsesor(String mes, String sede, String asesor, int nVentas, double ingresoGenerado, double comision) {
		super();
		this.mes = mes;
		this.sede = sede;
		this.asesor = asesor;
		this.nVentas = nVentas;
		this.ingresoGenerado = ingresoGenerado;
		this.comision = comision;
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
	public String getAsesor() {
		return asesor;
	}
	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}
	public int getnVentas() {
		return nVentas;
	}
	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
	public double getIngresoGenerado() {
		return ingresoGenerado;
	}
	public void setIngresoGenerado(double ingresoGenerado) {
		this.ingresoGenerado = ingresoGenerado;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
    
}
