package $package$

import sbt._

object Versions {

  val scala  = "$scala$"
  val specs2 = "$specs2$"

}

object Dependencies {

  object specs2 {
    val core       = "org.specs2" %% "specs2-core"       % Versions.specs2 % "test"
    val scalacheck = "org.specs2" %% "specs2-scalacheck" % Versions.specs2 % "test"
    val mock       = "org.specs2" %% "specs2-mock"       % Versions.specs2 % "test"
  }

}