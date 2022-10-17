package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

    //objeto que representa o evento
    private final Date momentoQueAcobteceuOEvento;

    public EventoChegadaAniversariante(Date momentoQueAcobteceuOEvento) {
        this.momentoQueAcobteceuOEvento = momentoQueAcobteceuOEvento;
    }

    public Date getMomentoQueAcobteceuOEvento() {
        return momentoQueAcobteceuOEvento;
    }
}
