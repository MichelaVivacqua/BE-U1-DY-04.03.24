public class Esercizio3 {

    public static void main(String[] args) {
        double result = perimetroRettangolo(4.4, 7.7);
        System.out.println("Il prodotto è: " + result);

        int numero = 7;
        int risultato = pariDispari(numero);
        System.out.println("Il numero " + numero + " è " + (risultato == 0 ? "pari" : "dispari"));

        double lato1 = 4.0;
        double lato2 = 7.0;
        double lato3 = 9.9;

        double area = areaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
    }

    public static double perimetroRettangolo(double base, double height) {
        return base * height;

    }
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        // Calcolo del semiperimetro
        double semiperimetro = (lato1 + lato2 + lato3) / 2;

        // Calcolo dell'area utilizzando la formula di Erone
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));

        return area;
    }
}