package com.projeto.messageboard.repository;

import com.projeto.messageboard.model.Recado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecadoRepository extends JpaRepository<Recado, Long> {
}