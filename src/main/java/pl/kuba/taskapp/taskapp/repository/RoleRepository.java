package pl.kuba.taskapp.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba.taskapp.taskapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
