package com.netease.opensource.idempotency.common;

public interface CheckBizService {

    boolean haveCurrentRequest(String requestId);

    boolean checkIsAnCompleteRequest(String requestId);
}
