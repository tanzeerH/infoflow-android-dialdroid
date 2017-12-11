package soot.jimple.infoflow.android.data;

import java.util.ArrayList;

public class ICCEntryPointSourceSink {
	
	private static ArrayList<String> data;
	
	public static ArrayList<String> getList(){
		if(data==null)
			init();
		return data;
	}
	
	public static void init(){
		
		data=new ArrayList<String>();
		
		data.add("<android.app.Activity: android.content.Intent getIntent()> -> _SOURCE_");		
		data.add("<android.app.Activity: void onActivityResult(int,int,android.content.Intent)> -> _SOURCE_");
		data.add("<android.content.BroadcastReceiver: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.BroadcastReceiver: android.os.Bundle getResultExtras(boolean)> -> _SOURCE_");
		data.add("<android.content.ContentValues: java.lang.String getAsString(java.lang.String)> -> _SOURCE_");
		
		data.add("<android.content.Context: android.content.Intent getIntent()> -> _SOURCE_");		
		data.add("<android.content.Context: void onActivityResult(int,int,android.content.Intent)> -> _SOURCE_");
		data.add("<android.content.Context: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.Context: android.os.Bundle getResultExtras(boolean)> -> _SOURCE_");
		
		data.add("<android.content.ContextWrapper: android.content.Intent getIntent()> -> _SOURCE_");		
		data.add("<android.content.ContextWrapper: void onActivityResult(int,int,android.content.Intent)> -> _SOURCE_");
		data.add("<android.content.ContextWrapper: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextWrapper: android.os.Bundle getResultExtras(boolean)> -> _SOURCE_");
		
		data.add("<android.content.ContextThemeWrapper: android.content.Intent getIntent()> -> _SOURCE_");		
		data.add("<android.content.ContextThemeWrapper: void onActivityResult(int,int,android.content.Intent)> -> _SOURCE_");
		data.add("<android.content.ContextThemeWrapper: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextThemeWrapper: android.os.Bundle getResultExtras(boolean)> -> _SOURCE_");

		

		
		data.add("<android.content.Intent: android.os.Bundle getBundleExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: byte[] getByteArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: byte getByteExtra(java.lang.String, byte)> -> _SOURCE_");
		
		data.add("<android.content.Intent: char[] getCharArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: char getCharExtra(java.lang.String, char)> -> _SOURCE_");
		data.add("<android.content.Intent: java.lang.CharSequence[] getCharSequenceArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.util.ArrayList getCharSequenceArrayListExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.lang.CharSequence getCharSequenceExtra(java.lang.String)> -> _SOURCE_");
		
		data.add("<android.content.Intent: android.net.Uri getData()> -> _SOURCE_");
		data.add("<android.content.Intent: java.lang.String getDataString()> -> _SOURCE_");
		data.add("<android.content.Intent: double[] getDoubleArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: double getDoubleExtra(java.lang.String, double)> -> _SOURCE_");
		data.add("<android.content.Intent: android.os.Bundle getExtras()> -> _SOURCE_");
		
		data.add("<android.content.Intent: float[] getFloatArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: float getFloatExtra(java.lang.String, float)> -> _SOURCE_");
		data.add("<android.content.Intent: int[] getIntArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.util.ArrayList getIntegerArrayListExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: int getIntExtra(java.lang.String, int)> -> _SOURCE_");
		data.add("<android.content.Intent: long[] getLongArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: long getLongExtra(java.lang.String, long)> -> _SOURCE_");
		data.add("<android.content.Intent: android.os.Parcelable[] getParcelableArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.util.ArrayList getParcelableArrayListExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: android.os.Parcelable getParcelableExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.io.Serializable getSerializableExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: short[] getShortArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: short getShortExtra(java.lang.String, short)> -> _SOURCE_");
		data.add("<android.content.Intent: java.lang.String[] getStringArrayExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.util.ArrayList getStringArrayListExtra(java.lang.String)> -> _SOURCE_");
		data.add("<android.content.Intent: java.lang.String getStringExtra(java.lang.String)> -> _SOURCE_");
		
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SOURCE_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SOURCE_");

		
		
		data.add("<java.io.OutputStream: void write(byte[])> -> _SINK_");
		data.add("<java.io.OutputStream: void write(byte[],int,int)> -> _SINK_");
		data.add("<java.io.OutputStream: void write(int)> -> _SINK_");

		data.add("<java.io.FileOutputStream: void write(byte[])> -> _SINK_");
		data.add("<java.io.FileOutputStream: void write(byte[],int,int)> -> _SINK_");
		data.add("<java.io.FileOutputStream: void write(int)> -> _SINK_");
		
		

		data.add("<java.io.Writer: void write(char[])> -> _SINK_");
		data.add("<java.io.Writer: void write(char[],int,int)> -> _SINK_");
		data.add("<java.io.Writer: void write(int)> -> _SINK_");
		data.add("<java.io.Writer: void write(java.lang.String)> -> _SINK_");
		data.add("<java.io.Writer: void write(java.lang.String,int,int)> -> _SINK_");
		
		data.add("<java.io.Writer: java.io.Writer append(java.lang.CharSequence)> -> _SINK_");

		data.add("<java.io.OutputStreamWriter: java.io.Writer append(java.lang.CharSequence)> -> _SINK_");
		data.add("<java.net.URLConnection: void setRequestProperty(java.lang.String,java.lang.String)>  android.permission.INTERNET -> -> _SINK_");

		data.add("<java.net.URL: void set(java.lang.String,java.lang.String,int,java.lang.String,java.lang.String)> -> _SINK_");
		data.add("<java.net.URL: void set(java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)> -> _SINK_");
		data.add("<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)> android.permission.SEND_SMS -> _SINK_"); 
		data.add("<android.telephony.SmsManager: void sendDataMessage(java.lang.String,java.lang.String,short,byte[],android.app.PendingIntent,android.app.PendingIntent)> android.permission.SEND_SMS -> _SINK_"); 
		data.add("<android.telephony.SmsManager: void sendMultipartTextMessage(java.lang.String,java.lang.String,java.util.ArrayList,java.util.ArrayList,java.util.ArrayList)> android.permission.SEND_SMS -> _SINK_"); 
		data.add("<java.net.Socket: void connect(java.net.SocketAddress)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.lang.String,java.lang.String,int,java.lang.String)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.lang.String,java.lang.String,java.lang.String)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.lang.String,java.lang.String,int,java.lang.String,java.net.URLStreamHandler)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.lang.String)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.net.URL,java.lang.String)> -> _SINK_");
		data.add("<java.net.URL: void <init>(java.net.URL,java.lang.String,java.net.URLStreamHandler)> -> _SINK_");		
		data.add("<android.app.Activity: void setResult(int,android.content.Intent)> -> _SINK_");

		data.add("<com.android.internal.telephony.sip.SipPhone: com.android.internal.telephony.Connection dial(java.lang.String,com.android.internal.telephony.UUSInfo)> android.permission.USE_SIP -> _SINK_");
		data.add("<com.android.internal.telephony.cdma.CDMALTEPhone: com.android.internal.telephony.Connection dial(java.lang.String)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<android.net.sip.ISipService$Stub$Proxy: void open3(android.net.sip.SipProfile,android.app.PendingIntent,android.net.sip.ISipSessionListener)> android.permission.USE_SIP android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.internal.telephony.cdma.CDMAPhone: com.android.internal.telephony.Connection dial(java.lang.String)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.server.WifiService: void setCountryCode(java.lang.String,boolean)> android.permission.WRITE_SETTINGS android.permission.CHANGE_WIFI_STATE -> _SINK_");
		
		data.add("<android.net.wifi.p2p.IWifiP2pManager$Stub: boolean onTransact(int,android.os.Parcel,android.os.Parcel,int)> android.permission.CHANGE_WIFI_STATE android.permission.ACCESS_WIFI_STATE -> _SINK_");
		data.add("<java.net.URL: java.net.URLConnection openConnection()> android.permission.INTERNET -> _SINK_");
		data.add("<com.android.server.net.NetworkStatsService: boolean onTransact(int,android.os.Parcel,android.os.Parcel,int)> android.permission.ACCESS_NETWORK_STATE -> _SINK_");
		data.add("<android.net.IConnectivityManager$Stub$Proxy: boolean setRadios(boolean)> android.permission.CHANGE_WIFI_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<android.net.wifi.p2p.WifiP2pManager: void removeGroup(android.net.wifi.p2p.WifiP2pManager$Channel,android.net.wifi.p2p.WifiP2pManager$ActionListener)> android.permission.STOP_APP_SWITCHES -> _SINK_");
		
		data.add("<com.android.systemui.screenshot.SaveImageInBackgroundTask: com.android.systemui.screenshot.SaveImageInBackgroundData doInBackground(com.android.systemui.screenshot.SaveImageInBackgroundData[])> android.permission.STOP_APP_SWITCHES -> _SINK_");
		data.add("<com.android.server.net.NetworkStatsService: void dump(java.io.FileDescriptor,java.io.PrintWriter,java.lang.String[])> android.permission.ACCESS_NETWORK_STATE -> _SINK_");
		data.add("<android.content.ContentService: void dump(java.io.FileDescriptor,java.io.PrintWriter,java.lang.String[])> android.permission.DUMP -> _SINK_");
		data.add("<android.content.ContentService: void dump(java.io.FileDescriptor,java.lang.String[])> android.permission.DUMP android.permission.BLUETOOTH android.permission.ACCESS_NETWORK_STATE android.permission.BACKUP -> _SINK_");
		data.add("<android.os.FileUtils: void stringToFile(java.lang.String,java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SINK_");
		data.add("<android.filterpacks.videosink.MediaEncoderFilter: void open(android.filterfw.core.FilterContext)> android.permission.CAMERA android.permission.RECORD_AUDIO -> _SINK_");
		data.add("<com.android.mms.transaction.ReadRecTransaction: byte[] sendPdu(byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.internal.telephony.cdma.CdmaSMSDispatcher: void dispatch(android.content.Intent,java.lang.String)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.internal.telephony.gsm.SimSmsInterfaceManager: void sendData(java.lang.String,java.lang.String,int,byte[],android.app.PendingIntent,android.app.PendingIntent)> android.permission.SEND_SMS -> _SINK_");
		data.add("<com.android.mms.transaction.NotificationTransaction: byte[] sendPdu(long,byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.internal.telephony.cdma.CdmaSMSDispatcher: int dispatchMessage(com.android.internal.telephony.SmsMessageBase)> android.permission.READ_SMS android.permission.SEND_SMS android.permission.WRITE_SMS android.permission.RECEIVE_SMS android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.internal.telephony.SMSDispatcher: void dispatch(android.content.Intent,java.lang.String)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.mms.transaction.RetrieveTransaction: byte[] sendPdu(byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.providers.telephony.SmsProvider: android.net.Uri insert(android.net.Uri,android.content.ContentValues)> android.permission.READ_SMS android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SINK_");
		data.add("<com.android.mms.transaction.Transaction: byte[] sendPdu(byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.internal.telephony.ISms$Stub$Proxy: void sendData(java.lang.String,java.lang.String,int,byte[],android.app.PendingIntent,android.app.PendingIntent)> android.permission.SEND_SMS -> _SINK_");
		data.add("<com.android.internal.telephony.gsm.GsmSMSDispatcher: void sendNewSubmitPdu(java.lang.String,java.lang.String,java.lang.String,com.android.internal.telephony.SmsHeader,int,android.app.PendingIntent,android.app.PendingIntent,boolean)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<android.telephony.gsm.SmsManager: boolean updateMessageOnSim(int,int,byte[])> android.permission.SEND_SMS android.permission.RECEIVE_SMS android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.internal.telephony.gsm.GsmSMSDispatcher: int processMessagePart(byte[],java.lang.String,int,int,int,long,int,boolean)> android.permission.READ_SMS android.permission.SEND_SMS android.permission.WRITE_SMS android.permission.RECEIVE_SMS android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.internal.telephony.gsm.GsmSMSDispatcher: void dispatch(android.content.Intent,java.lang.String,android.content.BroadcastReceiver)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<com.android.mms.transaction.ReadRecTransaction: byte[] sendPdu(long,byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.mms.transaction.RetrieveTransaction: byte[] sendPdu(long,byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<com.android.mms.transaction.NotificationTransaction: byte[] sendPdu(byte[],java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SINK_");
		data.add("<android.telephony.gsm.SmsManager: void sendMultipartTextMessage(java.lang.String,java.lang.String,java.util.ArrayList,java.util.ArrayList,java.util.ArrayList)> android.permission.SEND_SMS -> _SINK_");
		data.add("<com.android.internal.telephony.gsm.GsmSMSDispatcher: void dispatch(android.content.Intent,java.lang.String)> android.permission.WAKE_LOCK -> _SINK_");
		data.add("<android.content.Intent: android.content.Intent setAction(java.lang.String)> -> _SINK_");
		data.add("<android.content.Intent: android.content.Intent setClassName(android.content.Context,java.lang.Class)> -> _SINK_");
		data.add("<android.content.Intent: android.content.Intent setClassName(android.content.Context,java.lang.String)> -> _SINK_");
		data.add("<android.content.Intent: android.content.Intent setComponent(android.content.ComponentName)> -> _SINK_");
		
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.Context: void startActivity(android.content.Intent)> -> _SINK_");
		data.add("<android.content.Context: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.Context: void startActivities(android.content.Intent[])> -> _SINK_");		
		data.add(
				"<android.content.Context: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.Context: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.Context: boolean bindService(android.content.data.add(\"<android.util.Slog: int v(java.lang.String,java.lang.String,java.lang.Throwable)> android.permission.STOP_APP_SWITCHES -> _SINK_\");\n" + 
				"		data.add(\"<android.util.Slog: int i(java.lang.String,java.lang.String,java.lang.Throwable)> android.permission.STOP_APP_SWITCHES -> _SINK_\");\n" + 
				"		data.add(\"<android.util.Log: int v(java.lang.String,java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SINK_\");\n" + 
				"		data.add(\"<android.util.Log: int e(java.lang.String,java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SINK_\");\n" + 
				"		data.add(\"<android.util.Log: int println(int,java.lang.String,java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SINK_\");\n" + 
				"		Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		
		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivities(android.content.Intent[])> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		
		data.add("<android.app.Activity: void setResult(int,android.content.Intent)> -> _SINK_");
		data.add("<android.app.Activity: void startActivity(android.content.Intent)> -> _SINK_");
		
		data.add("<android.app.Activity: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.app.Activity: void startActivities(android.content.Intent[])> -> _SINK_");
		data.add("<android.app.Activity: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add("<android.app.Activity: void startActivityForResult(android.content.Intent,int)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityForResult(android.content.Intent,int,android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityFromChild(android.app.Activity,android.content.Intent,int,android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityFromChild(android.app.Activity,android.content.Intent,int)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityFromFragment(android.app.Fragment,android.content.Intent,int,android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityFromFragment(android.app.Fragment,android.content.Intent,int)> -> _SINK_");
		data.add(
				"<android.app.Activity: void startActivityIfNeeded(android.content.Intent,int,android.os.Bundle)> -> _SINK_");
		data.add("<android.app.Activity: void startActivityIfNeeded(android.content.Intent,int)> -> _SINK_");
		data.add(
				"<android.app.Activity: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.app.Activity: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.app.Activity: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.app.Activity: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendBroadcastAsUser(android.content.Intent,android.os.UserHandle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendBroadcastAsUser(android.content.Intent,android.os.UserHandle,java.lang.String)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendOrderedBroadcast(android.content.Intent,java.lang.String,android.content.BroadcastReceiver,android.os.Handler,int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendOrderedBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendOrderedBroadcastAsUser(android.content.Intent,android.os.UserHandle,java.lang.String,android.content.BroadcastReceiver,android.os.Handler,int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.app.Activity: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendStickyBroadcastAsUser(android.content.Intent,android.os.UserHandle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendStickyOrderedBroadcast(android.content.Intent,android.content.BroadcastReceiver,android.os.Handler,int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.app.Activity: void sendStickyOrderedBroadcastAsUser(android.content.Intent,android.os.UserHandle,android.content.BroadcastReceiver,android.os.Handler,int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.BroadcastReceiver: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.BroadcastReceiver: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)> -> _SINK_");
		data.add("<android.content.ContentResolver: int delete(android.net.Uri,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add("<android.content.ContentResolver: int update(android.net.Uri,android.content.ContentValues,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SINK_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SINK_");
		

		

	}
	
	

}
