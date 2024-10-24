public class Main{
    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(5);

        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo encaixa: " + buraco.encaixa(pinoRedondo));

        PinoQuadrado pinoQuadrado = new PinoQuadrado(7);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado adaptado encaixa: " + buraco.encaixa(adaptador));
    }
}