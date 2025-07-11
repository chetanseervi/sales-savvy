package sales.savvy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;
import sales.savvy.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserRepository repo;

	public void addUser(User user) {
		repo.save(user);
		
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

	@Override
	public String validateUser(LoginData data) {
		String webUsername = data.getUsername();
		String webPassword = data.getPassword();
		
		User u = getUser(webUsername);
		//username does not exist in db
		if(u == null) {
			return "invalid";
		}
		//username exists in db
		else {
			String dbPassword = u.getPassword();
			//valid credentials
			if(webPassword.equals(dbPassword)) {
				String role = u.getRole();
				if(role.equalsIgnoreCase("admin"))
					return "admin";
				else
					return "customer";
			}
			//invalid credentials
			else
				return "invalid";
		}
	}


}
