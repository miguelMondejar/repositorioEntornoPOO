package Ejercicio2;

public class Test {

    public static void main(String args[]) {
        int bucle=0;
        
        Reloj r=new Reloj(18, 35, 23);
        
        // Bucle para que cuenta 1000 segundos
        do{
            r.tictac();
            if(r.seg==60){ // Si los segundos llegan a 60, sumará un minuto
                r.seg=0;
                r.min++;
                if(r.min==60){ // Si los minutos llegan a 60, sumará una hora
                    r.min=0;
                    r.hora++;
                }
            }
            
            System.out.println(r.display());
            
            bucle++; 
            
        }while(bucle!=1000);
        
    }
}
