public class Klas {

    //Declaratie van een array
    //een array geef je aan met [] bij de declaratie
    //een array begint bij 0
    Projectgroep[] projectgroepen;

    public Klas() {
        //bij initialisatie geef je aan hoeveel items er in de array zitten
        //de vijf betekend 0 tot en met 4
        this.projectgroepen = new Projectgroep[5];

        //Hier vullen we de array met lege projectgroepen.
        //Een array pak je iets uit door middel van indexing ([i] waarbij i het nummer in de array is vanaf 0)
        for (int i = 0; i < projectgroepen.length; i++) {
            projectgroepen[i] = new Projectgroep();
        }
    }
}
