package nguoi.dev.data.dao;

import java.util.List;

import nguoi.dev.data.model.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean update(User user);
	public boolean delete(int userId);
	public User find(int userId);
	public List<User> findAll();
        public User checkAccount(String email, String password);
}
