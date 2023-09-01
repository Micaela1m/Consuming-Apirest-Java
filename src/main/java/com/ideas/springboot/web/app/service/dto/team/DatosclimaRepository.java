package com.ideas.springboot.web.app.service.dto.team;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@ComponentScan
public interface DatosclimaRepository extends JpaRepository<Datosclima, Long>{

}

