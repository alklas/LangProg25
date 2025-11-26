import java.util.List;
import java.util.ArrayList;
class TCalc {
    private List<String> names = new ArrayList<>();
    private int tPercentage = 0;

    public List<String> addPerson(List<String> names, String name) {
	    List<String> updated = new ArrayList<>(names);
	    updated.add(name);
	    return updated;
    }
   /* 
    public int getDiscountPercentage(List<String> items1) {
	    if(items1.contains("Книга")) 
		    return 5;
	    else 
		    return 0;
    }
    */

    public List<String> getNames() {
        return names;
    }

    public int getTPercentage(List<String> names) {
	if(names.size() > 5) {
		return 20;
	}
	else if (names.size() > 0) {
		return 10;
	}
    	return 0;
    }	    
}
TCalc one = new TCalc();
List <String> names;
names.add("Артём")
List <String> names2 = new ArrayList<>();
names2.add("Артём")
names2.add("Татьяна")
names2.add("Вита")
names2.add("Дмитрий")
names2
one.getTPercentage(names2)
one.addPerson(names2, "Дарья")
names2 = one.addPerson(names2, "Анжела")
names2 = one.addPerson(names2, "Дарья")
one.getTPercentage(names2)