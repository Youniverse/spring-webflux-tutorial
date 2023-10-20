package com.youniverse.springwebfluxtutorial.model

import org.springframework.data.annotation.Id
import java.time.Instant

data class Message(
    @Id
    var id: Long = 0,
    val message: String?,
    val userName: String?,
    val date: Instant?,
)
