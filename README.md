AndroidSQLiteDbProviderGenerator
================================

android sqlite dbProvider by generator
dependences: 
        bash shell (linux/bsd or other unixes or cygwin)
        grep
        sed

Usage:
./sqlitegen.sh javaFile [packageName]

javaFile - simple bean file (see sample DictData.java).
Should contain some private fields.
Must contain first field '_id':
    private long _id;
This field used as primary key in table.
Also it can be used for references between tables.
You must create/generate constructor with all fields (include '_id') and without '_id'.
Also you must create/generate getters and setters.
For '_id' field getter should be getId() and setter setId(longId).
Rename if generated get_id or other.

packageName - name of package prefix
bean classes should be in package packageName.data
beadDbProvider classes  generate for package packageName.db

You can edit generated classes (package name and import) as you need :)

outputfile will contain dbProvider class.
Name of class (and file) will add DbProvider to bean class name. 
Sample: DictData.java -> DictDataDbProvider.java

