/*
 * This file is generated by jOOQ.
*/
package com.github.jmart1.example.repo.service.model;


import com.github.jmart1.example.repo.service.model.tables.CoinUsdPrices;
import com.github.jmart1.example.repo.service.model.tables.PayoutQueue;
import com.github.jmart1.example.repo.service.model.tables.Transactions;
import com.github.jmart1.example.repo.service.model.tables.records.CoinUsdPricesRecord;
import com.github.jmart1.example.repo.service.model.tables.records.PayoutQueueRecord;
import com.github.jmart1.example.repo.service.model.tables.records.TransactionsRecord;
import com.github.jmart1.example.repo.service.model.tables.UserLogins;
import com.github.jmart1.example.repo.service.model.tables.records.UserLoginsRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>pacnode</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PayoutQueueRecord, Integer> IDENTITY_PAYOUT_QUEUE = Identities0.IDENTITY_PAYOUT_QUEUE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CoinUsdPricesRecord> KEY_COIN_USD_PRICES_PRIMARY = UniqueKeys0.KEY_COIN_USD_PRICES_PRIMARY;
    public static final UniqueKey<PayoutQueueRecord> KEY_PAYOUT_QUEUE_PRIMARY = UniqueKeys0.KEY_PAYOUT_QUEUE_PRIMARY;
    public static final UniqueKey<TransactionsRecord> KEY_TRANSACTIONS_PRIMARY = UniqueKeys0.KEY_TRANSACTIONS_PRIMARY;
    public static final UniqueKey<UserLoginsRecord> KEY_USER_LOGINS_PRIMARY = UniqueKeys0.KEY_USER_LOGINS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PayoutQueueRecord, Integer> IDENTITY_PAYOUT_QUEUE = Internal.createIdentity(PayoutQueue.PAYOUT_QUEUE, PayoutQueue.PAYOUT_QUEUE.PAYOUT_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CoinUsdPricesRecord> KEY_COIN_USD_PRICES_PRIMARY = Internal.createUniqueKey(CoinUsdPrices.COIN_USD_PRICES, "KEY_coin_usd_prices_PRIMARY", CoinUsdPrices.COIN_USD_PRICES.DATE, CoinUsdPrices.COIN_USD_PRICES.CLOSE, CoinUsdPrices.COIN_USD_PRICES.COIN_NAME);
        public static final UniqueKey<PayoutQueueRecord> KEY_PAYOUT_QUEUE_PRIMARY = Internal.createUniqueKey(PayoutQueue.PAYOUT_QUEUE, "KEY_payout_queue_PRIMARY", PayoutQueue.PAYOUT_QUEUE.PAYOUT_ID);
        public static final UniqueKey<TransactionsRecord> KEY_TRANSACTIONS_PRIMARY = Internal.createUniqueKey(Transactions.TRANSACTIONS, "KEY_transactions_PRIMARY", Transactions.TRANSACTIONS.TXID);
        public static final UniqueKey<UserLoginsRecord> KEY_USER_LOGINS_PRIMARY = Internal.createUniqueKey(UserLogins.USER_LOGINS, "KEY_user_logins_PRIMARY", UserLogins.USER_LOGINS.ACCOUNT_ID);
    }
}
