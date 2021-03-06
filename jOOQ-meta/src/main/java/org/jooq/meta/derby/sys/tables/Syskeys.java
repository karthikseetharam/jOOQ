/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Keys;
import org.jooq.meta.derby.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syskeys extends TableImpl<Record> {

    private static final long serialVersionUID = 216860706;

    /**
     * The reference instance of <code>SYS.SYSKEYS</code>
     */
    public static final Syskeys SYSKEYS = new Syskeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSKEYS.CONSTRAINTID</code>.
     */
    public final TableField<Record, String> CONSTRAINTID = createField(DSL.name("CONSTRAINTID"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSKEYS.CONGLOMERATEID</code>.
     */
    public final TableField<Record, String> CONGLOMERATEID = createField(DSL.name("CONGLOMERATEID"), SQLDataType.CHAR(36).nullable(false), this, "");

    private Syskeys(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Syskeys(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SYS.SYSKEYS</code> table reference
     */
    public Syskeys(String alias) {
        this(DSL.name(alias), SYSKEYS);
    }

    /**
     * Create an aliased <code>SYS.SYSKEYS</code> table reference
     */
    public Syskeys(Name alias) {
        this(alias, SYSKEYS);
    }

    /**
     * Create a <code>SYS.SYSKEYS</code> table reference
     */
    public Syskeys() {
        this(DSL.name("SYSKEYS"), null);
    }

    public <O extends Record> Syskeys(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SYSKEYS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.SYNTHETIC_FK_SYSKEYS__SYNTHETIC_PK_SYSCONSTRAINTS, Keys.SYNTHETIC_FK_SYSKEYS__SYNTHETIC_PK_SYSCONGLOMERATES);
    }

    public Sysconstraints sysconstraints() {
        return new Sysconstraints(this, Keys.SYNTHETIC_FK_SYSKEYS__SYNTHETIC_PK_SYSCONSTRAINTS);
    }

    public Sysconglomerates sysconglomerates() {
        return new Sysconglomerates(this, Keys.SYNTHETIC_FK_SYSKEYS__SYNTHETIC_PK_SYSCONGLOMERATES);
    }

    @Override
    public Syskeys as(String alias) {
        return new Syskeys(DSL.name(alias), this);
    }

    @Override
    public Syskeys as(Name alias) {
        return new Syskeys(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syskeys rename(String name) {
        return new Syskeys(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syskeys rename(Name name) {
        return new Syskeys(name, null);
    }
}
