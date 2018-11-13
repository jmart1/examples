/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.MasternodeAllRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class MasternodeAll extends TableImpl<MasternodeAllRecord> {

    /**
     * The reference instance of <code>pacnode.masternode_all</code>
     */
    public static final MasternodeAll MASTERNODE_ALL = new MasternodeAll();
    private static final long serialVersionUID = 1851802188;
    /**
     * The column <code>pacnode.masternode_all.col_txid</code>.
     */
    public final TableField<MasternodeAllRecord, String> COL_TXID = createField("col_txid", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");
    /**
     * The column <code>pacnode.masternode_all.status</code>.
     */
    public final TableField<MasternodeAllRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_all.protocol</code>.
     */
    public final TableField<MasternodeAllRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_all.payee</code>.
     */
    public final TableField<MasternodeAllRecord, String> PAYEE = createField("payee", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_all.lastseen</code>.
     */
    public final TableField<MasternodeAllRecord, String> LASTSEEN = createField("lastseen", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_all.activeseconds</code>.
     */
    public final TableField<MasternodeAllRecord, String> ACTIVESECONDS = createField("activeseconds", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_all.lastpaidtime</code>.
     */
    public final TableField<MasternodeAllRecord, String> LASTPAIDTIME = createField("lastpaidtime", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_all.lastpaidblock</code>.
     */
    public final TableField<MasternodeAllRecord, String> LASTPAIDBLOCK = createField("lastpaidblock", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_all.IP</code>.
     */
    public final TableField<MasternodeAllRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>pacnode.masternode_all</code> table reference
     */
    public MasternodeAll() {
        this(DSL.name("masternode_all"), null);
    }

    /**
     * Create an aliased <code>pacnode.masternode_all</code> table reference
     */
    public MasternodeAll(String alias) {
        this(DSL.name(alias), MASTERNODE_ALL);
    }

    /**
     * Create an aliased <code>pacnode.masternode_all</code> table reference
     */
    public MasternodeAll(Name alias) {
        this(alias, MASTERNODE_ALL);
    }

    private MasternodeAll(Name alias, Table<MasternodeAllRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasternodeAll(Name alias, Table<MasternodeAllRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MasternodeAllRecord> getRecordType() {
        return MasternodeAllRecord.class;
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
        return Arrays.<Index>asList(Indexes.MASTERNODE_ALL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MasternodeAllRecord> getPrimaryKey() {
        return Keys.KEY_MASTERNODE_ALL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MasternodeAllRecord>> getKeys() {
        return Arrays.<UniqueKey<MasternodeAllRecord>>asList(Keys.KEY_MASTERNODE_ALL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeAll as(String alias) {
        return new MasternodeAll(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeAll as(Name alias) {
        return new MasternodeAll(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeAll rename(String name) {
        return new MasternodeAll(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeAll rename(Name name) {
        return new MasternodeAll(name, null);
    }
}
