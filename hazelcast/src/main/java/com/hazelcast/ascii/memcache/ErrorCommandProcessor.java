/*
 * Copyright (c) 2008-2012, Hazelcast, Inc. All Rights Reserved.
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
 */

package com.hazelcast.ascii.memcache;

import com.hazelcast.ascii.AbstractTextCommandProcessor;
import com.hazelcast.ascii.TextCommandService;

public class ErrorCommandProcessor extends AbstractTextCommandProcessor<ErrorCommand> {

    public ErrorCommandProcessor(TextCommandService textCommandService) {
        super(textCommandService);
    }

    public void handle(ErrorCommand command) {
        textCommandService.sendResponse(command);
    }

    public void handleRejection(ErrorCommand command) {
        handle(command);
    }
}