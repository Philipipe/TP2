package ca.qc.bdeb.prog2.TP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean quitter = false;
        
        String choix;
        
        Scanner read = new Scanner(System.in);

        ArrayList<String> elementListe = new ArrayList();

        do {

            System.out.println("╔═════════════════╦═════════════════╦═════════════════╗\n"
                    + "║    Afficher     ║     Nouveau     ║    Modifier     ║\n"
                    + "║                 ║                 ║                 ║\n"
                    + "╟─────────────────╫─────────────────╫─────────────────╢\n"
                    + "║ [E]lements      ║ [C]réer nouvel  ║ [A]fficher liste║\n"
                    + "║ [U]nités        ║  élément        ║                 ║\n"
                    + "║ [S]tructures    ║                 ║                 ║\n"
                    + "║                 ║                 ║                 ║\n"
                    + "╟─────────────────╨─────────────────╨─────────────────╢\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "║                                                     ║\n"
                    + "╟─────────────────╥═══════════════════════════════════╝\n"
                    + "║ Sauvergarder et ║\n"
                    + "║ [Q]uitter       ║\n"
                    + "╚═════════════════╝");
            
            choix = read.nextLine();
            
            switch(choix) {
                
                case E : afficher(choix);
                
            }

        } while (!quitter);

    }

    public static void afficher() {

    }

}
