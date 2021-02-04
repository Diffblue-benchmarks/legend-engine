package org.finos.legend.engine.shared.core.operational.prometheus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import io.prometheus.client.Collector;
import java.util.List;
import org.junit.Test;
import zipkin2.reporter.InMemoryReporterMetrics;

public class TracingExportsDiffblueTest {
  @Test
  public void testCollect() {
    // Arrange and Act
    List<Collector.MetricFamilySamples> actualCollectResult = (new TracingExports(new InMemoryReporterMetrics()))
        .collect();

    // Assert
    assertEquals(1, actualCollectResult.size());
    Collector.MetricFamilySamples getResult = actualCollectResult.get(0);
    assertEquals("Name: Tracing Type: COUNTER Help: Metrics for OpenTracing Samples: [Name: Total_spans LabelNames: []"
        + " labelValues: [] Value: 0.0 TimestampMs: null, Name: Total_span_bytes LabelNames: [] labelValues: []"
        + " Value: 0.0 TimestampMs: null, Name: Spans_dropped LabelNames: [] labelValues: [] Value: 0.0 TimestampMs:"
        + " null, Name: Spans_queued LabelNames: [] labelValues: [] Value: 0.0 TimestampMs: null]",
        getResult.toString());
    assertEquals(Collector.Type.COUNTER, getResult.type);
    assertEquals("Tracing", getResult.name);
    List<Collector.MetricFamilySamples.Sample> sampleList = getResult.samples;
    assertEquals(4, sampleList.size());
    assertEquals("Metrics for OpenTracing", getResult.help);
    Collector.MetricFamilySamples.Sample getResult1 = sampleList.get(0);
    assertTrue(getResult1.labelValues.isEmpty());
    Collector.MetricFamilySamples.Sample getResult2 = sampleList.get(1);
    assertEquals(0.0, getResult2.value, 0.0);
    assertNull(getResult2.timestampMs);
    assertEquals("Total_span_bytes", getResult2.name);
    assertEquals("Name: Total_span_bytes LabelNames: [] labelValues: [] Value: 0.0 TimestampMs: null",
        getResult2.toString());
    assertEquals(0.0, getResult1.value, 0.0);
    assertNull(getResult1.timestampMs);
    assertEquals("Total_spans", getResult1.name);
    assertEquals("Name: Total_spans LabelNames: [] labelValues: [] Value: 0.0 TimestampMs: null",
        getResult1.toString());
    Collector.MetricFamilySamples.Sample getResult3 = sampleList.get(2);
    assertEquals(0.0, getResult3.value, 0.0);
    assertNull(getResult3.timestampMs);
    assertEquals("Spans_dropped", getResult3.name);
    assertEquals("Name: Spans_dropped LabelNames: [] labelValues: [] Value: 0.0 TimestampMs: null",
        getResult3.toString());
    Collector.MetricFamilySamples.Sample getResult4 = sampleList.get(3);
    assertEquals(0.0, getResult4.value, 0.0);
    assertNull(getResult4.timestampMs);
    assertEquals("Spans_queued", getResult4.name);
    assertEquals("Name: Spans_queued LabelNames: [] labelValues: [] Value: 0.0 TimestampMs: null",
        getResult4.toString());
  }
}

