//Nama : Ubassy Abdillah
//NIM : 1301148282

public class Member {
	private String name,specialization;
	private int projectWorked=0;
	
	public Member (String name) {
		this.name=name;
	}
	
	public Member (String name, String specialization) {
		this.name=name;
		this.specialization=specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	
	public String getSpecialization(){
		return specialization;
	}
	
	public void setProjectWorked(projectWorked) {
		this.projectWorked=projectWorked;
	}
	
	public void addProjectWorked() {
		projectWorked++;
	}
	
	public int getProjectWorked() {
		return projectWorked;
	}
	
	public String toString() {
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
	}
}
