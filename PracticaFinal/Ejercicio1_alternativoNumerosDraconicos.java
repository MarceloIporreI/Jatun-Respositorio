
public class Ejercicio1_alternativoNumerosDraconicos 
{
    public String desifrarNumeroDragonico(int num){
        String res="";
        int sumaP=contarDigitos(num).sumatoriaPares();
        int sumaI=contarDigitos(num).sumatoriaImpares();
        if  (sumaP==sumaI){
            res="Es un numero Draconico";
        }else {
            res="Es un numero Normal";
        }
        return res;
    }

    private int contarDigitos(int num){
        int residuo=0;
        int sumatoriaPares=0;
        int sumatoriaImpares=0;
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
        return sumatoriaPares;
        return sumatoriaImpares;
    }
}

