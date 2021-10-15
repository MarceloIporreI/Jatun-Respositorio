

public class Ejercicio8juntarDigitos
{
   public int formarNuevodigito (int numero){
     int res =0;
     int ultimoDigito= numero%10;
     while (numero>10 ){
        numero=numero/10;
    }
     int primerDigito=numero%10;
     res =(ultimoDigito*10)+primerDigito;
     return res;
    }
    }
     
