package com.yahoo.pt.json.bag;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.yahoo.pt.json.Utils;

public class BagAdapter implements JsonSerializer<BagState>, JsonDeserializer<BagState> {

    public BagState deserialize(JsonElement json, Type arg1,
            JsonDeserializationContext arg2) throws JsonParseException {
        //return BagState.getState(Utils.unquote(json.toString()));
        return BagState.getState(json.getAsString());
    }

    public JsonElement serialize(BagState bagState, Type arg1,
            JsonSerializationContext arg2) {
        return new JsonPrimitive(bagState.value());
    }

}
