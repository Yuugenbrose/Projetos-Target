public class ThirdSequence {
    public static void main(String[]args) {
        
        int number = 2;
        for (int i = 0; i <= 6; i++) { // A sequência mostra o quadrado dos números naturais um a um partindo do 0. Basta criar um for para multiplicar os números por eles mesmos.
            int squared = i * i;
            System.out.print(squared + " ");
        }
    }
}