package in.paws.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import in.paws.adapters.Converter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class DogBreedDao_Impl implements DogBreedDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDogCategory;

  private final Converter __converter = new Converter();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfDogCategory;

  private final SharedSQLiteStatement __preparedStmtOfSetRandomImageForCategory;

  public DogBreedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDogCategory = new EntityInsertionAdapter<DogCategory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Dog_Category`(`category`,`subCategory`,`isSubCat`,`images`,`isSynced`,`imgUrl`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DogCategory value) {
        if (value.getCategory() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategory());
        }
        final String _tmp;
        _tmp = __converter.fromListToStr(value.getSubCategory());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.isSubCat() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __converter.fromListToStr(value.getImages());
        if (_tmp_2 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_2);
        }
        final int _tmp_3;
        _tmp_3 = value.isSynced() ? 1 : 0;
        stmt.bindLong(5, _tmp_3);
        if (value.getImgUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImgUrl());
        }
      }
    };
    this.__updateAdapterOfDogCategory = new EntityDeletionOrUpdateAdapter<DogCategory>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Dog_Category` SET `category` = ?,`subCategory` = ?,`isSubCat` = ?,`images` = ?,`isSynced` = ?,`imgUrl` = ? WHERE `category` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DogCategory value) {
        if (value.getCategory() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCategory());
        }
        final String _tmp;
        _tmp = __converter.fromListToStr(value.getSubCategory());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.isSubCat() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __converter.fromListToStr(value.getImages());
        if (_tmp_2 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_2);
        }
        final int _tmp_3;
        _tmp_3 = value.isSynced() ? 1 : 0;
        stmt.bindLong(5, _tmp_3);
        if (value.getImgUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImgUrl());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCategory());
        }
      }
    };
    this.__preparedStmtOfSetRandomImageForCategory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Dog_Category SET imgUrl=? Where category=?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<DogCategory> breeds) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDogCategory.insert(breeds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final DogCategory dogCategory) {
    __db.beginTransaction();
    try {
      __updateAdapterOfDogCategory.handle(dogCategory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setRandomImageForCategory(final String category, final String imageUrl) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetRandomImageForCategory.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (imageUrl == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, imageUrl);
      }
      _argIndex = 2;
      if (category == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, category);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetRandomImageForCategory.release(_stmt);
    }
  }

  @Override
  public LiveData<List<DogCategory>> getDogBreeds(final boolean isSubCat) {
    final String _sql = "SELECT * FROM Dog_Category where isSubCat=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isSubCat ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Dog_Category"}, new Callable<List<DogCategory>>() {
      @Override
      public List<DogCategory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategory");
          final int _cursorIndexOfIsSubCat = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubCat");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "isSynced");
          final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imgUrl");
          final List<DogCategory> _result = new ArrayList<DogCategory>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DogCategory _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final List<String> _tmpSubCategory;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfSubCategory);
            _tmpSubCategory = __converter.fromStrToList(_tmp_1);
            final boolean _tmpIsSubCat;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsSubCat);
            _tmpIsSubCat = _tmp_2 != 0;
            final List<String> _tmpImages;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __converter.fromStrToList(_tmp_3);
            final boolean _tmpIsSynced;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIsSynced = _tmp_4 != 0;
            final String _tmpImgUrl;
            _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
            _item = new DogCategory(_tmpCategory,_tmpSubCategory,_tmpIsSubCat,_tmpImages,_tmpIsSynced,_tmpImgUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getNumberOfRows() {
    final String _sql = "SELECT COUNT(category) FROM Dog_Category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<DogCategory>> getSubCategories(final String category) {
    final String _sql = "SELECT * FROM Dog_Category WHERE category like ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Dog_Category"}, new Callable<List<DogCategory>>() {
      @Override
      public List<DogCategory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategory");
          final int _cursorIndexOfIsSubCat = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubCat");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "isSynced");
          final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imgUrl");
          final List<DogCategory> _result = new ArrayList<DogCategory>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DogCategory _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final List<String> _tmpSubCategory;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfSubCategory);
            _tmpSubCategory = __converter.fromStrToList(_tmp);
            final boolean _tmpIsSubCat;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSubCat);
            _tmpIsSubCat = _tmp_1 != 0;
            final List<String> _tmpImages;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __converter.fromStrToList(_tmp_2);
            final boolean _tmpIsSynced;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIsSynced = _tmp_3 != 0;
            final String _tmpImgUrl;
            _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
            _item = new DogCategory(_tmpCategory,_tmpSubCategory,_tmpIsSubCat,_tmpImages,_tmpIsSynced,_tmpImgUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DogCategory getCategory(final String category) {
    final String _sql = "SELECT * FROM Dog_Category WHERE category=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategory");
      final int _cursorIndexOfIsSubCat = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubCat");
      final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
      final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "isSynced");
      final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imgUrl");
      final DogCategory _result;
      if(_cursor.moveToFirst()) {
        final String _tmpCategory;
        _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        final List<String> _tmpSubCategory;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfSubCategory);
        _tmpSubCategory = __converter.fromStrToList(_tmp);
        final boolean _tmpIsSubCat;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsSubCat);
        _tmpIsSubCat = _tmp_1 != 0;
        final List<String> _tmpImages;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfImages);
        _tmpImages = __converter.fromStrToList(_tmp_2);
        final boolean _tmpIsSynced;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfIsSynced);
        _tmpIsSynced = _tmp_3 != 0;
        final String _tmpImgUrl;
        _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
        _result = new DogCategory(_tmpCategory,_tmpSubCategory,_tmpIsSubCat,_tmpImages,_tmpIsSynced,_tmpImgUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<DogCategory> getCategoryAsync(final String category) {
    final String _sql = "SELECT * FROM Dog_Category WHERE category=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Dog_Category"}, new Callable<DogCategory>() {
      @Override
      public DogCategory call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategory");
          final int _cursorIndexOfIsSubCat = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubCat");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfIsSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "isSynced");
          final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imgUrl");
          final DogCategory _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final List<String> _tmpSubCategory;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfSubCategory);
            _tmpSubCategory = __converter.fromStrToList(_tmp);
            final boolean _tmpIsSubCat;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSubCat);
            _tmpIsSubCat = _tmp_1 != 0;
            final List<String> _tmpImages;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __converter.fromStrToList(_tmp_2);
            final boolean _tmpIsSynced;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsSynced);
            _tmpIsSynced = _tmp_3 != 0;
            final String _tmpImgUrl;
            _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
            _result = new DogCategory(_tmpCategory,_tmpSubCategory,_tmpIsSubCat,_tmpImages,_tmpIsSynced,_tmpImgUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public boolean getIsCategorySynced(final String category) {
    final String _sql = "SELECT isSynced FROM Dog_Category WHERE category=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void updateImage(final List<String> images, final String category) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("UPDATE Dog_Category set images=");
    final int _inputSize = images.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(" where category=");
    _stringBuilder.append("?");
    final String _sql = _stringBuilder.toString();
    SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : images) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    _argIndex = 1 + _inputSize;
    if (category == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, category);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
