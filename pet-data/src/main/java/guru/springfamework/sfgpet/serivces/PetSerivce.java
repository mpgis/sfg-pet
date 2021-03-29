package guru.springfamework.sfgpet.serivces;

import guru.springfamework.sfgpet.model.Pet;

import java.util.Set;

public interface PetSerivce {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
