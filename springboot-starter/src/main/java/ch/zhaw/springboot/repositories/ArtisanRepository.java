package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ch.zhaw.springboot.entities.Artisan;
@Repository
public interface ArtisanRepository extends JpaRepository<Artisan,Long> {
	
	
}
