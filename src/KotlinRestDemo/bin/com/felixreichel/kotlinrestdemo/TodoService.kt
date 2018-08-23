package com.felixreichel.kotlinrestdemo

class TodoService(val todoRepository: TodoRepository){
	fun findAll(): List<Todo> {
		return todoRepository.collection
	}
}