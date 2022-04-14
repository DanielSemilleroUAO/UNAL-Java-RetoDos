/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delga
 */
public class Vehiculo {
    
    private String piloto;
    private String tipoLlanta;

    public Vehiculo(String piloto, String tipoLlanta) {
        this.piloto = piloto;
        this.tipoLlanta = tipoLlanta;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }
    
    
    
}
