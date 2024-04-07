package atividades;
import java.time.LocalDateTime;

public class Atividade {
    public static void main(String[] args) {
        mostrarDataPorExtenso();
    }

    public static void mostrarDataPorExtenso() {
        LocalDateTime dataAtual = LocalDateTime.now();
        int diaSemana = dataAtual.getDayOfWeek().getValue();
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();
        int horas = dataAtual.getHour();
        int minutos = dataAtual.getMinute();

        String[] diasSemana = {"", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
        String[] meses = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        String diaSemanaExt = diasSemana[diaSemana];
        String mesExt = meses[mes];

        System.out.println("Hoje é " + diaSemanaExt + ", dia " + dia + " de " + mesExt + " de " + ano + " e agora são " + horas + " horas e " + minutos + " minutos.");
    }
}
