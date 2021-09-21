package student.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "student_id")
	@GeneratedValue( strategy = GenerationType.AUTO)
	@NotNull
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_class")
	private int studentClass;
	@Column(name = "eng_marks")
	private int englishMarks;
	@Column(name = "math_marks")
	private int mathsMarks;
	@Column(name = "sci_marks")
	private int scienceMarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}


	public Student() {}
	
	public Student(int id, String name, int studentClass, int englishMarks, int mathsMarks, int scienceMarks) {
		super();
		this.id = id;
		this.name = name;
		this.studentClass = studentClass;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
	
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentClass=" + studentClass + ", englishMarks="
				+ englishMarks + ", mathsMarks=" + mathsMarks + ", scienceMarks=" + scienceMarks + "]";
	}
		

	
	

}
