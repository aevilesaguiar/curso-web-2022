package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout());
        //Centralizar janela
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        //listener é quem escuta/ oBserver em quem observa
       /* botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento Ocorreu");
            }
        });*/
        botao.addActionListener(e-> System.out.println("Ocorreu o evento!!"));

        janela.setVisible(true);
    }
}
