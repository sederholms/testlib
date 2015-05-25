package net.sederholms.testlib

import org.scalatest.FunSuite

class TestLibSuite extends FunSuite {

  test("Invoking test should return whatever is given in as a parameter") {
    val lib = new TestLib()
    assert(lib.test("XXX") == "XXX")
  }

}
