public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Esercizio1 ");

        // Moltiplicazione
        int risultato = moltiplicazione(4, 7);
        System.out.println("Il prodotto è: " + risultato);

        // Concatenazione
        String risultatoStringa = concatenazione("Mi", 4);
        System.out.println("Le stringhe concatenate sono: " + risultatoStringa);

        // InserisciInArray
        String[] arrayOriginale = {"uno", "due", "tre", "quattro", "cinque"};
        String nuovaStringa = "inserita";
        String[] arrayModificato = inserisciInArray(arrayOriginale, nuovaStringa);
        System.out.println("Array originale:");
        stampaArray(arrayOriginale);
        System.out.println("Array modificato:");
        stampaArray(arrayModificato);
    }

    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenazione(String string1, int num3) {
        return string1 + num3;
    }

    public static String[] inserisciInArray(String[] arrayOriginale, String nuovaStringa) {
        String[] nuovoArray = new String[arrayOriginale.length + 1];
        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = arrayOriginale[i];
        }
        nuovoArray[2] = nuovaStringa;
        for (int i = 2; i < arrayOriginale.length; i++) {
            nuovoArray[i + 1] = arrayOriginale[i];
        }
        return nuovoArray;
    }

    public static void stampaArray(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
