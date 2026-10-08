package citas;

/**
 * Representa una cita médica solicitada por un paciente.
 * Guarda el documento del paciente, el médico asignado,
 * la fecha y la hora de la cita.
 */
public class Cita {

    // Documento de identidad del paciente que solicita la cita
    private String documentoPaciente;
    // Nombre del médico con quien se agenda la cita
    private String medico;
    // Fecha de la cita
    private String fecha;
    // Hora de la cita
    private String hora;

    /**
     * Constructor vacío: permite crear una Cita sin datos
     * y completarla después, evitando errores si faltan datos.
     */
    public Cita() {
    }

    /**
     * Constructor completo: crea una Cita con todos sus datos.
     *
     * @param documentoPaciente documento del paciente
     * @param medico            nombre del médico
     * @param fecha             fecha de la cita
     * @param hora              hora de la cita
     */
    public Cita(String documentoPaciente, String medico, String fecha, String hora) {
        this.documentoPaciente = documentoPaciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Devuelve el documento del paciente
    public String getDocumentoPaciente() { return documentoPaciente; }

    // Devuelve el nombre del médico
    public String getMedico() { return medico; }

    // Devuelve la fecha de la cita
    public String getFecha() { return fecha; }

    // Devuelve la hora de la cita
    public String getHora() { return hora; }
}
