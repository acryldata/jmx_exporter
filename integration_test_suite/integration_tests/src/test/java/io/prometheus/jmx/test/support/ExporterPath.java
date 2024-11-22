/*
 * Copyright (C) 2024-present The Prometheus jmx_exporter Authors
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

package io.prometheus.jmx.test.support;

/** Class to implement ExporterPath */
public class ExporterPath {

    /** Healthy exporter path */
    public static final String HEALTHY = "/-/healthy";

    /** Metrics exporter path */
    public static final String METRICS = "/metrics";

    /** Constructor */
    private ExporterPath() {
        // INTENTIONALLY BLANK
    }
}