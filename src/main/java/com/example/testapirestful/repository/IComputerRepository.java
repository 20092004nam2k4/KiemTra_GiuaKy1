package com.example.testapirestful.repository;

import com.example.testapirestful.model.Computer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IComputerRepository extends PagingAndSortingRepository<Computer, Integer> {
    List<Computer> findAllByName(String keyword);
}
