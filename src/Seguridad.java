/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delga
 */
public class Seguridad extends Vehiculo{
    private String tipoSeguridad;

    public Seguridad(String tipoSeguridad, String piloto, String tipoLlanta) {
        super(piloto, tipoLlanta);
        this.tipoSeguridad = tipoSeguridad;
    }

    public String getTipoSeguridad() {
        return tipoSeguridad;
    }

    public void setTipoSeguridad(String tipoSeguridad) {
        this.tipoSeguridad = tipoSeguridad;
    }

    @Override
    public String toString() {
        return ""
            + "\tVehículo de Seguridad:" + "\n"
            + "\t\tPiloto: " + getPiloto() + "\n"
            + "\t\tTipo de Llanta: " + getTipoLlanta() + "\n"
            + "\t\tTipo de Seguridad: " + getTipoSeguridad();
    }
    
    
}
