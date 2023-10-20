package com.youniverse.springwebfluxtutorial.api

import com.youniverse.springwebfluxtutorial.model.Message
import com.youniverse.springwebfluxtutorial.repository.MessageRepository
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
@RequestMapping("/api/messages")
class MessageController(private val messageRepository: MessageRepository) {

    @GetMapping
    suspend fun getAll() = messageRepository.findAll()

    @GetMapping("/{id}")
    suspend fun getOne(@PathVariable id: Long) = messageRepository.findById(id)

    @PostMapping
    suspend fun post(@RequestBody messagePostRequestDto: MessagePostRequestDto) =
        messageRepository.save(
            Message(
                message = messagePostRequestDto.message,
                userName = messagePostRequestDto.userName,
                date = Instant.now(),
            )
        )

    @DeleteMapping("/{id}")
    suspend fun deleteOne(@PathVariable id: Long) = messageRepository.deleteById(id)
}

data class MessagePostRequestDto(
    val message: String?,
    val userName: String?,
)
