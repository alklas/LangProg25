class Gen<T> {
	//Объявление переменной обобщённого типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщённого типа
	Gen(T o) {
		ob = o;
	}
	//Метод, возвращающий объект
	T getOb() {
		return ob;
	}
	//Метод, получающий информацию об имени типа
	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}

class Pr001 {
	public static void main(String[] args) {
		//Создаём ссылочную переменную на объект типа Integer
		Gen<Integer> iOb;
		//Присваиваем ссыку на новый объект
		iOb = new Gen<Integer>(88);
		//Выводим информацию о типе объекта
		iOb.showType();
		//Присваиваем целой переменной значение, хранящееся в объекте
		int v = iOb.getOb();
		System.out.println("Значение: " + v);

		System.out.println();
		//Создаём ссылочную переменную на объект типа String и присваем ссылку на новый объект 
		Gen<String> strOb = new Gen<String>("Строка обобщённого класса");

		//Выводим информацию о типе объекта
		strOb.showType();
		//Присваиваем строковой переменной значение, хранящееся в объекте
		String str = strOb.getOb();
		System.out.println("Значение в переменной str: " + str);
	}
}
