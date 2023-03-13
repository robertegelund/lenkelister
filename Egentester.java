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
        il.leggTil(1, "paaaa");
        System.out.println(il);
        System.out.println(il.stoerrelse());

        il.fjern();
        il.fjern();
        il.fjern();

        
        // il.fjern();
        
        // il.leggTil(0, "Neida, ");
        // il.leggTil(1, "deg");
        // il.leggTil("deg");
        // il.sett(0, "Joda");
        // il.sett(3, "");
        // il.fjern(3);
        // System.out.println(il);
        // System.out.println(il.stoerrelse());
        // il.fjern(0);
        // System.out.println(il);
        // System.out.println(il.stoerrelse());
    }
}
