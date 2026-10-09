package citas;

public class CancelacionCita {
    private final String documentoPaciente;
    private final String fecha;
    private final String hora;
    private boolean cancelada;

    public CancelacionCita(String documentoPaciente, String fecha, String hora) {
        this.documentoPaciente = validar(documentoPaciente, "documento del paciente");
        this.fecha = validar(fecha, "fecha");
        this.hora = validar(hora, "hora");
        this.cancelada = false;
    }

    private static String validar(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El campo " + campo + " es obligatorio");
        }
        return valor.trim();
    }

    public void cancelar() {
        if (cancelada) {
            throw new IllegalStateException("La cita ya fue cancelada");
        }
        this.cancelada = true;
    }

    public boolean estaCancelada() { return cancelada; }
    public String getDocumentoPaciente() { return documentoPaciente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}
