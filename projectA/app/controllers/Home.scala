package controllers

import play.api.mvc._
import play.api.Configuration

class Home(
  val controllerComponents: ControllerComponents,
  config: Configuration
) extends BaseController {

  def index() = Action {
    Ok(
      s"""
      application.conf "myKey" is: ${config.getOptional[String]("myKey")}
      expected: Some(A)
      """
    )
  }
}
