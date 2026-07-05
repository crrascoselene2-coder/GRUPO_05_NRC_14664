package clases;

public class Venta {
    private String dniAlumno;
    private int idPlan;
    private String metodoPago;
    private double montoEfectivo;
    private double montoDigital;
    private double totalPagado;
    private double saldoPendiente;
    private String fechaVencimiento;
    private String estado;
    private int idSede;
    private int idUsuario;

    public Venta(String dniAlumno, int idPlan, String metodoPago, double montoEfectivo, double montoDigital,
            double totalPagado, double saldoPendiente, String fechaVencimiento, String estado, int idSede, int idUsuario) {
        this.dniAlumno = dniAlumno;
        this.idPlan = idPlan;
        this.metodoPago = metodoPago;
        this.montoEfectivo = montoEfectivo;
        this.montoDigital = montoDigital;
        this.totalPagado = totalPagado;
        this.saldoPendiente = saldoPendiente;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.idSede = idSede;
        this.idUsuario = idUsuario;
    }

    public String getDniAlumno() { return dniAlumno; }
    public int getIdPlan() { return idPlan; }
    public String getMetodoPago() { return metodoPago; }
    public double getMontoEfectivo() { return montoEfectivo; }
    public double getMontoDigital() { return montoDigital; }
    public double getTotalPagado() { return totalPagado; }
    public double getSaldoPendiente() { return saldoPendiente; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public String getEstado() { return estado; }
    public int getIdSede() { return idSede; }
    public int getIdUsuario() { return idUsuario; }
}