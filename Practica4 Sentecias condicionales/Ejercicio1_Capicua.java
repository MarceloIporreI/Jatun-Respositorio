

public class Ejercicio1_Capicua
{
   public String verificar (int n){
        String res ="";
        int primerDig=n/100;
        int ultimoDig=n%10;
        
        if (primerDig==ultimoDig){
        
            res ="El numero es capicua ";
        
        
        }else {
            res="El numero no es capicua ";
            
            
        }
        return res;
    
    
    
    }
    
    
}
