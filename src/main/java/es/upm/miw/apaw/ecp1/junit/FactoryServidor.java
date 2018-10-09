package es.upm.miw.apaw.ecp1.junit;

public class FactoryServidor extends Observable<Archivo> {

    private static FactoryServidor factoryServidor;
    private Servidor servidor;

    public static FactoryServidor getFactory(){
        if(factoryServidor == null){
            factoryServidor = new FactoryServidor();
        }
        return factoryServidor;
    }

    public void borrarArchivos() {
        this.servidor.borrarArchivos();
    }

    public Servidor getServidor() {
        if(this.servidor == null){
            this.servidor = new Servidor();
        }
        return this.servidor;
    }

    public void addArchivo(Archivo archivo){
        if(this.servidor == null){
            this.servidor = new Servidor();
        }
        this.servidor.setArchivo(archivo);
        this.notify(archivo);
    }
}
