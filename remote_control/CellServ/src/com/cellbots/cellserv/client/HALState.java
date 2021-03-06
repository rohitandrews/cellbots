// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from Cellbots.proto

package com.cellbots.cellserv.client;

import com.google.gwt.core.client.*;

public final class HALState extends JavaScriptObject  {

    public static final class SensorValue extends JavaScriptObject  {

        public static final class SensorUnits extends JavaScriptObject {
                
            public static final SensorUnits MILIVOLTS = create(1);
            public static final SensorUnits MILIAMPS = create(2);
            public static final SensorUnits DEG_CELISUS = create(3);
            public static final SensorUnits CENTIMETERS = create(4);
            public static final SensorUnits COUNT = create(5);
            public static final SensorUnits LUX = create(8);
            public static final SensorUnits SATURATON_RED = create(9);
            public static final SensorUnits SATURATON_GREEN = create(10);
            public static final SensorUnits SATURATON_BLUE = create(11);
            public static final SensorUnits TIME_MS = create(12);
            public static final SensorUnits HZ = create(13);
            public static final SensorUnits PULSE_WIDTH_MS = create(13);
            public static final SensorUnits RESISTNACE_OHMS = create(14);
            public static final SensorUnits PRESSURE_MILIBAR = create(15);
            
            private static native SensorUnits create(int number) /*-{
                return number;
            }-*/;
            
            protected SensorUnits() {}
            
            public native int getNumber() /*-{
                return this;
            }-*/;
            
        }

        /**
         * Creates a new SensorValue instance 
         *
         * @return new SensorValue instance
         */
        public static native SensorValue create() /*-{
            return {
                            
            };
        }-*/;

        /**
         * Creates a new JsArray<SensorValue> instance 
         *
         * @return new JsArray<SensorValue> instance
         */
        public static native JsArray<SensorValue> createArray() /*-{
            return [];
        }-*/;

        /**
         * Gets a SensorValue (casting) from a JavaScriptObject
         *
         * @param JavaScriptObject to cast
         * @return SensorValue
         */
        public static native SensorValue get(JavaScriptObject jso) /*-{
            return jso;
        }-*/;
        
        /**
         * Gets a JsArray<SensorValue> (casting) from a JavaScriptObject
         *
         * @param JavaScriptObject to cast
         * @return JsArray<SensorValue> 
         */
        public static native JsArray<SensorValue> getArray(JavaScriptObject jso) /*-{
            return jso;
        }-*/;
        
        /**
         * Parses a SensorValue from a json string
         *
         * @param json string to be parsed/evaluated
         * @return SensorValue 
         */
        public static native SensorValue parse(String json) /*-{
            return $wnd.JSON.parse(json);
        }-*/;
        
        /**
         * Parses a JsArray<SensorValue> from a json string
         *
         * @param json string to be parsed/evaluated
         * @return JsArray<SensorValue> 
         */
        public static native JsArray<SensorValue> parseArray(String json) /*-{
            return $wnd.JSON.parse(json);
        }-*/;
        
        /**
         * Serializes a json object to a json string.
         *
         * @param SensorValue the object to serialize
         * @return String the serialized json string
         */
        public static native String stringify(SensorValue obj) /*-{
            return $wnd.JSON.stringify(obj);
        }-*/;
        
        public static native boolean isInitialized(SensorValue obj) /*-{
            return 
                obj["iD"] != null;
        }-*/;
        
        protected SensorValue() {}

        // getters and setters

        // iD

        public native String getID() /*-{
            return this["iD"] || "";
        }-*/;

        public native void setID(String iD) /*-{
            this["iD"] = iD;
        }-*/;

        public native void clearID() /*-{
            delete this["iD"];
        }-*/;

        public native boolean hasID() /*-{
            return this["iD"] != null;
        }-*/;

        // outOfRange

        public native boolean getOutOfRange() /*-{
            return this["outOfRange"] || false;
        }-*/;

        public native void setOutOfRange(boolean outOfRange) /*-{
            this["outOfRange"] = outOfRange;
        }-*/;

        public native void clearOutOfRange() /*-{
            delete this["outOfRange"];
        }-*/;

        public native boolean hasOutOfRange() /*-{
            return this["outOfRange"] != null;
        }-*/;

