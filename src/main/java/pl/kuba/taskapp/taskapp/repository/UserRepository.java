package pl.kuba.taskapp.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba.taskapp.taskapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

