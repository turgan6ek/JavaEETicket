package dao;

import entity.Account;

public interface AccountDao {
    public int insertAccount(Account acc);
    public Account getAccount(String username, String password);
    public boolean ifExists(String username);
}
