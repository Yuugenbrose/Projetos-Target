public class FifthSequence {
    public static void main(String[] args) {
        int howMany = 6;
        int firstN = 1, secondN = 1;
        
        System.out.print(firstN + " " + secondN + " "); 
        
        for (int i = 1; i <= howMany - 2; i++) { // A sequência é uma sequência de fibonacii, então basta armazenar os dois primeiros números e depois usar o for para a soma e substituição dos termos.
            int nextN = firstN + secondN;
            
            System.out.print(nextN + " ");
            
            firstN = secondN;
            secondN = nextN;
        }
    }
}
