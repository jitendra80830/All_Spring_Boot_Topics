package ashok.in.rest;

import ashok.in.binding.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksRestController {

   /* @GetMapping("/book/{bid}")
    public Book getBooks(@PathVariable("bid") Integer bid){

        Book book = new Book(bid,"Java",100.1);

        return book;
    }*/
   @GetMapping("/book/{bid}")
   public ResponseEntity<Book> getBooks(@PathVariable("bid") Integer bid){

       Book book = new Book(bid,"Java",100.1);

       return new ResponseEntity<>(book , HttpStatus.OK);
   }

    @GetMapping("/books/{bid}")
    public List<Book> getBookList(@PathVariable("bid") Integer bid){
        Book b1 = new Book(bid , "Python",100.1);
        Book b2 = new Book(bid , "C++",120.1);
        Book b3 = new Book(bid , "Java",1110.1);
        Book b4 = new Book(bid , "C#",1090.1);
        Book b5 = new Book(bid , "C",10106.1);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5);

        return books;
    }

    @PostMapping("/book")
    public ResponseEntity<String> createBook(@RequestBody Book book){

       System.out.println(book);

       return new ResponseEntity<>("Books saved ",HttpStatus.CREATED);
    }

}
