

public class Ejerciocio4_Semaforo
{
    public String verificarEstadoFinal(String colorActual , int cambios){
        String res="";
        int valorActual;
        if (colorActual == "Verde "){
            valorActual= 0;
        }else{
            if (colorActual=="amarillo"){
                valorActual=1;
            
            }else {
                valorActual=2;
            }
        }
        int valorFinal=(valorActual+cambios)%3;
        if (valorFinal==0){
            res="verde";
        }else{
            if (valorFinal==1){
                res="amarillo";
            }else{
                res="rojo";
            }
        }
        return res;
    }
   
}
