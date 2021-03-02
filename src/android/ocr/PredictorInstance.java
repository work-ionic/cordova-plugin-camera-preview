package com.baidu.paddle.lite.demo.ocr;


import android.content.Context;

public class PredictorInstance {
    private static PredictorInstance instance;
    public Predictor predictor = new Predictor();

    // Model settings of object detection
    private String modelPath = "ocr_v1_for_cpu";
    private String labelPath = "labels/ppocr_keys_v1.txt";

    private PredictorInstance(Context context) {
        predictor.init(context, modelPath, labelPath);
    }

    public static synchronized PredictorInstance getInstance(Context context) {
        if (instance == null) {
            instance = new PredictorInstance(context);
        }
        return instance;
    }
}
