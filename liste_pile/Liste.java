package liste_pile;
import java.util.*;

//Classe liste
public class Liste {
    private int position;
    private ArrayList<Object> elements;

    //Constructeur
    public Liste()
    {
        //l'arraylist commence a 0, on insert une case vide
        position = 0;
        elements = new ArrayList<>();
        elements.add(position, null);
    }


    //methode pour se positionner sur le premier element
    public void Premier()
    {
        position = 1;
    }


    //methode pour se positionner sur le dernier element
    public void Dernier()
    {
        position = elements.size()-1;
    }


    /**
     * methode pour ajouter un element
     *@param aAjouter de type objet
     */
    public void Ajouter(Object aAjouter)
    {
        //on incremente la position
        position++;
        elements.add(position, aAjouter);

    }


    /**
     * methode pour supprimer un element
     *@return elemSup de type objet
     */
    public Object Supprimer()
    {
        Object elemSup;

        //cas liste vide
        if(position==0) {
            System.out.println("la liste est vide !");
            elemSup = null;
        }

        //on supprime et decremente la liste
        else {
            elemSup = elements.remove(position);
            position--;
        }


        return elemSup;
    }


    /**
     * methode pour trouver l'element suivant
     *@return elemSuiv de type objet
     */
    public Object Suivant()
    {
        Object elemActu = null;
        Object elemSuiv = null;

        elemActu = elements.get(position);
        //cas liste vide
        if(position==0 && elemActu==elements.get(elements.size()-1)) {
            System.out.println("la liste est vide !");
            elemSuiv = null;
        }

        //cas dernier element de la liste
        if(elemActu==elements.get(elements.size()-1))
        {
            System.out.println("C'est le dernier element");
            elemSuiv = null;
        }

        else {
            elemSuiv = elements.get(position + 1);
        }

        return elemSuiv;

    }


    //methode d'affichage
    public void afficher()
    {
        for(int i=1; i<elements.size();i++) {
            System.out.print(elements.get(i) + " ");
        }


    }

    public int getPosition()
    {
        return position;
    }
    public void setPosition(int Pos)
    {
        position = Pos;
    }



}
