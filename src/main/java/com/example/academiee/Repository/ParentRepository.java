package com.example.academiee.Repository;


import com.example.academiee.Entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParentRepository extends JpaRepository<Parent,Long>
{


}
