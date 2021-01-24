package com.example.mypay;

import com.google.zxing.Result;

public interface ZxingScanner {
    void handleResult(Result rawResult);
}
