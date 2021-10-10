

public class Ejercicio6_Familia
{
    public String  encontrarHermanos (String nombre1, int hermano1,String nombre2, int hermano2,String nombre3, int hermano3 ){
        String res="";
        if ((hermano1>hermano2)&&(hermano1>hermano3)){
         }else if (hermano2>hermano3){
               res=" El mayor es "+ nombre1 + "\n" +"El hermano del medio es "+nombre2 +"\n" +"El hermano menor es " +nombre3;
            }else{
                res=" El mayor es "+ nombre1+ "\n"+ "El hermano del medio es "+nombre3+ " \n"+ "El hermno menor es " +nombre2;
            }   
        if ((hermano2>hermano1)&&(hermano2>hermano3)){
         }else if (hermano1>hermano3){
               res=" El mayor es "+ nombre2 +"\n" + "El hermano del medio es "+nombre1+"\n"+ "El hermno menor es " +nombre3;
            }else{
                res=" El mayor es "+ nombre2 +"\n"+ "El hermano del medio es "+nombre3+" \n"+ "El hermno menor es " +nombre1;
            }
        if ((hermano3>hermano2)&&(hermano3>hermano1)){
         }else if (hermano2>hermano1){
               res=" El mayor es "+ nombre3+"\n"+ "El hermano del medio es "+nombre2 +"\n"+ "El hermno menor es " +nombre1;
            }else{
                res=" El mayor es "+ nombre3+ "\n"+ "El hermano del medio es "+nombre1+"\n"+ "El hermno menor es " +nombre2;
            }
        
        return res; 
    }
}
