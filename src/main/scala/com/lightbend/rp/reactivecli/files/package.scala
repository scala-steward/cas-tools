/*
 * Copyright 2017 Lightbend, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightbend.rp.reactivecli

import scala.concurrent.Future

package object files {
  def deleteFile(path: String): Unit = Platform.deleteFile(path)

  def fileExists(path: String): Boolean = Platform.fileExists(path)

  def mkDirs(path: String): Unit = Platform.mkDirs(path)

  def pathFor(components: String*): String = Platform.pathFor(components: _*)

  def readFile(path: String): String = Platform.readFile(path)

  def withTempDir[T](f: String => Future[T]): Future[T] = Platform.withTempDir(f)

  def withTempFile[T](f: String => Future[T]): Future[T] = Platform.withTempFile(f)

  def writeFile(path: String, data: String): Unit = Platform.writeFile(path, data)
}
