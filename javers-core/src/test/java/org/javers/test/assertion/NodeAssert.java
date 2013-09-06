package org.javers.test.assertion;

import org.fest.assertions.api.AbstractAssert;
import org.javers.model.object.graph.ObjectNode;

/**
 * @author bartosz walacik
 */
public class NodeAssert extends AbstractAssert<NodeAssert, ObjectNode> {

    private NodeAssert(ObjectNode actual) {
        super(actual, NodeAssert.class);
    }

    public static NodeAssert assertThat(ObjectNode actual) {
        return new NodeAssert(actual);
    }

    public NodeAssert hasCdoWithId(String expectedCdoId) {
        Assertions.assertThat(actual.getCdoId()).isEqualTo(expectedCdoId);
        return this;
    }

    public NodeAssert hasEdges(int expectedSize) {
        Assertions.assertThat(actual.getEdges()).hasSize(expectedSize);
        return this;
    }
}