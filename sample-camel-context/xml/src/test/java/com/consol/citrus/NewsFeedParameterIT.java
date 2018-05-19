/*
 * Copyright 2006-2014 the original author or authors.
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

package com.consol.citrus;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.testng.AbstractTestNGCitrusTest;
import com.consol.citrus.testng.CitrusParameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Christoph Deppisch
 * @since 2.1
 */
@Test
public class NewsFeedParameterIT extends AbstractTestNGCitrusTest {

    @CitrusXmlTest(name = "NewsFeed_DataProvider_Ok_IT")
    @CitrusParameters({ "message" })
    @Test(dataProvider = "messageDataProvider")
    public void newsFeed_DataProvider_Ok_Test(String message) {}

    @DataProvider
    public Object[][] messageDataProvider() {
        return new Object[][] {{ "Citrus rocks!" },
                               { "Citrus really rocks!" },
                               { "Citrus is awesome!" }};
    }
}
