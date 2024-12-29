package ashok.in.repository;

import ashok.in.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import springfox.documentation.annotations.ApiIgnore;

@RepositoryRestResource(path = "book")
public interface BookRepo extends CrudRepository<Book ,Integer> {


    @RestResource(exported = false)
    public void deleteById(@Param("l") Long l);

}
