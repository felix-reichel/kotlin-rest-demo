package com.felixreichel.kotlinrestdemo

import io.ktor.application.Application
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.application.call
import io.ktor.http.*
import io.ktor.response.respond
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class TodoController(override val kodein: Kodein): KodeinAware {
	val app: Application by instance()
	val service: TodoService by instance("todoService")
	
	init {
		app.routing {
			get("/todos") {
				req -> call.respond(service.findAll()) // call.respond(service.findAll())
			}
		}
	}
}