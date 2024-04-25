package asterisc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asterisc.in.model.User;

@Service

public class UserService {

	@Autowired
    private UserRepository userRepository;

	//Create
	public User createUser(User user) {
        return userRepository.save(user);
    }

}
