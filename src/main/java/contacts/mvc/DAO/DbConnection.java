package contacts.mvc.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DbConnection {
    private static String url = "jdbc:postgresql://127.0.0.1:5432/contacts";
    private static String name = "postgres";
    private static String password = "oxitxmq5q2";


    public static List<Map<String, Object>> executeQuery(String query) throws ClassNotFoundException, SQLException {
        try (Connection connection = DriverManager.getConnection(url, name, password);
             Statement statement = connection.createStatement()) {
            Class.forName("org.postgresql.Driver");
            System.out.println("Драйвер подключен");

            ResultSet result = statement.executeQuery(query);

            return resultSetToList(result);
        }
    }

    private static List<Map<String, Object>> resultSetToList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        while (rs.next()) {
            Map<String, Object> row = new HashMap<String, Object>(columns);
            for (int i = 1; i <= columns; ++i) {
                row.put(md.getColumnName(i), rs.getObject(i));
            }
            rows.add(row);
        }
        return rows;
    }

}
