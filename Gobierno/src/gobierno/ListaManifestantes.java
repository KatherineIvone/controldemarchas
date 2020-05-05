package gobierno;
public class ListaManifestantes {
    private Manifestante manifestantes[][];
    
    public ListaManifestantes(int filaMani, int ColuMani){
        manifestantes= new Manifestante[filaMani][ColuMani];
    }
    
    
    public boolean agregarManifestante(Manifestante nuevo){
        boolean existe=false;
        for(int i=0; i<manifestantes.length; i++){
            for(int j=0; j< manifestantes[0].length; j++){
               if(manifestantes[i][j]!=null){
                    if(manifestantes[i][j].getRut().equals(nuevo.getRut())){
                        existe=true;
                    }   
               } 
            }
        }
        if(existe==false){
            if(nuevo.getIndicePeligrosidad()> peligrosidadEnFila()){
                for(int i=0; i<manifestantes.length; i++){
                    for(int j=0; j< manifestantes[0].length; j++){
                        if(manifestantes[0][j]==null){
                            manifestantes[0][j] = nuevo;
                        }
                    }
                }    
            }else{
                for(int i=0; i<manifestantes.length; i++){
                    for(int j=0; j< manifestantes[0].length; j++){
                        if(manifestantes[i][j]==null){
                            manifestantes[i][j]=nuevo;
                        }
                    }
                }
            }
        }
        return false;
    
    }
    
    public double peligrosidadEnFila(){
        double suma=0.0;
        double promedio=0.0;
        double peligrosidad=0.0;
        int contador=0;
        for(int i=0; i< 1; i++){
            for(int j=0; j<manifestantes[0].length; j++){
                if(Math.abs(1-manifestantes[i][j].getIndicePeligrosidad())>0.00000001){
                    peligrosidad = manifestantes[i][j].getIndicePeligrosidad()* 0.2;
                    suma+= peligrosidad;
                    contador++;
                }else{
                    peligrosidad= manifestantes[i][j].getEdad()*0.08;
                    suma+= peligrosidad;
                    contador++;
                }
            }
        }
        if(contador> 0){
            promedio= suma/contador;
        }
        return promedio;
    }
}
