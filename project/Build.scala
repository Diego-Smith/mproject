import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "mproject"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
		anorm, 
		javaJdbc
		, "com.loicdescotte.coffeebean" % "html5tags_2.10" % "1.1.0"
		, "com.typesafe" %% "play-plugins-mailer" % "2.1.0"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
        resolvers += Resolver.url("github repo for html5tags", url("http://loicdescotte.github.io/releases/"))(Resolver.ivyStylePatterns) ,
        lessEntryPoints <<= baseDirectory(_ / "app" / "assets" / "stylesheets" ** "layout.less")
       
    )

}
