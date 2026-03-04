package repository;

import model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository {

    private List<Course> courses = List.of(
            new Course(1L, "Java Spring", "OPEN", 1L),
            new Course(2L, "Web Backend", "CLOSED", 2L)
    );

    public List<Course> findAll() {
        return courses;
    }
}
