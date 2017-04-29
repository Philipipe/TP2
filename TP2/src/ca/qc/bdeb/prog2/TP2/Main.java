package ca.qc.bdeb.prog2.TP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        lireFichier();

        boolean quitter = false;

        String choix;

        Scanner read = new Scanner(System.in);

        ArrayList<Element> elementListe = new ArrayList();

        do {

            System.out.println("╔═════════════════╦═════════════════╦═════════════════╗\n"
                    + "║ Afficher                      ║ Nouveau                       ║ Modifier                      ║\n"
                    + "║                               ║                               ║                               ║\n"
                    + "╟─────────────────╫─────────────────╫─────────────────╢\n"
                    + "║ [E]lements                    ║ [C]réer nouvel                ║ [A]fficher liste              ║\n"
                    + "║ [U]nités                      ║  élément                      ║                               ║\n"
                    + "║ [S]tructures                  ║                               ║                               ║\n"
                    + "║                               ║                               ║                               ║\n"
                    + "╟─────────────────╨─────────────────╨─────────────────╨═══════════════════════════════════════════╗\n"
                    + "║\n"
                    + "║\n"
                    + "║\n"
                    + "║\n"
                    + "║\n"
                    + "║\n"
                    + "║\n"
                    + "╟─────────────────╥═══════════════════════════════════════════════════════════════════════════════╝\n"
                    + "║ Sauvergarder et               ║\n"
                    + "║ [Q]uitter                     ║\n"
                    + "╚═════════════════╝");

            choix = read.nextLine();

            switch (choix.toLowerCase()) {

                case "e":
                    afficher(choix, elementListe);
                    break;

                case "u":
                    afficher(choix, elementListe);
                    break;

                case "s":
                    afficher(choix, elementListe);
                    break;

                case "c":
                    creer(elementListe);
                    break;

                case "a":
                    modifier(elementListe);
                    break;

                case "q":
                    quitter = true;
                    break;

            }

        } while (!quitter);

    }

    public static void lireFichier() {

    }

    public static void afficher(String type, ArrayList<Element> elementListe) {
        
        boolean partie = false;
        
        switch (type) {

            case "e":

                menu(partie);
                
                for (int i = 0; i < 5; i++) {
                    
                    System.out.print("║ - ");
                    
                    System.out.println((elementListe.get(i)).getDescription());
                    
                }
                
                System.out.println("║\n║ ");
                
                if (elementListe.size() > 5) {
                    
                    System.out.println(" Pages : ");
                    
                    for (int i = 0; i < Math.ceil(elementListe.size() / 5) || i < 10; i++) {
                    
                        System.out.println("[" + i + 1 + "] ");
                    
                    }
                    
                    if (Math.ceil(elementListe.size() / 5) > 10) {
                        
                        System.out.println("... [" + Math.ceil(elementListe.size() / 5) + "]");
                        
                    }
                    
                }
                
                break;

            case "u":
                break;

            case "s":
                break;

        }

    }

    public static void creer(ArrayList<Element> elementListe) {

    }

    public static void modifier(ArrayList<Element> elementListe) {

    }

    public static void menu(boolean partie) {

        if (!partie) {

            System.out.println("╔═════════════════╦═════════════════╦═════════════════╗\n"
                    + "║    Afficher     ║     Nouveau     ║    Modifier     ║\n"
                    + "║                 ║                 ║                 ║\n"
                    + "╟─────────────────╫─────────────────╫─────────────────╢\n"
                    + "║ [E]lements      ║ [C]réer nouvel  ║ [A]fficher liste║\n"
                    + "║ [U]nités        ║  élément        ║                 ║\n"
                    + "║ [S]tructures    ║                 ║                 ║\n"
                    + "║                 ║                 ║                 ║\n"
                    + "╟─────────────────╨─────────────────╨─────────────────╢\n");

        } else {

            System.out.println("╟─────────────────╥═══════════════════════════════════╝\n"
                    + "║ [R]etour        ║\n"
                    + "║                 ║\n"
                    + "╚═════════════════╝\n");

        }

    }

}
