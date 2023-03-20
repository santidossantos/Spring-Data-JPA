package com.curso.jpa.repository;

import com.curso.jpa.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    public Client findByIdAndActive(Long id, Boolean active);

}
