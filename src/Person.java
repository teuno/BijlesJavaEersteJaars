public class Person {
    //private betekend dat alleen in een instantie van deze klasse een variabel aangepast kan worden.
    //protected betekend dat in een child klasse van deze klasse je het variable ook kan aanpassen.
    //public betekend dat het variable overal aangepast kan worden.
    //Als er niets bij staat is een variabel public.
    protected int id;
    private int schoenmaat;
    protected String naam;
    protected double lengte;

    //getters en setters zodat protect en private variabelen veranderd kunnen worden.
    // De private en protected variabelen zijn geencapsuleerd (encapsulation)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoenmaat() {
        return schoenmaat;
    }

    public void setSchoenmaat(int schoenmaat) {
        this.schoenmaat = schoenmaat;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    //constructors met constuctor chaining
    //Als er geen constructor met parameters is wordt er standaard een lege constructor aangemaakt.
    //Als er wel een constructor met parameters is moet je deze zelf aanmaken.

    public Person(){}

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String naam){
        this(id);
        this.naam = naam;
    }

    public Person(int id, String naam, double lengte) {
        this(id,naam);
        this.lengte = lengte;
    }

    public Person(int id, int schoenmaat, String naam, double lengte) {
        this(id,naam, lengte);
        this.schoenmaat = schoenmaat;
    }

    //constructor met 2 ints werkt, want compiler kijkt naar types en er is nog geen constructor met 2 int parameters
    public Person(int id, int schoenmaat) {
        this.id = id;
        this.schoenmaat = schoenmaat;
    }

//    dit compilt niet, want er is al een constuctor met 1 int parameter
//    public Person(int schoenmaat) {
//        this.schoenmaat = schoenmaat;
//    }




    //Methoden

    //dit is een methode. void betekend dat er niets gereturnd wordt.
    public void printIets(){
        System.out.println("er wordt iets geprint");
    }

    //een overload van de printIets methode. Twee methoden met dezelfde naam kan, omdat er een parameter in de methode zit.
    public void printIets(String iets){
        System.out.println(iets);
    }

    //Ook hier kan de duplicatie niet, vanwege dat er naar parameter types wordt gekeken en niet naam.
//    public void printIets(String anders){
//        System.out.println(anders);
//    }

    //dit werkt wel,want het type is anders
    public void printIets(int anders){
        System.out.println(anders);
    }

    //Wat een methode returnt maakt niet uit voor method overloading. Hierdoor kan je ook
    // geen methode hebben met dezelfde naam en parameters als er iets anders wordt gereturnt
//    public int printIets(String anders){
//        System.out.println(anders);
//        return 1;
//    }


    @Override
    public String toString() {
        return "de persoon met id "+id+ " schoenmaat "+schoenmaat+" en lengte "+lengte+" heet "+naam;
    }
}
