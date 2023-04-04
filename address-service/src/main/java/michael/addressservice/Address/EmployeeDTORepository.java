package michael.addressservice.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDTORepository extends JpaRepository<EmployeeDTO,Long> {

    Long findById(EmployeeDTO employee);
}
