package com.github.ghik.silencer

import scala.annotation.StaticAnnotation

class silent extends StaticAnnotation {
  def this(messagePattern: String) = this()
}

