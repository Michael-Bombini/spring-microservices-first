package michael.addressservice.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

    Address findByEmployeeId(Long id);

}
