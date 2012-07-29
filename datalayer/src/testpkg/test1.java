/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpkg;

import basicBeans.Agenti;
import basicBeans.Fbdati;
import basicBeans.Pagamenti;
import basicBeans.PuntiVendita;
import basicBeans.Utenti;
import java.util.Collection;
import testpkg.test1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author luca.pompa
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DataLayerPU");
////        EntityManager em = emf.createEntityManager();
////        
////        Agenti agente1 = em.find(Agenti.class, 1);
////         
////
////        Fbdati fbdati = new Fbdati(Long.parseLong("9"), "documento");
////        
////      //  fbdati.setAgentiCodice(agente1);
////        Pagamenti p = new Pagamenti(1);
////     //   fbdati.setPAGAMENTIidPAGAMENTI(p);
////        
////        Utenti u2 = em.find(Utenti.class,1);
////        System.out.println("punti vendita: "+u2.getPuntiVenditaCollection());
////        Collection <PuntiVendita> listaPVendita = u2.getPuntiVenditaCollection();
////        
////        for(PuntiVendita pvendita:listaPVendita)
////        {
////            System.out.println(pvendita.getCitta());
////        }
////        Utenti u = new Utenti(1);
////        //fbdati.setUTENTIidUTENTI(u);
////        //DataLayer datal = new DataLayer();
////        test1.persist(fbdati);
////        System.out.println(agente1.getRagsoc());
////        
////        
////    }
////
////    public static void persist(Object object) {
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DataLayerPU");
////        EntityManager em = emf.createEntityManager();
////        em.getTransaction().begin();
////        try {
////            em.persist(object);
////            em.getTransaction().commit();
////        } catch (Exception e) {
////            e.printStackTrace();
////            em.getTransaction().rollback();
////        } finally {
////            em.close();
////        }
    }
}
