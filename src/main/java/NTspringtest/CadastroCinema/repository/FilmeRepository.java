package NTspringtest.CadastroCinema.repository;
import NTspringtest.CadastroCinema.entity.Filme;
import org.springframework.data.repository.CrudRepository;
public interface FilmeRepository extends CrudRepository<Filme, Integer> {
}
