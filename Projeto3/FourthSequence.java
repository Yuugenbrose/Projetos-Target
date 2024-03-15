public class FourthSequence {
    public static void main(String[]args) {
        
        for (int i = 2; i <= 8; i += 2) { // É uma sequência de quadrados perfeitos, isto é, basta que elevemos os números ao quadrado progredindo-os de 2 em 2.
            int squared = i * i;
            System.out.print(squared + " ");
        }
    }
}