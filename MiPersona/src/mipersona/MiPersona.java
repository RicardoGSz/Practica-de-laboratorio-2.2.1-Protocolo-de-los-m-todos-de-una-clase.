package mipersona;

class Persona {
    //edad, sexo, estatura, peso, pais de origen
    int edad;
    String S;
    double estatura;
    float peso;
    String Origen;
    
    //Creacion de set de cada atributo
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(String S){
        this.S = S;
    }
    
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setOrigen(String Origen){
        this.Origen = Origen;
    }
    
    //Creacion get de cada atributo
    public int getEdad(){
        return edad;
    }
    
    public String getSexo(){
        return S;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public String getOrigen(){
        return Origen;
    }
    
}

class Rutinas {
    int sentadillas;
    String alimento;
    int horas_dormido;
    
    public void hacerEjercicio(int sentadillas){
        this.sentadillas = sentadillas;
    }
    
    public int GethacerEjercicio(){
        return sentadillas;
    }
    
    public void Dormir(int horas_dormido){
        this.horas_dormido = horas_dormido;
    }
    
    public int GetDormir(){
        return horas_dormido;
    }
    
    public static void Comer(String alimento) {
        System.out.println(alimento + " ha sido ingerido");
    }
}

public class MiPersona {
    public static void main(String[] args) {
        Persona perso = new Persona();
        Rutinas hacer = new Rutinas();
        
        perso.setEdad(20);
        perso.setEstatura(1.80);
        perso.setOrigen("Chiapas");
        perso.setPeso(78);
        perso.setSexo("Hombre");
        
        hacer.hacerEjercicio(3);
        hacer.Dormir(3);
        
        
        System.out.println("Edad: "+perso.getEdad());
        System.out.println("Estatura: "+perso.getEstatura());
        System.out.println("Origen: "+perso.getOrigen());
        System.out.println("Peso: "+perso.getPeso());
        System.out.println("Sexo: "+ perso.getSexo());
        System.out.println("Horas dormidas: "+hacer.GetDormir());
        System.out.println("Sentadillas hechas: "+hacer.GethacerEjercicio());
        Rutinas.Comer("Hamburguesa");
        
        
        
    }
    
}
