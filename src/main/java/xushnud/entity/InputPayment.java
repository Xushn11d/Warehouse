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
public class InputPayment {
    @Id
    private Integer id;
    private Timestamp date;
    private Double amount;
    private Integer input_id;
}
