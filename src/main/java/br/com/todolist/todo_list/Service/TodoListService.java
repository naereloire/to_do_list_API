package br.com.todolist.todo_list.Service;

import br.com.todolist.todo_list.models.TodoListModel;
import br.com.todolist.todo_list.repositories.TodoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {
    private TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public TodoListModel saveTodo(TodoListModel listOrder) {

        todoListRepository.save(listOrder);
        return listOrder;
    }

    public List<TodoListModel> findAllTodo() {
        return todoListRepository.findAll();

    }

}

//tipo/retorno/nome/parametros
