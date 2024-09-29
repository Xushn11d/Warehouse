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
public class Output {
    @Id
    private Integer id;
    private Timestamp date;
    private Integer client_id;
    private Integer warehouse_id;
    private Double total_price;
    private Boolean has_paid;
}
