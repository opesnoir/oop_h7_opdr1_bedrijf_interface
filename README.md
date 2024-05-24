# oop_opdracht7_bedrijf_interface
compareTo methode
sort: Collections.sort(persoonList); //voorbeeld

//compareTo() toegevoegd waarin je de naam vergelijkt
    @Override
    public int compareTo(Persoon ander) {
        return this.naam.compareTo(ander.naam);
    }

//gebruik for-each om de toonJaarInkomen() te printen
        //sorteer de personenlijst op alfabetische volgorde
        Collections.sort(persoonList);
        for (Persoon persoon : persoonList){
            System.out.println(persoon); // print elke instantie, Java zorgt ervoor dat de juiste methode (bijv toString) voor het werkelijke type van het object wordt gebruikt.
            toonJaarInkomen(persoon);
        }
    }