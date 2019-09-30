package ca.uqtr.Account.Repository;


import ca.uqtr.Account.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Nullable
    User findByEmail(String email);

}
