package de.telekom.sea7.bigBankingBrojekt.repository;

import java.sql.*;

import de.telekom.sea7.bigBankingBrojekt.Implementation.IbanDb;
import de.telekom.sea7.bigBankingBrojekt.Implementation.ZahlungDb;

public class IbansRepository extends IbanDb {

	private Connection connection;

	String url = "jdbc:mariadb://localhost:3306/myfirstdb";
	String user = "admin";
	String pass = "SEA31";

	Connection con = DriverManager.getConnection(url, user, pass);

	String sqlForInsert = "INSERT INTO iban1 (iban) VALUES (?)";
	String sqlForAll = "SELECT * FROM iban1";

	private PreparedStatement psForInsert;
	private PreparedStatement psForAll;

	public IbansRepository(Connection connection) throws SQLException {
		this.connection = con;

		psForInsert = this.connection.prepareStatement(sqlForInsert, Statement.RETURN_GENERATED_KEYS);
		psForAll = this.connection.prepareStatement(sqlForAll);
	}

	public void ibansDBauslesen() {
		try {
			Statement stm = con.createStatement();
			String abfrage = "SELECT * FROM zahlung1";
			ResultSet rs = stm.executeQuery(abfrage);

			while (rs.next()) {
				String str1 = String.format("%-15s|", rs.getString(1));
				String str2 = String.format("%-15s|", rs.getString(2));

				System.out.println(str1 + str2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public IbanDb auslesen(int id) {
		try {
			Statement stm = con.createStatement();
			String abfrage = "SELECT * FROM iban1 WHERE id_iban =" + id;
			ResultSet rs = stm.executeQuery(abfrage);

			if (rs.next()) {
				String str1 = String.format("%-15s|", rs.getString(1));
				String str2 = String.format("%-15s|", rs.getString(2));
				System.out.println(str1 + str2);
				IbanDb ibanDb = new IbanDb();
				ibanDb.setId_iban(rs.getInt(1));
				ibanDb.setIban(rs.getString(2));
				return ibanDb;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public IbanDb ibansDBeinfügenSingle(String iban) {
        try {
            IbansRepository ibansRepository = new IbansRepository(connection); // neue Instanz von ibansRepository
            psForInsert.setString(ibansRepository.getId_iban(), ibansRepository.getIban()); 
            //preperedStatement mit Verbindung zur DB incl. Schreibbefehl der iban und deren Index (Speicherplatz)
            //setze String mit den Parametern getID_iban und Iban aus der IbansRepository
            int i = psForInsert.executeUpdate(); //in Var i wird die ausgeführte DB Änderung gespeichert
            ResultSet result = psForInsert.getGeneratedKeys(); // die neu gebildete Id_iban wird im Objekt result gespeichert
            result.next(); //
            int ibanDb = result.getInt(1);
            System.out.println(ibanDb);
            return ibanDb;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

	public int ibansDBeinfügen() {
		try {
			psForInsert.setString(1, "DE6666666");

			int i = psForInsert.executeUpdate();
			System.out.println(i);
			ResultSet result = psForInsert.getGeneratedKeys();
			result.next();
			int iban_id = result.getInt(1);
			return iban_id;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	 /*public int ibansDBloeschen(int nr){
	        try { ZahlungenRepository zahlungenrepository = new ZahlungenRepository(connection);
	        int iban = zahlungenrepository.zahlungenDBloeschen(nr);
	            String loeschen =
	            "DELETE FROM zahlung1 WHERE id_zahlung ="+ nr +";";
	            Statement stm = con.createStatement();
	            stm.execute(loeschen);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return 0;
	    }*/
}
