
public class Ejercicio7_DragonFlye
{
    public String verificadorDeDaño (int P , int H){
     String res ="";
     if (H%P==0){
        res ="Si hace daño ";
        
        }else{
          res = "No hace daño ";
        }
     
     return res;  
    }
    
}
