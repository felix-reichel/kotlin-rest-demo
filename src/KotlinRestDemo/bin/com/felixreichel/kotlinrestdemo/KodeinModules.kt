package com.felixreichel.kotlinrestdemo

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.eagerSingleton
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import javax.persistence.Persistence

val common = Kodein.Module(name = "common") {
	bind("entityManager") from singleton {
		// Persistence.createEntityManagerFactory("").createEntityManager()
		Object()
	}
}

val repositories = Kodein.Module(name = "repositories") {
	bind(tag = "todoRepository") from singleton { TodoRepository() }
	// bind(tag = "todoCategoryRepository") from singleton { TodoCategoryRepository(instance("entityManager")) }
}
 

val services = Kodein.Module(name = "services") {
	bind(tag = "todoService") from singleton { TodoService(instance("todoRepository")) }
	// bind(tag = "todoCategoryService") from singleton { TodoService(instance("todoCategoryRepository")) }
}

val controllers = Kodein.Module(name = "controllers") {
	bind(tag = "todoController") from eagerSingleton { TodoController(kodein) }
	// bind(tag = "todoCategoryController") from eagerSingleton { TodoCategoryController(kodein) }
 }
