package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Handler;
import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

public class GerenciarControlePonto {

    public static void main(String[] args) {

        try {
            //Item 8
            Gerente gerente1 = new Gerente(1, "João", "joao@gmail", "SP-123456789", "g1", "1234");

            //Item 9
            Secretaria secretaria1 = new Secretaria(2, "Maria", "julia@gmail.com", "MG-987654321", "19 99999 9999", "9909");

            //Item 10
            Operador operador1 = new Operador(3, "Zé", "paulo@gmail.com", "RJ-135798642", 77.5);

            //Item 11
            RegistroPonto rp1 = new RegistroPonto(1, gerente1, LocalDate.now(), LocalDateTime.now(), null);
            rp1.apresentarRegistroPonto();
            Thread.sleep(1000);
            //Item 12
            RegistroPonto rp2 = new RegistroPonto(2, secretaria1, LocalDate.now(), LocalDateTime.now(), null);
            rp2.apresentarRegistroPonto();
            Thread.sleep(1000);
            //Item 13
            RegistroPonto rp3 = new RegistroPonto(3, operador1, LocalDate.now(), LocalDateTime.now(), null);
            rp3.apresentarRegistroPonto();
            Thread.sleep(1000);
            //Item 14
            rp1.setHoraSaida(LocalDateTime.now());
            rp1.apresentarRegistroPonto();
            Thread.sleep(1000);
            //Item 15
            rp2.setHoraSaida(LocalDateTime.now());
            rp2.apresentarRegistroPonto();
            Thread.sleep(1000);
            //Item 16
            rp3.setHoraSaida(LocalDateTime.now());
            rp3.apresentarRegistroPonto();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
