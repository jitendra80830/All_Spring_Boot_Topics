package ashok.in.service;

import ashok.in.binding.Course;
import ashok.in.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String upsert(Course course) {

        courseRepository.save(course);
        return "Saves Data";
    }

    @Override
    public Course getBtId(Integer cid) {

        Optional<Course> byId = courseRepository.findById(cid);
        if(byId.isPresent()){
            return byId.get();
        }

        return null;
    }

    @Override
    public List<Course> getAllCourse() {

        return courseRepository.findAll();

    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepository.existsById(cid)){
            courseRepository.deleteById(cid);
            return "Deleted";
        }
        return "Id not found";
    }
}
