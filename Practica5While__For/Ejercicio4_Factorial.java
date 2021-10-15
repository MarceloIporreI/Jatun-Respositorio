
public class Ejercicio4_Factorial
{
    public int encontrarFactorial(int num){
        int res=1;
        if (num==0){
            res=1;
        }else{
            for (int i=1;i<=num;i++){
                res =res*i;
            }
        }
        return res; 
    }
}


