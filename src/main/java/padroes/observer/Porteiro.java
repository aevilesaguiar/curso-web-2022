package padroes.observer;

//porteiro representa o Subject
//o porteiro tem uma lista de Observadores

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarianteObservador> observadors = new ArrayList<>();

    public void registrarObservador(ChegadaAniversarianteObservador observador) {
        observadors.add(observador);
    }

    //iniciar o monitoramento pelo o porteiro
    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        String valor="";

        //enquanto for diferente de sair
        while (!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante Chegou?");
            valor= entrada.nextLine();

            //evento aconteceu
            if("sim".equalsIgnoreCase(valor)){
                //criar evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                //notificar observadores
                //ou seja quem river de ser notificado será notificado nesse momento
                observadors.stream().forEach(o->o.chegou(evento));

                valor = "sair";


                //alarme falso
            }else{
                System.out.println("Alarme falso");
            }
        }
    }
}
