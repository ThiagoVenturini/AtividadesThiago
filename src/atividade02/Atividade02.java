package atividade02;
import java.util.GregorianCalendar;
public class Atividade02 {
		public static void main(String[] args) {
	        contaTempo(04, 01, 2026); 
	    }

		public static void contaTempo(int dia, int mes, int ano) {
	        GregorianCalendar dataAtual = new GregorianCalendar();
	        GregorianCalendar dataFutura = new GregorianCalendar(ano, mes - 1, dia);

	        long diferencaEmMillis = dataFutura.getTimeInMillis() - dataAtual.getTimeInMillis();
	      
	        long segundos = diferencaEmMillis / 1000;
	        long minutos = segundos / 60;
	        long horas = minutos / 60;
	        long dias = horas / 24;

	        long anosRestantes = dias / 365;
	        long mesesRestantes = (dias % 365) / 30;
	        dias = (dias % 365) % 30;

	        System.out.println("Faltam " + anosRestantes + " anos, " + mesesRestantes + " meses e " + dias + " dias para a data " + dia + "/" + mes + "/" + ano);
	    }
	}


