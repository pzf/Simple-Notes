package exp.injection;

import android.util.Log;



public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static void injectClassCastException (Object result){
        try {
            Log.i(TAG,"injectClassCastException begin");
            String classCast = (String)result;
        }finally {
            Log.i(TAG,"injectClassCastException after");
        }
    }
    public static void injectLogicException (Runnable runnable){
        try {
            Log.i(TAG,"injectLogicException begin");
            runnable.run();
        }finally {
            Log.i(TAG,"injectLogicException after");
        }
    }
}
