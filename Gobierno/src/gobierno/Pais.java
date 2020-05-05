package gobierno;
public class Pais {
    //Atributos
    private String nombrePresidente;
    private ListaRegiones regiones;
    
    //Contructores
    public Pais(String nombrePresidente, int tamRegion){
        this.nombrePresidente= nombrePresidente;
        regiones = new ListaRegiones(tamRegion);
    }
    
    public boolean agregarManifestante(Manifestante nuevo, int numeroRegion){
        return regiones.agregarManifestante(nuevo, numeroRegion);
    }
}
