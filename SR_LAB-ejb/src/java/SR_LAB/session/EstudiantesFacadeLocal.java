/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SR_LAB.session;

import SR_LAB.entity.Estudiantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sergi
 */
@Local
public interface EstudiantesFacadeLocal {

    void create(Estudiantes estudiantes);

    void edit(Estudiantes estudiantes);

    void remove(Estudiantes estudiantes);
    
    Estudiantes getStudent(int codEstudiantes);

    Estudiantes find(Object id);

    List<Estudiantes> findAll();

    List<Estudiantes> findRange(int[] range);

    int count();
    
}
