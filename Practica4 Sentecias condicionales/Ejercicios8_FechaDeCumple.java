
public class Ejercicios8_FechaDeCumple{
    public String designacionLiteral (int D , int M,int A){
        String res="";
        if(M==1){
            res= D+" de Enero de"+A;

        }else{
            if (M==2){
                res= D+" de Febrero de"+A;

            }else {
                if (M==3){
                    res= D+" de Marzo de"+A;

                }else {
                    if (M==4){
                        res= D+" de Abril de"+A;
                    }else{
                        if (M==5){
                            res= D+" de Mayo de"+A;

                        }else{
                            if (M==6){
                                res= D+" de Junio de"+A;
                            }else{
                                if(M==7){
                                    res= D+" de Julio de"+A;
                                }else{
                                    if( M==8){
                                        res= D+" de Agosto de"+A;

                                    }else{
                                        if (M==9){
                                            res= D+" de Septiembre de"+A;
                                        }else {
                                            if (M==10){
                                                res= D+" de Octubre de"+A;
                                            }else {
                                                if(M==11){
                                                    res= D+" de Noviembre de"+A;
                                                }else {
                                                    if (M==12){
                                                        res= D+" de Diciembr de"+A;
                                                    }

                                                }

                                            }

                                        }
                                    }

                                }

                            }
                        }

                    }

                }
            }
        }

    
    
    
    
    
    
    
    
    
        return res;
    }

    
    
    
    
    

}    
