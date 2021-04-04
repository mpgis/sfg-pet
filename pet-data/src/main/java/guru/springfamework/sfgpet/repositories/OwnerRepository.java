package guru.springfamework.sfgpet.repositories;

import guru.springfamework.sfgpet.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
