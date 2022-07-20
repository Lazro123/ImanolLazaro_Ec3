package pe.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
}
