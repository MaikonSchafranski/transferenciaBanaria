package com.transferenciaBanaria.repositories;

import com.transferenciaBanaria.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findUserByDocuments(String documents);
    Optional<User> findUserById(Long id);
}
