package citas;

import java.util.ArrayList;
import java.util.List;

public class AgendaMedico {
    private String medico;
    private List<String> citasDelDia;

    public AgendaMedico(String medico) {
        this.medico = medico;
        this.citasDelDia = new ArrayList<>();
    }

    public void agregarCita(String cita) {
        citasDelDia.add(cita);
    }

    public List<String> consultarAgenda() {
        return citasDelDia;
    }
     //asi esta bien 
    public boolean tieneCitas() { return !citasDelDia.isEmpty(); }
}
