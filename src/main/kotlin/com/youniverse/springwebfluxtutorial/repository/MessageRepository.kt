package com.youniverse.springwebfluxtutorial.repository

import com.youniverse.springwebfluxtutorial.model.Message
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository


@Repository
interface MessageRepository : CoroutineCrudRepository<Message, Long>