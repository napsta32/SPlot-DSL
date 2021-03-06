package splot

import d3v4.Selection
import org.scalajs.dom

abstract class Drawing {

  def append(d: Drawing): Drawing
  def setData[Node, Edge](graph: Graph[Node, Edge]): Drawing
  def setData[Node, Edge](m: Matrix[Edge], cols: Seq[Node]): Drawing
  def getSelection(): Selection[dom.EventTarget]
  def setValue[T](propName: String, func: () => T): Unit

  def setZoom(enabled: Boolean): Drawing
  def onLoadSVG(callback: (Selection[dom.EventTarget]) => Unit): Drawing

  // worldmap
  def setCountryHandler(eventName: String, handler: (Selection[dom.EventTarget], String) => Unit): Drawing
  def setCountryColor(setter: String => String): Drawing

}

object splotdrawing {

  def setData[Node, Edge](graph: Graph[Node, Edge]): this.type = {
    Context.setData(graph)
    this
  }

  def setData[Node, Edge](m: Matrix[Edge], cols: Seq[Node]): this.type = {
    Context.setData(m, cols)
    this
  }

  def setValue[T](propName: String, func: () => T): this.type = {
    Context.setValue(propName, func)
    this
  }
  def setValue[T](propName: String, value: T): this.type = setValue(propName, () => value)

  def setZoom(enabled: Boolean): this.type = {
    Context.setZoom(enabled)
    this
  }

  def setCountryHandler(eventName: String, handler: (Selection[dom.EventTarget], String) => Unit): this.type = {
    Context.setCountryHandler(eventName, handler)
    this
  }
  def setCountryColor(setter: String => String): this.type = {
    Context.setCountryColor(setter)
    this
  }

  def onLoadSVG(callback: (Selection[dom.EventTarget]) => Unit): this.type = {
    Context.onLoadSVG(callback)
    this
  }

}
