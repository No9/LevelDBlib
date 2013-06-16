package org.leveldb;

import org.apache.cordova.CordovaArgs;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONException;
import com.google.code.p.leveldb.LevelDB;

public class LevelDownMobile extends CordovaPlugin {

	LevelDB db = new LevelDB(this.webView.getContext());
/*private native String dbOpen(String dbpath);

	private native String dbClose(String dbpath);

	public native String dbPut(String key1, String value1);

	public native String dbGet(String key1);
	
	public native String dbDelete(String key1);
	*/

	
    @Override
    public boolean execute(String action, CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
        if ("open".equals(action)) {

            final String result = args.isNull(0) ? null : args.getString(0);
            callbackContext.success(result);
            return true;
        } else if ("echoAsync".equals(action)) {
            final String result = args.isNull(0) ? null : args.getString(0);
            cordova.getThreadPool().execute(new Runnable() {
                public void run() {
                    callbackContext.success(result);
                }
            });
            return true;
        } else if ("echoArrayBuffer".equals(action)) {
            final byte[] result = args.getArrayBuffer(0);
            callbackContext.success(result);
            return true;
        }
        return false;
    }
}