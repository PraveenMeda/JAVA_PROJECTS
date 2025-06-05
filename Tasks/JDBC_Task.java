package praveen;

import java.sql.*;

public class JDBC_Task {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentdb", "root", "Pr@veen");

			String insertSQL = "REPLACE INTO students (id, name, marks) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);

			Object[][] students = {
					{1, "Alice",99},
					{2, "Bob",98},
					{3, "Charlie",87},
					{4, "David",99},
					{5, "Eve",100},
					{6, "Fiona",12}
			};
			for(Object[] student : students) {
				pstmt.setInt(1, (int) student[0]);
				pstmt.setString(2, (String) student[1]);
				pstmt.setInt(3, (int)student[2]);// Corrected index
				pstmt.executeUpdate();
			}

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");

			System.out.println("Student List: ");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " "+rs.getInt("marks"));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}