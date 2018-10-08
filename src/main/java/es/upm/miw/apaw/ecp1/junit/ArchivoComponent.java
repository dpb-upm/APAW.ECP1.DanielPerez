package es.upm.miw.apaw.ecp1.junit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ArchivoComponent {

    public abstract void add(ArchivoComponent cc);

    public abstract boolean isComposite();

    public Iterator<ArchivoComponent> iterator() {
        List<ArchivoComponent> list = new LinkedList<>();
        addAllChildren(list);
        list.add(this);
        return list.iterator();
    }

    protected abstract void addAllChildren(List<ArchivoComponent> list);

    public abstract void remove(ArchivoComponent cc);

    public abstract int total();

    public abstract String view();
}
