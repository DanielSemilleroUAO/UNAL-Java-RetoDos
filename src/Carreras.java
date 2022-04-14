/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delga
 */
public class Carreras extends Vehiculo{
    private String equipo;
    private String mejorTiempo;
    private String pesoCarro;

    public Carreras(String equipo, String mejorTiempo, String pesoCarro, String piloto, String tipoLlanta) {
        super(piloto, tipoLlanta);
        this.equipo = equipo;
        this.mejorTiempo = mejorTiempo;
        this.pesoCarro = pesoCarro;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMejorTiempo() {
        return mejorTiempo;
    }

    public void setMejorTiempo(String mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }

    public String getPesoCarro() {
        return pesoCarro;
    }

    public void setPesoCarro(String pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    @Override
    public String toString() {
        return ""
            + "\tVehículo de Carreras:" + "\n"
            + "\t\tPiloto: " + getPiloto() + "\n"
            + "\t\tEquipo: " + getEquipo() + "\n"
            + "\t\tMejor Tiempo: " + getMejorTiempo() + "\n"
            + "\t\tTipo de Llanta: " + getTipoLlanta() + "\n"
            + "\t\tPeso del Carro (kg): " + getPesoCarro();
    }
    
    
    
       
}
