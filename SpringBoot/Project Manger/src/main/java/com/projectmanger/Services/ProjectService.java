package com.projectmanger.Services;

import com.projectmanger.Models.Project;
import com.projectmanger.Models.User;
import com.projectmanger.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAllProjectNotAsProjectLead(User currentUser){
        List<Project> projectsNotForUser=projectRepository.findAllByUsers(currentUser);
        return projectsNotForUser;
    }
    public List<Project> findAllProjectsAsProjectLeader(User currentUser){
        List<Project>projectsForUser=projectRepository.findByUsersNotContains(currentUser);
        return projectsForUser;
    }
    public Project createProject(Project project){
        return projectRepository.save(project);
    }
    public Project findProject(Long projectId) {
        Optional<Project> optionalProject=projectRepository.findById(projectId);
        if (optionalProject.isPresent()) {
            return optionalProject.get();
        }
        else {
            return null;
        }
    }
    public void deleteProject(Long id){
        Project projectDelete =findProject(id);
        projectRepository.delete(projectDelete);
    }
    public Project updateProject(Project project){
        return projectRepository.save(project);
    }

}

