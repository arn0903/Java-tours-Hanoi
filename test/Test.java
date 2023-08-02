package test;
import liste_pile.*;
import hanoi.*;
import java.util.*;


public class Test {
    public static void test_aleatoire(){

        //declaration et instanciation des piles
        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();
        PileEntiers tempP1 = new PileEntiers();

        Random rn = new Random();
        Integer sup = null;


        //Initialisation de la pile avec des nombre aleatoires
        System.out.println("Initialisation pile P1");
        for(int i=0; i<5; i++) {

            System.out.println("Element n° " + (i+1));
            P1.Empiler(rn.nextInt(100));
        }


        //passage par une pile intermediaire pour ne pas inverser l'ordre
        System.out.println("\nInitialisation de la pile intermediaire");
        for(int i=0; i<5; i++) {
            sup = P1.Depiler();
            tempP1.Empiler(sup);
        }


        //depilement de la pile intermediaire pour ensuite empiler vers P1 et P2
        System.out.println("\nDepilement de la pile intermediaire");
        for(int i=0; i<5; i++) {
            sup = tempP1.Depiler();

            System.out.println("\nReempilement dans la pile 1");
            P1.Empiler(sup);
            //s'ils sont pairs
            if(sup%2==0) {
                System.out.println("\nPile 2");
                P2.Empiler(sup);

            }
            else
            {
                System.out.println("\nPile 3");
                P3.Empiler(sup);
            }

        }

        //affichage des resultats
        System.out.println("\n Affichage des piles");
        System.out.println("\n PILE1");
        P1.DepilerTout();

        System.out.println("\n PILE1 prime");
        tempP1.DepilerTout();

        System.out.println("\n PILE2");
        P2.DepilerTout();


        System.out.println("\n PILE3");
        P3.DepilerTout();
    }

    public static void main(String []args){

        int choix = 0;
        Scanner sc = new Scanner(System.in);

        do {

            //menu
            do {
                System.out.println("\nQue voulez-vous faire ?");
                System.out.println("\t1)Trier une pile par parite");
                System.out.println("\t2)Tours de Hanoi");
                System.out.println("\t3)Quitter");
                System.out.print("Votre choix : ");
                choix = sc.nextInt();

            }while(choix<1 || choix>3);

            //exo3
            if(choix==1)
                test_aleatoire();

            //exo4
            if(choix==2) {
                Hanoi jeuHanoi = new Hanoi();
                jeuHanoi.SaisirNbDisques();
                jeuHanoi.RemplirPremierePile();
                jeuHanoi.afficherTours();

                jeuHanoi.Resoudre(jeuHanoi.getN(), jeuHanoi.getTour1(), jeuHanoi.getTour2(), jeuHanoi.getTour3());
            }

        }while(choix!=3);
    }


}
