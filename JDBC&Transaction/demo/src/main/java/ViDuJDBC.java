import java.sql.*;

public class ViDuJDBC {
    // Ten cua driver va dia chi URL cua co so du lieu
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sinhvien";

    //  Ten nguoi dung va mat khau cua co so du lieu
    static final String USER = "root";
    static final String PASS = "0964613519aA";

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement stmt = null;
        try{
            // Buoc 2: Dang ky Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Buoc 3: Mo mot ket noi
            System.out.println("Dang ket noi toi co so du lieu ...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // Buoc 4: Thiet lap auto commit la false.

            // Buoc 5: Thuc thi truy van
            System.out.println("Tao cac lenh truy van SQL ...");
            String sql = "{call getTenSV (?, ?)}";
            stmt = conn.prepareCall(sql);

            int MS_SINHVIEN = 2;
            stmt.setInt(1, MS_SINHVIEN);// thiet lap mssv la 2]
            //dang ki tham so thu hai
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);

            System.out.println("Thuc thi stored procedure....");
            stmt.execute();
            // lay ten sinh vien voi phuong thuc getXXX
            String TEN_SINHVIEN = stmt.getString("minh");
            System.out.println("Ten sinh vien co MSSV: " + MS_SINHVIEN + " la " + TEN_SINHVIEN);
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // Xu ly cac loi cho JDBC
            se.printStackTrace();
            // Neu xuat hien loi thi xoa sach cac thay doi
            // va tro ve trang thai truoc khi co thay doi.
            System.out.println("\nQuay ve trang thai truoc thay doi ...");
            try{
                if(conn!=null)
                    conn.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }// Ket thuc khoi try

        }catch(Exception e){
            // Xu ly cac loi cho Class.forName
            e.printStackTrace();
        }finally{
            // Khoi finally duoc su dung de dong cac resource
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }// Ket thuc khoi finally
        }// Ket thuc khoi try
    }// Ket thuc main

    public static void printRs(ResultSet rs) throws SQLException{
        // Bao dam chung ta da bat dau tu hang dau tien
        rs.beforeFirst();
        while(rs.next()){
            // Lay du lieu boi su dung ten cot
            int mssv  = rs.getInt("mssv");
            int diemthi = rs.getInt("diemthi");
            String ho = rs.getString("ho");
            String ten = rs.getString("ten");

            // Hien thi cac gia tri
            System.out.print("\nMSSV: " + mssv);
            System.out.print("\nHo: " + ho);
            System.out.println("\nTen: " + ten);
            System.out.print("\nDiem Thi: " + diemthi);
            System.out.print("\n=================");
        }
        System.out.println();
    }// Ket thuc printRs()
}//