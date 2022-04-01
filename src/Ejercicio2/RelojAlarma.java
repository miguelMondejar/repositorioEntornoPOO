package Ejercicio2;

import javax.swing.JOptionPane;

public class RelojAlarma {
    
    protected Reloj r=new Reloj();
    protected int horaAlarma,minAlarma;
    
    // Constructores
    public RelojAlarma(int hora,int min, int seg, int horaAlarma, int minAlarma){
        r.hora=hora;
        r.min=min;
        r.seg=seg;
        this.horaAlarma=horaAlarma;
        this.minAlarma=minAlarma;   
    }
    public RelojAlarma(){
        // R reloj ya iniciado por defecto
        this.horaAlarma=19;
        this.minAlarma=0;
    }
    
    // Metodos
    public void setTime(int hora, int min, int seg){ // Establece hora
        this.r.hora=hora;
        this.r.min=min;
        this.r.seg=seg;
    }
    public String display(){ // Hora actual
        return "Son las "+r.hora+":"+r.min+":"+r.seg;
    }
    public void setAlarma(int horaAlarma, int minAlarma){
        this.horaAlarma=horaAlarma;
        this.minAlarma=minAlarma;
    }
    public void tictac(){ // Incrementar un segundo
        r.tictac();
        
        if(r.seg==60){ // Si los segundos llegan a 60, sumará un minuto
            r.seg=0;
            r.min++;
            if(r.min==60){ // Si los minutos llegan a 60, sumará una hora
                r.min=0;
                r.hora++;
            }
            if(r.hora==horaAlarma){ // Si hora+minutos son iguales a la ALARMA
                if(r.min==minAlarma){
                    JOptionPane.showMessageDialog(null, "Alarma sonando !!!\nSon las " + horaAlarma+":"+minAlarma);
                }
            }
        }
    }
    
    // Getters
    public int getHoraAlarma() {
        return horaAlarma;
    }
    public int getMinAlarma() {
        return minAlarma;
    }
    
    // Setters
    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma=horaAlarma;
    }
    public void setMinAlarma(int minAlarma) {
        this.minAlarma=minAlarma;
    }
    
}
