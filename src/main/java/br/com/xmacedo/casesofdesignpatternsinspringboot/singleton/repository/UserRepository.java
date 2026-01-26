package br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.repository;

import br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
