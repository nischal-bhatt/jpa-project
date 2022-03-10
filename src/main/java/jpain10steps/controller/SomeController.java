package jpain10steps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jpain10steps.entity.User;
import jpain10steps.service.UserRepository;

@RestController

public class SomeController {
     
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/home")
	public String doSomething()
	{
		List<User> users = this.userRepository.findAll();
		
		for(int i =0; i<users.size(); i++)
		{
			System.out.println(users.get(i));
		}
		
		
		
		return "lol";
	}
	
	@GetMapping("/testing123")
	public String doSomethingElse()
	{
		System.out.println("doing..");
		return "something";
	}
	
}
