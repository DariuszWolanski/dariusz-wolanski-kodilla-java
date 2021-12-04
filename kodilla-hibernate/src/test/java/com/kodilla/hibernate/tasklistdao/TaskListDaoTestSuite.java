package com.kodilla.hibernate.tasklistdao;


import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test Hibernate of name list";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Name list");
        taskListDao.save(taskList);
        String nameList = taskList.getListName();

        //When
        List<TaskList> namesTaskList = taskListDao.findByListName(nameList);

        //Then
        assertEquals(1, namesTaskList.size());
        taskListDao.deleteAll();
    }
}
