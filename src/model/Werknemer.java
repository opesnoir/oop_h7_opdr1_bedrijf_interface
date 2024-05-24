package model;

public class Werknemer extends Persoon {
    private final static int AANTAL_MAANDEN_IN_EEN_JAAR = 12;
    private final static double MIN_MAAND_SALARIS = 0.00;
    private final static double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;

    //constructor
    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        this.setMaandSalaris(maandSalaris);
    }

    // je wilt dat de tweede constructor de eerste gebruikt met standaardwaarden. Dus hier gebruik je this ipv super
    public Werknemer(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling(), MIN_MAAND_SALARIS);
    }

    public Werknemer() {
        this(DEFAULTWAARDE_NAAM);
    }

    public double berekenJaarInkomen() {
        if (heeftRechtOpBonus()) {
            return (maandSalaris * AANTAL_MAANDEN_IN_EEN_JAAR) + maandSalaris;
        } else {
            return maandSalaris * AANTAL_MAANDEN_IN_EEN_JAAR;
        }
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS; //retourneert true als maandSalaris groter dan of gelijk aan GRENSWAARDE_BONUS is, anders retourneert het false
    }

    //toString
    @Override
    public String toString() {
        String basisZin = super.toString() + " en is een werknemer met recht op een bonus";
        if (heeftRechtOpBonus()) {
            return basisZin;
        } else {
            return basisZin.replace("met", "zonder");
        }
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris >= MIN_MAAND_SALARIS) {
            this.maandSalaris = maandSalaris;
        } else {
            System.out.printf("Het maandsalaris moet gelijk aan of boven €%2f, zijn. Het maandsalaris wordt op €%2f gezet.", MIN_MAAND_SALARIS, MIN_MAAND_SALARIS);
        }
    }
}
