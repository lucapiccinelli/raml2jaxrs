package com.g3.bowlingapp

import com.g3.bowlingapp.api.Game
import com.g3.bowlingapp.api.model.GameCreated
import com.g3.bowlingapp.api.model.GameCreatedImpl
import com.g3.bowlingapp.api.model.GameGetInclude
import com.g3.bowlingapp.api.model.GamePost201ApplicationVndApiJson
import org.glassfish.jersey.server.ResourceConfig
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.stereotype.Component
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class BowlingappApplicationTests {

	@Test
	fun contextLoads() {
	}
}
