package com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.controller;

import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.service.BookPublisherService;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.Response;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.book.CreateBookRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Caching;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@Validated
@RestController
public class KafkaController {

  private final BookPublisherService bookPublisherService;

  public KafkaController(BookPublisherService bookPublisherService) {
    this.bookPublisherService = bookPublisherService;
  }

  @ApiOperation("Publish Kafka to Create a Book")
  @PostMapping(path = "/api/publish",
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public Response<Void> publishKafkaToCreateBook(@RequestBody CreateBookRequest createBookRequest) {
    bookPublisherService.sendMessage(createBookRequest);
    return Response.<Void>builder()
        .status(HttpStatus.OK.value())
        .build();
  }

}
