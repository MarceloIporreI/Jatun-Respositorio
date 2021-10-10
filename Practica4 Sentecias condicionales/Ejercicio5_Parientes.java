

public class Ejercicio5_Parientes
{
  public String veriParientes (int a , int b){
     String res ="";
     if ((a%b==0)||(b%a==0)){
        res ="Son parientes ";
        
        }else{
          res = "No son parientes ";
        }
     
     return res;  
    }
    
}
