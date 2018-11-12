package permmissingelem;

import java.util.ArrayList;

public class Solution {
   
    //Criando a lista que vai receber os valores da matriz
    ArrayList<Integer> A = new ArrayList<Integer>();
    
    //Criando a lista com todos os valores possíveis
    ArrayList<Integer> allValues = new ArrayList<Integer>();
    
    //Atributo que vai receber o valor perdido
    private int perdido;
    
    //Atributo que armazena o resultado da validação
    private boolean resultado = false;
    
    public int solution(int[] A){
        
        //Atribuindo valores da matriz na lista A
        for(int i=0;i<A.length;i++){
            this.A.add(A[i]);
        }
        
        //Atribuindo todos os valores possíveis na lista allValues
        for(int i=1;i<=(A.length+1);i++){
            this.allValues.add(i);
        }
        
        int contador = 0;
        
        //Validação dos valores
        for(int i=0;i<this.A.size();i++){
            
            //Valida se o valor corresponde a faixa determinada
            if(!this.validation(this.A.get(i), this.A.size())){
                return -1;
            }
            
            //Verifica se os valores são distintos
            for(int j=0;j<this.A.size();j++){
                if(this.A.get(i) == this.A.get(j)){
                    contador++;
                }
            }
            
            if(contador>1){
                return -1;
            }
            
            contador=0;
        }
        
        //Encontra o valor perdido
        for(int i=0;i<this.allValues.size();i++){
            for(int j=0;j<this.A.size();j++){
                if(this.allValues.get(i) == this.A.get(j)){
                    contador++;
                }
            }
            
            if(contador==0){
                this.perdido = this.allValues.get(i);
                break;
            }
            
            contador=0;
        }
        
        return this.perdido;
    }
    
    public boolean validation(int n, int size){
        
        if(n>=0 && n<=100000){
            if(n>=1 && n<=size+1){
                this.resultado = true;
            }
            else{
                this.resultado = false;
            }
        }
        else{
            this.resultado = false;
        }
        
        return this.resultado;
    }
    
}