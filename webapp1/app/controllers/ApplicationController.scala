package controllers

import play.api._
import play.api.mvc._

import java.text.SimpleDateFormat
import javax.inject.Inject
import models._
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Try
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import ChatSchema._

import play.api.libs.json._

object ApplicationController extends Controller {

  def index = Action { Ok(views.html.index()) }

}
