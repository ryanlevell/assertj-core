/*
 * Created on Sep 18, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assert4j.core.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.assert4j.core.assertions.error.ShouldBeNullOrEmpty.shouldBeNullOrEmpty;
import static org.assert4j.core.util.Lists.newArrayList;

import org.assert4j.core.assertions.description.*;
import org.assert4j.core.assertions.error.ErrorMessageFactory;
import org.assert4j.core.assertions.error.ShouldBeNullOrEmpty;
import org.junit.*;

/**
 * Tests for <code>{@link ShouldBeNullOrEmpty#create(Description)}</code>.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class ShouldBeNullOrEmpty_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeNullOrEmpty(newArrayList("Luke", "Yoda"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TextDescription("Test"));
    assertEquals("[Test] expecting null or empty but was:<['Luke', 'Yoda']>", message);
  }
}