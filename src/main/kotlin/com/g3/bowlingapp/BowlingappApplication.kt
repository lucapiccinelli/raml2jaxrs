package com.g3.bowlingapp

import com.g3.bowlingapp.api.Game
import com.g3.bowlingapp.api.model.*
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class BowlingappApplication

fun main(args: Array<String>) {
	runApplication<BowlingappApplication>(*args)
}


@Component
public class JerseyConfig : ResourceConfig() {

	init{
		registerEndpoints()
		packages("com.g3.bowlingapp")
	}

	private fun registerEndpoints() {
		register(RestApiGameImpl::class)
	}
}

@Component
class RestApiGameImpl : Game {
	override fun getGame(include: String?): Game.GetGameResponse {
		val response = GameGet200ApplicationVndApiJsonImpl()

		val game = GameImpl()
		game.id = 0
		game.type = "game"

		game.attributes = GameImpl.AttributesTypeImpl()
		game.attributes.total = 0

		game.relationships = GameImpl.RelationshipsTypeImpl()
		val frameId = FrameCreatedImpl()
		frameId.id = 0
		frameId.type = "frame"
		game.relationships.data = listOf(frameId)

		val frame = FrameImpl()
		frame.id = frameId.id
		frame.type = frameId.type
		frame.attributes = FrameImpl.AttributesTypeImpl()
		frame.attributes.type = "Standard"
		frame.attributes.value = 8
		frame.attributes.rolls = (0..1).map {
			val roll = RollImpl()
			roll.id = it
			roll.type = "roll"
			roll.attributes = RollImpl.AttributesTypeImpl()
			roll
		}
		frame.attributes.rolls[0].attributes.value = 3
		frame.attributes.rolls[1].attributes.value = 5

		response.data = game
		if(include != null && include == "frames"){
			response.included = listOf(frame)
		}

		return Game.GetGameResponse.respond200WithApplicationVndApiJson(response)
	}

	override fun postGame(): Game.PostGameResponse {
		val game = GameCreatedImpl()
		game.id = 0
		game.type = "game"
		val response = GamePost201ApplicationVndApiJsonImpl()
		response.data = game
		return Game.PostGameResponse.respond201WithApplicationVndApiJson(response)
	}
}