/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

import entidades.Estcivil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hp
 */
@Local
public interface EstcivilFacadeLocal {

    void create(Estcivil estcivil);

    void edit(Estcivil estcivil);

    void remove(Estcivil estcivil);

    Estcivil find(Object id);

    List<Estcivil> findAll();

    List<Estcivil> findRange(int[] range);

    int count();
    
}
