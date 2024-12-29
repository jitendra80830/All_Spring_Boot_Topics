package ashok.in.rest;

import ashok.in.binding.Course;
import ashok.in.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRestController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/upsert",consumes = "application/json",produces = "text/plain")
    public ResponseEntity<String> createCourse(@RequestBody Course course){

        String upsert = courseService.upsert(course);
         return new ResponseEntity<>(upsert , HttpStatus.CREATED);
    }

    @GetMapping(value ="/courses",produces = "application/json")
    public ResponseEntity<List<Course>> getAllCourse(){

        List<Course> allCourse = courseService.getAllCourse();

        return new ResponseEntity<>(allCourse , HttpStatus.OK);
    }

    @GetMapping(value = "/course/{id}",produces = "application/json")
    public ResponseEntity<Course> getById(@PathVariable("id") Integer id){

        Course btId = courseService.getBtId(id);
        if(btId!=null) {
            return new ResponseEntity<>(btId, HttpStatus.OK);
        }
        return new ResponseEntity<>(btId, HttpStatus.NOT_FOUND);
    }
    @DeleteMapping(value = "/delete/{id}",produces = "text/plain")
    public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){

        String deleteById = courseService.deleteById(id);
        if(deleteById!=null) {
            return new ResponseEntity<>(deleteById, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(deleteById , HttpStatus.NOT_FOUND);
        }

    }
    @PutMapping(value = "/update",consumes = "application/json" , produces = "application/json")
    public ResponseEntity<String> updateCourse(@RequestBody Course course){

        String upsert = courseService.upsert(course);
        return new ResponseEntity<>(upsert , HttpStatus.CREATED);
    }

}
