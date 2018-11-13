/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.MasternodeListRecord;
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
public class MasternodeList extends TableImpl<MasternodeListRecord> {

    /**
     * The reference instance of <code>pacnode.masternode_list</code>
     */
    public static final MasternodeList MASTERNODE_LIST = new MasternodeList();
    private static final long serialVersionUID = -1413399087;
    /**
     * The column <code>pacnode.masternode_list.mn_id</code>.
     */
    public final TableField<MasternodeListRecord, Integer> MN_ID = createField("mn_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.masternode_list.mn_label</code>.
     */
    public final TableField<MasternodeListRecord, String> MN_LABEL = createField("mn_label", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_list.col_txid</code>.
     */
    public final TableField<MasternodeListRecord, String> COL_TXID = createField("col_txid", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_list.status</code>.
     */
    public final TableField<MasternodeListRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_list.protocol</code>.
     */
    public final TableField<MasternodeListRecord, String> PROTOCOL = createField("protocol", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_list.payee</code>.
     */
    public final TableField<MasternodeListRecord, String> PAYEE = createField("payee", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_list.lastseen</code>.
     */
    public final TableField<MasternodeListRecord, String> LASTSEEN = createField("lastseen", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_list.activeseconds</code>.
     */
    public final TableField<MasternodeListRecord, String> ACTIVESECONDS = createField("activeseconds", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_list.lastpaidtime</code>.
     */
    public final TableField<MasternodeListRecord, String> LASTPAIDTIME = createField("lastpaidtime", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_list.lastpaidblock</code>.
     */
    public final TableField<MasternodeListRecord, String> LASTPAIDBLOCK = createField("lastpaidblock", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");
    /**
     * The column <code>pacnode.masternode_list.IP</code>.
     */
    public final TableField<MasternodeListRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>pacnode.masternode_list</code> table reference
     */
    public MasternodeList() {
        this(DSL.name("masternode_list"), null);
    }

    /**
     * Create an aliased <code>pacnode.masternode_list</code> table reference
     */
    public MasternodeList(String alias) {
        this(DSL.name(alias), MASTERNODE_LIST);
    }

    /**
     * Create an aliased <code>pacnode.masternode_list</code> table reference
     */
    public MasternodeList(Name alias) {
        this(alias, MASTERNODE_LIST);
    }

    private MasternodeList(Name alias, Table<MasternodeListRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasternodeList(Name alias, Table<MasternodeListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MasternodeListRecord> getRecordType() {
        return MasternodeListRecord.class;
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
        return Arrays.<Index>asList(Indexes.MASTERNODE_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MasternodeListRecord> getPrimaryKey() {
        return Keys.KEY_MASTERNODE_LIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MasternodeListRecord>> getKeys() {
        return Arrays.<UniqueKey<MasternodeListRecord>>asList(Keys.KEY_MASTERNODE_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeList as(String alias) {
        return new MasternodeList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeList as(Name alias) {
        return new MasternodeList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeList rename(String name) {
        return new MasternodeList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeList rename(Name name) {
        return new MasternodeList(name, null);
    }
}