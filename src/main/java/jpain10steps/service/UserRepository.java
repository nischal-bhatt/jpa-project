package jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
