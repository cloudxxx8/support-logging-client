/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @microservice:  support-logging-client library
 * @author: Jude Hung, Dell
 * @version: 1.0.0
 *******************************************************************************/
package org.edgexfoundry.support.logging.client;

import org.edgexfoundry.support.logging.client.EdgeXLogger;
import org.edgexfoundry.support.logging.client.EdgeXLoggerFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class EdgeXLoggingClientTest {
	
	private EdgeXLogger logger;

	@Before
	public void setUp() throws Exception {
		logger = EdgeXLoggerFactory.getEdgeXLogger(EdgeXLoggingClientTest.class);
	}

	@After
	public void cleanup() throws Exception {
		
	}
	
	//@Test
	public void test1() {
		Marker fooMarker = MarkerFactory.getMarker("foo");
		Marker barMarker = MarkerFactory.getMarker("bar");
		fooMarker.add(barMarker);
		//logger.debug(fooMarker, "test message from EdgeXLoggingClientTest");
	}
	
	@Test
	public void test2() {
		logger.debug("test message from EdgeXLoggingClientTest", "foo", "bar", "baz");
	}

}
