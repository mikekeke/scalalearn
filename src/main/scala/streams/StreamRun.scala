package streams

/**
  * Created by ibes on 13.03.17.
  */
object StreamRun extends App{
  println(MyStream(1,2,3,4).take(3).toListFast)
  println(MyStream(1,2,3,4).takeWhile(_ <= 3).toListFast)
  println(s"Exists true: ${MyStream(1,2,3,4).exists(_ == 3)}")
  println(s"Exists false: ${MyStream(1,2,3,4).exists(_ == 77)}")
  println(s"Forall true: ${MyStream(2,2,2).forAll(_ == 2)}")
  println(s"Forall false: ${MyStream(2,2,3).forAll(_ == 2)}")
  println(MyStream(1,2,3,4).takeWhileViaFoldRight(_ <= 3).toListFast)
  println(s"Map x*10: ${MyStream(1,2,3).map(_ * 10).toList}")
  println(s"Filter x <=4: ${MyStream(1,2,3,1,3,4,5,7).filter(_ <= 4).toList}")
}
