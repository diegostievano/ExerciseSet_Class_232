package entities;

import java.util.Objects;

public class Course {
	
	private String course;
	private Integer studentId;
	
	public Course(String course, Integer studentId) {		
		this.course = course;
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getStudentId() {
		return studentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(studentId, other.studentId);
	}	
}
