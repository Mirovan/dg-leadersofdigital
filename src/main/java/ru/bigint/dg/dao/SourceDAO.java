package ru.bigint.dg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bigint.dg.model.Source;

@Repository
public interface SourceDAO extends JpaRepository<Source, Long> {
}
