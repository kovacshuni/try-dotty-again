package com.hunorkovacs.trydotty

import akka.http.scaladsl.model.StatusCodes.OK
import akka.http.scaladsl.server.Directives
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer

import language.implicitConversions

import scala.concurrent.ExecutionContext

class Router(implicit ec: ExecutionContext, mat: ActorMaterializer) extends Directives {

  val route: Route = 
    path("hello") { 
      get {
        complete {
          OK -> Main.msg
        }
      } 
    }
}
