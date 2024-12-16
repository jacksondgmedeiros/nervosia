package br.com.jj.nervosia.repository;

import br.com.jj.nervosia.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
