package check

import minitest._

object MySimpleSuite extends SimpleTestSuite {
  test("should be") {
    assertEquals(2, 1 + 1)
  }

  test("should not be") {
    assert(1 + 1 != 3)
  }

  test("should throw") {
    class DummyException extends RuntimeException("DUMMY")
    def run(): Unit = throw new DummyException

    intercept[DummyException] {
      run()
    }
  }

  test("test result of") {
    assertResult("hello world") {
      "hello" + " " + "world"
    }
  }
}