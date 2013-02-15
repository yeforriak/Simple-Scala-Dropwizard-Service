
package com.teamyefos.scala.service.resources

import java.util.concurrent.atomic.AtomicLong
import com.yammer.metrics.annotation.Timed
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import com.teamyefos.scala.service.core.Saying

@Path("/hello-world")
@Produces(Array("application/json"))
class HelloWorldResource(val template: String, val defaultName: String) {

  private val counter: AtomicLong = new AtomicLong

  @GET
  @Timed
  def sayHello(@QueryParam("name") name: Option[String]): Saying =
    new Saying(counter.incrementAndGet(), String.format(name.getOrElse(defaultName)))

}