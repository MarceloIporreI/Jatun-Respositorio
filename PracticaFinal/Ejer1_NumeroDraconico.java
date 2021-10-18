
public class Ejer1_NumeroDraconico
{
    public String verificarNumeroDraconicos(int num){
        int residuo=0;
        int sumatoriaPares=0;
        int sumatoriaImpares=0;
        String res="";
        while (num!=0 ){
            residuo=num%10;
            if (residuo%2==0){
                sumatoriaPares= sumatoriaPares+residuo;
                num=num/10;
            }else {
                sumatoriaImpares= sumatoriaImpares+residuo;
                num=num/10;
            }
        }
        if  (sumatoriaPares==sumatoriaImpares){
            res="Es un numero Draconico";
        }else {
            res="Es un numero Normal";
        }
        return res;
    }

}
