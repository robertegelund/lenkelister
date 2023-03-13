class Egentester {
    public static void main(String[] args) {
    
        Stabel<String> stbl = new Stabel<>();

        stbl.leggTil("Hei");
        stbl.leggTil("paa");
        stbl.leggTil("deg");

        System.out.println(stbl);

        stbl.fjern();

        System.out.println(stbl);



    }
}
