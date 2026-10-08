package citas;

import java.util.Objects;

public class Paciente {
    private final String nombre;
    private final String documento;
    private final String correo;

    public Paciente(String nombre, String documento, String correo) {
        this.nombre = validarTexto(nombre, "nombre");
        this.documento = validarTexto(documento, "documento");
        this.correo = validarCorreo(correo);
    }

    private static String validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El " + campo + " es obligatorio");
        }
        return valor.trim();
    }

    private static String validarCorreo(String correo) {
        String valor = validarTexto(correo, "correo");
        if (!valor.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("El correo no tiene un formato válido");
        }
        return valor;
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getCorreo() { return correo; }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', documento='" + documento + "', correo='" + correo + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente otro = (Paciente) o;
        return documento.equals(otro.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}
