package dao;

import ConfigDB.ConnProvider;
import ConfigDB.ProviderDB;
import entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAOImpl implements AccountDao{

    static Connection conn;
    static PreparedStatement pst;

    @Override
    public int insertAccount(Account acc) {
        int status = 0;
        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("insert into accounts (username, password, email, phone_num, rolenum) values (?,?,?,?,?)");
            pst.setString(1, acc.getUsername());
            pst.setString(2, acc.getPassword());
            pst.setString(3, acc.getEmail());
            pst.setString(4, acc.getPhone_num());
            pst.setInt(5,acc.getRolenum());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public Account getAccount(String username, String password) {
        Account account = new Account();
        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("SELECT * FROM accounts WHERE username = ? and password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                account.setUser_id(rs.getInt(1));
                account.setUsername(rs.getString(2));
                account.setPassword(rs.getString(3));
                account.setEmail(rs.getString(4));
                account.setPhone_num(rs.getString(5));
                account.setPhone_num(rs.getString(5));
                account.setRolenum(rs.getInt(6));
            }
            System.out.println(account.getUsername());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return account;
    }

    @Override
    public boolean ifExists(String username) {
        Account account = new Account();

        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("SELECT * FROM accounts WHERE username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
