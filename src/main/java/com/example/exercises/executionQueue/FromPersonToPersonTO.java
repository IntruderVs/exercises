package com.example.exercises.executionQueue;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class FromPersonToPersonTO {
    public List<PersonTO> getPersonTo(List<Person> persons) {
        HashMap<String, Integer> groupsAndTheirSize = new HashMap<>();
        List<PersonTO> exit = new ArrayList<>();
        ExecutionQueue executionQueue = () -> {};

        for (Person person : persons) {
            groupsAndTheirSize.merge(person.getGroup(), 1, Integer::sum);

            executionQueue = executionQueue.oneMoreExecute(() -> {
                PersonTO personTO = new PersonTO();
                personTO.setName(person.getName());
                personTO.setAge(person.getAge());
                personTO.setSizeOfGroup(groupsAndTheirSize.get(person.getGroup()));
                exit.add(personTO);
            });
        }
        executionQueue.execute();
        return exit;
    }
}
