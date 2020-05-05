package gobierno;
public class ListaRegiones {
    //Atributos
    private Region regiones[];
    private int pLibre;
    
    public ListaRegiones(int tamRegion){
        this.regiones= new Region[tamRegion];
        this.pLibre=0;
    }
    
    public boolean agregarManifestante(Manifestante nuevo, int numeroRegion){
        for(int i=0; i<pLibre; i++){
            if(regiones[i].getNumRegion()==numeroRegion){
                return regiones[i].agregarManifestante(nuevo);
            }
        }
        return false;
    }
}
