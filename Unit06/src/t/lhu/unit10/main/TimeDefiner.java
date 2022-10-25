package t.lhu.unit10.main;

/**
 * 6. Составьте описание класса для представления времени. Предусмотрте
 * возможности установки времени и изменения его отдельных полей (час, минута,
 * секунда) с проверкой допустимости вводимых значений. В случае недопустимых
 * значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */

public class TimeDefiner {
	private int hours;
	private int minutes;
	private int seconds;

	public TimeDefiner(int hours1, int minutes1, int seconds1) {
		if (hours1 > 23 || hours1 < 0) {
			hours = 0;
		} else {
			hours = hours1;
		}
		if (minutes1 > 59 || minutes1 < 0) {
			minutes = 0;
		} else {
			minutes = minutes1;
		}
		if (seconds1 > 59 || seconds1 < 0) {
			seconds = 0;
		} else {
			seconds = seconds1;
		}
	}

	public TimeDefiner() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > 23 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void addSeconds(int x) {
		if (x < 60) {
			seconds = seconds + x;
		} else {
			seconds = x % 60;
			minutes = x / 60;
			hours = minutes / 60;
			minutes = minutes % 60;
			hours = hours % 24;
		}
	}

	public void addMinutes(int x) {
		if (x < 60) {
			minutes = minutes + x;
		} else {
			minutes = x / 60;
			hours = hours + minutes / 60;
			minutes = minutes % 60;
		}
	}

	public void addHours(int x) {
		if (x < 24) {
			hours = hours + x;
		} else {
			hours = hours % 24;
		}
	}

	public void print() {
		System.out.println("HH: " + getHours() + ", MM: " + getMinutes() + ", SS: " + getSeconds());
	}

	public static void main(String[] args) {
		TimeDefiner a = new TimeDefiner(2, 32, 23);
		a.print();
		a.addSeconds(333700);
		a.print();
		a.addMinutes(300);
		a.print();
		a.addHours(3);
		a.print();
	}

}
