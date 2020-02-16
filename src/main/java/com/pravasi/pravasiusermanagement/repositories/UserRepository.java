package com.pravasi.pravasiusermanagement.repositories;

import com.pravasi.pravasiusermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByDriverId(Long driverId);
}
