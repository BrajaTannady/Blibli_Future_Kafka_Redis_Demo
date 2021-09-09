package com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.controller;

import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.service.BookPublisherService;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@Api
@Validated
@RestController
public class KafkaController {

  private final BookPublisherService bookPublisherService;

  public KafkaController(BookPublisherService bookPublisherService) {
    this.bookPublisherService = bookPublisherService;
  }

}
