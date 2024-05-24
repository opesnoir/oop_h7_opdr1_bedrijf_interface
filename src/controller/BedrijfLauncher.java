package controller;
import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BedrijfLauncher {
    public static void main(String[] args) {
        // maak array met afdelingen, vul hem daarna
        Afdeling[] afdeling = new Afdeling[4];
        afdeling[0] = new Afdeling("Uitvoering", "Hilverum");
        afdeling[1] = new Afdeling("Support", "Amsterdam");
        afdeling[2] = new Afdeling("Management", "Almere");
        afdeling[3] = new Afdeling("Documentatie", "Gouda");

        // maak een verander ArrayList in List en declareer een new ArrayList<>();
        List<Persoon> persoonList = new ArrayList<>();
        persoonList.add(new Werknemer("Mark", "Den Haag", afdeling[2], 10000));
        persoonList.add(new Werknemer("Caroline", "Delf", afdeling[1], 4000));
        persoonList.add(new Zzper("Klaas", "Diemen", afdeling[0], 50.00));
        persoonList.add(new Zzper("Ronals", "Zaandam", afdeling[0], 80.00));
        persoonList.add(new Zzper("Jannie", "Utrecht", afdeling[0], 60.00));
        persoonList.add(new Zzper("Anne", "Zwolle", afdeling[0], 40.00));
        //voeg vrijwilligers toe
        persoonList.add(new Vrijwilliger("Ambi", "Amsterdam", afdeling[0]));
        persoonList.add(new Vrijwilliger("Naledi", "Gaborone", afdeling[1]));
        persoonList.add(new Vrijwilliger("Ceren", "Istanboel", afdeling[2]));
        persoonList.add(new Vrijwilliger("Haining", "Shaoxing", afdeling[3]));

        // gebruik for-each met instanceof om alle zzp'ers in te huren voor 320 uur
        for (Persoon persoon : persoonList){ // for each loop zegt: voor elk datatype : [:=in] in de array met de naam ... doe...
            if (persoon instanceof Zzper){ // instance of zegt parent is persoon en de instantie is zzper (is A relatie)
                ((Zzper) persoon).huurIn(320); // type casten in, om zo bij de methode huurIn te kunnen komen
            }
            if (persoon instanceof Vrijwilliger){
                ((Vrijwilliger)persoon).huurIn(160); // type casten om bij methode huurIn te komen voor de vrijwilliger
            }
        }

        System.out.println(persoonList.get(2));
        //gebruik for-each om de toonJaarInkomen() te printen
        //sorteer de personenlijst op alfabetische volgorde
        Collections.sort(persoonList);
        for (Persoon persoon : persoonList){
            System.out.println(persoon); // print elke instantie, Java zorgt ervoor dat de juiste methode (bijv toString) voor het werkelijke type van het object wordt gebruikt.
            toonJaarInkomen(persoon);
        }
    }


    // methode om het jaarinkomen te tonen
    public static void toonJaarInkomen(Persoon persoon){
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }



}
