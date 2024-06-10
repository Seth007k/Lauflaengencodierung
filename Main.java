package Main;

public class Main {
    public static void main(String[] args) {

        String testString = "kkkeeennnyyykkk";                 // Hier erstelle ich einen String mit mehreren gleichen Zeichen

        String encodeString = encode(testString);           // Hier speichere ich meinen codierten String in encodeString ab und erstellter String kommt in die Methode und wird "verarbeitet"

        System.out.println(encodeString);                   // Hier gebe ich den codierten String aus
    }

    public static String encode(String inputString){

        StringBuilder result = new StringBuilder();         // StringBuilder wird erstellt um den String nachher "zusammenzubauen"

        char aktuellesZeichen = inputString.charAt(0);      // Erstes Zeichen in meinem String wird in aktuelles Zeichen als Zeichen gespeichert

        int count = 1;                                      // Zähler um gleiche Zeichen zu zählen

        for (int i = 1; i < inputString.length(); i++) {    // Ich gehe durch jedes Zeichen des Strings
            char naechstesZeichen = inputString.charAt(i);  // Ich speichere den nächsten index des String in nächstesZeichen als Zeichen ab
            if(aktuellesZeichen == naechstesZeichen){       // Ich prüfe ob nächstesZeichen mit aktuellesZeichen übereinstimmt,
                count++;                                    // wenn es übereinstimmt zähle ich meinen Zähler hoch
            }else{
                result.append(count).append(aktuellesZeichen);  // Ich "baue" meinen String mit dem hochgezählten Zähler des aktuellen Zeichens
                aktuellesZeichen = naechstesZeichen;            // Ich speichere das bereits geprüfte Zeichen in aktuelles Zeichen ab um den nächsten index prüfen zu können
                count = 1;                                      // Ich setze Zähler wieder auf 1 um das nächste Zeichen zu zählen
            }


        }
        result.append(count).append(aktuellesZeichen);      // Hier "baue" ich meinen String welcher dann beim return Statement zurückgegeben und dann in der Konsole ausgegeben wird
        return result + " = Codierter String";

    }
}