package repository;

import model.Enrollment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnrollmentRepository {

    private List<Enrollment> enrollments = List.of(
            new Enrollment(1L, "Student One", 1L),
            new Enrollment(2L, "Student Two", 1L)
    );

    public List<Enrollment> findAll() {
        return enrollments;
    }
}
