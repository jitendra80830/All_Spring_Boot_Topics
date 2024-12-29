package in.ashokit.service;

import in.ashokit.Dao.BookDao;
import in.ashokit.beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public void processBooks() {
        String filePath = "D:\\SpringBootProject\\BooksApp\\books.txt";

        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));

            lines.forEach(line -> {
                System.out.println(line);

                String[] values = line.split(",");
                Book b = new Book();
                b.setBookId(Integer.parseInt(values[0]));
                b.setBookName(values[1]);
                b.setBookprice(Double.parseDouble(values[2]));

                int cnt = dao.insert(b);
                if (cnt > 0) {
                    System.out.println("Record Inserted...");
                }


            });


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
