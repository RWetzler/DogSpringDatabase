package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Dog;

public interface ContactRepository extends JpaRepository<Dog, Long>{

}
