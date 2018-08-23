package com.felixreichel.kotlinrestdemo

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Todo(
	@Id @GeneratedValue
	val id: Long = -1,
	val name: String,
	val completedAt: LocalDateTime? = null
) {
	@ManyToOne
    lateinit var todoCategory: TodoCategory

    constructor(name: String, todoCategory: TodoCategory) : this(name = name) {
        this.todoCategory = todoCategory
    }
}