package com.gdn.training.Blibli_Future_Kafka_Redis_Demo.service.impl;

import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.entity.Book;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.repository.BookRepository;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.service.BookService;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.book.BookFilter;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.book.CreateBookRequest;
import com.gdn.training.Blibli_Future_Kafka_Redis_Demo.web.model.book.UpdateBookRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }


  @Override
  public Book create(CreateBookRequest request) {
    return null;
  }

  @Override
  public Page<Book> findAll(BookFilter filter) {
    return null;
  }

  @Override
  public Book findById(String id) {
    return null;
  }

  @Override
  public Book update(String id, UpdateBookRequest request) {
    return null;
  }

  @Override
  public void delete(String id) {

  }
  
}
