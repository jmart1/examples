/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.service.model.tables;


import com.github.jmart1.example.repo.service.model.Indexes;
import com.github.jmart1.example.repo.service.model.Keys;
import com.github.jmart1.example.repo.service.model.Pacnode;
import com.github.jmart1.example.repo.service.model.tables.records.TransactionsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Transactions extends TableImpl<TransactionsRecord> {

    private static final long serialVersionUID = 1169769991;

    /**
     * The reference instance of <code>pacnode.transactions</code>
     */
    public static final Transactions TRANSACTIONS = new Transactions();

    /**
     * The column <code>pacnode.transactions.amount</code>.
     */
    public final TableField<TransactionsRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(42, 10).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.account</code>.
     */
    public final TableField<TransactionsRecord, String> ACCOUNT = createField("account", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.address</code>.
     */
    public final TableField<TransactionsRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");
    /**
     * The column <code>pacnode.transactions.blocktime</code>.
     */
    public final TableField<TransactionsRecord, Timestamp> BLOCKTIME = createField("blocktime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pacnode.transactions.bip125-replaceable</code>.
     */
    public final TableField<TransactionsRecord, String> BIP125_REPLACEABLE = createField("bip125-replaceable", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.blockhash</code>.
     */
    public final TableField<TransactionsRecord, String> BLOCKHASH = createField("blockhash", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.blockindex</code>.
     */
    public final TableField<TransactionsRecord, Integer> BLOCKINDEX = createField("blockindex", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.transactions.time</code>.
     */
    public final TableField<TransactionsRecord, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pacnode.transactions.category</code>.
     */
    public final TableField<TransactionsRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.confirmation</code>.
     */
    public final TableField<TransactionsRecord, Integer> CONFIRMATION = createField("confirmation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.generated</code>.
     */
    public final TableField<TransactionsRecord, Byte> GENERATED = createField("generated", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.instantlock</code>.
     */
    public final TableField<TransactionsRecord, Byte> INSTANTLOCK = createField("instantlock", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.involvesWatchonly</code>.
     */
    public final TableField<TransactionsRecord, Byte> INVOLVESWATCHONLY = createField("involvesWatchonly", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.label</code>.
     */
    public final TableField<TransactionsRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");
    /**
     * The column <code>pacnode.transactions.amount_in_usd</code>.
     */
    public final TableField<TransactionsRecord, BigDecimal> AMOUNT_IN_USD = createField("amount_in_usd", org.jooq.impl.SQLDataType.DECIMAL(42, 10), this, "");

    /**
     * The column <code>pacnode.transactions.timereceived</code>.
     */
    public final TableField<TransactionsRecord, Timestamp> TIMERECEIVED = createField("timereceived", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pacnode.transactions.txid</code>.
     */
    public final TableField<TransactionsRecord, String> TXID = createField("txid", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.vout</code>.
     */
    public final TableField<TransactionsRecord, Integer> VOUT = createField("vout", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pacnode.transactions.walletconflicts</code>.
     */
    public final TableField<TransactionsRecord, String> WALLETCONFLICTS = createField("walletconflicts", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionsRecord> getRecordType() {
        return TransactionsRecord.class;
    }

    /**
     * The column <code>pacnode.transactions.usd_exchange_rate</code>.
     */
    public final TableField<TransactionsRecord, BigDecimal> USD_EXCHANGE_RATE = createField("usd_exchange_rate", org.jooq.impl.SQLDataType.DECIMAL(42, 10), this, "");

    /**
     * Create a <code>pacnode.transactions</code> table reference
     */
    public Transactions() {
        this(DSL.name("transactions"), null);
    }

    /**
     * Create an aliased <code>pacnode.transactions</code> table reference
     */
    public Transactions(String alias) {
        this(DSL.name(alias), TRANSACTIONS);
    }

    /**
     * Create an aliased <code>pacnode.transactions</code> table reference
     */
    public Transactions(Name alias) {
        this(alias, TRANSACTIONS);
    }

    private Transactions(Name alias, Table<TransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transactions(Name alias, Table<TransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pacnode.PACNODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TRANSACTIONS_ACCOUNT_GENERATED, Indexes.TRANSACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TransactionsRecord> getPrimaryKey() {
        return Keys.KEY_TRANSACTIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<TransactionsRecord>>asList(Keys.KEY_TRANSACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transactions as(String alias) {
        return new Transactions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transactions as(Name alias) {
        return new Transactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactions rename(String name) {
        return new Transactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactions rename(Name name) {
        return new Transactions(name, null);
    }
}