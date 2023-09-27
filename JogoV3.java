import java.util.Random;

public class JogoV3 {
    public static void main(String[] args) throws Exception{
        var cacador = new Personagem("Robertinho");
        var gerador = new Random();
        for(;;){
            int oQueFazer = gerador.nextInt(3) + 1;
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            cacador.exibirEstado();
            System.out.println("####################");
            Thread.sleep(4000);
        }
        
    }
}
