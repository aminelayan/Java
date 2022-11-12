package com.projectmanger.Repositories;

import com.projectmanger.Models.Project;
import com.projectmanger.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
    List<Project> findAll();
    List<Project> findAllByUsers(User user);

    // Retrieves a list of any projects a particular user
    // does not belong to.
    List<Project> findByUsersNotContains(User user);
}
