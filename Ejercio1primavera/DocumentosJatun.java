

public class DocumentosJatun
{
    
     public double imprimerHojas(double numeroHojas){
         double total = numeroHojas%2;
         if (total==0){
            return (numeroHojas/2);
            }
         else {
            return (numeroHojas/2)+(0.5) ;
            
            }
         
        }
       
    
}
