/*
 * Copyright 2011-2012 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package piuk.blockchain.android;

import java.math.BigInteger;

import android.content.Context;
import android.content.Intent;

import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.Utils;

import piuk.blockchain.R;

/**
 * @author Andreas Schildbach
 */
public class Constants
{
	public static final boolean TEST = false; // replace protected

	public static final NetworkParameters NETWORK_PARAMETERS = TEST ? NetworkParameters.testNet() : NetworkParameters.prodNet();

	static final String LOCAL_WALLET_FILENAME = "wallet.backup.aes.json";
	static final String WALLET_FILENAME = "wallet.aes.json";
	
	static final String MULTIADDR_FILENAME = "multiaddr.cache.json";
	
	static final String EXCEPTION_LOG = "exception.log";

	static final boolean isAmazon = true;

	public final static long MultiAddrTimeThreshold =  60000; //1 minute
	
	private static final String WALLET_KEY_BACKUP_BASE58_PROD = "key-backup-base58";
	private static final String WALLET_KEY_BACKUP_BASE58_TEST = "key-backup-base58-testnet";
	public static final String WALLET_KEY_BACKUP_BASE58 = Constants.TEST ? WALLET_KEY_BACKUP_BASE58_TEST : WALLET_KEY_BACKUP_BASE58_PROD;

	private static final int WALLET_MODE_PROD = Context.MODE_PRIVATE;
	private static final int WALLET_MODE_TEST = Context.MODE_WORLD_READABLE | Context.MODE_WORLD_WRITEABLE;
	public static final int WALLET_MODE = Constants.TEST ? WALLET_MODE_TEST : WALLET_MODE_PROD;

	private static final String WALLET_KEY_BACKUP_SNAPSHOT_PROD = "key-backup-snapshot";
	private static final String WALLET_KEY_BACKUP_SNAPSHOT_TEST = "key-backup-snapshot-testnet";
	public static final String WALLET_KEY_BACKUP_SNAPSHOT = Constants.TEST ? WALLET_KEY_BACKUP_SNAPSHOT_TEST : WALLET_KEY_BACKUP_SNAPSHOT_PROD;

	private static final String BLOCKCHAIN_SNAPSHOT_FILENAME_PROD = "blockchain-snapshot.jpg";
	private static final String BLOCKCHAIN_SNAPSHOT_FILENAME_TEST = "blockchain-snapshot-testnet.jpg";
	public static final String BLOCKCHAIN_SNAPSHOT_FILENAME = Constants.TEST ? BLOCKCHAIN_SNAPSHOT_FILENAME_TEST : BLOCKCHAIN_SNAPSHOT_FILENAME_PROD;

	private static final String BLOCKCHAIN_FILENAME_PROD = "blockchain";
	private static final String BLOCKCHAIN_FILENAME_TEST = "blockchain-testnet";
	public static final String BLOCKCHAIN_FILENAME = TEST ? BLOCKCHAIN_FILENAME_TEST : BLOCKCHAIN_FILENAME_PROD;

	public static final String PEER_DISCOVERY_IRC_CHANNEL_PROD = "#bitcoin";
	public static final String PEER_DISCOVERY_IRC_CHANNEL_TEST = "#bitcoinTEST";

	private static final String BLOCKEXPLORER_BASE_URL_PROD = "https://blockexplorer.com/";
	private static final String BLOCKEXPLORER_BASE_URL_TEST = "https://blockexplorer.com/testnet/";
	public static final String BLOCKEXPLORER_BASE_URL = TEST ? BLOCKEXPLORER_BASE_URL_TEST : BLOCKEXPLORER_BASE_URL_PROD;

	private static final String PACKAGE_NAME_PROD = "piuk.blockchain.android";
	private static final String PACKAGE_NAME_TEST = "piuk.blockchain.android" + '_' + "test"; // replace protected
	public static final String PACKAGE_NAME = TEST ? PACKAGE_NAME_TEST : PACKAGE_NAME_PROD;

