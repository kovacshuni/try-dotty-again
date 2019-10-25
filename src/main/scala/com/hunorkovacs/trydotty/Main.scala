package com.hunorkovacs.trydotty

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer


object Main extends App   {

  println("Hello world!")
  println(msg)

  implicit private val sys: ActorSystem = ActorSystem("snowplow-tech-test")
  implicit private val mat: ActorMaterializer = ActorMaterializer()

  import sys.dispatcher

  val router = new Router()
  val httpBindingF = Http().bindAndHandle(router.route, "0.0.0.0", 8080)

  def msg = "I was compiled by dotty :)"
}

