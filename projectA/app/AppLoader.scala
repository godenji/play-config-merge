// play
import play.api.{controllers => _, _}
import router.Routes
import routing.Router
import ApplicationLoader.Context

import controllers.Home

// macwire
import com.softwaremill.macwire._

class AppLoader extends ApplicationLoader {

  override def load(context: Context) = {
    setLogger(context)
    new AppComponents(context).application
  }
  protected def setLogger(context: Context): Unit =
    LoggerConfigurator(context.environment.classLoader).foreach(
      _.configure(context.environment)
    )
}

class AppComponents(context: Context)
  extends BuiltInComponentsFromContext(context) {

  val httpFilters = Seq()
  lazy val home: Home = wire[Home]

  override lazy val router: Router = new Routes(
    httpErrorHandler,
    home
  )
}

