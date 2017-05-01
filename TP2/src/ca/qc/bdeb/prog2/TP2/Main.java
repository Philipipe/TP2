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
        
        Scanner read = new Scanner(System.in);
        
        int page = 1;
        
        int pagesTot = Math.ceil(elementListe.size() / 5);
        
        do {
            
            String choix;
        
            boolean partie = false;
        
            switch (type) {

                case "e":

                    menu(partie);
                
                    for (int i = page*5 - 5; i < 5; i++) {
                    
                        System.out.print("║ - ");
                    
                        System.out.println((elementListe.get(i)).getDescription());
                    
                    }
                
                    System.out.println("║\n║ ");
                
                    if (elementListe.size() > 5) {
                    
                        System.out.print(" Pages : ");
                    
                        for (int i = page; i <= pagesTot || i < 10; i++) {
                            
                            if (i = page) {
                                
                                System.out.print("{" + i + "} ");
                                
                            }
                    
                            else {
                                
                                System.out.print("[" + i + "] ");
                                
                            }
                            
                            // Pages : {1} [2] [3] [4] [5] [6] [7] [8] [9] [10] ... [22]
                            // Pages :  1   1   1   1   1   6   6   6   6   6   11
                            
                            // 5*Math.ceil((page/5)-1) + 1
                            
                            // Pages :  1   1   1   1   1   1   2   3   4   5   6   7   7   7   7   7   7
                            
                            // Math.ceil(Math.atan(page) + 1)

// => Pages : 1, 1, 1, ..., 1, 2, 3, 4, 5, 5, 5, 5, ..., 5

//if (page > 5 || page < pageTot - 5)
                    
                        }
                    
                        if (Math.ceil(elementListe.size() / 5) > 10) {
                        
                            System.out.print("... [" + Math.ceil(elementListe.size() / 5) + "]");
                        
                        }
                    
                    }
                    
                    partie = true;
                    
                    menu(partie);
                    
                    choix = read.nextLine();
                    
                    if (choix != "q") {
                        
                        if (Integer.parseInt(choix) <= pageTot) {
                            
                            page = Integer.parseInt(choix);
                            
                        }
                        
                    }
                
                    break;

                case "u":
                    break;

                case "s":
                    break;

            }
            
        } while(choix != "q");

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
