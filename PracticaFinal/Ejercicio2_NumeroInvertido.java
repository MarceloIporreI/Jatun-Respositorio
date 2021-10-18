
public class Ejercicio2_NumeroInvertido
{
    public String inversorNumeral(int num1,int num2){
        String  res="";
        int contador=0;
        int exp=contarDigitos(num1);
        if (num2 ==0){
            res = ""+num1;
        }else{
            while (num2>contador ){
                int dig = num1%10;
                String aux=""+ dig +(num1/10);
                res =res +aux+",";
                num1= (num1/10)+ (dig*(int) Math.pow(10,(exp-1)));
                contador++;
            }
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

