package guru.springfamework.sfgpet.serivces;

import guru.springfamework.sfgpet.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
