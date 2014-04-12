/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.tutorial.log.generated;  
@SuppressWarnings("all")
public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}]}");
  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[1]);
  private java.lang.CharSequence metricDimension;
  private long timestamp;
  private long metric;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return metricDimension;
    case 2: return timestamp;
    case 3: return metric;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)(value); break;
    case 1: metricDimension = (java.lang.CharSequence)(value); break;
    case 2: timestamp = (java.lang.Long)(value); break;
    case 3: metric = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'metricDimension' field.
   */
  public java.lang.CharSequence getMetricDimension() {
    return metricDimension;
  }

  /**
   * Sets the value of the 'metricDimension' field.
   * @param value the value to set.
   */
  public void setMetricDimension(java.lang.CharSequence value) {
    this.metricDimension = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'metricDimension' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isMetricDimensionDirty(java.lang.CharSequence value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'timestamp' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isTimestampDirty(java.lang.Long value) {
    return isDirty(2);
  }

  /**
   * Gets the value of the 'metric' field.
   */
  public java.lang.Long getMetric() {
    return metric;
  }

  /**
   * Sets the value of the 'metric' field.
   * @param value the value to set.
   */
  public void setMetric(java.lang.Long value) {
    this.metric = value;
    setDirty(3);
  }
  
  /**
   * Checks the dirty status of the 'metric' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isMetricDirty(java.lang.Long value) {
    return isDirty(3);
  }

  /** Creates a new MetricDatum RecordBuilder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder() {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder();
  }
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing MetricDatum instance */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToWriteOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for MetricDatum instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MetricDatum>
    implements org.apache.avro.data.RecordBuilder<MetricDatum> {

    private java.nio.ByteBuffer __g__dirty;
    private java.lang.CharSequence metricDimension;
    private long timestamp;
    private long metric;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing MetricDatum instance */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
            super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.metricDimension)) {
        this.metricDimension = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.metricDimension);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.metric)) {
        this.metric = (java.lang.Long) data().deepCopy(fields()[3].schema(), other.metric);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'metricDimension' field */
    public java.lang.CharSequence getMetricDimension() {
      return metricDimension;
    }
    
    /** Sets the value of the 'metricDimension' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setMetricDimension(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.metricDimension = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'metricDimension' field has been set */
    public boolean hasMetricDimension() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'metricDimension' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearMetricDimension() {
      metricDimension = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }
    
    /** Gets the value of the 'metric' field */
    public java.lang.Long getMetric() {
      return metric;
    }
    
    /** Sets the value of the 'metric' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setMetric(long value) {
      validate(fields()[3], value);
      this.metric = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'metric' field has been set */
    public boolean hasMetric() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'metric' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearMetric() {
      fieldSetFlags()[3] = false;
      return this;
    }
    
    @Override
    public MetricDatum build() {
      try {
        MetricDatum record = new MetricDatum();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(new byte[1]);
        record.metricDimension = fieldSetFlags()[1] ? this.metricDimension : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.metric = fieldSetFlags()[3] ? this.metric : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public MetricDatum.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public MetricDatum newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends MetricDatum implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  				  /**
	   * Gets the value of the 'metricDimension' field.
		   */
	  public java.lang.CharSequence getMetricDimension() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'metricDimension' field.
		   * @param value the value to set.
	   */
	  public void setMetricDimension(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'metricDimension' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isMetricDimensionDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'timestamp' field.
		   */
	  public java.lang.Long getTimestamp() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'timestamp' field.
		   * @param value the value to set.
	   */
	  public void setTimestamp(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'timestamp' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isTimestampDirty(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'metric' field.
		   */
	  public java.lang.Long getMetric() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'metric' field.
		   * @param value the value to set.
	   */
	  public void setMetric(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'metric' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isMetricDirty(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}