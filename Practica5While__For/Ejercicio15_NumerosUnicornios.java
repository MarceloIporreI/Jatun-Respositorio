

public class Ejercicio15_NumerosUnicornios
{
   
    
    
    private int sumatoriaDig(int num1){
    int res=0;
    int numeroDigitos=contarDigitos(numero);
    int aux=numeroDado;
    int auxiliar=numeroDigitos;
    if (numeroDigitos%2==0){
    while ( auxiliar<= ((numeroDigitos/2)+1) )  {
    
    
    } 
    }
    
    
    
    }
    
    private int contarDigitos(int num){
    int res=0;
    if (num==0){
        res=1;
    }else{
        while (num!=0 ){
        num=num /10;
        res ++;
        }
    }
     return res; 
    }
}
