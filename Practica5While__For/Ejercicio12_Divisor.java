public class Ejercicio12_Divisor
{
   public int dividir(int num ,int divisor){
       int res =0;
     while ( num >= divisor ){
          num=num-divisor;
          res =res +1;
          }
      return res;
}
}
