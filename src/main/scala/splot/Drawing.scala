package splot

import d3v4.Selection
import org.scalajs.dom

abstract class Drawing {

  def append(d: Drawing): Drawing
  def setData[Node, Edge](graph: Graph[Node, Edge]): Drawing
  def getSelection(): Selection[dom.EventTarget]
  def setValue[T](propName: String, func: () => T): Unit

}

object splotdrawing {

  def setData[Node, Edge](graph: Graph[Node, Edge]): this.type = {
    Context.setData(graph)
    this
  }

  def setValue[T](propName: String, func: () => T): this.type = {
    Context.setValue(propName, func)
    this
  }
  def setValue[T](propName: String, value: T): this.type = setValue(propName, () => value)

}