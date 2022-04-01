package Ejercicio2;

public class Reloj {
    
    protected int hora,min,seg;
    
    // Constructores
    public Reloj(int hora, int min, int seg){
        this.hora=hora;
        this.min=min;
        this.seg=seg;
    }
    public Reloj(){
        this.hora=0;
        this.min=0;
        this.seg=0;
    }
    
    // Metodos
    public void setTime(int hora, int min, int seg){ // Establece hora
        this.hora=hora;
        this.min=min;
        this.seg=seg;
    }
    public String display(){ // Hora actual
        return "Son las "+hora+":"+min+":"+seg;
    }
    public void tictac(){ // Incrementar un segundo
        seg++;
    }
    
    // Getters
    public int getHora() {
        return hora;
    }
    public int getMin() {
        return min;
    }
    public int getSeg() {
        return seg;
    }
    
    // Setters
    public void setHora(int hora) {
        this.hora=hora;
    }
    public void setMin(int min) {
        this.min=min;
    }
    public void setSeg(int seg) {
        this.seg=seg;
    }   
}
