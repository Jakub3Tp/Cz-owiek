import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Czlowiek czlowiek = new Czlowiek("Adam", 21, Oczy.Piwne, Wlosy.Czarne);
        System.out.println(czlowiek
        );
        Scanner scanner = new Scanner(System.in);

            String imie, oczy, wlosy;
            int wiek;
            System.out.println("Podaj imie");
            imie = scanner.nextLine();
            System.out.println("Podaj wiek");
            wiek = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj kolor oczu");
            oczy = scanner.nextLine();
            Oczy o = switch (oczy) {
                case "Piwne" -> Oczy.Piwne;
                case "Niebieskie" -> Oczy.Niebieskie;
                case "Zielone" -> Oczy.Zielone;
                default -> null;
            };
        System.out.println("Podaj kolor włosów");
        wlosy = scanner.nextLine();
        Wlosy w = switch (wlosy) {
            case "Czarne" -> Wlosy.Czarne;
            case "Brazowe" -> Wlosy.Brazowe;
            case "Blond" -> Wlosy.Blond;
            case "Rude" -> Wlosy.Rude;
            case "Nienaturalne" -> Wlosy.Nienaturalne;
            default -> null;
        };
            Czlowiek c = new Czlowiek(imie, wiek, o, w);
        System.out.println(c);
    }
}