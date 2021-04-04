package guru.springfamework.sfgpet.repositories;

import guru.springfamework.sfgpet.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
