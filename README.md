# Applied Functional Programming Workshop Check Project
This repository helps workshop attendees to verify the required installation.

## Requirements
- Java (JDK) version 8 or higher
- Scala version 2.12.x (https://www.scala-lang.org/download/)
- SBT version 1.x (https://www.scala-sbt.org/download.html)
- IDE/Editor like: IntelliJ, Eclipse, Sublime, Visual Studio Code, Vim or Emacs

## Run tests
Clone or download this repository, enter the project directory and execute SBT in interactive mode.
```
$ git clone https://github.com/doubleloop-io/avanscoperta-fp-workshop-scala-check
$ cd avanscoperta-fp-workshop-scala-check
$ sbt
```
When SBT is ready run all tests.
```
sbt:global> test
```
After downloading missing dependencies and running tests the result will be like the following.
```
[info] SetSuite:
[info] - An empty Set should have size 0
[info] - Invoking head on an empty Set should produce NoSuchElementException
[info] Run completed in 112 milliseconds.
[info] Total number of tests run: 2
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 2, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 0 s, completed Nov 7, 2018 11:43:09 PM
```

## Import SBT project in IntelliJ IDEA
Follow the istructions:
1. Click Import Project on the welcome screen.
2. Select the project directory that contains the build.sbt file.
3. Enable the `Use sbt shell for build and import (requires sbt 0.13.5+)`
4. Follow the next steps suggested in by the wizard with default settings.

More option can be found here:
- [SBT Support](https://www.jetbrains.com/help/idea/sbt-support.html)
- [Run, debug and test Scala](https://www.jetbrains.com/help/idea/run-debug-and-test-scala.html)