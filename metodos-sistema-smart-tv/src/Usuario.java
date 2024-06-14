public class Usuario {
    public static void main(String[] args) {


        SmartTv smartTv = new SmartTv();
        System.out.println("A televisao esta: " + smartTv.ligada);
        System.out.println("O canal padrão: " + smartTv.canal);
        System.out.println("O Volume padrão: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: A televisao esta: " + smartTv.ligada);

        System.out.println("Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("esta agora no canal: " + smartTv.canal);

    }    
}
