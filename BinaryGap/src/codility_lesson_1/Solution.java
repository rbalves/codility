package codility_lesson_1;
import java.util.ArrayList;
public class Solution {
    
    private ArrayList<String> binario = new ArrayList<String>();
    
    public int solution(int N){
        
        while(N / 2 != 0){
            binario.add(Integer.toString(N%2));                   
            N = N/2;
        }
        
        int contaZero = 0;
        int maior = contaZero;
        String inicio = "0";
        
        int i;
        for(i=0;i<binario.size();i++){

            if(binario.get(i).contains("1")){
                inicio = binario.get(i);
                contaZero = 0;
            }
            
            if(binario.get(i).contains("0") && inicio.contains("1")){
                contaZero++;
            }
            
            if(contaZero > maior){
                maior = contaZero;
            }
        }
        
        return maior;
    }
    
}
