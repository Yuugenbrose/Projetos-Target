public class FoundLamps {
    public static void main(String[] args) {
        boolean[] lamps = new boolean[3]; // Inicialmente, todas as lâmpadas estão apagadas.
        boolean[] switchs = new boolean[3]; // Inicialmente, todos os interruptores estão desligados.

        // Liga o primeiro interruptor.
        switchs[0] = true;

        // Simula a passagem de tempo
        try {
            Thread.sleep(2000); // Espera 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Desliga o primeiro interruptor e liga o segundo.
        switchs[0] = false;
        switchs[1] = true;

        // Liga o terceiro interruptor.
        switchs[2] = true;

        // Verifica as lâmpadas.
        for (int i = 0; i < lamps.length; i++) {
            if (lamps[i]) {
                System.out.println("The lamp " + (i + 1) + " is lit. The switch controlling this lamp is the switch " + (i + 1));
            } else {
                System.out.println("The lamp " + (i + 1) + " is off and cold. The switch that wasn't turnedo on controls this lamp.");
            }
        }
    }
}
