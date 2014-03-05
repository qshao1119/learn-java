class Student {
	private String name;
	private int age;
	private float computer;
	private float english;
	private float math;
	
	public Student(){
		//Constructor
	}
	public Student(String n, int a, float c, float e, float m){
		this.setName(n);
		this.setAge(a);
		this.setEnglish(e);
		this.setComputer(c);
		this.setMath(m);
	}
	public float sum(){
		return english+computer+math;
	}
	public float avg(){
		return this.sum()/3;
	}
	public float max(){
		float max = computer>math?computer:math;
		max = max>english?max:english;
		return max;
	}
	public float min(){
		float min = computer<math?computer:math;
		min = min<english?min:english;
		return min;
	}
	public String getInfo(){
		return "StudentsInformation: \n" +
	           "\t|- name: "+ this.getName() + "\n" +
	           "\t|- age: "+ this.getAge() + "\n" +
	           "\t|- English: "+ this.getEnglish() + "\n" +
	           "\t|- Computer: "+ this.getComputer() + "\n" +
	           "\t|- Math: "+ this.getMath() + "\n" +
	           "\t|- Sum: "+ this.sum() + "\n" +
	           "\t|- Ava: "+ this.avg() + "\n" +
	           "\t|- Max: "+ this.max() + "\n" +
	           "\t|- Min: "+ this.min() ;
	}
	public void setName(String n){
		name = n;
	}
    public void setAge(int a){
    	age = a;
    }
    public void setEnglish(float e){
    	english = e;
    }
    public void setComputer(float c){
    	computer = c;
    }
    public void setMath(float m){
    	math = m;
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public float getEnglish(){
    	return english;
    }
    public float getComputer(){
    	return computer;
    }
    public float getMath(){
    	return math;
    }
}
	
	

public class ExecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("Qian", 27, 90.0f,90.0f,90.0f);
		System.out.println(stu.getInfo());

	}

}
