package com.bookstore.bookstore.Repo;
import com.bookstore.bookstore.Entities.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Bookstore, Long> {

}
