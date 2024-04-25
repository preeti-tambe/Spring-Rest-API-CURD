package asterisc.in.repesitory;

import org.springframework.data.jpa.repository.JpaRepository;

import asterisc.in.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
