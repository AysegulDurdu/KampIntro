package javaCampOdev;

public class CourseManager {
	public void registerCourse(Courses course) {
		System.out.println("Kayıt olundu : " + course.name);
	}
	
	public void deleteCourse(Courses course) {
		System.out.println("Kayıt silindi : " + course.name);
	}

}
