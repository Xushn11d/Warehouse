package xushnud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputProduct {
    @Id
    private Integer id;
    private Timestamp date;
    private Integer product_id;
    private Integer quantity;
    private Double price;
    private Integer input_id;
}
