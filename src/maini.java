import java.util.Map;
import java.util.TreeMap;

public class maini {

    public static void main(String[] args) {
        AffectationHashMap mapED = new AffectationHashMap();

        Employe dali = new Employe("brow");
        Employe rayene = new Employe("yoww");
        Employe lamton = new Employe("ez");

        Departement rh = new Departement("ddd");
        Departement ccc = new Departement("ccc");
        Departement rrr = new Departement("rrr");

        mapED.ajouterEmployeDepartement(dali, rh);
        mapED.ajouterEmployeDepartement(rayene, ccc);
        mapED.ajouterEmployeDepartement(lamton, rrr);

        mapED.afficherEmployesEtDepartements();


        try {
            mapED.ajouterEmployeDepartement(dali, ccc);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


        mapED.afficherEmployesEtDepartements();
        mapED.supprimerEmploye(dali);
        mapED.afficherEmployesEtDepartements();
        mapED.supprimerEmployeEtDepartement(rayene, ccc);
        mapED.afficherEmployesEtDepartements();
        mapED.afficherEmployes();
        mapED.afficherDepartements();

        System.out.println(mapED.rechercherEmploye(dali));
        System.out.println(mapED.rechercherDepartement(ccc));
        TreeMap<Employe, Departement> maptreeED = mapED.trierMap();
        for (Map.Entry<Employe, Departement> entry : maptreeED.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }
    }
    
}