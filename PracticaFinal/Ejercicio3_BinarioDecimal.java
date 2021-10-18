
public class Ejercicio3_BinarioDecimal
{
    public int conversorBinarioDecimal (int num){
        int base=2;
        int exponente=0;
        int res=0;;
        while (num>0){
            int dig= num%10;
            res = res+(dig*(int) Math.pow(base,exponente));
            exponente=exponente+1;
            num=num/10;
        }
        return res;  
    }
}
