import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class AnguloPonteiro {
	public static void main(String[] args) throws ParseException {
		ObterAngulo obterAngulo1 = new ObterAngulo();
		long horas=0, minutos=0;
		GregorianCalendar horario = new GregorianCalendar();
		String relogio;
		Scanner dado;
		while(true)
		{
			System.out.println("-----Forneca um horário----");
			do {
				System.out.println("Forneca as horas(de 00 ate 23) ou digite 'q' para sair");		
				dado = new Scanner(System.in);
				relogio = dado.next();
				if(relogio.equals("q")) {
					System.exit(0);
				}
				else {
					horas = 25;
				}
				try {
					horas = Integer.parseInt(relogio);
				}catch(NumberFormatException erro) {
					System.out.println("Digite um número");
					horas = -1;
					continue;
				}
				
			}while(horas>24 || horas<0);
			do {
				System.out.println("Forneca os minutos(de 00 ate 59 min)");
				dado = new Scanner(System.in);
				try {
					minutos = dado.nextInt();
				}catch(InputMismatchException erro) {
					System.out.println("Digite um número");
					minutos = -1;
					continue;
				}
				
			}while(minutos>59 || minutos<0);
			relogio = horas+":"+minutos;
			SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
			Date d = formato.parse(relogio);
			horario.setTime(d);
			System.out.println("Horario fornecido: "+ horario.get(Calendar.HOUR_OF_DAY) + ":" + horario.get(Calendar.MINUTE));
			System.out.println("Angulacao dos ponteiros resultou em: " + obterAngulo1.retornaAnguloRelogio(horario));
		}
				
	}
}

