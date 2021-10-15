
public class Ejercicio13_NumerosAmigos
{
    public String verificarNumeros(int num1, int num2){
        String res="";
        int sumaTotalA=calcularSumatoriaDiv(num1);
        int sumaTotalB=calcularSumatoriaDiv(num2);
        if ((sumaTotalA==num2) &&(sumaTotalB==num1)){
            res="Son Amigos";
        } else{
            res="No Son Amigos"; 
        }
        return res;
    }

    private int calcularSumatoriaDiv(int num){
        int res =0;
        for (int div=1; div<=(num/2); div++){

            if (num%div==0){
                res=res+div;
            }

        }
        return res;
    }
}
