package Datatypes;

public class Course {
	private String name;
	private Teacher T;
	private int capacity;
	private int slots;
	private boolean isFixed;
	private String topicname;
	
	public Course(String name, String topicname,  int slots, int capacity){
		this.name = name;
		this.capacity = capacity;
		this.slots = slots;
		this.isFixed = false;
		this.topicname = topicname;
	}

	public String getTopicname() {
		return topicname;
	}

	public int getSlots() {
		return slots;
	}

	public Teacher getT() {
		return T;
	}

	public void setT(Teacher T) {
		this.T = T;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString(){
		return "Name: " + this.name + " Teacher: " + (T==null?" null ":T.getName()) + " Students: " + this.capacity + " slots: " + this.slots;
	}
	
	public boolean isFixed(){
		return isFixed;
	}
	
	public void setFixed(){
		this.isFixed = true;
		//System.out.println("setfixed");
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Course)) return false;
		return (this.name.equals(((Course)o).getName()) && (this.slots == ((Course)o).getSlots()));
	}
	
}
