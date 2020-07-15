/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn;

import entidades.Cargo;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sesiones.CargoFacadeLocal;

/**
 *
 * @author hp
 */
@Named(value = "cargoManagedBean")
@ViewScoped
public class CargoManagedBean implements Serializable, ManagedBeanInterface<Cargo> {

    //Etablecer una conexión directa con cada EJB
    @EJB
    private CargoFacadeLocal cargoFacadeLocal;

    /**
     * Creates a new instance of CargoManagedBean
     */
    public CargoManagedBean() {
    }

    //Variable de tipo lista
    private List<Cargo> listaCargos;

    //Objeto de tipo cargo
    private Cargo cargo;

    //Centinela
    private String centinela;

    @PostConstruct
    public void init() {
        //Se carga la lista de cargos que está en la BDD

        listaCargos = cargoFacadeLocal.findAll();

    }

    @Override
    public void nuevo() {
        cargo = new Cargo();
    }

    @Override
    public void grabar() {

        try {
            
            if (cargo.getCodigo() == null) {
                cargoFacadeLocal.create(cargo);
               
            } else {
                cargoFacadeLocal.edit(cargo);
             
            }

            //Un panel aparece o deapacerce
            cargo = null;
            listaCargos = cargoFacadeLocal.findAll();
            mostrarMensajeTry("Información: ", FacesMessage.SEVERITY_INFO);

        } catch (Exception e) {
            mostrarMensajeTry("Ha habido un error: ", FacesMessage.SEVERITY_WARN);
        }

    }

    @Override
    public void seleccionar(Cargo c) {
        cargo = c;
       
    }

    @Override
    public void eliminar(Cargo c) {

        try {
            cargoFacadeLocal.remove(c);
            listaCargos = cargoFacadeLocal.findAll();
            mostrarMensajeTry("Información: ", FacesMessage.SEVERITY_INFO);

        } catch (Exception e) {
            mostrarMensajeTry("Ha habido un error: ", FacesMessage.SEVERITY_WARN);
        }

    }

    @Override
    public void cancelar() {
        cargo = null;
        listaCargos = cargoFacadeLocal.findAll();
 
    }

    //Gettes y Setters
    public List<Cargo> getListaCargos() {
        return listaCargos;
    }

    public void setListaCargos(List<Cargo> listaCargos) {
        this.listaCargos = listaCargos;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
