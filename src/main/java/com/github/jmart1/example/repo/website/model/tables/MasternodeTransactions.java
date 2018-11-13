/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.MasternodeTransactionsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;
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
public class MasternodeTransactions extends TableImpl<MasternodeTransactionsRecord> {

    /**
     * The reference instance of <code>pacnode.masternode_transactions</code>
     */
    public static final MasternodeTransactions MASTERNODE_TRANSACTIONS = new MasternodeTransactions();
    private static final long serialVersionUID = 1275355868;
    /**
     * The column <code>pacnode.masternode_transactions.mn_id</code>.
     */
    public final TableField<MasternodeTransactionsRecord, Integer> MN_ID = createField("mn_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.masternode_transactions.reward_amount</code>.
     */
    public final TableField<MasternodeTransactionsRecord, BigDecimal> REWARD_AMOUNT = createField("reward_amount", org.jooq.impl.SQLDataType.DECIMAL(30, 10), this, "");
    /**
     * The column <code>pacnode.masternode_transactions.reward_date</code>.
     */
    public final TableField<MasternodeTransactionsRecord, Date> REWARD_DATE = createField("reward_date", org.jooq.impl.SQLDataType.DATE, this, "");
    /**
     * The column <code>pacnode.masternode_transactions.reward_datetime</code>.
     */
    public final TableField<MasternodeTransactionsRecord, Timestamp> REWARD_DATETIME = createField("reward_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.masternode_transactions.payout_address</code>.
     */
    public final TableField<MasternodeTransactionsRecord, String> PAYOUT_ADDRESS = createField("payout_address", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");
    /**
     * The column <code>pacnode.masternode_transactions.transaction_id</code>.
     */
    public final TableField<MasternodeTransactionsRecord, String> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>pacnode.masternode_transactions.confirmations</code>.
     */
    public final TableField<MasternodeTransactionsRecord, Integer> CONFIRMATIONS = createField("confirmations", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pacnode.masternode_transactions</code> table reference
     */
    public MasternodeTransactions() {
        this(DSL.name("masternode_transactions"), null);
    }

    /**
     * Create an aliased <code>pacnode.masternode_transactions</code> table reference
     */
    public MasternodeTransactions(String alias) {
        this(DSL.name(alias), MASTERNODE_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>pacnode.masternode_transactions</code> table reference
     */
    public MasternodeTransactions(Name alias) {
        this(alias, MASTERNODE_TRANSACTIONS);
    }

    private MasternodeTransactions(Name alias, Table<MasternodeTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasternodeTransactions(Name alias, Table<MasternodeTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MasternodeTransactionsRecord> getRecordType() {
        return MasternodeTransactionsRecord.class;
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
        return Arrays.<Index>asList(Indexes.MASTERNODE_TRANSACTIONS_MN_TRANS_ID, Indexes.MASTERNODE_TRANSACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MasternodeTransactionsRecord> getPrimaryKey() {
        return Keys.KEY_MASTERNODE_TRANSACTIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MasternodeTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<MasternodeTransactionsRecord>>asList(Keys.KEY_MASTERNODE_TRANSACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactions as(String alias) {
        return new MasternodeTransactions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactions as(Name alias) {
        return new MasternodeTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeTransactions rename(String name) {
        return new MasternodeTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeTransactions rename(Name name) {
        return new MasternodeTransactions(name, null);
    }
}
