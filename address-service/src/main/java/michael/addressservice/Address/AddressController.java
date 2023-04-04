package michael.addressservice.Address;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class AddressController {

    @Autowired
    private final AddressService addressService;

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressEmployee(@PathVariable Long id){
        return addressService.getAddressEmployee(id);
    }
}

