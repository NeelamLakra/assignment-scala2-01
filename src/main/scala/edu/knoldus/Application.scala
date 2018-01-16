package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  val first = 1;
  val second = 1;
  val third = 2;
  val fourth = 2;
  val fifth = 2;
  val sixth = 3
  val list2 = List(first, second, third, fourth, fifth, sixth)
  log.info(runLength(list2) + "\n")
  val char1 = 'a'
  val char2 = 'b'
  val char3 = 'c'
  val char4 = 'd'
  val char5 = 'e'
  val char6 = 'f'
  val list = List(char1, char2, char3, char4, char5, char6)
  val index = 4
  log.info(rotateList(index, list) + "\n")
  val list1 = List(char1, char1, char2, char3, char3, char3, char2, char2, char4, char1)
  val resultantList = List()
  log.info(consecutiveElimination(resultantList, list1))
  val number = 20
  log.info(happySadChecker(number, List()))


}
