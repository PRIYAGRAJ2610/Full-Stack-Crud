package com.CodeWithPriyag.fullstackbackend.Repository;

import com.CodeWithPriyag.fullstackbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{

}
