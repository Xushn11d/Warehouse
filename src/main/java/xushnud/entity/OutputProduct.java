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
public class OutputProduct {
    @Id
    private Integer id;
    private Integer product_id;
    private Integer quantity;
    private Double price;
    private Integer output_id;
}
