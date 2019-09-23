# Applied Functional Programming Workshop Check Project

This repository helps workshop attendees to verify the required installation.

Course description (Italian):
[Applied Functional Programming Workshop](https://www.avanscoperta.it/it/training/applied-functional-programming-workshop/)

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
[info] check.MySimpleSuite
[info] - should be
[info] - should not be
[info] - should throw
[info] - test result of
[info] Passed: Total 4, Failed 0, Errors 0, Passed 4
```

And then run the application

```
sbt:global> run
```

with the following output

```
[info] Done packaging.
[info] Running check.Main
Hello!
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
