package gobierno;
public class Region {
    //Atributos
    private int numeroRegion;
    private String nombreRegion;
    private String nombreGobernador;
    private ListaManifestantes manifestantes; 
    
    //Constructores
    public Region(int numeroRegion, String nombreRegion, String nombreGobernador, int filaMani, int ColuMani){
        this.numeroRegion = numeroRegion;
        this.nombreRegion = nombreRegion;
        this.nombreGobernador = nombreGobernador;
        this.manifestantes = new ListaManifestantes (filaMani, ColuMani);
    } 
    
    public int getNumRegion(){
        return numeroRegion;
    }
    
    public boolean agregarManifestante(Manifestante nuevo){
        return manifestantes.agregarManifestante(nuevo);
    }
    
}
