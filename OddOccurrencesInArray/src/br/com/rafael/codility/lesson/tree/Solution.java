package br.com.rafael.codility.lesson.tree;

import java.util.ArrayList;

public class Solution {
    
    private int valor = -1;
    private ArrayList<Integer> valores = new ArrayList<Integer>();
    private ArrayList<Integer> A = new ArrayList<Integer>();
    
    public int solution(int[] A){
        
        int contador=0;
        
        if(A.length % 2 != 0){
            
            for(int i=0;i<A.length;i++){
                this.A.add(A[i]);
            }
            
            for(int i=0;i<this.A.size();i++){
                if(!(valores.contains(this.A.get(i)))){
                    valores.add(A[i]);
                }
            }
            
            for(int i=0;i<valores.size();i++){
                for(int j=0;j<this.A.size();j++){
                    if(valores.get(i).equals(this.A.get(j))){
                        contador++;
                    }
                }
                
                if(contador % 2 != 0) {
                    valor = valores.get(i);
                }
                
                contador=0;
            }
            
        }
        
        return valor;
    }
}
