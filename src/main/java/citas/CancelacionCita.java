package citas;

public class CancelacionCita {
    private String documentoPaciente;
    private String fecha;
    private String hora;
    private boolean cancelada;

    public CancelacionCita(String documentoPaciente, String fecha, String hora) {
        this.documentoPaciente = documentoPaciente;
        this.fecha = fecha;
        this.hora = hora;
        this.cancelada = false;
    }

    public void cancelar() {
        this.cancelada = true;
    }

    public boolean estaCancelada() { return cancelada; }
}
