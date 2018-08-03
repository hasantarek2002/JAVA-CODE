package ComparableComparator;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		//super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(Fruit compareFruit) {
		int compareQuantity = ((Fruit) compareFruit).getQuantity();

		// ascending order
		return this.quantity - compareQuantity;

		// descending order
		// return compareQuantity - this.quantity;
	}

	// This Fruit class contains the following static FruitNameComparator method
	// to compare
	// the “fruitName”. Now the Fruit object is able to sort with either
	// “quantity” or “fruitName” property.

	// Sort Fruit array based on its “fruitName” property in ascending order by
	// calling this from that class where it will be called

	// Arrays.sort(fruits, Fruit.FruitNameComparator);

	public static Comparator<Fruit> FruitNameComparator = new Comparator<Fruit>() {

		public int compare(Fruit fruit1, Fruit fruit2) {

			String fruitName1 = fruit1.getFruitName().toUpperCase();
			String fruitName2 = fruit2.getFruitName().toUpperCase();

			// ascending order
			return fruitName1.compareTo(fruitName2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};

}

/*
class Student
   String name
   Date birthday
   
   I used arrayList to store the Student Objects My problem is, how can I sort the 
   StudentList by birthday using the collecitons sort?.
   
   List <Student> studentList = new ArrayList<Student>();
   
   To sort this 
   
   Collections.sort(studentList, new Comparator<Student>() {
   public int compare(Student s1, Student s2) {
       return s1.getBirthday().compareTo(s2.getBirthday());
   }
	});
	
	You'll need to add getBirthday() to your Student class if you don't have it already.
	
*/