        // value

        public native int getValue() /*-{
            return this["value"] || 0;
        }-*/;

        public native void setValue(int value) /*-{
            this["value"] = value;
        }-*/;

        public native void clearValue() /*-{
            delete this["value"];
        }-*/;

        public native boolean hasValue() /*-{
            return this["value"] != null;
        }-*/;

        // prevValue

        public native int getPrevValue() /*-{
            return this["prevValue"] || 0;
        }-*/;

        public native void setPrevValue(int prevValue) /*-{
            this["prevValue"] = prevValue;
        }-*/;

        public native void clearPrevValue() /*-{
            delete this["prevValue"];
        }-*/;

        public native boolean hasPrevValue() /*-{
            return this["prevValue"] != null;
        }-*/;

        // minSenseableValue

        public native int getMinSenseableValue() /*-{
            return this["minSenseableValue"] || 0;
        }-*/;

        public native void setMinSenseableValue(int minSenseableValue) /*-{
            this["minSenseableValue"] = minSenseableValue;
        }-*/;

        public native void clearMinSenseableValue() /*-{
            delete this["minSenseableValue"];
        }-*/;

        public native boolean hasMinSenseableValue() /*-{
            return this["minSenseableValue"] != null;
        }-*/;

        // maxSenseableValue

        public native int getMaxSenseableValue() /*-{
            return this["maxSenseableValue"] || 0;
        }-*/;

        public native void setMaxSenseableValue(int maxSenseableValue) /*-{
            this["maxSenseableValue"] = maxSenseableValue;
        }-*/;

        public native void clearMaxSenseableValue() /*-{
            delete this["maxSenseableValue"];
        }-*/;

        public native boolean hasMaxSenseableValue() /*-{
            return this["maxSenseableValue"] != null;
        }-*/;

        // sensorUnits

        public native SensorUnits getSensorUnits() /*-{
            var v = this["sensorUnits"];
            return v == null ? 1 : v;
        }-*/;

        public native void setSensorUnits(SensorUnits sensorUnits) /*-{
            this["sensorUnits"] = sensorUnits;
        }-*/;

        public native void clearSensorUnits() /*-{
            delete this["sensorUnits"];
        }-*/;

        public native boolean hasSensorUnits() /*-{
            return this["sensorUnits"] != null;
        }-*/;

    }

    /**
     * Creates a new HALState instance 
     *
     * @return new HALState instance
     */
    public static native HALState create() /*-{
        return {
                        
        };
    }-*/;

    /**
     * Creates a new JsArray<HALState> instance 
     *
     * @return new JsArray<HALState> instance
     */
    public static native JsArray<HALState> createArray() /*-{
        return [];
    }-*/;

    /**
     * Gets a HALState (casting) from a JavaScriptObject
     *
     * @param JavaScriptObject to cast
     * @return HALState
     */
    public static native HALState get(JavaScriptObject jso) /*-{
        return jso;
    }-*/;
    
    /**
     * Gets a JsArray<HALState> (casting) from a JavaScriptObject
     *
     * @param JavaScriptObject to cast
     * @return JsArray<HALState> 
     */
    public static native JsArray<HALState> getArray(JavaScriptObject jso) /*-{
        return jso;
    }-*/;
    
    /**
     * Parses a HALState from a json string
     *
     * @param json string to be parsed/evaluated
     * @return HALState 
     */
    public static native HALState parse(String json) /*-{
        return $wnd.JSON.parse(json);
    }-*/;
    
    /**
     * Parses a JsArray<HALState> from a json string
     *
     * @param json string to be parsed/evaluated
     * @return JsArray<HALState> 
     */
    public static native JsArray<HALState> parseArray(String json) /*-{
        return $wnd.JSON.parse(json);
    }-*/;
    
    /**
     * Serializes a json object to a json string.
     *
     * @param HALState the object to serialize
     * @return String the serialized json string
     */
    public static native String stringify(HALState obj) /*-{
        return $wnd.JSON.stringify(obj);
    }-*/;
    
    public static native boolean isInitialized(HALState obj) /*-{
        return 
            obj["timestamp"] != null;
    }-*/;
    
    protected HALState() {}

    // getters and setters

    // timestamp

    public native double getTimestamp() /*-{
        return this["timestamp"] || 0;
    }-*/;

