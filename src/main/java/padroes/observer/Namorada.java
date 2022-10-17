package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador{

    //quando o evento acontecer a namorado será notificada
    @Override
    public void chegou(EventoChegadaAniversariante evento) {

        System.out.println("Avisar os convidados");
        System.out.println("Apagar as luzes");
        System.out.println("Esperar um pouco");
        System.out.println("E...Surpresa");
    }
}
