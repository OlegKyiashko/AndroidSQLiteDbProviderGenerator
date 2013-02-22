package com.c.data;

public class DictData {
	private long _id = -1;
	private long dtype;
	private int code;
	private String locale;
	private String data;

	public DictData(long _id, long dtype, int code, String locale, String data) {
		this._id = _id;
		this.dtype = dtype;
		this.code = code;
		this.locale = locale;
		this.data = data;
	}

	public DictData(long dtype, int code, String locale, String data) {
		this.dtype = dtype;
		this.code = code;
		this.locale = locale;
		this.data = data;
	}

	public long getId() {
		return _id;
	}

	public void setId(long _id) {
		this._id = _id;
	}

	public long getDtype() {
		return dtype;
	}

	public void setDtype(long dtype) {
		this.dtype = dtype;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("DictData [_id=%s, dtype=%s, code=%s, locale=%s, data=%s]", _id, dtype, code, locale, data);
	}
};
