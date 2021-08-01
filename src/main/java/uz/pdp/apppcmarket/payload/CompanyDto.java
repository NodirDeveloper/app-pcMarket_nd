package uz.pdp.apppcmarket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.apppcmarket.entity.Address;

import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    private String name;

    private String email;

    private String phoneNumber;

    private Integer addressId;


}
