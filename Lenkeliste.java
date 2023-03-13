abstract class Lenkeliste<E> implements Liste<E> {
    private Node forste = null; //null hvis ingen elementer i lista, en nodereferanse ellers
    private Node siste = null; ////null hvis ingen elementer i lista, en nodereferanse ellers
    private int stoerrelse = 0; //0 hvis forste = siste = null (ingen listeelementer), >0 ellers

    private class Node {
        Node neste = null; //null hvis bare én node i lista, en nodereferanse ellers
        E data = null; //aldri null naar et nodeobjekt er opprettet

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public void leggTil(E data) {
        Node nyNode = new Node(data);
        stoerrelse++;
        if(forste == null) {
            forste = siste = nyNode;
            return;
        }
        siste.neste = nyNode;
        siste = nyNode;
    }

    @Override
    public E hent() throws UgyldigListeindeks {
        if(stoerrelse == 0) throw new UgyldigListeindeks(0);
        return forste.data;
    }

    @Override
    public E fjern() throws UgyldigListeindeks {
        if(stoerrelse == 0) throw new UgyldigListeindeks(-1);
        
        E forsteVerdi = forste.data;
        if(forste != siste) {
            forste = forste.neste;
        } else {
            forste = siste = null;
        }
        
        stoerrelse--;
        return forsteVerdi;
    }

    @Override
    public int stoerrelse() { 
        return stoerrelse; 
    }

    @Override 
    public String toString() {
        String innhold = "";
        Node peker = forste;
        while(peker != null) {
            innhold += peker.data + "\n>>";
            peker = peker.neste;
        }
        return innhold;
    }
}