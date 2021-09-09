package com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.controller;

import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.entity.Book;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.service.BookService;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.Response;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.book.BookResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@Api
@Validated
@RestController
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  private BookResponse convertToResponse(Book book) {
    BookResponse bookResponse = new BookResponse();
    BeanUtils.copyProperties(book, bookResponse);
    return bookResponse;
  }

  private Response.Pagination convertToResponse(Page<?> page) {
    return Response.Pagination.builder()
            .page(page.getNumber())
            .size((long) page.getSize())
            .totalItems(page.getTotalElements())
            .build();
  }

}
