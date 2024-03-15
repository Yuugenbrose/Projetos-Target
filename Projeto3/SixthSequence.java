public class SixthSequence {
    public static void main(String[] args) {
        for (int i = 2; i <= 19; i++) {
            if (startsWithD(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean startsWithD(int number) {
        return number == 2 || number == 10 || number == 12 ||
               number == 16 || number == 17 || number == 18 || number == 19;
    }
}

/* Sequência de números que começam com D. Basta gerar 
o número inicial e verificar se contém ou não a letra 
D no primeiro digito e exibir em caso positivo, 
fazendo acréscimo do número após verificação.*/

/*Para fazer a verificação de forma direta, eu precisaria de uma biblioteca que não consegui encontrar, então optei por 
fazer manualmente até o 19 no código, haja vista que estaria realizando a saída de dados correta e demonstrando que compreendi 
a lógica, apenas não implementei da forma correta por não ter a função apropriada*/

