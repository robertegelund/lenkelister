class Egentester {
    public static void main(String[] args) {
        // Koe<String> koe =  new Koe<>();
        
        // koe.leggTil("Hei");
        // koe.leggTil("paa");
        // koe.leggTil("deg");
        
        // System.out.println(koe);

        IndeksertListe<String> il = new IndeksertListe<>();
        il.leggTil(0, "Hei");
        il.leggTil(1, "paa");
        il.leggTil(0, "Neida, ");
        il.leggTil(3, "deg");
        il.leggTil("deg");
        il.sett(0, "Joda");
        il.sett(3, "");
        il.fjern(3);
        il.fjern(0);

        System.out.println(il);
    }
}
