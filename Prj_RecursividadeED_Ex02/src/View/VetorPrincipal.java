package View;

import Controller.VetorController;

public class VetorPrincipal {
    
    public static void main (String args[]){
        
        VetorController vc = new VetorController();
        
        int[] vetor = {12, 8, 14, 9, 17, 7};
        int tamanho = vetor.length;
        int numero = vetor[tamanho - 1];
        
        int menorValorVetor = vc.menorValorVetor(vetor, tamanho - 1, numero);
        
        System.out.println(menorValorVetor);
      
    }
}
