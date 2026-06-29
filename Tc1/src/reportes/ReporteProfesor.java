package reportes;

public class ReporteProfesor {
	private String mes;
    private String sede;
    private String profesor;
    private String disciplina;
    private int nClasesDictadas;
    private double calificacionPromedio;
    public ReporteProfesor() {
    }
    public ReporteProfesor(String mes, String sede, String profesor, String disciplina, int nClasesDictadas, double calificacionPromedio) {
        this.mes = mes;
        this.sede = sede;
        this.profesor = profesor;
        this.disciplina = disciplina;
        this.nClasesDictadas = nClasesDictadas;
        this.calificacionPromedio = calificacionPromedio;
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
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getnClasesDictadas() {
		return nClasesDictadas;
	}
	public void setnClasesDictadas(int nClasesDictadas) {
		this.nClasesDictadas = nClasesDictadas;
	}
	public double getCalificacionPromedio() {
		return calificacionPromedio;
	}
	public void setCalificacionPromedio(double calificacionPromedio) {
		this.calificacionPromedio = calificacionPromedio;
	}
    
}
