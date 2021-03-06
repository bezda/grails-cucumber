package steps
/*
 * Copyright 2012 Martin Hauner
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

import static org.junit.Assert.assertTrue
this.metaClass.mixin (cucumber.runtime.groovy.Hooks)
this.metaClass.mixin (cucumber.runtime.groovy.EN)


Given(~'^I run test-app functional:cucumber$') { ->
    // nop
}

When (~'^the "([^"]*)" scenario is executed$') { String scenario ->
    // nop
}

Then (~'^it should pass$') { ->
    // nop
}

Then (~'^it should fail$') { ->
    assertTrue (false)
}

Then (~'^report the failing step$') { ->
    // nop
}

Then (~'^it should error$') { ->
    error ()
}

Then (~'^report the erroneous step$') { ->
    // nop
}

Then (~'^it should print step snippets$') { ->
    // nop
}


def error () {
    int nonZero = 1
    int zero = 0
    nonZero / zero
}
