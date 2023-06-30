package com.example.testsuitepoc;

import static org.junit.jupiter.api.Assertions.fail;

import com.other.ExternalClass;
import org.junit.jupiter.api.Test;

class MyE2ETest {

  @Test
  void test(){
    FromMain fromMain = new FromMain();
    ExternalClass externalClass = new ExternalClass();
  }

}
