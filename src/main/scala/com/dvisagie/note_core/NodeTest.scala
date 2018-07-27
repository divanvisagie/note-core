package com.dvisagie.note_core

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel, ScalaJSDefined}

//@ScalaJSDefined
@JSExportTopLevel("NodeTest")
class NodeTest extends js.Object{
  def test(): Unit ={
    println("Hello World I am a scala node module")
  }
}
