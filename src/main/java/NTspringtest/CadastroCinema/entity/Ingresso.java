package NTspringtest.CadastroCinema.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "INGRESSO")
public class Ingresso {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_filme")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
