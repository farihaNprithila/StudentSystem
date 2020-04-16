package StudentSystem.Bootstrap;

import StudentSystem.Model.Course;
import StudentSystem.Model.Department;
import StudentSystem.Model.Student;
import StudentSystem.Repository.CourseRepository;
import StudentSystem.Repository.DepartmentRepository;
import StudentSystem.Repository.StudentRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Fariha Nawaz on 16,Apr,2020.
 */
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private CourseRepository courseRepository;
    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;

    public DevBootStrap(CourseRepository courseRepository, StudentRepository studentRepository, DepartmentRepository departmentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Course course = new Course(110, "Programming Language I", "TBA");
        courseRepository.save(course);
        course = new Course(111, "Programming Language II", "TBA");
        courseRepository.save(course);
        course = new Course(220, "Data Structure", "TBA");
        courseRepository.save(course);
        course = new Course(221, "Algorithm", "TBA");
        courseRepository.save(course);

        Student student=new Student(15301121,"Fariha","Nawaz","fariha@gmail.com","Mirpur-2");
        studentRepository.save(student);

        Department department=new Department(01,"CSE");
        departmentRepository.save(department);
        department=new Department(02,"EEE");
        departmentRepository.save(department);
    }
}
