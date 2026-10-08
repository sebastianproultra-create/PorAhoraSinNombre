package citas;

public class Cita {
    private String documentoPaciente;
    private String medico;
    private String fecha;
    private String hora;

    public Cita(String documentoPaciente, String medico, String fecha, String hora) {
        this.documentoPaciente = documentoPaciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getDocumentoPaciente() { return documentoPaciente; }
    public String getMedico() { return medico; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}
