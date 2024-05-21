import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Ex1302 {

	public static void main(String[] args) {
		HashSet<String> cats1 = new HashSet<String>();
		
		cats1.add("샴");
		cats1.add("페르시안");
		cats1.add("러시안블루");
		
		System.out.println(cats1);
		System.out.print("HashSet 요소 : ");
		for (String cat : cats1) {
			System.out.print(cat + " ");
		}
cats1.remove("페르시안");

System.out.print("HashSet iter:");
Iterator <String> iter = cats1.iterator();
while (iter.hasNext()) {
	System.out.print(iter.next());
}
//배열 사본 만들기
String[] array = new String[cats1.size()];
cats1.toArray(array);

System.out.print("\n array 요소 : ");
for(int i = 0; i < array.length; i++) {
	System.out.print(array [i]+ " ");
}
//TreeSet
TreeSet<String> cats2 = new TreeSet<String>();

cats2.add("샴");
cats2.add("페르시안");
cats2.add("러시안블루");

System.out.println("\n\nTreeSet -------------");
System.out.println(cats2);
System.out.println(cats2.size());
System.out.println(cats2.contains("삼"));
System.out.println(cats2.first());
System.out.println(cats2.last());


	}

}