	public static final int APP_ICON_RESID = R.drawable.app_icon;

	public static final String MIMETYPE_TRANSACTION = "application/x-btctx";

	public static final int MAX_CONNECTED_PEERS = 6;
	public static final String USER_AGENT = "Blockchain";
	public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";
	public static final int WALLET_OPERATION_STACK_SIZE = 256 * 1024;
	public static final int BLOCKCHAIN_DOWNLOAD_THRESHOLD_MS = 5000;
	public static final int BLOCKCHAIN_STATE_BROADCAST_THROTTLE_MS = 1000;
	public static final int BLOCKCHAIN_UPTODATE_THRESHOLD_HOURS = 1;
	public static final int SHUTDOWN_REMOVE_NOTIFICATION_DELAY = 2000;

	public static final String CURRENCY_CODE_BITCOIN = "BTC";
	public static final String THIN_SPACE = "\u2009";
	public static final String CURRENCY_PLUS_SIGN = "+" + THIN_SPACE;
	public static final String CURRENCY_MINUS_SIGN = "-" + THIN_SPACE;
	public static final int ADDRESS_FORMAT_GROUP_SIZE = 4;
	public static final int ADDRESS_FORMAT_LINE_SIZE = 12;

	public static final String DONATION_ADDRESS = "1PZmMahjbfsTy6DsaRyfStzoWTPppWwDnZ";

	public static final String DISCLAIMER = "http://blockchain.info/disclaimer";
	public static final String PRIVACY_POLICY = "http://blockchain.info/privacy";

	public static final String LICENSE_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";
	public static final String SOURCE_URL = "https://github.com/blockchain/My-Wallet-Android/";
	public static final String CREDITS_BITCOINJ_URL = "http://code.google.com/p/bitcoinj/";
	public static final String CREDITS_ZXING_URL = "http://code.google.com/p/zxing/";
	public static final String CREDITS_BITCON_WALLET_ANDROID = "http://code.google.com/p/bitcoin-wallet/";
	public static final String CREDITS_ICON_URL = "http://www.bitcoin.org/smf/index.php?action=profile;u=2062";
	public static final String AUTHOR_TWITTER_URL = "http://twitter.com/android_bitcoin";
	public static final String AUTHOR_GOOGLEPLUS_URL = "https://profiles.google.com/andreas.schildbach";
	public static final String MARKET_APP_URL = "market://details?id=%s";
	public static final String WEBMARKET_APP_URL = isAmazon ? "http://www.amazon.com/gp/mas/dl/android?p=%s" : "https://play.google.com/store/apps/details?id=%s";

	private static final String VERSION_URL_PROD = "http://wallet.schildbach.de/version";
	private static final String VERSION_URL_TEST = VERSION_URL_PROD + '_' + "test"; // replace protected
	public static final String VERSION_URL = TEST ? VERSION_URL_TEST : VERSION_URL_PROD;

	public static final Intent INTENT_QR_SCANNER = new Intent("com.google.zxing.client.android.SCAN").putExtra("SCAN_MODE", "QR_CODE_MODE");
	public static final String PACKAGE_NAME_ZXING = "com.google.zxing.client.android";

	public static final String PREFS_KEY = "general";
	public static final String PREFS_KEY_LAST_VERSION = "last_version";
	public static final String PREFS_KEY_AUTOSYNC = "autosync";
	public static final String PREFS_KEY_SELECTED_ADDRESS = "selected_address";
	public static final String PREFS_KEY_EXCHANGE_CURRENCY = "exchange_currency";
	public static final String PREFS_KEY_TRUSTED_PEER = "trusted_peer";
	public static final String PREFS_KEY_INITIATE_RESET = "initiate_reset";

	public static final BigInteger DEFAULT_TX_FEE = Utils.CENT.divide(BigInteger.valueOf(20));
}
