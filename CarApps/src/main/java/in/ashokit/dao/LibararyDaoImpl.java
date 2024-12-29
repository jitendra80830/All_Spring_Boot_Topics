package in.ashokit.dao;

import in.ashokit.beans.Library;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class LibararyDaoImpl implements LibraryDao {

    @Value("${DB_URL}")
    private String DB_URL;

    @Value("${DB_UNAME}")
    private String DB_UNAME;

    @Value("${DB_UPWD}")
    private String DB_UPWD;

    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    @Override
    public int insertData(Library libraryBooks) {
        try(Connection connection = DriverManager.getConnection(DB_URL , DB_UNAME, DB_UPWD)) {

            PreparedStatement pstm = connection.prepareStatement("INSERT INTO LIBRARY VALUES(?,?,?)");
            pstm.setInt(1,libraryBooks.getBook_Id());
            pstm.setString(2,libraryBooks.getBook_Name());
            pstm.setDouble(3,libraryBooks.getBook_Price());

            int i = pstm.executeUpdate();

            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

    }
}
