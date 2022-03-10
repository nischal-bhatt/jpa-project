package jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jpain10steps.entity.User;
import jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
 
	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("user","one");
		long insert = userDaoService.insert(user);
		log.info("new user is created : " + user);
	}
  
}
