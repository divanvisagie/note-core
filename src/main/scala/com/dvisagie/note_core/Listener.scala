package com.dvisagie.note_core

import com.dvisagie.note_core.ApplicationStore.ReceiveMessage

trait Listener {
  def receive: ReceiveMessage

  def !(message: Any): Unit = receive(message)

  def noop(): Unit = {}
}