    public native void setTimestamp(double timestamp) /*-{
        this["timestamp"] = timestamp;
    }-*/;

    public native void clearTimestamp() /*-{
        delete this["timestamp"];
    }-*/;

    public native boolean hasTimestamp() /*-{
        return this["timestamp"] != null;
    }-*/;

    // dbgMessage

    public native String getDbgMessage() /*-{
        return this["dbgMessage"] || "";
    }-*/;

    public native void setDbgMessage(String dbgMessage) /*-{
        this["dbgMessage"] = dbgMessage;
    }-*/;

    public native void clearDbgMessage() /*-{
        delete this["dbgMessage"];
    }-*/;

    public native boolean hasDbgMessage() /*-{
        return this["dbgMessage"] != null;
    }-*/;

    // vBat

    public native int getVBat() /*-{
        return this["vBat"] || 0;
    }-*/;

    public native void setVBat(int vBat) /*-{
        this["vBat"] = vBat;
    }-*/;

    public native void clearVBat() /*-{
        delete this["vBat"];
    }-*/;

    public native boolean hasVBat() /*-{
        return this["vBat"] != null;
    }-*/;

    // currentDraw

    public native int getCurrentDraw() /*-{
        return this["currentDraw"] || 0;
    }-*/;

    public native void setCurrentDraw(int currentDraw) /*-{
        this["currentDraw"] = currentDraw;
    }-*/;

    public native void clearCurrentDraw() /*-{
        delete this["currentDraw"];
    }-*/;

    public native boolean hasCurrentDraw() /*-{
        return this["currentDraw"] != null;
    }-*/;

    // powerUsed

    public native int getPowerUsed() /*-{
        return this["powerUsed"] || 0;
    }-*/;

    public native void setPowerUsed(int powerUsed) /*-{
        this["powerUsed"] = powerUsed;
    }-*/;

    public native void clearPowerUsed() /*-{
        delete this["powerUsed"];
    }-*/;

    public native boolean hasPowerUsed() /*-{
        return this["powerUsed"] != null;
    }-*/;

    // batteryTemp

    public native int getBatteryTemp() /*-{
        return this["batteryTemp"] || 0;
    }-*/;

    public native void setBatteryTemp(int batteryTemp) /*-{
        this["batteryTemp"] = batteryTemp;
    }-*/;

    public native void clearBatteryTemp() /*-{
        delete this["batteryTemp"];
    }-*/;

    public native boolean hasBatteryTemp() /*-{
        return this["batteryTemp"] != null;
    }-*/;

    // vCC

    public native int getVCC() /*-{
        return this["vCC"] || 0;
    }-*/;

    public native void setVCC(int vCC) /*-{
        this["vCC"] = vCC;
    }-*/;

    public native void clearVCC() /*-{
        delete this["vCC"];
    }-*/;

    public native boolean hasVCC() /*-{
        return this["vCC"] != null;
    }-*/;

    // sensorValue

    public native JsArray<SensorValue> getSensorValueArray() /*-{
        return this["sensorValue"];
    }-*/;

    public native void setSensorValueArray(JsArray<SensorValue> sensorValue) /*-{
        this["sensorValue"] = sensorValue;
    }-*/;

    public native JsArray<SensorValue> clearSensorValueArray() /*-{
        return (this["sensorValue"] = []);
    }-*/;

    public SensorValue getSensorValue(int index) {
        JsArray<SensorValue> array = getSensorValueArray();
        return array == null ? null : array.get(index);
    }

    public int getSensorValueCount() {
        JsArray<SensorValue> array = getSensorValueArray();
        return array == null ? 0 : array.length();
    }

    public void addSensorValue(SensorValue sensorValue) {
        JsArray<SensorValue> array = getSensorValueArray();
        if(array == null)
            array = clearSensorValueArray();
        array.push(sensorValue);
    }

    // botID

    public native String getBotID() /*-{
        return this["botID"] || "";
    }-*/;

    public native void setBotID(String botID) /*-{
        this["botID"] = botID;
    }-*/;

    public native void clearBotID() /*-{
        delete this["botID"];
    }-*/;

    public native boolean hasBotID() /*-{
        return this["botID"] != null;
    }-*/;

}
