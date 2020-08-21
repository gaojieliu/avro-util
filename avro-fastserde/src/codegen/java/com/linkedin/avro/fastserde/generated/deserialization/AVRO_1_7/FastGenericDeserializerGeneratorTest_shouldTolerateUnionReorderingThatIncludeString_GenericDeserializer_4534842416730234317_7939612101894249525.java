
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_7;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString_GenericDeserializer_4534842416730234317_7939612101894249525
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema test0;

    public FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString_GenericDeserializer_4534842416730234317_7939612101894249525(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.test0 = readerSchema.getField("test").schema();
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder)
        throws IOException
    {
        return deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString0((reuse), (decoder));
    }

    public IndexedRecord deserializeFastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString = ((IndexedRecord)(reuse));
        } else {
            FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            decoder.readNull();
        } else {
            if (unionIndex0 == 1) {
                if (FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.get(0) instanceof Utf8) {
                    FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.put(0, (decoder).readString(((Utf8) FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.get(0))));
                } else {
                    FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.put(0, (decoder).readString(null));
                }
            } else {
                if (unionIndex0 == 2) {
                    if (FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.get(0) instanceof Utf8) {
                        FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.put(0, (decoder).readString(((Utf8) FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.get(0))));
                    } else {
                        FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString.put(0, (decoder).readString(null));
                    }
                }
            }
        }
        return FastGenericDeserializerGeneratorTest_shouldTolerateUnionReorderingThatIncludeString;
    }

}
