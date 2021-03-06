/*******************************************************************************
 * Copyright (c) 2014, 2021 SAP AG and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    SAP AG - initial API and implementation
 *    Christoph Läubrich - Bug 572420 - Tycho-Surefire should be executable for eclipse-plugin
package type
 *******************************************************************************/
package org.eclipse.tycho;

/**
 * Types of Eclipse/OSGi artifacts which can be referenced in a Tycho build.
 */
public final class ArtifactType {

    public static final String TYPE_ECLIPSE_PLUGIN = "eclipse-plugin";
    /**
     * This ArtifactType is for the generated test fragment (tests from an eclipse-plugin module).
     * It should also be used as the <b>classifier</b> to attach and get this test fragment on a
     * given MavenProject.
     */
    public static final String TYPE_ECLIPSE_TEST_FRAGMENT = "eclipse-test-fragment";
    public static final String TYPE_ECLIPSE_FEATURE = "eclipse-feature";
    public static final String TYPE_ECLIPSE_PRODUCT = "eclipse-product";
    public static final String TYPE_INSTALLABLE_UNIT = "p2-installable-unit";

}
