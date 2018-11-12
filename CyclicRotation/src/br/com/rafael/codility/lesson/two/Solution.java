package br.com.rafael.codility.lesson.two;

public class Solution {
    
    public int[] solution(int[] A, int K){
        int ultimo,posicaoAnterior,auxiliar;
        if(A.length != 0){
            while(K>0){
                ultimo = A[A.length-1];
                posicaoAnterior = A[0];
                A[0] = ultimo;
                for(int i=1;i<A.length;i++){
                   auxiliar = A[i];
                   A[i] = posicaoAnterior;
                   posicaoAnterior = auxiliar;
                }
                K--;
            }
        }
        
        return A;
    }
    
}
