

public class Ejercio10_NumeroMalvado
{
    public String verificar(int numero){
        String res="";
        int binario=transformar(numero);
        int contUnos=0;
        while (binario>0){
            int dig  =binario%10;
            if (dig==1){
                contUnos++;
            }
            binario=binario/10;
        } 
        if (contUnos%2==0){
            res="Numero Malvado";
        }else{
            res="Numero Odioso";
        }
        return res;
    }
    
    
    private int transformar(int num){
        int res=0;
        int mult=1;
        while (num>0){
            int residuo =num%2;
            res = res +(residuo*mult);
            num=num/2;
            mult= mult*10;
        }
        return res;
    }
   
}
