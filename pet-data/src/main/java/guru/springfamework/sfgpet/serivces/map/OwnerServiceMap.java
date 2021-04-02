package guru.springfamework.sfgpet.serivces.map;

import guru.springfamework.sfgpet.model.Owner;
import guru.springfamework.sfgpet.model.Pet;
import guru.springfamework.sfgpet.serivces.OwnerService;
import guru.springfamework.sfgpet.serivces.PetSerivce;
import guru.springfamework.sfgpet.serivces.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetSerivce petSerivce;

    public OwnerServiceMap(PetTypeService petTypeService, PetSerivce petSerivce) {
        this.petTypeService = petTypeService;
        this.petSerivce = petSerivce;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if(object != null){
            if (object.getPets() != null ){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw new RuntimeException("Pet Type is reequired");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petSerivce.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
