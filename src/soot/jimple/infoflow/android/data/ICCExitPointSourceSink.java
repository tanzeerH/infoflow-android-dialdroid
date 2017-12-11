package soot.jimple.infoflow.android.data;

import java.util.ArrayList;

public class ICCExitPointSourceSink {

	private static ArrayList<String> data;

	public static ArrayList<String> getList() {
		if (data == null)
			init();
		return data;
	}

	public static void init() {

		data = new ArrayList<String>();

		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getDeviceId()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getSubscriberId()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getSimSerialNumber()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getSimOperatorName()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getNetworkOperator()> android.permission.READ_PHONE_STATE -> _SOURCE_");

		data.add(
				"<android.bluetooth.BluetoothAdapter: java.lang.String getAddress()> android.permission.BLUETOOTH_ADMIN -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiInfo: java.lang.String: getMacAddress()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		// data.add("<java.util.Locale: java.lang.String getCountry()>
		// android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiInfo: java.lang.String getSSID()> android.permissionget.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiInfo: java.lang.String getSubscriberId()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.telephony.gsm.GsmCellLocation: int getCid()> android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.telephony.gsm.GsmCellLocation: int getLac()> android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.location.Location: double getLongitude()> android.permission.ACCESS_FINE_LOCATION -> _SOURCE_");
		data.add(
				"<android.location.Location: double getLatitude()> android.permission.ACCESS_FINE_LOCATION -> _SOURCE_");
		data.add("<android.accounts.AccountManager: android.accounts.Account[] getAccounts()> -> _SOURCE_");
		data.add(
				"<android.telephony.TelephonyManager: java.lang.String getLine1Number()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add("<android.location.Location: double getLatitude()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.location.LocationManager: android.location.Location getLastKnownLocation(java.lang.String)> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<com.android.server.LocationManagerService: java.lang.String getBestProvider(android.location.Criteria,boolean)> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: android.net.NetworkInfo[] getAllNetworkInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.IWifiManager$Stub$Proxy: android.net.wifi.WifiInfo getConnectionInfo()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.ITelephony$Stub$Proxy: android.os.Bundle getCellLocation()> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.net.SSLCertificateSocketFactory: java.net.Socket createSocket(java.net.InetAddress,int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.WifiService: java.lang.String getConfigFile()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: java.lang.String[] getTetherableWifiRegexs()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManagerService: java.lang.String getUserData(android.accounts.Account,java.lang.String)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: java.lang.String getPassword(android.accounts.Account)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,boolean,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,android.os.Bundle,android.app.Activity,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: java.lang.String peekAuthToken(android.accounts.Account,java.lang.String)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.test.IsolatedContext$MockAccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,boolean,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.app.DownloadManager: android.net.Uri getUriForDownloadedFile(long)> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<com.android.providers.downloads.DownloadInfo: android.net.Uri getAllDownloadsUri()> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<com.android.providers.downloads.DownloadInfo: android.net.Uri getMyDownloadsUri()> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothDevice: java.lang.String getName()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.content.ContentService: android.content.SyncStatusInfo getSyncStatus(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<com.android.exchange.adapter.ContactsSyncAdapter: java.lang.String getSyncKey()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.google.android.mms.pdu.DeliveryInd: byte[] getMessageId()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.google.android.mms.pdu.ReadRecInd: int getReadStatus()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.contacts.list.LegacyContactListAdapter: android.net.Uri getPersonUri(int)> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.provider.ContactsContract$SyncState: android.util.Pair getWithUri(android.content.ContentProviderClient,android.accounts.Account)> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.mms.data.Contact$ContactsCache: java.util.List getContactInfoForPhoneUris(android.os.Parcelable[])> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.vcard.VCardProperty: byte[] getByteValue()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.contacts.list.CustomContactListFilterActivity$CustomFilterConfigurationLoader: com.android.contacts.list.CustomContactListFilterActivity$AccountSet loadInBackground()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.GET_ACCOUNTS android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.CallLogProvider: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> com.android.voicemail.permission.ADD_VOICEMAIL android.permission.READ_CALL_LOG -> _SOURCE_");
		data.add(
				"<com.android.mms.data.ContactList: com.android.mms.data.ContactList getByNumbers(java.lang.String,boolean,boolean)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.ProfileProvider: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> android.permission.READ_PROFILE -> _SOURCE_");
		data.add(
				"<android.provider.CalendarContract$EventDays: android.database.Cursor query(android.content.ContentResolver,int,int,java.lang.String[])> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMAPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.gsm.GSMPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.PhoneBase: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMALTEPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.RIL: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMAPhone: void getEnhancedVoicePrivacy(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMALTEPhone: void getEnhancedVoicePrivacy(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.sip.SipPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.sip.SipPhoneBase: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.gallery3d.exif.ExifTag: int getLong(int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add("<android.nfc.NdefRecord: int getByteLength()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.nfc.tech.NdefFormatable: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.Ndef: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<com.android.nfc.handover.HandoverManager: android.nfc.NdefRecord createBluetoothOobDataRecord()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.nfc.tech.NfcBarcode: android.nfc.Tag getTag()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.nfc.tech.MifareUltralight: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.NfcF: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.NfcB: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.NfcV: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.IsoDep: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<org.apache.http.protocol.DefaultedHttpContext: java.lang.Object getAttribute(java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.deskclock.widget.multiwaveview.TargetDrawable: int getHeight()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.camera.ListPreference: java.lang.String getKey()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.preference.Preference: java.lang.CharSequence getSummary()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.content.ContentProviderClient: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SOURCE_");

		data.add("<android.content.BroadcastReceiver: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.Context: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextWrapper: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextThemeWrapper: java.lang.String getResultData()> -> _SOURCE_");

		// data.add("<android.app.Activity: android.content.Intent getIntent()> ->
		// _SOURCE_");
		// data.add("<android.app.Context: android.content.Intent getIntent()> ->
		// _SOURCE_");
		// data.add("<android.app.ContextWrapper: android.content.Intent getIntent()> ->
		// _SOURCE_");
		// data.add("<android.app.ContextThemeWrapper: android.content.Intent
		// getIntent()> -> _SOURCE_");

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
				"<android.content.Context: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.Context: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.Context: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");

		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivities(android.content.Intent[])> -> _SINK_");

		data.add("<android.content.ContextWrapper: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");

		data.add(
				"<android.content.ContextWrapper: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.content.ContextWrapper: android.os.IBinder onBind(android.content.Intent)> -> _SINK_");

		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");

		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void startActivities(android.content.Intent[])> -> _SINK_");

		data.add("<android.content.ContextThemeWrapper: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");

		data.add(
				"<android.content.ContextThemeWrapper: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: android.os.IBinder onBind(android.content.Intent)> -> _SINK_");

		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");

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
				"<android.view.ContextThemeWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.view.ContextThemeWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.view.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.view.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.view.ContextThemeWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add("<android.view.ContextThemeWrapper: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");

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
		data.add(
				"<android.content.BroadcastReceiver: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.Context: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.Context: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");

		data.add("<android.content.ContextWrapper: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void setResultData(java.lang.String)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");

		data.add(
				"<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)> -> _SINK_");
		data.add(
				"<android.content.ContentResolver: int delete(android.net.Uri,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add(
				"<android.content.ContentResolver: int update(android.net.Uri,android.content.ContentValues,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add(
				"<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SINK_");
		data.add(
				"<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SINK_");
		data.add("<android.database.MatrixCursor: void addRow(java.lang.Object[])> -> _SINK_");
	}

}
