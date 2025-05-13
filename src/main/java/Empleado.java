import java.time.LocalDate;

public class Empleado {
    private String dni;
    private String nombre;
    private String categoria;
    private String sede;
    private String turno;
    private LocalDate fechaContrato;
    private double salario;

    public Empleado(String dni, String sede, String nombre, String categoria, String turno, LocalDate fechaContrato, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
        this.sede = sede;
        this.turno = turno;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "DNI: " + dni +
                " | Sede: " + sede +
                " | Nombre: " + nombre +
                " | Categoria: " + categoria +
                " | Turno: " + turno +
                " | Fecha: " + fechaContrato.toString() +
                " | Salario: " + salario;
    }
}
