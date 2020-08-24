// --------------------------------------------
// Datei:			Zahlenratspiel (Java)
// Datum:			17.08.2020
// Ersteller:		Florian Buechi
// Version:		      1.1
// Änderungen:		
// Das Spiel kann neu gestartet werden.					
// Beschreibung:
// Das Programm erstellt eine Zahl zwischen 0-100. Du kannst diese dann erraten.
// --------------------------------------------

import java.util.Random;

import javax.lang.model.util.ElementScanner14;

public class Zahlenratspiel {

      public static void main(final String[] args) {

            boolean nstart = true;
            while (nstart) {
                  System.out.println("Willkommen zum Zahlenratspiel!");
                  System.out.println("Der Computer speichert jetzt eine Zahl zwischen 1-100."); // Ausgabe Text
                  System.out.println("Erraten sie diese Zahl. Viel Spass!");
                  System.out.println("");
                  Random random = new Random();
                  int randomnumber = random.nextInt(100); // Erstellt eine Random Zahl zwischen 1-100
                  String erraten;
                  boolean weiter = true;
                  int versuche = 0;

                  while (weiter) {
                        System.out.println("");
                        System.out.println("Zahl zum Raten eingeben:"); // Ausgabe von Text
                        erraten = System.console().readLine(); // Liest die Konsole ein
                        versuche = versuche + 1; // Fügt ein Versuch hinzu
                        int zerraten = 0;
                        try {
                              zerraten = Integer.parseInt(erraten); // Probiert aus ob die Eingabe eine Zahl ist.
                              if (zerraten > 100 || zerraten < 0) { // Filtern ob Zahl zwischen 0-100 ist.
                                    System.out.println("Fehler! Zahl zwischen 0-100 eingeben!"); // Fehlermeldung wenn
                                                                                                 // Zahl nicht zwischen
                                                                                                 // 0-100 ist.
                              } else {
                                    if (zerraten > randomnumber) {
                                          System.out.println("Zahl zu gross!"); // Gibt an das die eingegebene Zahl zu
                                                                                // gross ist.
                                    } else if (zerraten < randomnumber) {
                                          System.out.println("Zahl zu klein!"); // Gibt an das die eingegebene Zahl zu
                                                                                // klein ist.
                                    } else {
                                          weiter = false; // Wenn die eingegebene Zahl erraten wurde --> Weiter
                                    }
                              }
                        } catch (final NumberFormatException e) {
                              System.out.println("Fehler! Zahl eingeben!"); // Fehlermeldung wenn keine Zahl
                        }

                  }

                  System.out.println("Yey! Erraten! die Zahl ist " + randomnumber + "."); // Ausgabe von Text mit der
                                                                                          // errateten Zahl
                  System.out.println("Sie haben " + versuche + " Versuche gebraucht."); // Ausgabe von Text mit der
                                                                                    // Anzahl von Versuchen

                  System.out.println("Wollem Sie nochmal spielen? Drücke die Taste J um das Spiel neu zu Satrten."); //Ausgabe von Text
                  String eingabeyn;
                  eingabeyn = System.console().readLine();  //Liest die Konsole ein

                  if (eingabeyn.equals("J")) 
                  {
                        System.out.println("Yuhuuu");                         //Ausgabe von Text
                        System.out.println("Das Spiel wird neu gestartet.");
                        System.out.println(".........................................");
                  }
                  else if (eingabeyn.equals("j"))
                  {
                        System.out.println("Yuhuuu"); //Ausgabe von Text
                        System.out.println("Das Spiel wird neu gestartet.");
                        System.out.println(".........................................");
                  }
                  else
                  {
                        System.out.println("Danke fürs Spielen bis zum nächsten Mal."); //Ausgabe von Text
                        nstart = false; //Ändert die While Schleife, so dass das ganze sich nicht neustartet sondern schliesst.
                  }
            }
      }

}