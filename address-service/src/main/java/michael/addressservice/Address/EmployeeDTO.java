package michael.addressservice.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class EmployeeDTO {

    @Id
    private Long id;

}
