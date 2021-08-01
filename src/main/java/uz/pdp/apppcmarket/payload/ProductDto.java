package uz.pdp.apppcmarket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Brand;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Measurement;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;

    private double incomePrice;

    private double salePrice;

    private String description;

    private Integer brandId;

    private Integer categoryId;

    private Integer attachmentId;

    private Integer measurementId;


}
