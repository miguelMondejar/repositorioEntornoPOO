package Ejercicio2;

public class TestAlarma {

    public static void main(String args[]) {
        
        int bucle=0;
        
        RelojAlarma ra=new RelojAlarma(18, 35, 23, 18, 52); // Hora, min y seg actual || Hora y min de la alarma
        
        do{
            ra.tictac();
            
            System.out.println(ra.display());
            
            bucle++; 
            
        }while(bucle!=1000);
    }
}
