package xushnud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentProduct {
    @Id
    private Integer id;
    private Double price;
    private Integer quantity;
    private Integer input_product_id;
}
