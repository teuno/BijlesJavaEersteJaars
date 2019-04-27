import java.util.ArrayList;
import java.util.List;

public class Projectgroep {
    //ArrayList is een zelfgroeiende lijst in Java
    private List<Projectlid> projectleden; //declaratie variable
    public static int groepCounter = 0; //Static betekend dat al de instanties van de klasse dezelfde waarde hebben.
    //Initialisatie en declaratie van een variabel
    public final int groepnummer = groepCounter; //final betekend dat de waarde niet meer aangepast kan worden

    public Projectgroep() {
        //this. hoeft niet, als er niet meerdere variabelen met dezelfde naam zijn.
        projectleden = new ArrayList<>();//initialisatie variabel
        //je voegt dingen aan arraylist toe met .add()
        //je kunt ook collecties ineens toevoegen met addAll()
        groepCounter++;

    }
}
