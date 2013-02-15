package com.teamyefos.scala.service

import com.yammer.dropwizard.ScalaService
import com.yammer.dropwizard.config.{Environment, Bootstrap}

import com.yammer.dropwizard.bundles.ScalaBundle
import health.TemplateHealthCheck
import resources.HelloWorldResource


object SimpleService extends ScalaService[SimpleServiceConfiguration] {

  def initialize(bootstrap: Bootstrap[SimpleServiceConfiguration]) {
    bootstrap.setName("example")
    bootstrap.addBundle(new ScalaBundle)
  }

  def run(configuration: SimpleServiceConfiguration, environment: Environment) {
    environment.addResource(new HelloWorldResource(configuration template, configuration defaultName))
    environment.addHealthCheck(new TemplateHealthCheck(configuration template))
  }

}