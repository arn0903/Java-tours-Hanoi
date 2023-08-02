package liste_pile;

//classe fille
public class PileEntiers extends Pile {


    //constucteur
    public PileEntiers() {
        super();
    }


    //redefinition des methodes avec un cast
    public void Empiler(Object element) {
        //cast d'objet en Integer
        int objetCast = (Integer) element;
        maListe.Dernier();
        maListe.Ajouter(objetCast);
        System.out.println("Element empile : " + objetCast);
    }


    public Integer Depiler() {
        maListe.Dernier();
        return (Integer) maListe.Supprimer();
    }


    public void DepilerTout(){
        Integer depil;
        do {
            depil = Depiler();
            if(depil==null)
                break;
            System.out.println("Element depile : " + depil);
        } while (depil!=null);

    }


    //methode d'affichage
    public void afficherListe()
    {
        maListe.afficher();
    }

}
