package com.teamyefos.scala.service

import com.yammer.dropwizard.config.Configuration
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * User: Victor
 * Date: 15/02/2013
 * Time: 14:49
 */
class SimpleServiceConfiguration extends Configuration {
  @NotEmpty
  @JsonProperty
  val template: String = "Hello, %s!"

  @NotEmpty
  @JsonProperty
  val defaultName: String = "Stranger"

}
