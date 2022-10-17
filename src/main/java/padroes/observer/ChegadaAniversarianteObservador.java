package padroes.observer;


@FunctionalInterface
public interface ChegadaAniversarianteObservador {

    //esse evento será executado quando o evento acontecer
    public void chegou(EventoChegadaAniversariante evento);
}
