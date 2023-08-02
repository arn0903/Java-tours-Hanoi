package hanoi;
import  liste_pile.*;
import java.util.Scanner;

public class Hanoi {

    //attributs n: nombre de disques et les 3 tours
    private int n;
    PileEntiers tour1;
    PileEntiers tour2;
    PileEntiers tour3;

    //constucteur
    public Hanoi(){
        n = 0;
        tour1 = new PileEntiers();
        tour2 = new PileEntiers();
        tour3 = new PileEntiers();
    }


    //Methode pour saisir le nombre de disques
    public void SaisirNbDisques(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Saisir le nombre de disques: ");
            n = sc.nextInt();

            if(n<=0)
                System.out.println("Vous ne pouvez pas saisir un nombre de disques negatif ou nul");
        }while(n<=0);
    }


    //Methode pour remplir la premiere tour
    public void RemplirPremierePile(){
        for(int i = n; i >=1; i--){
            tour1.Empiler(i);
        }
    }


    //Methode pour afficher les tours
    public void afficherTours(){
        System.out.print("Tour 1 : ");
        tour1.afficherListe();
        System.out.println();
        System.out.print("Tour 2 : ");
        tour2.afficherListe();
        System.out.println();
        System.out.print("Tour 3 : ");
        tour3.afficherListe();
        System.out.println();
        System.out.println();

    }


    /**
     * methode pour resoudre le jeu de Hanoi
     *@param k: un entier, T1: tour initiale, T2: tour intermediaire, T1: tour finale
     */
    public void Resoudre(int k, PileEntiers T1, PileEntiers T2, PileEntiers T3){

        //cas d'arret
        if (k == 1) {
            T3.Empiler(T1.Depiler());
            afficherTours();
        }

        //cas general
        else {
            //premer appel recursif
            Resoudre(k - 1, T1, T3, T2);
            T3.Empiler(T1.Depiler());
            afficherTours();
            //second appel recursif
            Resoudre(k - 1, T2, T1, T3);
        }

    }


    public int getN()
    {
        return n;
    }

    public PileEntiers getTour1()
    {
        return tour1;
    }

    public PileEntiers getTour2()
    {
        return tour2;
    }

    public PileEntiers getTour3()
    {
        return tour3;
    }



}






