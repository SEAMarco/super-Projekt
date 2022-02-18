package de.telekom.sea7.bigBankingBrojekt.repository;

import java.sql.*;

import de.telekom.sea7.bigBankingBrojekt.Implementation.IbanDb;
import de.telekom.sea7.bigBankingBrojekt.Implementation.ZahlungDb;

public class ZahlungenRepository extends ZahlungDb {

	private Connection connection;

	String url = "jdbc:mariadb://localhost:3306/myfirstdb";
	String user = "admin";
	String pass = "SEA31";

	Connection con = DriverManager.getConnection(url, user, pass);

	String sqlForInsert = "INSERT INTO zahlung1 (id_iban, betrag,verwendungszweck) VALUES (?, ?, ?)";
	String sqlForAll = "SELECT * FROM zahlung1";

	private PreparedStatement psForInsert;
	private PreparedStatement psForAll;

	public ZahlungenRepository(Connection connection) throws SQLException {
		this.connection = con;

		psForInsert = this.connection.prepareStatement(sqlForInsert);
		psForAll = this.connection.prepareStatement(sqlForAll);
	}

	public void zahlungenDBauslesen() {
		try {
			Statement stm = con.createStatement();
			String abfrage = "SELECT * FROM zahlung1";
			ResultSet rs = stm.executeQuery(abfrage);

			while (rs.next()) {
				String str1 = String.format("%-15s|", rs.getString(1));
				String str2 = String.format("%-15s|", rs.getString(2));
				String str3 = String.format("%-10s|", rs.getString(3));
				String str4 = String.format("%-15s|", rs.getString(4));
				System.out.println(str1 + str2 + str3 + str4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ZahlungDb auslesen(int id) {
		try {
			Statement stm = con.createStatement();
			String abfrage = "SELECT * FROM zahlung1 WHERE id_zahlung =" + id;
			ResultSet rs = stm.executeQuery(abfrage);

			if (rs.next()) {
				String str1 = String.format("%-15s|", rs.getString(1));
				String str2 = String.format("%-15s|", rs.getString(2));
				String str3 = String.format("%-10s|", rs.getString(3));
				String str4 = String.format("%-15s|", rs.getString(4));
				System.out.println(str1 + str2 + str3 + str4);
				ZahlungDb zahlungDb = new ZahlungDb();
				zahlungDb.setId_zahlung(rs.getInt(1));
				IbanDb ibanDb = new IbanDb();
				zahlungDb.setIban(ibanDb);
				zahlungDb.setBetrag(rs.getInt(3));
				zahlungDb.setVerwendungszweck(rs.getString(4));
				return zahlungDb;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public void zahlungenDBeinfügen() { // ZahlundDb zahlungDB
		try {
			IbansRepository ibansRepository = new IbansRepository(connection);
			int iban_id = ibansRepository.ibansDBeinfügen();
			psForInsert.setInt(1, iban_id); //aus ZahlungDb.getiban().getID()
			psForInsert.setDouble(2, 10.50); // aus ZahlungDb.getBetrag
			psForInsert.setString(3, "Sport"); // aus ZahlungDb.getVerwendungszweck

			psForInsert.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet idibanauslesen(int nr) {
		try {
			Statement stm = con.createStatement();
			String id = "SELECT id_iban FROM zahlung1 WHERE id_zahlung = " + nr + ";";
			ResultSet rs = stm.executeQuery(id);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public String zahlungenDBloeschen(int nr) {
		try {

			String loeschen = "DELETE FROM zahlung1 WHERE id_zahlung =" + nr + ";";
			Statement stm1 = con.createStatement();
			stm1.execute(loeschen);
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}*/
}
