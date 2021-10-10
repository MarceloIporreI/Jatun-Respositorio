
public class Ejercicio9_AñoBisiesto{
    String verificarAñoBisiesto (int A){
        String res="";
        if (A%100==0){       
            res="No es Bisiesto";
        }else{
            if(A%4==0){
                res=" Es Bisiesto";
            
            }else{
                if (A%400==0){
                    res="Es Bisiesto";
                }else{
                
                    res="No es Bisiesto";
                }
            
            }
        
        }
    
        return res;
    }
     
}

    
     
    
    
   
