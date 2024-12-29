package ashok.in.service;

import ashok.in.binding.Course;

import java.util.List;

public interface CourseService {

    public String upsert(Course course);

    public Course getBtId(Integer cid);

    public List<Course> getAllCourse();

    public String deleteById(Integer cid);

}
