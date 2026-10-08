package citas;

public class Paciente {
    private String nombre;
    private String documento;
    private String correo;

    public Paciente(String nombre, String documento, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getCorreo() { return correo; }
}
