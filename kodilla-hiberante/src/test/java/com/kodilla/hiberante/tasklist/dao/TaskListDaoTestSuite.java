package com.kodilla.hiberante.tasklist.dao;

import com.kodilla.hiberante.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskLiskDao taskLiskDao;
    private static final String DESCRIPTION = "Modul 17.2";

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Find the list");
        taskLiskDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskLiskDao.findByListName(name);

        //Then
        assertEquals(1, readTaskList.size());


        //CleanUp

        taskLiskDao.deleteAll();
    }
}
