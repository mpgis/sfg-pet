package guru.springfamework.sfgpet.serivces;

import guru.springfamework.sfgpet.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
