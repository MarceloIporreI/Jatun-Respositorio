
public class Ejercicio10_NumeroEnCrecimiento
{
    String revisarNumeros (int N){
       String res="";
       int a = N/100;
       int aux = N%100;
       int c = aux%10;
       int b= aux/10;
       
       if ((b>=a)&&( c>=b)){
        res= "Es un Numero en Crecimiento";
        
        }else {
            res ="No esta Creciendo";
        }
    
        return res;
    }
}
