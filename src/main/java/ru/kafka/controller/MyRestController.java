package ru.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;
import ru.kafka.dto.UserDto;

@RestController
@RequestMapping("msg")
public class MyRestController {

    @Autowired
    private KafkaTemplate<Long, UserDto> kafkaTemplate;

    @PostMapping //Body в Postman: {"age":33,"name":"Ivan","address":{"country":"RUS","city":"Msk","street":"Lenina","homeNumber":1,"flatNumber":1}}
    public void sendOrder(@RequestParam Long msgId,@RequestBody UserDto msg){
        ListenableFuture<SendResult<Long, UserDto>> future = kafkaTemplate.send("msg", msgId, msg);

        future.addCallback(System.out::println, System.err::println);

        kafkaTemplate.flush();
    }

}
