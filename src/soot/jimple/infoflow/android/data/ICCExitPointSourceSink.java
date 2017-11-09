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
		
		data.add("<android.bluetooth.BluetoothAdapter: java.lang.String getAddress()> android.permission.BLUETOOTH_ADMIN -> _SOURCE_");
		data.add("<android.net.wifi.WifiInfo: java.lang.String: getMacAddress()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		//data.add("<java.util.Locale: java.lang.String getCountry()> android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add("<android.net.wifi.WifiInfo: java.lang.String getSSID()> android.permissionget.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add("<android.net.wifi.WifiInfo: java.lang.String getSubscriberId()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add("<android.telephony.gsm.GsmCellLocation: int getCid()> android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add("<android.telephony.gsm.GsmCellLocation: int getLac()> android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add("<android.location.Location: double getLongitude()> android.permission.ACCESS_FINE_LOCATION -> _SOURCE_");
		data.add("<android.location.Location: double getLatitude()> android.permission.ACCESS_FINE_LOCATION -> _SOURCE_");
		data.add("<android.accounts.AccountManager: android.accounts.Account[] getAccounts()> -> _SOURCE_");
				data.add(
				"<android.telephony.TelephonyManager: java.lang.String getLine1Number()> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add("<android.location.Location: double getLatitude()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.location.LocationManager: boolean isProviderEnabled(java.lang.String)> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.sip.SipPhoneBase: void getPreferredNetworkType(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<android.location.LocationManager: android.location.Location getLastKnownLocation(java.lang.String)> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<com.android.server.LocationManagerService: java.lang.String getBestProvider(android.location.Criteria,boolean)> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.net.IConnectivityManager$Stub$Proxy: java.lang.String[] getTetherableWifiRegexs()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiManager: android.net.wifi.WifiInfo getConnectionInfo()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CdmaConnection: long getCreateTime()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.RetryManager: int getRetryTimer()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager: int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiManager: int getFrequencyBand()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.email.EmailConnectivityManager: int getActiveNetworkType(android.content.Context)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.nsd.INsdManager$Stub$Proxy: android.os.Messenger getMessenger()> android.permission.INTERNET -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: android.net.NetworkInfo[] getAllNetworkInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.IWifiManager$Stub$Proxy: android.net.wifi.WifiInfo getConnectionInfo()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.ITelephony$Stub$Proxy: android.os.Bundle getCellLocation()> android.permission.ACCESS_FINE_LOCATION android.permission.ACCESS_COARSE_LOCATION -> _SOURCE_");
		data.add(
				"<android.net.wifi.p2p.WifiP2pService: android.os.Messenger getMessenger()> android.permission.CHANGE_WIFI_STATE android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.IWifiManager$Stub$Proxy: int getWifiApEnabledState()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<org.apache.harmony.xnet.provider.jsse.SSLInputStream: long readUint32()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.OperatorInfo: java.lang.String toString()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.telephony.CellInfoCdma: android.telephony.CellSignalStrengthCdma getCellSignalStrength()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.net.sip.SipManager: android.net.sip.SipAudioCall takeAudioCall(android.content.Intent,android.net.sip.SipAudioCall$Listener)> android.permission.USE_SIP -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMALTEPhone: void getAvailableNetworks(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.server.ConnectivityService: android.net.LinkProperties getLinkProperties(int)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.p2p.IWifiP2pManager$Stub$Proxy: android.os.Messenger getMessenger()> android.permission.CHANGE_WIFI_STATE android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.IThrottleManager$Stub$Proxy: int getCliffLevel(java.lang.String,int)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.provider.Telephony$Sms: android.database.Cursor query(android.content.ContentResolver,java.lang.String[])> android.permission.READ_SMS android.permission.RECEIVE_SMS -> _SOURCE_");
		data.add(
				"<android.net.SSLCertificateSocketFactory: java.net.Socket createSocket(java.net.InetAddress,int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.server.NetworkManagementService: android.net.NetworkStats getNetworkStatsTethering(java.lang.String[])> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.net.IConnectivityManager$Stub$Proxy: android.net.NetworkInfo getNetworkInfo(int)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.net.NetworkPolicyManagerService: int[] getUidsWithPolicy(int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.net.wifi.WifiManager: java.lang.String getConfigFile()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: android.net.NetworkInfo getActiveNetworkInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.RuimRecords: int getDisplayRule(java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.telephony.SignalStrength: int getGsmSignalStrength()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.server.ConnectivityService: android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.wifi.IWifiManager$Stub$Proxy: android.net.DhcpInfo getDhcpInfo()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.WifiService: java.lang.String getConfigFile()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.IConnectivityManager$Stub$Proxy: android.net.NetworkInfo getActiveNetworkInfo()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.ThrottleManager: long getCliffThreshold(java.lang.String,int)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.ThrottleService: int getThrottle(java.lang.String)> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.net.ConnectivityManager: java.lang.String[] getTetherableWifiRegexs()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.WifiService: java.util.List getConfiguredNetworks()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<android.net.IThrottleManager$Stub$Proxy: java.lang.String getHelpUri()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.server.WifiService: java.util.List getScanResults()> android.permission.ACCESS_WIFI_STATE -> _SOURCE_");
		data.add(
				"<com.android.email.service.AttachmentDownloadService$AccountManagerStub: int getNumberOfAccounts()> android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManagerService: java.lang.String getUserData(android.accounts.Account,java.lang.String)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: java.lang.String getPassword(android.accounts.Account)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.test.IsolatedContext$MockAccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,android.os.Bundle,android.app.Activity,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,boolean,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.test.IsolatedContext$MockAccountManager: java.lang.String getPassword(android.accounts.Account)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.test.IsolatedContext$MockAccountManager: java.lang.String peekAuthToken(android.accounts.Account,java.lang.String)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,android.os.Bundle,android.app.Activity,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: java.lang.String peekAuthToken(android.accounts.Account,java.lang.String)> android.permission.AUTHENTICATE_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManagerService: android.accounts.Account[] getAccounts(java.lang.String)> android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.test.IsolatedContext$MockAccountManager: android.accounts.AccountManagerFuture getAuthToken(android.accounts.Account,java.lang.String,boolean,android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.USE_CREDENTIALS android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.accounts.AccountManager: android.accounts.AccountManagerFuture getAccountsByTypeAndFeatures(java.lang.String,java.lang.String[],android.accounts.AccountManagerCallback,android.os.Handler)> android.permission.MANAGE_ACCOUNTS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<android.app.DownloadManager: android.net.Uri getUriForDownloadedFile(long)> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<com.android.providers.downloads.DownloadInfo$Reader: com.android.providers.downloads.DownloadInfo newDownloadInfo(android.content.Context,com.android.providers.downloads.SystemFacade)> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<com.android.providers.downloads.DownloadInfo: android.net.Uri getAllDownloadsUri()> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<com.android.providers.downloads.DownloadInfo: android.net.Uri getMyDownloadsUri()> android.permission.WRITE_EXTERNAL_STORAGE android.permission.INTERNET android.permission.VIBRATE -> _SOURCE_");
		data.add(
				"<android.bluetooth.IBluetoothPbap$Stub$Proxy: android.bluetooth.BluetoothDevice getClient()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothAdapter: android.bluetooth.BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String,java.util.UUID)> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<com.android.bluetooth.pbap.BluetoothPbapVcardManager: int getContactsSize()> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothHeadset: int getConnectionState(android.bluetooth.BluetoothDevice)> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothHeadset: java.util.List getDevicesMatchingConnectionStates(int[])> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.media.AudioManager: int setBluetoothA2dpDeviceConnectionState(android.bluetooth.BluetoothDevice,int)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothAdapter: int getConnectionState()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothDevice: java.lang.String getName()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add("<android.bluetooth.BluetoothPan: boolean isTetheringOn()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<com.android.bluetooth.pbap.BluetoothPbapVcardManager: java.util.ArrayList getContactNamesByNumber(java.lang.String)> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.bluetooth.BluetoothInputDevice: java.util.List getDevicesMatchingConnectionStates(int[])> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.net.IConnectivityManager$Stub$Proxy: java.lang.String[] getTetherableBluetoothRegexs()> android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.bluetooth.IBluetoothHeadset$Stub$Proxy: java.util.List getConnectedDevices()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<android.database.sqlite.SQLiteGlobal: java.lang.String getWALSyncMode()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.database.CrossProcessCursorWrapper: android.database.CursorWindow getWindow()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.email.activity.EmailActivity: android.content.Intent createOpenMailboxIntent(android.app.Activity,long,long)> android.permission.STOP_APP_SWITCHES (EMAIL)");
		data.add(
				"<android.content.ContentService: android.content.SyncStatusInfo getSyncStatus(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.app.ContextImpl$ApplicationContentResolver: boolean getSyncAutomatically(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.content.IContentService$Stub$Proxy: java.util.List getPeriodicSyncs(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.test.mock.MockContentResolver: boolean getSyncAutomatically(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<com.android.exchange.adapter.ContactsSyncAdapter: java.lang.String getSyncKey()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: android.content.SyncInfo getCurrentSync()> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<com.android.exchange.adapter.AccountSyncAdapter: java.lang.String getSyncKey()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.app.ContextImpl$ApplicationContentResolver: java.util.List getPeriodicSyncs(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: int getIsSyncable(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: android.content.SyncStatusInfo getSyncStatus(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.test.mock.MockContentResolver: android.content.SyncStatusInfo getSyncStatus(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: boolean getSyncAutomatically(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.test.mock.MockContentResolver: int getIsSyncable(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.content.IContentService$Stub$Proxy: android.content.SyncStatusInfo getSyncStatus(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.test.mock.MockContentResolver: java.util.List getPeriodicSyncs(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<com.android.exchange.adapter.AbstractSyncAdapter: java.lang.String getSyncKey()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.exchange.adapter.EmailSyncAdapter: java.lang.String getSyncKey()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.app.ContextImpl$ApplicationContentResolver: int getIsSyncable(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.app.ContextImpl$ApplicationContentResolver: android.content.SyncInfo getCurrentSync()> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.content.IContentService$Stub$Proxy: boolean getSyncAutomatically(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<android.test.mock.MockContentResolver: android.content.SyncInfo getCurrentSync()> android.permission.READ_SYNC_STATS -> _SOURCE_");
		data.add(
				"<android.content.ContentResolver: java.util.List getPeriodicSyncs(android.accounts.Account,java.lang.String)> android.permission.READ_SYNC_SETTINGS -> _SOURCE_");
		data.add(
				"<com.google.android.mms.pdu.DeliveryInd: byte[] getMessageId()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.google.android.mms.pdu.ReadRecInd: int getReadStatus()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.contacts.list.LegacyContactListAdapter: android.net.Uri getPersonUri(int)> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<android.provider.ContactsContract$SyncState: android.util.Pair getWithUri(android.content.ContentProviderClient,android.accounts.Account)> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.calllog.PhoneNumberHelper: java.lang.CharSequence getDisplayNumber(java.lang.CharSequence,java.lang.CharSequence)> android.permission.READ_PHONE_STATE -> _SOURCE_");
		data.add(
				"<com.android.mms.data.Contact$ContactsCache: java.util.List getContactInfoForPhoneUris(android.os.Parcelable[])> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.LegacyApiSupport: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,java.lang.String)> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.vcard.VCardProperty: byte[] getByteValue()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.contacts.editor.SelectAccountDialogFragment: android.app.Dialog onCreateDialog(android.os.Bundle)> android.permission.READ_SYNC_SETTINGS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.list.CustomContactListFilterActivity$CustomFilterConfigurationLoader: com.android.contacts.list.CustomContactListFilterActivity$AccountSet loadInBackground()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.GET_ACCOUNTS android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.interactions.PhoneNumberInteraction$PhoneDisambiguationDialogFragment: android.app.Dialog onCreateDialog(android.os.Bundle)> android.permission.READ_SYNC_SETTINGS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.activities.PhotoSelectionActivity$PhotoHandler: long getWritableEntityId()> android.permission.READ_SYNC_SETTINGS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.list.ProfileAndContactsLoader: android.database.Cursor loadInBackground()> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.vcard.NfcImportVCardActivity$ImportTask: com.android.contacts.vcard.ImportRequest doInBackground(com.android.contacts.vcard.VCardService[])> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.VIBRATE android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.mms.data.Contact: android.net.Uri getUri()> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.contacts.editor.ContactEditorFragment$PhotoHandler: long getWritableEntityId()> android.permission.READ_SYNC_SETTINGS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.RuimPhoneBookInterfaceManager: java.util.List getAdnRecordsInEf(int)> android.permission.READ_CONTACTS android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.CallLogProvider: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> com.android.voicemail.permission.ADD_VOICEMAIL android.permission.READ_CALL_LOG -> _SOURCE_");
		data.add(
				"<com.android.vcard.VCardProperty: java.util.List getValueList()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.data.ContactList: com.android.mms.data.ContactList getByNumbers(java.lang.String,boolean,boolean)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.provider.ContactsContract$ProfileSyncState: byte[] get(android.content.ContentProviderClient,android.accounts.Account)> android.permission.READ_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.vcard.VCardEntry: java.util.ArrayList constructInsertOperations(android.content.ContentResolver,java.util.ArrayList)> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.ProfileProvider: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> android.permission.READ_PROFILE -> _SOURCE_");
		data.add(
				"<com.android.contacts.detail.PhotoSelectionHandler: long getWritableEntityId()> android.permission.READ_SYNC_SETTINGS android.permission.GET_ACCOUNTS -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.IccPhoneBookInterfaceManager: java.util.List getAdnRecordsInEf(int)> android.permission.READ_CONTACTS android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.providers.contacts.LegacyApiSupport: java.lang.String getType(android.net.Uri)> android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.gsm.SimPhoneBookInterfaceManager: java.util.List getAdnRecordsInEf(int)> android.permission.READ_CONTACTS android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.calendar.Utils: java.lang.String getDisplayedDatetime(long,long,long,java.lang.String,boolean,android.content.Context)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<android.provider.CalendarContract$Instances: android.database.Cursor query(android.content.ContentResolver,java.lang.String[],long,long)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<android.provider.CalendarContract$CalendarAlerts: long findNextAlarmTime(android.content.ContentResolver,long)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<com.android.calendar.selectcalendars.SelectSyncedCalendarsMultiAccountAdapter: android.database.Cursor getChildrenCursor(android.database.Cursor)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<android.provider.CalendarContract$EventDays: android.database.Cursor query(android.content.ContentResolver,int,int,java.lang.String[])> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<com.android.calendar.CalendarUtils$TimeZoneUtils: java.lang.String getTimeZone(android.content.Context,java.lang.Runnable)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<com.android.calendar.agenda.AgendaByDayAdapter: android.view.View getView(int,android.view.View,android.view.ViewGroup)> android.permission.READ_CALENDAR -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.cdma.CDMAPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.os.BatteryStatsImpl: int getBluetoothPingCount()> android.permission.BLUETOOTH -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.gsm.GSMPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.server.net.NetworkStatsService$DefaultNetworkStatsSettings: long getPollInterval()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.internal.widget.LockPatternUtils: int getRequestedPasswordMinimumNumeric()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
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
				"<com.android.internal.os.BatteryStatsImpl: long getRadioDataUptimeMs()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.sip.SipPhone: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.internal.telephony.sip.SipPhoneBase: void getSmscAddress(android.os.Message)> android.permission.WAKE_LOCK -> _SOURCE_");
		data.add(
				"<com.android.gallery3d.data.TagClustering: java.util.ArrayList getCluster(int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.gallery3d.data.SingleItemAlbum: java.lang.String getName()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.gallery3d.exif.ExifTag: int getLong(int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.gallery3d.gadget.MediaSetSource: android.graphics.Bitmap getImage(int)> android.permission.NFC android.permission.SET_WALLPAPER android.permission.INTERNET android.permission.ACCESS_FINE_LOCATION android.permission.VIBRATE android.permission.ACCESS_COARSE_LOCATION android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.browser.BrowserBookmarksPage$OpenAllInTabsTask: android.database.Cursor doInBackground(java.lang.Void[])> com.android.browser.permission.WRITE_HISTORY_BOOKMARKS android.permission.GET_ACCOUNTS com.android.browser.permission.READ_HISTORY_BOOKMARKS -> _SOURCE_");
		data.add(
				"<com.android.browser.provider.BrowserProvider2: int getUrlCount(android.database.sqlite.SQLiteDatabase,java.lang.String,java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add("<android.nfc.INfcTag$Stub$Proxy: int[] getTechList(int)> android.permission.NFC -> _SOURCE_");
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
				"<android.nfc.INfcAdapterExtras$Stub$Proxy: int getCardEmulationRoute(java.lang.String)> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.NfcF: int getTimeout()> android.permission.NFC -> _SOURCE_");
		data.add("<android.nfc.tech.IsoDep: byte[] transceive(byte[])> android.permission.NFC -> _SOURCE_");
		data.add(
				"<android.nfc.tech.MifareClassic: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<android.nfc.tech.BasicTagTechnology: byte[] transceive(byte[],boolean)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<android.nfc.INfcAdapter$Stub$Proxy: android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<com.android.nfc.NfcService$NfcAdapterExtrasService: int getCardEmulationRoute(java.lang.String)> android.permission.NFC -> _SOURCE_");
		data.add(
				"<org.apache.http.protocol.DefaultedHttpContext: java.lang.Object getAttribute(java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.deskclock.widget.multiwaveview.TargetDrawable: int getHeight()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.transaction.ReadRecTransaction: byte[] getPdu(java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.mms.util.Recycler$SmsRecycler: android.database.Cursor getAllThreads(android.content.Context)> android.permission.READ_SMS android.permission.RECEIVE_SMS -> _SOURCE_");
		data.add("<java.util.UUID: long getLeastSignificantBits()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.internal.statusbar.StatusBarIconList: int getViewIndex(int)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.camera.ListPreference: java.lang.String getKey()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.preference.Preference: java.lang.CharSequence getSummary()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.google.common.collect.ForwardingMap: java.lang.Object get(java.lang.Object)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.systemui.recent.RecentsHorizontalScrollView: int getVerticalFadingEdgeLength()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.org.bouncycastle.asn1.ASN1Object: com.android.org.bouncycastle.asn1.ASN1Primitive toASN1Object()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.google.common.collect.MapMakerInternalMap$SoftExpirableEvictableEntry: long getExpirationTime()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add("<java.nio.CharToByteBufferAdapter: char get()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.util.Recycler$MmsRecycler: android.database.Cursor getAllThreads(android.content.Context)> android.permission.READ_SMS -> _SOURCE_");
		data.add(
				"<com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator: java.util.Iterator getDelegateIterator()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.transaction.NotificationTransaction: byte[] getPdu(java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<org.apache.http.message.BasicLineParser: org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer,org.apache.http.message.ParserCursor)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<java.beans.PropertyChangeEvent: java.lang.Object getOldValue()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.transaction.Transaction: byte[] getPdu(java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.os.storage.IObbActionListener$Stub$Proxy: java.lang.String getInterfaceDescriptor()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.webkit.WebSettings: boolean getJavaScriptCanOpenWindowsAutomatically()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.content.ContentProviderClient: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.videoeditor.service.MovieTransition: int getSlidingDirection()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.systemui.statusbar.phone.PhoneStatusBar: com.android.systemui.statusbar.phone.PhoneStatusBarView makeStatusBarView()> android.permission.READ_PHONE_STATE android.permission.CHANGE_WIFI_STATE android.permission.ACCESS_WIFI_STATE android.permission.ACCESS_COARSE_LOCATION android.permission.ACCESS_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.inputmethodservice.KeyboardView$SwipeTracker: float getXVelocity()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.hardware.input.IInputManager$Stub$Proxy: java.lang.String[] getKeyboardLayoutsForInputDevice(java.lang.String)> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<android.app.ActivityManager: java.util.List getRunningTasks(int)> android.permission.GET_TASKS -> _SOURCE_");
		data.add(
				"<com.android.mms.ui.SlideshowEditActivity$SlideListAdapter: android.view.View getView(int,android.view.View,android.view.ViewGroup)> android.permission.READ_SMS android.permission.READ_SYNC_SETTINGS android.permission.READ_SOCIAL_STREAM android.permission.WRITE_SOCIAL_STREAM android.permission.READ_CONTACTS android.permission.WRITE_CONTACTS -> _SOURCE_");
		data.add(
				"<com.android.launcher2.Launcher: com.android.launcher2.Workspace getWorkspace()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.transaction.RetrieveTransaction: byte[] getPdu(java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<com.android.mms.dom.NodeImpl: java.lang.String getTextContent()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.providers.settings.SettingsBackupAgent: void onRestoreFile(android.os.ParcelFileDescriptor,long,int,java.lang.String,java.lang.String,long,long)> android.permission.WRITE_SETTINGS android.permission.CHANGE_WIFI_STATE android.permission.ACCESS_WIFI_STATE android.permission.CHANGE_CONFIGURATION -> _SOURCE_");
		data.add(
				"<android.content.pm.ComponentInfo: android.content.pm.ApplicationInfo getApplicationInfo()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");
		data.add(
				"<com.android.mms.transaction.SendTransaction: byte[] getPdu(java.lang.String)> android.permission.READ_PHONE_STATE android.permission.CHANGE_NETWORK_STATE -> _SOURCE_");
		data.add(
				"<android.widget.LinearLayout: int getDividerWidth()> android.permission.STOP_APP_SWITCHES -> _SOURCE_");

		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SOURCE_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SOURCE_");

		data.add("<android.content.BroadcastReceiver: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.Context: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextWrapper: java.lang.String getResultData()> -> _SOURCE_");
		data.add("<android.content.ContextThemeWrapper: java.lang.String getResultData()> -> _SOURCE_");
		
		//data.add("<android.app.Activity: android.content.Intent getIntent()> -> _SOURCE_");
		//data.add("<android.app.Context: android.content.Intent getIntent()> -> _SOURCE_");
		//data.add("<android.app.ContextWrapper: android.content.Intent getIntent()> -> _SOURCE_");
		//data.add("<android.app.ContextThemeWrapper: android.content.Intent getIntent()> -> _SOURCE_");
		
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
		data.add("<android.content.ContextWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void startActivities(android.content.Intent[])> -> _SINK_");
		
		data.add("<android.content.ContextWrapper: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");
		
		data.add(
				"<android.content.ContextWrapper: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add(
				"<android.content.ContextWrapper: android.os.IBinder onBind(android.content.Intent)> -> _SINK_");
		
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void startActivity(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void startActivity(android.content.Intent,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void startActivities(android.content.Intent[])> -> _SINK_");
		
		data.add("<android.content.ContextThemeWrapper: void sendStickyBroadcast(android.content.Intent)> -> _SINK_");
		
		data.add(
				"<android.content.ContextThemeWrapper: void startActivities(android.content.Intent[],android.os.Bundle)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add(
				"<android.content.ContextThemeWrapper: android.os.IBinder onBind(android.content.Intent)> -> _SINK_");
		
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");

		
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
		data.add("<android.view.ContextThemeWrapper: android.content.ComponentName startService(android.content.Intent)> -> _SINK_");
		data.add(
				"<android.view.ContextThemeWrapper: boolean bindService(android.content.Intent,android.content.ServiceConnection,int)> -> _SINK_");
		data.add("<android.view.ContextThemeWrapper: void sendBroadcast(android.content.Intent)> -> _SINK_");
		data.add("<android.view.ContextThemeWrapper: void sendBroadcast(android.content.Intent,java.lang.String)> -> _SINK_");
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
		data.add("<android.content.BroadcastReceiver: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.Context: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.Context: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		
		data.add("<android.content.ContextWrapper: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextWrapper: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void setResultData(java.lang.String)> -> _SINK_");
		data.add("<android.content.ContextThemeWrapper: void setResult(int,java.lang.String,android.os.Bundle)> -> _SINK_");
		
		
		
		data.add("<android.content.ContentResolver: android.net.Uri insert(android.net.Uri,android.content.ContentValues)> -> _SINK_");
		data.add("<android.content.ContentResolver: int delete(android.net.Uri,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add("<android.content.ContentResolver: int update(android.net.Uri,android.content.ContentValues,java.lang.String,java.lang.String[])> -> _SINK_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String)> -> _SINK_");
		data.add("<android.content.ContentResolver: android.database.Cursor query(android.net.Uri,java.lang.String[],java.lang.String,java.lang.String[],java.lang.String,android.os.CancellationSignal)> -> _SINK_");
		data.add("<android.database.MatrixCursor: void addRow(java.lang.Object[])> -> _SINK_");
	}

}
