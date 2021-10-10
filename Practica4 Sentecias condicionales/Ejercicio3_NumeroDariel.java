
public class Ejercicio3_NumeroDariel{
    public String verificarDia(int dia){
        
        String res="";
        
        if (dia <10){
          res ="Es un dia Normal";
        }else {
                int dig1 = dia%10;
                int dig2 =dia/10;
                if((dig1%2==0 && dig2==0)||(dig1%2!=0 && dig2!=0)){
                     res="Es un dia Normal";
                  
                }else {
                    res="Cruz de Dariel";
                
                }
                    
        
        }
        return res;
    
    
    
    
    
    
    }







}


