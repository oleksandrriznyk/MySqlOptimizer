package ua.nure.riznyk.diploma.run.serializer;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.time.ZonedDateTime;


@JsonComponent
public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {
    @Override
    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString("Hello");
    }
}
