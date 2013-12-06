package com.alainodea

import java.sql.DriverManager
import java.net.InetAddress

object JDBCTestMain {
  def main(args: Array[String]) {
    val connectionString = args(0)
    println(connectionString)
    val con = DriverManager.getConnection(
      args(0),
      args(1),
      args(2))
    val stmt = con.createStatement()
    val rs = stmt.executeQuery("SELECT 1")
    while (rs.next()) {
      println(rs)
    }
  }
}
