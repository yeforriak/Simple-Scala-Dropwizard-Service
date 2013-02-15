package com.teamyefos.scala.service.core

import scala.reflect.BeanProperty

class Saying(@BeanProperty val id: Long, @BeanProperty val content: String) {

}