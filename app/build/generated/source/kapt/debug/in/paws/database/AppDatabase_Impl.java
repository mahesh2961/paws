package in.paws.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile DogBreedDao _dogBreedDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Dog_Category` (`category` TEXT NOT NULL, `subCategory` TEXT NOT NULL, `isSubCat` INTEGER NOT NULL, `images` TEXT NOT NULL, `isSynced` INTEGER NOT NULL, `imgUrl` TEXT NOT NULL, PRIMARY KEY(`category`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b7f581b65bd834f28e4ce3b978de9986\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Dog_Category`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDogCategory = new HashMap<String, TableInfo.Column>(6);
        _columnsDogCategory.put("category", new TableInfo.Column("category", "TEXT", true, 1));
        _columnsDogCategory.put("subCategory", new TableInfo.Column("subCategory", "TEXT", true, 0));
        _columnsDogCategory.put("isSubCat", new TableInfo.Column("isSubCat", "INTEGER", true, 0));
        _columnsDogCategory.put("images", new TableInfo.Column("images", "TEXT", true, 0));
        _columnsDogCategory.put("isSynced", new TableInfo.Column("isSynced", "INTEGER", true, 0));
        _columnsDogCategory.put("imgUrl", new TableInfo.Column("imgUrl", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDogCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDogCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDogCategory = new TableInfo("Dog_Category", _columnsDogCategory, _foreignKeysDogCategory, _indicesDogCategory);
        final TableInfo _existingDogCategory = TableInfo.read(_db, "Dog_Category");
        if (! _infoDogCategory.equals(_existingDogCategory)) {
          throw new IllegalStateException("Migration didn't properly handle Dog_Category(in.paws.database.DogCategory).\n"
                  + " Expected:\n" + _infoDogCategory + "\n"
                  + " Found:\n" + _existingDogCategory);
        }
      }
    }, "b7f581b65bd834f28e4ce3b978de9986", "2f9a83525dc9532526b8465614177ad1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Dog_Category");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Dog_Category`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DogBreedDao dogCategoryDao() {
    if (_dogBreedDao != null) {
      return _dogBreedDao;
    } else {
      synchronized(this) {
        if(_dogBreedDao == null) {
          _dogBreedDao = new DogBreedDao_Impl(this);
        }
        return _dogBreedDao;
      }
    }
  }
}
