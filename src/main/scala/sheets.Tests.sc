import java.util.concurrent.TimeUnit

import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

val mon = List(1, 2)
val m2 = mon.map(d => List(d, d + 2))
val m3 = mon.flatMap(d => List(d, d + 2))

val x = 5
val mon2 = Some(x)
val s1 = mon2.map(x => List(x))
val s2 = mon2.flatMap(x => None)

val d1 = "test".map(c => c + "-")
val d2 = "test".flatMap(c => c + "-")
val d3 = "test".to[List]

val c = "test" (3)

val fut: Future[Int] = Future(1).flatMap(x => Future(x + 3))


val res = Await.result(fut, Duration(2, TimeUnit.SECONDS))


def tryOne(i: Int) = Try(i + 2)
def tryTwo(i: Int) = Try(i.ensuring(i < 10, "Error!?!?"))

val res2 = tryOne(3).flatMap(x => tryTwo(x))

def forResFunc(i: Int) = for {
  one <- tryOne(i)
  two <- tryTwo(one)
} yield (one, two)

val froRes = forResFunc(5)