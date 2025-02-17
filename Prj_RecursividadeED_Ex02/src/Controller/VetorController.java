/*
    Ponto de parada: subtrair o tamanho do vetor até chegar a zero para percorrer as posições.
    A função é chamada e vai verificar qual número é o menor dentro do vetor.
 
 */

package Controller;

public class VetorController {

    public VetorController() {
        super();
    }

    public int menorValorVetor(int[] vetor, int tamanho, int numero) {

        if (tamanho == 0) {

            return 0;
            
        } else {
            if (numero < vetor[tamanho]) {
                
                return numero;

            } else {

                numero = vetor[tamanho];

                return menorValorVetor(vetor, (tamanho - 1), numero);                
            }
        }
    }
}
