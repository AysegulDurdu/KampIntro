package javaCampOdev;

public class CourseManager {
	public void registerCourse(Courses course) {
		System.out.println("Kay�t olundu : " + course.name);
	}
	
	public void deleteCourse(Courses course) {
		System.out.println("Kay�t silindi : " + course.name);
	}

}
