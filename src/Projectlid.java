
//Extends betekend dat een klasse toegang heeft tot al de protected variabelen van de Parent klasse (Person in de geval).
public class Projectlid extends Person {

    //Een default waarde die wordt meegegeven aan een variabel
    private int projectID =0;
    //constructors

    //Ook hier wordt een lege constructor aangemaakt als die er niet is. Anders meot je ze weer zelf aanmaken.
    public Projectlid() {
    }
    //In een constructor van een child klasse moet je de constructor van de parent klasse aanroepen door middel van super.
    // Dit moet altijd op de eerste regel van de klasse, want anders compilt het neit.
    public Projectlid(int id) {
        super(id);
        //Niet elke waarde die in de klasse gezet wordt moet via een cosntructor meegegeven worden.
        this.projectID = 5;
    }

    public Projectlid(int id, String naam) {
        //Als je deze regel uitkomt zie je dat super eerst moet komen, omdat het anders niet compilt
//        this.projectID = 5;
        super(id, naam);
    }
}
