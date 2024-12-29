package in.ashokit.service;

import in.ashokit.beans.Library;
import in.ashokit.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class LibraryServiceImpl implements LibraryService {


    @Autowired
    private LibraryDao libraryDao;
    @Override
    public void libararyProcess() {

        String filePath = "D:\\SpringBootProject\\CarApps\\books.txt";

        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));

            lines.forEach(line->{
                String[] values = line.split(",");

                Library books = new Library();

                books.setBook_Id(Integer.parseInt(values[0]));
                books.setBook_Name(values[1]);
                books.setBook_Price(Double.parseDouble(values[2]));
                int cnt = libraryDao.insertData(books);
                if(cnt>0){
                    System.out.println("Record inserted");
                }


            });

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
