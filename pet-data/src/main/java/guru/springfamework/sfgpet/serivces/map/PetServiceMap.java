package guru.springfamework.sfgpet.serivces.map;

import guru.springfamework.sfgpet.model.Pet;
import guru.springfamework.sfgpet.serivces.PetSerivce;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetSerivce {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
