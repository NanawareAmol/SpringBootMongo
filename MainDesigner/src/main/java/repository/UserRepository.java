package repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Entity.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String>{

}
