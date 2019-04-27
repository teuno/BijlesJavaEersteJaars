public class Main {

    public static void main(String[] args) {
        Person nathan = new Person();
        nathan.setId(82);
        nathan.setLengte(1.85);
        nathan.setSchoenmaat(45);
        nathan.setNaam("persoon 1");
        System.out.println(nathan);
        Person teuno = new Person(1,"persoon 2");
        teuno.setSchoenmaat(44);
        teuno.setLengte(1.84);
        System.out.println(teuno);

        Projectlid plid = new Projectlid(1, "projectlid 1");
        System.out.println(plid);

        Klas k = new Klas();
        System.out.println(k);
    }
}
