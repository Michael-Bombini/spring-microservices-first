package michael.addressservice.Address;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@AllArgsConstructor
public class AddressService {


    private final AddressRepository addressRepository;
    private final EmployeeDTORepository employeeDTORepository;

    private final RestTemplate restTemplate;

    public ResponseEntity<Address> getAddressEmployee(Long EmployeeId) {
        EmployeeDTO employee = restTemplate.getForObject("/employees/{employeeId}", EmployeeDTO.class, EmployeeId);

        Address address = addressRepository.findByEmployeeId(employeeDTORepository.findById(employee));

        return ResponseEntity.status(HttpStatus.OK).body(address);

    }
}
