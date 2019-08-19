package org.apache.gora.benchmark;

import java.io.File;

public final class Constants {
  /** The Constant AVRO_PATH. */
  public static final String AVRO_PATH = "src/main/avro";
  /** The Constant AVRO_FILE. */
  public static final String AVRO_FILE = "user.json";
  /** The field prefix. */
  public static String FIELD_PREFIX = "field";
  /** The Constant USER_ID_VALUE. */
  public static final String USER_ID_VALUE = "userId";
  /** The Constant AVRO_FULL_PATH. */
  public static final String AVRO_FULL_PATH = AVRO_PATH + "/" + AVRO_FILE;
  /** The Constant NULL. */
  public static final String NULL = "null";
  /** The Constant RECORD. */
  public static final String RECORD = "User";
  /** The Constant NAMESPACE_VALUE. */
  public static final String NAMESPACE_VALUE = "org.apache.gora.benchmark.generated";
  /** The Constant NAMESPACE_KEY. */
  public static final String NAMESPACE_KEY = "namespace";
  /** The Constant NAME_KEY. */
  public static final String NAME_KEY = "name";
  /** The Constant MONGODB. */
  public static final String MONGODB = "mongodb";
  /** The Constant COUCHDB. */
  public static final String COUCHDB = "couchdb";
  /** The Constant HBASE. */
  public static final String HBASE = "hbase";
  /** The Constant KEYCLASS. */
  public static final String KEYCLASS = "java.lang.String";
  /** The db mapping path. */
  public static String DB_MAPPING_PATH = "src/main/resources";
  /** The Constant MONGO_MAPPING_FILE. */
  public static final String MONGO_MAPPING_FILE = "gora-mongodb-mapping.xml";
  /** The Constant HBASE_MAPPING_FILE. */
  public static final String HBASE_MAPPING_FILE = "gora-hbase-mapping.xml";
  /** The Constant COUCHDB_MAPPING_FILE. */
  public static final String COUCHDB_MAPPING_FILE = "gora-couchdb-mapping.xml";
  /** The Constant BEAN_DESTINATION_DIR. */
  public static final File BEAN_DESTINATION_DIR = new File("src/main/java/");
  /** The Constant DEFAULT_DATA_STORE_KEY. */
  public static final String DEFAULT_DATA_STORE_KEY = "gora.datastore.default";
  public static final String GORA_ROOT_ELEMENT = "gora-otd";

  public static final String PERSISTENCE_CLASS_KEY = "persistent.class";
  public static final String PERSISTENCE_CLASS_VALUE = "org.apache.gora.benchmark.generated.User";

  public static final String KEY_CLASS_KEY = "key.class";
  public static final String KEY_CLASS_VALUE = "java.lang.String";

  // Datastore Class Constants
  public static final String MONGODB_CLASS = "org.apache.gora.mongodb.store.MongoStore";
  public static final String HBASEDB_CLASS = "org.apache.gora.mongodb.store.HBaseStore";
  public static final String COUCHDB_CLASS = "org.apache.gora.couchdb.store.CouchDBStore";

  // XML Mapping constants
  public static final String CLASS = "class";
  public static final String KEYCLASS_ATT = "keyClass";
  public static final String TABLE = "table";
  public static final String FAMILY = "family";
  public static final String FIELD = "field";
  public static final String DOCUMENT = "document";
  public static final String USERS = "users";
  public static final String DOCFIELD = "docfield";
  public static final String TYPE = "type";
  public static final String INFO = "info";
  public static final String QUALIFIER = "qualifier";
  public static final String ASLV2 = "ASLv2";

  // Test Constants
  public static final int TEST_NUMBER_OF_FIELDS = 20;
  public static final String TEST_TABLE = "users";
  public static final String TEST_KEY_1 = "key1";
  public static final String TEST_KEY_2 = "key2";
  public static final String TEST_KEY_3 = "key3";
  public static final String TEST_FIELD_0 = "field0";
  public static final String TEST_VALUE_0 = "value0";
  public static final String TEST_VALUE = "value";
  public static final String TEST_UPDATED = "updated";
  public static final String TEST_UPDATED_0 = "updated0";

  public static final String LOCALHOST = "localhost";
  public static final int MONGO_DEFAULT_PORT = 27017;

  /**
   * Avoid Instantiatiating a new BenchmarkConstant.
   *
   * @throws AssertionError
   *           the assertion error
   */
  private Constants() throws AssertionError {
    throw new AssertionError();
  }
}
