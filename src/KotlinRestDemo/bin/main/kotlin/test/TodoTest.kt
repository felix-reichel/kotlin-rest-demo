package main.kotlin.test

import com.felixreichel.kotlinrestdemo.Todo
import org.junit.Test

/*
 * doInHibernate is a feature of spring-web-mvc
 
@Test
fun givenTodoWithNullFields_whenSaved_thenFound() {
    doInHibernate(({ this.sessionFactory() }), { session ->
        val todoToSave = Todo(0, "My first todo")
        session.persist(todoToSave)
        val todoFound = session.find(Todo::class.java, todoToSave.id)
        session.refresh(todoFound)
        assertTrue(todoToSave == todoFound)
    })
}}
*/