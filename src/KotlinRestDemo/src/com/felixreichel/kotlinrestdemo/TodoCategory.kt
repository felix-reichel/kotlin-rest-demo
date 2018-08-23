package com.felixreichel.kotlinrestdemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class TodoCategory(
	@Id @GeneratedValue
	val id: Long = -1,
	val name: String
) {
    @OneToMany(mappedBy = "todoCategory")
    val todos: MutableSet<Todo> = HashSet()
}
