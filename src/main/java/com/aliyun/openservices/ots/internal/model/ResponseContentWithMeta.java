package com.aliyun.openservices.ots.internal.model;

import com.aliyun.openservices.ots.model.OTSResult;
import com.google.protobuf.Message;

public class ResponseContentWithMeta {
    Message message;
    OTSResult meta;
    
    public ResponseContentWithMeta(Message message, OTSResult meta) {
        this.message = message;
        this.meta = meta;
    }
    
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        this.message = message;
    }
    public OTSResult getMeta() {
        return meta;
    }
    public void setMeta(OTSResult meta) {
        this.meta = meta;
    }
}
