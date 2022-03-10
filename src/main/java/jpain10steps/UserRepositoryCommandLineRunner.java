package jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jpain10steps.entity.User;
import jpain10steps.service.UserDAOService;
import jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
 
	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("user","two");
		User returned = userRepository.save(user);
		log.info("new user is created : " + returned);
		Optional<User> userwithid=userRepository.findById(1L);
		log.info("new user is retrieved : " + userwithid);
		
		Optional<User> userwithid1=userRepository.findById(2L);
		log.info("new user is retrieved : " + userwithid1);
		
		
		List<User> users = userRepository.findAll();
		log.info("list of users area "+users);
		
		for (int i =0; i<10;i ++)
		{
			User user3 = new User("userthirty",":)");
			 userRepository.save(user3);
		}
		
	}
  
}
