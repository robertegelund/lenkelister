class Stabel<E> extends Lenkeliste<E> {
    //I en stabel legges det til og fjernes elementer fra toppen

    @Override
    public void leggTil(E data) {
        Node nyNode = new Node(data);
        stoerrelse++;
        if(forste == null) {
            forste = siste = nyNode;
            return;
        }
        nyNode.neste = forste;
        forste = nyNode;
    }

}
