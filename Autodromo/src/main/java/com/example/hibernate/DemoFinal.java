package com.example.hibernate;
import com.example.hibernate.dominio.*;

import com.example.hibernate.utils.BDUtils;
import java.time.LocalDateTime;
import static java.util.Arrays.asList;
import java.util.List;
import javax.persistence.EntityManager;

public class DemoFinal {

    public static void main(String[] args) {

        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);

//        try {
            Corredor marcos = new Corredor();
            //Insert

//        } catch (Exception e) {
//            BDUtils.rollback(em);
//            return;
//        }

        //Update
        marcos.setNombre("Marcos"); //Entidad administrada -> detecta cambios
        marcos.setApellido("Fernandez");
        marcos.setDni(44444444);
        marcos.setPesoCorredor(80);
        marcos.setVerificado(Boolean.TRUE);
        em.persist(marcos);
        System.out.println("ID MARCOS: " + marcos.getId());

        //Insert
        Corredor fabiano = new Corredor();
        //Insert

//        } catch (Exception e) {
//            BDUtils.rollback(em);
//            return;
//        }

        //Update
        fabiano.setNombre("Fabiano"); //Entidad administrada -> detecta cambios
        fabiano.setApellido("Caruana");
        fabiano.setDni(44444444);
        fabiano.setPesoCorredor(80);
        fabiano.setVerificado(Boolean.TRUE);
        em.persist(fabiano);
        System.out.println("ID Fabiano: " + fabiano.getId());

//        } catch (Exception e) {
//            BDUtils.rollback(em);
//            return;
//        }

        //Update
    //      em.persist(fabiano);
        //JPQL Query
        List<Persona> personas = em
                // equivalente a: select * from persona where persona.nombre = 'Julian'
                .createQuery("select p from Persona p where p.nombre = ?1", Persona.class) //ojo, query no tipada
                .setParameter(1, "Fabiano")
                .getResultList();

        System.out.println(personas);

        //Delete
        for (Persona persona : personas) {
            em.remove(persona);
        }

        BDUtils.commit(em);
    }

}
