package com.task_manager.mapper;

import com.task_manager.dto.ListTaskDTO;
import com.task_manager.dto.TaskItemDTO;
import com.task_manager.entities.ListTasksEntity;
import com.task_manager.entities.TaskItemEntities;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-18T20:07:03-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Azul Systems, Inc.)"
)
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskItemEntities toTaskEntities(TaskItemDTO taskItemDTO) {
        if ( taskItemDTO == null ) {
            return null;
        }

        TaskItemEntities taskItemEntities = new TaskItemEntities();

        taskItemEntities.setIdTask( taskItemDTO.getIdTask() );
        taskItemEntities.setNameTask( taskItemDTO.getNameTask() );
        taskItemEntities.setDescriptionTask( taskItemDTO.getDescriptionTask() );
        taskItemEntities.setStatusTask( taskItemDTO.getStatusTask() );
        taskItemEntities.setDateTask( taskItemDTO.getDateTask() );

        return taskItemEntities;
    }

    @Override
    public TaskItemDTO toTaskDTO(TaskItemEntities taskItemEntities) {
        if ( taskItemEntities == null ) {
            return null;
        }

        TaskItemDTO taskItemDTO = new TaskItemDTO();

        taskItemDTO.setIdListTask( taskItemEntitiesListIdListTask( taskItemEntities ) );
        taskItemDTO.setIdTask( taskItemEntities.getIdTask() );
        taskItemDTO.setNameTask( taskItemEntities.getNameTask() );
        taskItemDTO.setDescriptionTask( taskItemEntities.getDescriptionTask() );
        taskItemDTO.setStatusTask( taskItemEntities.getStatusTask() );
        taskItemDTO.setDateTask( taskItemEntities.getDateTask() );

        return taskItemDTO;
    }

    @Override
    public void updateEntityFromDTO(ListTaskDTO listTaskDTO, ListTasksEntity listTasksEntity) {
        if ( listTaskDTO == null ) {
            return;
        }

        if ( listTaskDTO.getIdListTask() != null ) {
            listTasksEntity.setIdListTask( listTaskDTO.getIdListTask() );
        }
        if ( listTaskDTO.getNameListTask() != null ) {
            listTasksEntity.setNameListTask( listTaskDTO.getNameListTask() );
        }
        if ( listTasksEntity.getTasks() != null ) {
            List<TaskItemEntities> list = taskItemDTOListToTaskItemEntitiesList( listTaskDTO.getTasks() );
            if ( list != null ) {
                listTasksEntity.getTasks().clear();
                listTasksEntity.getTasks().addAll( list );
            }
        }
        else {
            List<TaskItemEntities> list = taskItemDTOListToTaskItemEntitiesList( listTaskDTO.getTasks() );
            if ( list != null ) {
                listTasksEntity.setTasks( list );
            }
        }
    }

    @Override
    public ListTasksEntity toListTaksEntity(ListTaskDTO listTaskDTO) {
        if ( listTaskDTO == null ) {
            return null;
        }

        ListTasksEntity listTasksEntity = new ListTasksEntity();

        listTasksEntity.setIdListTask( listTaskDTO.getIdListTask() );
        listTasksEntity.setNameListTask( listTaskDTO.getNameListTask() );

        return listTasksEntity;
    }

    @Override
    public ListTaskDTO toListTaskDTO(ListTasksEntity listTasksEntity) {
        if ( listTasksEntity == null ) {
            return null;
        }

        ListTaskDTO listTaskDTO = new ListTaskDTO();

        listTaskDTO.setTasks( taskItemEntitiesListToTaskItemDTOList( listTasksEntity.getTasks() ) );
        listTaskDTO.setIdListTask( listTasksEntity.getIdListTask() );
        listTaskDTO.setNameListTask( listTasksEntity.getNameListTask() );

        return listTaskDTO;
    }

    @Override
    public void updateEntityFromDTO(TaskItemDTO taskItemDTO, TaskItemEntities taskItemEntities) {
        if ( taskItemDTO == null ) {
            return;
        }

        if ( taskItemDTO.getIdTask() != null ) {
            taskItemEntities.setIdTask( taskItemDTO.getIdTask() );
        }
        if ( taskItemDTO.getNameTask() != null ) {
            taskItemEntities.setNameTask( taskItemDTO.getNameTask() );
        }
        if ( taskItemDTO.getDescriptionTask() != null ) {
            taskItemEntities.setDescriptionTask( taskItemDTO.getDescriptionTask() );
        }
        if ( taskItemDTO.getStatusTask() != null ) {
            taskItemEntities.setStatusTask( taskItemDTO.getStatusTask() );
        }
        if ( taskItemDTO.getDateTask() != null ) {
            taskItemEntities.setDateTask( taskItemDTO.getDateTask() );
        }
    }

    private Long taskItemEntitiesListIdListTask(TaskItemEntities taskItemEntities) {
        if ( taskItemEntities == null ) {
            return null;
        }
        ListTasksEntity list = taskItemEntities.getList();
        if ( list == null ) {
            return null;
        }
        Long idListTask = list.getIdListTask();
        if ( idListTask == null ) {
            return null;
        }
        return idListTask;
    }

    protected List<TaskItemEntities> taskItemDTOListToTaskItemEntitiesList(List<TaskItemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskItemEntities> list1 = new ArrayList<TaskItemEntities>( list.size() );
        for ( TaskItemDTO taskItemDTO : list ) {
            list1.add( toTaskEntities( taskItemDTO ) );
        }

        return list1;
    }

    protected List<TaskItemDTO> taskItemEntitiesListToTaskItemDTOList(List<TaskItemEntities> list) {
        if ( list == null ) {
            return null;
        }

        List<TaskItemDTO> list1 = new ArrayList<TaskItemDTO>( list.size() );
        for ( TaskItemEntities taskItemEntities : list ) {
            list1.add( toTaskDTO( taskItemEntities ) );
        }

        return list1;
    }
}
