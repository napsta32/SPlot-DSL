package d3v4

import scalajs.js
import scalajs.js.{undefined, `|`}
import scala.scalajs.js.annotation._

@JSImport("d3-array", JSImport.Namespace)
@js.native
object d3array extends js.Object {
  def ascending[V](a: V, b: V): Int = js.native
  def descending[V](a: V, b: V): Int = js.native
  def range(stop: Int): js.Array[Int] = js.native
  def range(start: Int, stop: Int): js.Array[Int] = js.native
  def range(start: Int, stop: Int, step: Int): js.Array[Int] = js.native

  def range(stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native

  def extent[Comparable, V](values: js.Array[V]): js.Tuple2[Comparable, Comparable] = js.native
  def extent[Comparable, V](values: js.Array[V], valueOf: (V, Int, js.Array[V]) => Comparable): js.Tuple2[Comparable, Comparable] = js.native

  def max[Comparable, V](values: js.Array[V]): Comparable = js.native
  def max[Comparable, V](values: js.Array[V], valueOf: (V, Int, js.Array[V]) => Comparable): Comparable = js.native

  def min[Comparable, V](values: js.Array[V]): Comparable = js.native
  def min[Comparable, V](values: js.Array[V], valueOf: (V, Int, js.Array[V]) => Comparable): Comparable = js.native
}