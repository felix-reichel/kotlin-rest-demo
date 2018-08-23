package com.felixreichel.kotlinrestdemo

import javax.persistence.EntityManager

class TodoRepository(
		//val client: EntityManager
) {
	
	/* val collection: MutableList<Todo> = (client.createQuery("select * from todo"))
			.getResultList() as MutableList<Todo>; */
	
	val collection: MutableList<Todo> = mutableListOf(
			Todo(0, "test1"), Todo(1, "test2"), Todo(2, "third todo"))
}