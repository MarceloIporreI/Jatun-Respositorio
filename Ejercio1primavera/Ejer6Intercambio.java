

public class Ejer6Intercambio
{
  public String interacambiar(int num1,int num2,int num3){
    String respuesta ="";
    int aux = num1;
    num1 = num2;
    num2 = aux;
    aux= num1;
    num1= num3;
    num3= aux;
    
   respuesta = num1+" "+num2+" "+num3;
   return respuesta;
} 
}
