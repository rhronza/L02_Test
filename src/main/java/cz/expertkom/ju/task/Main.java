package cz.expertkom.ju.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class Main {

	private static final String HELLO_WORLD = "Hello world ";
	private static final String LIST2 = "list: ";

	private static int count = 10; // protože main je statické musí bý i coutnt statické

	// "Integer" je objekt má svoje funkce/metody, může být i null, primitivní typ
	// "int" být null NESMÍ !!
	// ten objekt nesmusí být inicializov�n - to se mi u pritimitvn�ho typu st�t
	// nem��e
	private static Integer countInt = new Integer(10);

	public static void main(String[] args) throws MyException {

		Person p = new Person("Pavel", "Š tika");
		Gson gson = new Gson();

		String json = gson.toJson(p);

		System.out.println(json);

		/*************************************************/
		Nameable nameable = new Person();
		System.out.println("osoba: " + nameable.getName());
		System.out.println(gson.toJson(nameable));
		/*************************************************/

		// DateTime datetime = new DateTime());
		/*************************************************/

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date();
		String formatovanyDate = sdf.format(date);
		System.out.println("Dnes je: " + formatovanyDate);

		Calendar calendar = Calendar.getInstance();
		// calendar.add(Calendar.YEAR, -1); // nastavení roku o méně
		calendar.add(Calendar.MONTH, +1); // nastavení roku o méně
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR));

		String cal = sdf.format(calendar.getTime()); // vrací aktuální čas
		System.out.println("cal: " + cal);
		System.out.println("month+1: " + calendar.get(Calendar.MONTH) + 1);

		/***********************************************************************/

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			// Date date = new Date();
			String text = HELLO_WORLD + i;
			System.out.println("when (ts): " + date.getTime());
			if (i % 2 == 0) {
				System.out.println(text + date.getTime());
			}
			list.add(text);
			list.size();
		}

		for (String s : list) {
			System.out.println(LIST2 + s);
			if (s.contains("5"))
				break; // continue - pokraČuje v další iteraci

		}

		/*
		 * použití proměnné typu předka, která je inicializována konstruktorem potomka
		 * (který nastavuje specifickou vlastnost potomka ktrou předem NEMÁ!!!)
		 */
		Person kdosi = new Hasic();
		System.out.println("kdosi: " + kdosi.getSurname() + ", " + kdosi.getName());
		/* chod kupodivu nekončí výjimkou :-) */

		/************************/

		for (int i = 1; i < 21; i++) {
			Person person = new Person();
			if (i == 20) {
				/*
		 		MyException myException = new MyException("dvacátý");
				throw myException;
				
				NEBO raději: 
				*/
				
				throw new MyException("dvacátý");
			}

		}

	}
}
