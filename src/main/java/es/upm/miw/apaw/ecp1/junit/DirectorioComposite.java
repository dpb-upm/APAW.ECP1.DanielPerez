package es.upm.miw.apaw.ecp1.junit;

public class DirectorioComposite extends ArchivoComponent {

    private java.util.List<ArchivoComponent> list;

    public DirectorioComposite() {
        if(this.list == null)
            this.list = new java.util.ArrayList<>();
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
    public void remove(ArchivoComponent ac) {
        list.remove(ac);
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
