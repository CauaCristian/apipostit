package com.caua.api_post_it.repositories;
import com.caua.api_post_it.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    public UserModel findByUsername(UserModel userModel);
}
