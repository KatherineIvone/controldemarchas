package gobierno;
public class Manifestante {
    //Atributos
    private String rut;
    private String nombre;
    private int edad;
    private double indicePeligrosidad;
    
    //Contructores
    public Manifestante(String rut,String nombre, int edad,double indicePeligrosidad ){
        this.rut= rut;
        this.nombre = nombre;
        this.edad= edad;
        this.indicePeligrosidad= indicePeligrosidad;
    }
    
    public double getIndicePeligrosidad(){
        return indicePeligrosidad;
    }
    
    public String getRut(){
        return rut;
    }
    public int getEdad(){
        return edad;
    }
    
}
