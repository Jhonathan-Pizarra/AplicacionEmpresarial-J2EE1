/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn;

import entidades.Cargo;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author hp
 */
public interface ManagedBeanInterface <T>{
    
    public void nuevo();
    
    public void grabar();
    
    public void seleccionar(Cargo t);
    
    public void eliminar(Cargo t);
    
    public void cancelar();
    
    default void mostrarMensajeTry(String mensaje, FacesMessage.Severity tipo){
        FacesMessage msg = new FacesMessage(tipo, mensaje, "");
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, msg);
    }
}
