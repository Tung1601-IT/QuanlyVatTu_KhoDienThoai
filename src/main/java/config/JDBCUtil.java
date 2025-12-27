package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JDBCUtil {

    public static Connection getConnection() {
        Connection result = null;
        try {
        String url = "jdbc:mysql://localhost:3306/quanlikhohang";
        String username = "root";
        String password = "123456";
        return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu !", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
