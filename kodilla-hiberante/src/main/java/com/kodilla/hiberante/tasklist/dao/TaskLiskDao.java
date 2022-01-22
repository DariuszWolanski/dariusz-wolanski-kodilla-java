package com.kodilla.hiberante.tasklist.dao;

import com.kodilla.hiberante.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskLiskDao extends CrudRepository<TaskList, Integer> {

    List<TaskList> findByListName(String listName);
}
