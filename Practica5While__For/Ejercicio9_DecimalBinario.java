
public class Ejercicio9_DecimalBinario
{
    public int transformar(int num){
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
