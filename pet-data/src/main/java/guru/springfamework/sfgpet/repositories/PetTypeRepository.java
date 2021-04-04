package guru.springfamework.sfgpet.repositories;

import guru.springfamework.sfgpet.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
