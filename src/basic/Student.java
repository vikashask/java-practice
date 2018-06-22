package basic;

class Student {
	public static void main(String args[]){
		TestStudent s1 = new TestStudent();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

class TestStudent{
	int id;
	String name;
	
}