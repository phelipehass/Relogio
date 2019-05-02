import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObterAngulo {
	public long retornaAnguloRelogio(GregorianCalendar horas) {
		long minutes, hours, angMinutes, angulo, angHours;
		hours = horas.get(Calendar.HOUR_OF_DAY);
		minutes = horas.get(Calendar.MINUTE);
		if(hours>12)
			hours = hours - 12;
		angHours = hours*30;
		angMinutes = minutes*6;
		angulo = angHours - angMinutes;
		if(angulo<0)
			angulo = angulo*(-1);
		if(angulo>180) {
			angulo = 360-angulo;
		}
		return angulo;
	}
}
