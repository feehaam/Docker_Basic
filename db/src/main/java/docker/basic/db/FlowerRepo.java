package docker.basic.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepo extends JpaRepository<Flower, Integer> {
}
