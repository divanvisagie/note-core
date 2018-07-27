import Dependencies._

//lazy val root = (project in file(".")).
//  settings(
//    inThisBuild(List(
//
//    )),
//
//  )


organization := "com.example"
scalaVersion := "2.12.6"
version      := "0.1.0-SNAPSHOT"

name := "note-core"
libraryDependencies += scalaTest % Test


//persistLauncher := false

scalaJSUseMainModuleInitializer := false
scalaJSModuleKind := ModuleKind.CommonJSModule
scalacOptions += "-P:scalajs:sjsDefinedByDefault"

enablePlugins(ScalaJSPlugin)