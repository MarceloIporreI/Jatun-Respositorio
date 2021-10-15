

public class Ejercicio14_NumerosNovios
{
     public String verificarNumeros(int num1, int num2){
        String res="";
        int sumaTotalA=calcularSumatoriaDiv(num1);
        int sumaTotalB=calcularSumatoriaDiv(num2);
        if ((sumaTotalA==num2+1) &&(sumaTotalB==num1+1)){
            res="Son Novios";
        } else{
            res="No Pasa Nada"; 
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
