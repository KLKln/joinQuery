package joinQuery.repository;

import joinQuery.model.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
	
	@Override
	public List<StudentEntity> findAll()
;
}
