package es.upm.miw.apaw.ecp1.junit;

import java.util.List;

public class DirectorioComposite extends ArchivoComponent {

    private List<ArchivoComponent> list;

    public DirectorioComposite() {
        if(this.list == null)
            this.list = new java.util.ArrayList<ArchivoComponent>();
    }

    @Override
    public void add(ArchivoComponent ac) {
        list.add(ac);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    protected void addAllChildren(List<ArchivoComponent> list) {
        for (ArchivoComponent component : this.list) {
            component.addAllChildren(list);
            list.add(component);
        }
    }

    @Override
    public void remove(ArchivoComponent ac) {
        list.remove(ac);
    }

    @Override
    public int total() {
        return this.list.size();
    }

    @Override
    public String view() {
        StringBuilder result = new StringBuilder();
        for (ArchivoComponent item : list) {
            result.append(item.view()+ "\n");
        }
        return result.toString();
    }
}
