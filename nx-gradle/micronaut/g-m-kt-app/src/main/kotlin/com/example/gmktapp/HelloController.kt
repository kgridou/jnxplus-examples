package com.example.gmktapp

import com.example.gmktlib.HelloService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import jakarta.inject.Inject

@Controller("/hello")
class HelloController(
  @Inject val helloService: HelloService,
) {
  @Get
  @Produces(MediaType.TEXT_PLAIN)
  fun index() = helloService.greeting()
}
