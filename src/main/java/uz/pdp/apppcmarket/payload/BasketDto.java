package uz.pdp.apppcmarket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.entity.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketDto {
    private Date date;

    private Set<Integer> productSet;

    private Set<Integer> clientSet;

    private boolean active;

}
