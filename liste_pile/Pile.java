package liste_pile;

//classe mère
public class Pile {
    protected Liste maListe = new Liste();

    //constructeur
    public Pile()
    {

    }


    //methode pour empiler
    public void Empiler(Object element) {
        maListe.Dernier();
        maListe.Ajouter(element);
    }


    /**
     * methode pour depiler un objet
     *@return un type objet
     */
    public Object Depiler() {
        maListe.Dernier();
        return maListe.Supprimer();
    }


    //methode pour tout depiler
    public void DepilerTout(){
        Object depil;

        //tant que la pile n'est pas vide
        do {
            depil = Depiler();

            //on force l'arret
            if(depil==null)
                break;
            System.out.println("Element depile : " + depil);
        } while (depil!=null);

    }
}
