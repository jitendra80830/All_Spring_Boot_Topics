package in.ashokit.Dao;

import in.ashokit.beans.Book;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.PanelUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Repository
public class BookDaoImpl implements BookDao{

    public static final String DB_URL = "jdbc:mysql://localhost:3306/sbms";

    public static final String DB_UNAME= "root";

    public static final String DB_UPWD= "adeptia";

    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";


    @Override
    public int insert(Book book) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_UNAME, DB_UPWD)){
           // Class.forName(DB_DRIVER);

            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?)");

            pstmt.setInt(1 , book.getBookId());
            pstmt.setString(2, book.getBookName());
            pstmt.setDouble(3 , book.getBookprice());
             int i = pstmt.executeUpdate();
             return i;


        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }
}
