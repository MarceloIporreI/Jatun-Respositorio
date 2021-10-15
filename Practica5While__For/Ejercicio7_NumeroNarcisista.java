

public class Ejercicio7_NumeroNarcisista
{
    public String evaluarNumero(int numero){
        int exp=contarDigitos(numero);
        int total=0;
        String res="";
        int numeroUsuario=numero;
        while (numero >0){
            int dig=numero%10;
            total = total +(int) (Math.pow(dig,exp));
            numero=numero/10;
            }
        if (numeroUsuario==total){
            res="Es un numero Narcisista";
        }else{
            res="Es un numero Normal";
        }
        return res;
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
