
object exam {

  def main(args:Array[String]): Unit = {

    // Task 1
    def bucket(value: Float, start: Float, diff: Float): (Float, Float) = {
      (start + ((value/diff).floor) * diff, (start + ((value/diff).floor) * diff + 0.049F))
    }

    println(bucket(12.05F, 0.0F, 0.05F))
    println(bucket(10.33F, 0.0F, 0.05F))
    println(bucket(11.45F, 0.0F, 0.05F))
    println(bucket(13.50F, 0.0F, 0.05F))



    var players = Array((2021, "Sam", "India", 23, 2300, 3),(2021, "Ram", "India", 23, 300, 3), (2021, "Mano", "India", 23, 300, 13))
    //Q1 Player with the best highest run scored.

    var playw=players.sortWith(_._5 > _._5)
    println(playw(0)._2)


    println(1)

    //Q2 Top 5 players by run scored.

    for(i <- players.sortWith(_._5 > _._5).take(5)){
      println(i._2)
    }

    println(2)
    //Q3. Top 5 players by wicket taken.

    for(i <- players.sortWith(_._6 > _._6).take(5)){
      println(i._2)
    }
    println(3)
    //Q4. Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.

    var play=players.sortBy(x => x._5 * 0.05 + x._6 * 5).reverse
    var cnt: Int = 1
    for(i<-play)
      {

        println(s"Rank $cnt --> " + i._2)
        cnt += 1;
      }


  }}
